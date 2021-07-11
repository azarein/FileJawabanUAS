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
public class MenghapusKata {
    public static void main(String args[]) {
        String sentence, word;
        int index;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Pemrogramanan itu sangat mudah");
        sentence = scanner.nextLine();
 
        System.out.println("itu");
        word = scanner.nextLine();
        // Deleting word from
        sentence = sentence.replaceAll(word, "2");
 
        System.out.println("Output kalimat\n" + sentence);
    }
}