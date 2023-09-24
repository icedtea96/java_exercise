package MyOwn;

import java.util.Scanner;

public class AngkaSatu {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

		int start = 100;
		int lompat = 3;
		
		int hasilK = lompat;
		System.out.println(start + " adalah si angka 1");
		for (int i = 1; i <= n; i++) {
			
			System.out.println((start+hasilK) + " adalah si angka 1");
			//System.out.println(hasilK);
			hasilK=lompat;
			
			for (int j = 1; j <= i; j++) {
				hasilK=hasilK*lompat;
			}

		}

		input.close();
    }
}
