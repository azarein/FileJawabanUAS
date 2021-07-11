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
public class VocalKonsonan {


    public static void main(String[] args) {
        String word;
        int vokal;
        int konsonan;
        String coba;

        do {
            System.out.print("Universitas Nusa Putra Sukabumi ");
            Scanner scanner = new Scanner(System.in);
            word = scanner.nextLine();

            vokal = num_vokal(word);
            konsonan = num_konsonan(word);

            System.out.println("Jumlah huruf vokal : " +vokal);
            System.out.println("Jumlah huruf konsonan : " +konsonan);

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
            System.out.print("\n");
        } while (coba.equals("Y") || coba.equals("y"));
    }

    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);

            if (ascii_vokal(ascii)) {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);

            if (ascii_konsonan(ascii)) {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }

    private static boolean ascii_vokal(int ascii) {
        return ascii == 97 || ascii == 105 || ascii == 117 || ascii == 101 || ascii == 111
                || ascii == 65 || ascii == 73 || ascii == 85 || ascii == 69 || ascii == 79;
    }

    private static boolean ascii_konsonan(int ascii) {
        return ascii != 97 && ascii != 105 && ascii != 117 && ascii != 101 && ascii != 111 && ascii != 65
                && ascii != 73 && ascii != 85 && ascii != 69 && ascii != 79 && ascii != 32;
    }
}
