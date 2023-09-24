import java.util.Random;
import java.util.Scanner;

public class Keranjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        int kosong = 0, sum = 0;
        
        System.out.print("Masukkan jumlah buah pertama: ");
        int buah1 = input.nextInt();
        System.out.print("Masukkan jumlah buah kedua: ");
        int buah2 = input.nextInt();
        System.out.print("\nPilih keranjang yang akan dibawa: ");
        int pilih = input.nextInt();
        System.out.println();
        
        int keranjang[] = {kosong, buah1, buah2};
        int newKeranjang[] = new int[keranjang.length-1];

        // Fisher-Yates shuffle => randomly shuffle array
        // To shuffle an array a of n elements (indices 0..n-1):
        // for i from n - 1 downto 1 do
        //     j = random integer with 0 <= j <= i
        //     exchange a[j] and a[i]

        for (int i = keranjang.length-1; i > 0; i--) {
             
            // Pick a random index from 0 to i
            int j = rand.nextInt(i+1);
             
            // Swap arr[i] with the element at random index
            int temp = keranjang[i];
            keranjang[i] = keranjang[j];
            keranjang[j] = temp;

        }

        for(int i = 0; i < keranjang.length; i++){
                System.out.print(keranjang[i] + " ");
            }
    
        System.out.println();

        if(pilih < 0 || pilih > keranjang.length){
            System.out.println("Input tidak valid, hanya bisa memilih satu dari " + keranjang.length + " keranjang");
        } else {
            
            for(int i = 0, k = 0; i < keranjang.length; i++){
                if(i != pilih-1){
                    newKeranjang[k] = keranjang[i];
                    k++;
                }
            }

            System.out.println("Keranjang " + (pilih) + " dibawa ke pasar\n");
            for(int i = 0; i < newKeranjang.length; i++){
                sum += newKeranjang[i];
            }

            System.out.println("Jumlah buah -> " + newKeranjang[newKeranjang.length-2] + " + " + newKeranjang[newKeranjang.length-1] + " = " + sum);
        }
        input.close();
        //cara 2: (int)Math.floor(Math.random() * (max - min + 1) + min) -> randomizer dengan range (min, max)
        // Ehe <3 
    }
}