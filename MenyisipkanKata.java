/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Yamin
 */
public class MenyisipkanKata {
 
    public static String insertString(
        String asliString,
        String stringYangAkanDimasukan,
        int index)
    {
  
        String newString = new String();
  
        for (int i = 0; i < asliString.length(); i++) {
            newString += asliString.charAt(i);
  
            if (i == index) {
                newString += stringYangAkanDimasukan;
            }
        }
  
        return newString;
    }
  
    public static void main(String[] args)
    {
  
        String asliString = "Pemrograman itu sangat mudah";
        String stringYangAkanDimasukan = "dan menyenangkan";
        int index = 4;
  
        System.out.println("String asli: "
                           + asliString);
        System.out.println("String yang akan dimasukkan: "
                           + stringYangAkanDimasukan);
        System.out.println("String yang akan disisipkan pada indeks: "
                           + index);
  
        // Insert the String
        System.out.println("String yang Dimodifikasi: "
                           + insertString(asliString,
                                stringYangAkanDimasukan,
                                index));
    }
}
