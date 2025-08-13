package com.example.project.bee1010;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleCalculateTests{
    @Test
    @DisplayName("teste 1 - Total a pagar")
    void totalProductsPrices(){
        PackageData p1 = new PackageData(1, 1, 5.30);
        PackageData p2 = new PackageData(2, 1, 2.10);
        SimpleCalculate total = new SimpleCalculate();
        assertEquals(15.30, SimpleCalculate.(p1,p2))
    }

}