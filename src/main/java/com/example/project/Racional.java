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

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional somar(Racional outro) {
        int num = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int den = this.denominador * outro.denominador;
        return new Racional(num, den).simplificar();
    }

    public Racional subtrair(Racional outro) {
        int num = this.numerador * outro.denominador - outro.numerador * this.denominador;
        int den = this.denominador * outro.denominador;
        return new Racional(num, den).simplificar();
    }

    public Racional multiplicar(Racional outro) {
        int num = this.numerador * outro.numerador;
        int den = this.denominador * outro.denominador;
        return new Racional(num, den).simplificar();
    }

    public Racional dividir(Racional outro) {
        int num = this.numerador * outro.denominador;
        int den = this.denominador * outro.numerador;
        return new Racional(num, den).simplificar();
    }

    public Racional simplificar() {
        int divisor = mdc(Math.abs(this.numerador), Math.abs(this.denominador));
        if (divisor > 0) {
            this.numerador /= divisor;
            this.denominador /= divisor;
        }
        return this;
    }

    private int mdc(int a, int b) {
        if (b == 0) return a;
        return mdc(b, a % b);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}