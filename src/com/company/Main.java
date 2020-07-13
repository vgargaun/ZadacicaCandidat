package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int candidatA = 733;
        int candidatB = 733;
        System.out.println("----------------------");
        System.out.println("IN\t\t\t|\t\tOUT");
        System.out.println("----------------------");

        if(candidatB>candidatA) {
            double probabilitateB = (double) candidatB / (candidatA + candidatB);
            double probabilitateCastig = (double) probabilitateB - (double) candidatA / (candidatA + candidatB);
            System.out.println(candidatA +" "+candidatB +"\t\t|\tB  "+new DecimalFormat("##.####").format(probabilitateCastig*100));
        }else if (candidatB<candidatA){
            double probabilitateA = (double) candidatA / (candidatA + candidatB);
            double probabilitateCastig = (double) probabilitateA - (double) candidatB / (candidatA + candidatB);
            System.out.println(candidatA +" "+candidatB +"\t\t|\tA  "+new DecimalFormat("##.####").format(probabilitateCastig*100));
        } else {
            System.out.println("\t\t\tDRAW");
        }



    }
}
