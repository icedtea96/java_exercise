package MyOwn;

public class Geser {
    public static void main(String[] args) {
        int aDeret[] = { 3, 4, 5, 6, 7 };
        int x = 4;

        // cetak awal
        System.out.print("awal :");
        for (int i = 0; i < aDeret.length; i++) {
            System.out.print(aDeret[i] + " ");
        }

        // geser sebanyak xxx
        for (int j = 1; j <= x; j++) {
            // ambil elemen index 0
            int awal = aDeret[0];
            // geser tiap elemen
            for (int i = 0; i < aDeret.length - 1; i++) {
                aDeret[i] = aDeret[i + 1];
            }
            // isi elemen akhir dengan awal
            aDeret[aDeret.length - 1] = awal;
            // cetak
            System.out.println();
            System.out.print("X"+j+" :");
            for (int i = 0; i < aDeret.length; i++) {
                System.out.print(aDeret[i] + " ");
            }
        }

    }
}
