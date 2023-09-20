package MyOwn;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 4, countEven = 0, countOdd = 0;

        while (number <= 20){
            number++;
            //continue bakal ngeskip iterasi sesuai dengan kondisi
            if(!isEvenNumber(number)){
                countOdd++;
                continue;
            }

            System.out.print(number + " ");
            countEven++;
            
            if(countEven == 5){
                break;
            }
        }

        System.out.println("\n\nThere's " + countOdd + " odd numbers");
        System.out.println("There's " + countEven + " even numbers");
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        } else return false;
    }
}
