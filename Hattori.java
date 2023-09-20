package MyOwn;

public class Hattori {
    public static void main(String[] args) {
        String naikTurun = "N N T N N N T T T T T N T T T N T N";
        naikTurun = naikTurun.replace(" ", "");

        int panjang = naikTurun.length();
        int gunungCount = 0, lembahCount = 0;
        for (int i = 0; i < panjang-1; i++) {
            char naik = naikTurun.charAt(i);
            char turun = naikTurun.charAt(i+1);

            if(naik == 'N' && turun == 'T'){
                gunungCount++;
            } else if (naik == 'T' && turun == 'N'){
                lembahCount++;
            }

        }

        System.out.println(gunungCount);
        System.out.println(lembahCount);
    }
}
