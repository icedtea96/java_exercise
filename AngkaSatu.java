package MyOwn;

public class AngkaSatu {
    public static void main(String[] args) {
        int n = 3;
		int start = 100;
		int lompat = 3;
		
		int hasilK = lompat;
		for (int i = 1; i <= n; i++) {
			
			System.out.println((start+hasilK) + " adalah si angka 1");
			//System.out.println(hasilK);
			hasilK=lompat;
			
			for (int j = 1; j <= i; j++) {
				hasilK=hasilK*lompat;
			}

		}
    }
}
