/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Yamin
 */
public class Perbandingan {
public static void main(String args[]){
      
    int VakiSenin = 5000;
    int RinaSenin = 10000;
    int VakiSelasa = 3000;
    int RinaSelasa = 5000;
    int VakiRabu = 6500;
    int RinaRabu = 5000;
    int VakiKamis = 10000;
    int RinaKamis = 10000;
    int VakiJumat = 4000;
    int RinaJumat = 15000;
    int VakiSabtu = 4000;
    int RinaSabtu = 10000;
    int VakiTotal = 32500;
    int RinaTotal = 55000;
    boolean hasil;
     
    hasil = VakiRabu > RinaRabu;
    System.out.println("Uang Saku Vaki Lebih Banyak Dari Rina 1x Pada Hari Rabu = " + hasil );   
     
    hasil = VakiSenin + VakiSelasa + VakiJumat + VakiSabtu < RinaSenin + RinaSelasa + RinaJumat + RinaSabtu;
    System.out.println("Uang Saku Rina Lebih Banyak dari Vaki 4x Pada Hari Senin, Selasa, Jum'at, dan Sabtu = " + hasil );   
     
    hasil = VakiKamis == RinaKamis;
    System.out.println("Uang Saku Vaki Dan Rina Sama 1x Pada Hari Kamis = " + hasil );   
     
    hasil = VakiTotal == VakiTotal;
    System.out.println("Total Uang saku Vaki adalah Rp.32500 = " + hasil );   
     
    hasil = RinaTotal == RinaTotal;
    System.out.println("Total Uang Saku Rina Adalah Rp.55000 = " + hasil );   
  
     
  }
}

