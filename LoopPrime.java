package MyOwn;

public class LoopPrime {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 50; i++){
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
        // System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }

    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        // Cara pertama
        // int divisor  diset nilainya jadi dua karena 0 dan 1 bukan bilangan prima.
        // maka dari itu, cek modulus bilangan menggunakan bilangan prima terkecil (2),
        // kemudian diiterasikan sehingga nilai divisor selalu naik.
        // Apabila modulus bilangan dengan divisor = 0, return false.

        // for (int divisor = 2; divisor < wholeNumber; divisor++){
        //     if (wholeNumber % divisor == 0){
        //         return false;
        //     }
        // }

        // Cara kedua
        // Cara ini dipakai untuk meningkatkan performa kode pemrograman.
        // Dikarenakan nilai modulus bilangan yang digunakan selalu dibagi dengan 2,
        // maka batas atas loop juga dapat dibagi dengan 2.
        // Hal ini menyebabkan proses looping lebih cepat, menghemat waktu sebanyak 50%. 
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }
}
