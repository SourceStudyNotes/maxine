/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.max.asm.ia32;

import com.sun.max.asm.x86.*;
import com.sun.max.lang.*;
import com.sun.max.util.*;

/**
 */
public enum IA32GeneralRegister32 implements GeneralRegister<IA32GeneralRegister32> {

    // Note: keep the order such that 'value()' can rely on ordinals:

    EAX, ECX, EDX, EBX, ESP, EBP, ESI, EDI;

    public static final Enumerator<IA32GeneralRegister32> ENUMERATOR = new Enumerator<IA32GeneralRegister32>(IA32GeneralRegister32.class);

    public static IA32GeneralRegister32 from(GeneralRegister generalRegister) {
        return ENUMERATOR.get(generalRegister.id());
    }

    public IA32IndirectRegister32 indirect() {
        return IA32IndirectRegister32.from(this);
    }

    public IA32BaseRegister32 base() {
        return IA32BaseRegister32.from(this);
    }

    public IA32IndexRegister32 index() {
        return IA32IndexRegister32.from(this);
    }

    public WordWidth width() {
        return WordWidth.BITS_32;
    }

    public int value() {
        return ordinal();
    }

    public int id() {
        return ordinal();
    }

    public long asLong() {
        return value();
    }

    public String externalValue() {
        return "%" + name().toLowerCase();
    }

    public String disassembledValue() {
        return name().toLowerCase();
    }

    public Enumerator<IA32GeneralRegister32> enumerator() {
        return ENUMERATOR;
    }

    public IA32GeneralRegister32 exampleValue() {
        return EAX;
    }
}
