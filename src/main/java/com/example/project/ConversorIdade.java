/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class ConversorIdade {

    public int[] converter(int diasTotais) {
        int anos = diasTotais / 365;
        diasTotais = diasTotais % 365;

        int meses = diasTotais / 30;
        int dias = diasTotais % 30;

        return new int[] {anos, meses, dias};
    }
}