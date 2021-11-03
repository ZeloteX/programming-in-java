package agh.ii.prinjava.lab06.Exercise.Exercise1;
import agh.ii.prinjava.lab06.Exercise.Exercise1.C1;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

public class Main {
    public  static void main(String[] args) {

        DoubleUnaryOperator f1 = (x)-> x-2 ;
        DoubleBinaryOperator f2 = (x, y)-> Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));

        double y = f1.applyAsDouble(3.5);
        System.out.println(y);
    }


}
