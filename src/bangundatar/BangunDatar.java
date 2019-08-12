/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author bangrejas
 */

public class BangunDatar{
    
    
    public static void main(String[] args) {
        // Ini tanpa inputan
//        String nama = "Avief";
//        int umur = 19;
//        System.out.println(nama);
//        System.out.println(umur);
//        int sisi = 10;
//        int tinggi = 8;
//        int alas = 10;
//        double phi = 3.14;
//        int jari = 7;
//        
//        int luasPersegi = umur * sisi;
//        int kelilingPersegi = 4 * sisi;
//        
//        int luasSegitiga = alas * tinggi;
//        int kelilingSegitiga = 3 * alas;
//        
//        double luasLingkaran = 0.5 * phi * jari * jari;
//        double kelilingLingkaran = 2 * phi * jari;
//        
//        System.out.println("sisi persegi = "+sisi);
//        System.out.println("luas persegi = "+luasPersegi);
//        System.out.println("keliling persegi = "+kelilingPersegi);
//        
//        System.out.println("alas segitiga = "+alas);
//        System.out.println("tinggi segitiga = "+tinggi);
//        System.out.println("luas segitiga = "+luasSegitiga);
//        System.out.println("keliling segitiga = "+kelilingSegitiga);
//        
//        System.out.println("jari-jari lingakaran = "+jari);
//        System.out.println("luas lingkaran = "+luasLingkaran);
//        System.out.println("keliling lingkaran = "+kelilingLingkaran);
//        

        //ini make inputan
        Scanner input = new Scanner(System.in); //buat ngeinput

        int sisi,alas,tinggi;
        double phi = 3.14;
        double jari, luasLingkaran, kelilingLingkaran, luasPersegi, kelilingPersegi, luasSegitiga, kelilingSegitiga;

        System.out.println("Program Bangun Datar\n");
        System.out.println("Persegi\n");
        System.out.println("Masukkan sisi : ");
        sisi = input.nextInt();

        luasPersegi = sisi * sisi;
        kelilingPersegi = 4*sisi;

        System.out.print("Luas persegi = " + luasPersegi + " \nKeliling Persegi = "+ kelilingPersegi);
        
        System.out.println("\n\nSegitiga\n");
        System.out.println("Masukkan alas : ");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        tinggi = input.nextInt();

        luasSegitiga = alas * tinggi;
        kelilingSegitiga = 3 * alas;

        System.out.print("Luas Segitiga = " + luasSegitiga + " \nKeliling Segitiga = "+ kelilingSegitiga);
        
        System.out.println("\n\nLingkaran\n");
        System.out.println("Masukkan jari-jari : ");
        jari = input.nextDouble();

        luasLingkaran = 0.5 * phi * jari * jari;
        kelilingLingkaran = 2 * phi * jari;

        System.out.print("Luas lingkaran = " + luasLingkaran + " \nKeliling Lingkaran = "+ kelilingLingkaran);
        }
    }
    
