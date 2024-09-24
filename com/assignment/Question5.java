package com.assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        new Question5().initial();
        
    }
    void initial(){
        double weights[]=new double[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weights of 10 people:");
        for(int i=0;i<10;i++){
            weights[i]=sc.nextDouble();
        }
        findAverage(weights);
        sc.close();
    }

    void findAverage(double[] weights){
        double sum=0;
        for(double i:weights){
            sum+=i;
        }

        System.out.println("The Average weight of 10 people: "+sum/10);
    }
}
