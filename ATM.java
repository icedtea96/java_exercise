package MyOwn;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 123456;

        System.out.print("Masukkan PIN\t: ");
        int inputPin = input.nextInt();

        if (inputPin != pin) {
            System.out.println("PIN yang dimasukkan salah");
        } else {
            System.out.print("Masukkan nominal uang yang akan disetor: ");
            int nominalSetor = input.nextInt();

            System.out.print("Pilihan transfer: ");
            System.out.print("\t1. Antar rekening\t2. Antar Bank");
            System.out.print("\nPilihan menu (1/2): ");
            int menuTransfer = input.nextInt();

            if (menuTransfer != 1 && menuTransfer != 2) {
                System.out.println("Input tidak valid");
            } else {
                if (menuTransfer == 1) {
                    System.out.print("Masukkan rekening tujuan: ");
                    input.nextLine();
                    String rekening = input.nextLine();

                    if (rekening.length() != 10) {
                        System.out.println("Rekening yang dimasukkan salah.");
                    } else {
                        System.out.print("Masukkan nominal transfer: ");
                        int nominalTransfer = input.nextInt();
                        if (nominalTransfer > nominalSetor) {
                            System.out.println("Saldo rekening tidak cukup untuk melakukan transfer.");
                        } else {
                            nominalSetor -= nominalTransfer;
                            System.out.println("Transaksi berhasil, saldo anda saat ini Rp. " + nominalSetor);
                        }
                    }
                } else if (menuTransfer == 2) {
                    input.nextLine();
                    System.out.print("Masukkan kode bank tujuan: ");
                    String kodeBank = input.nextLine();
                    
                    if (kodeBank.length() != 3) {
                        System.out.println("Kode bank tujuan harus dimasukkan.");
                    } else {
                        System.out.print("Masukkan rekening tujuan: ");
                        String rekening = input.nextLine();
                        
                        if (rekening.length() != 10) {
                            System.out.println("Rekening yang dimasukkan salah.");
                        } else {
                            System.out.print("Masukkan nominal transfer: ");
                            int nominalTransfer = input.nextInt();
                            if (nominalTransfer > nominalSetor) {
                                System.out.println("Saldo rekening tidak cukup untuk melakukan transfer.");
                            } else {
                                nominalSetor -= nominalTransfer + 7500;
                                System.out.println("Transaksi berhasil, saldo anda saat ini Rp. " + nominalSetor);
                            }
                        }
                    }
                }
            }
        }

        input.close();

    }
}
