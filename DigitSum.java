
// Input = 12345
// Output = 1 + 2 + 3 + 4 + 5 = 15

package MyOwn;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(12345));
    }

    public static int sumDigit(int number){
        int sum = 0;

        if(number < 0){
            return -1;
        } else {
            while(number != 0){
                sum += number % 10;
                number = number / 10;
                
                if(number == 0){
                    break;
                }

            }
        }

        return sum;
    }
}
