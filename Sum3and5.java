package MyOwn;

public class Sum3and5 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                
                System.out.print(i + " ");
                sum += i;
                count++;

                if(count == 5){
                    break;
                }
            }
        }
        System.out.println("\nSum = " + sum);
    }

}
