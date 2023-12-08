package com.juaracoding.tugas.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("============= Menghitung Luas Segitiga =============");
        Scanner input = new Scanner(System.in);

        //======================================= ALAS SEGITIGA =======================================
        System.out.println("Enter alas segitiga : ");
        float alas = input.nextFloat();
        //===============================================================================================


        //======================================= TINGGI SEGITIGA =======================================
        System.out.println("Enter tinggi segitiga : ");
        float tinggi = input.nextFloat();
        //===============================================================================================


        //======================================= RUMUS LUAS SEGITIGA ===================================
        int luasSegitiga = (int) (alas * tinggi/2);
        System.out.println("luas segitiga : "+"\n"+luasSegitiga);
        //===============================================================================================

        System.out.println("=====================================================");
    }
}