import java.util.Scanner;
public class SaldoOPO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pcsKopi = 0;
        double diskon = 0.5, hargaTotal = 0, hargaDiskon = 0, hargaCashback = 0;
        double hargaKopi = 18000, afterCashback = 0;

        System.out.print("Masukkan saldo Opo: ");
        double saldo = input.nextInt();

        while (saldo >= hargaKopi) {
            saldo -= hargaKopi;
            hargaTotal += hargaKopi;
            pcsKopi++;
        }

        hargaCashback = hargaTotal * 0.1;
        afterCashback = hargaCashback + saldo;

        if (hargaCashback > 30000) {
            hargaCashback = 30000;
            afterCashback = hargaCashback + saldo;
        }

        while (hargaTotal > 40000){
            hargaDiskon = hargaTotal * diskon;
            hargaTotal = (hargaTotal - hargaDiskon) + hargaKopi;
            pcsKopi++;
        }

        System.out.println("Jumlah cup: " + pcsKopi);
        System.out.println("Saldo: " + afterCashback);

        input.close();
    }

}
