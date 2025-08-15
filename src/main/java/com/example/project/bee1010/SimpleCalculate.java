// Link do BeeCrowd - https://judge.beecrowd.com/en/problems/view/1010

package com.example.project.bee1010;

import java.text.DecimalFormat;

class SimpleCalculate{
    public double calculatePrices(PackageData p1, PackageData p2){
        DecimalFormat df = new DecimalFormat("#.##");

        if(p1.idProduct == p2.idProduct){
            
            return Double.parseDouble(df.format(p1.price * p1.quantity *p2.quantity));
        }
        return Double.parseDouble(df.format((p1.price * p1.quantity) + (p2.price * p2.quantity)));
    }
}