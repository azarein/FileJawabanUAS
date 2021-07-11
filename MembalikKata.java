/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Muhamad Yamin
 */
public class MembalikKata {
public static void main(String args[])
 {
 String kata, hasil = "";
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Selamat datang di dunia pemrograman");
 kata = scanner.nextLine();
 
 int jumlah = kata.length();
 int jumlahKata = jumlah - 1;
 
 for ( int i = 0; i < jumlah; i++) {
 hasil += kata.charAt(jumlahKata); 
 jumlahKata--;
 }
 System.out.println("Kata dibalik : -> "+hasil);
 }
 
}
