package MyOwn;

import java.util.Random;
import java.util.Scanner;

public class GameBox {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int angkaCPU[] = new int[2];

        System.out.print("Masukkan jumlah kartu untuk bermain: ");
        int kartuAwal = input.nextInt();

        int kartuAkhir = kartuAwal;
        while (true) {

            System.out.print("Masukkan jumlah kartu yang ditawarkan: ");
            int kartuTawaran = input.nextInt();
            System.out.println();
            System.out.print("Masukkan angka bulat (1-10): ");
            int angkaPlayer = input.nextInt();
            input.nextLine();
            System.out.print("Pilih kotak (A/B): ");
            String kotak = input.nextLine();

            // control flow
            if (angkaPlayer < 1 || angkaPlayer > 10) {
                System.out.println("Angka yang dimasukkan tidak valid.");
            } else {
                // print choice
                if (kartuAkhir <= 0) {
                    System.out.println("==============================================================================");
                    System.out.println("Kartu yang anda miliki habis");
                    System.out.println("GAME OVER");
                    break;
                } else {
                    System.out.println("==============================================================================");
                    if (kotak.equalsIgnoreCase("A")) {
                        System.out.println("\nAnda memilih kotak A\n");
                        System.out.println("==============================================================================");
                        angkaCPU[0] = random.nextInt(1, 10);
                        if (angkaPlayer == angkaCPU[0]) {
                            System.out.println("Nilai Player: " + angkaPlayer);
                            System.out.println("Nilai CPU: " + angkaCPU[0]);
                            System.out.println("\nPlayer Win!");
                            kartuAkhir += kartuTawaran;
                        } else {
                            System.out.println("Nilai Player: " + angkaPlayer);
                            System.out.println("Nilai CPU: " + angkaCPU[0]);
                            System.out.println("\nCPU Win!");
                            kartuAkhir -= kartuTawaran;
                        }
                    } else if (kotak.equalsIgnoreCase("B")) {
                        System.out.println("\nAnda memilih kotak B\n");
                        System.out.println("==============================================================================");
                        angkaCPU[1] = random.nextInt(1, 10);
                        if (angkaPlayer == angkaCPU[1]) {
                            System.out.println("Nilai Player: " + angkaPlayer);
                            System.out.println("Nilai CPU: " + angkaCPU[1]);
                            System.out.println("\nPlayer Win!");
                            kartuAkhir += kartuTawaran;
                        } else {
                            System.out.println("Nilai Player: " + angkaPlayer);
                            System.out.println("Nilai CPU: " + angkaCPU[1]);
                            System.out.println("\nCPU Win!");
                            kartuAkhir -= kartuTawaran;
                        }
                    }
                }

                if (kartuAkhir <= 0) {
                    System.out.println("==============================================================================");
                    System.out.println("Kartu yang anda miliki habis\n");
                    System.out.println("GAME OVER");
                    break;
                } else {
                    System.out.println("==============================================================================");
                    System.out.println("Jumlah kartu yang anda miliki: " + kartuAkhir);
                    System.out.print("Ulang game (Ya/Tidak): ");
                    String ulangGame = input.nextLine();

                    if (ulangGame.equalsIgnoreCase("ya")) {
                        System.out.println();
                    } else if (ulangGame.equalsIgnoreCase("tidak")) {
                        System.out.println();
                        System.out.println("Terima kasih telah bermain!");
                        break;
                    } else
                        break;
                }
            }

        }
        input.close();
    }
}
