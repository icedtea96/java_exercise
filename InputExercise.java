package MyOwn;

public class InputExercise {
    public static void main(String[] args) {

        // Input dari console
        // Tidak bisa dipake di IntelliJ (disable di console, bisa diakses lewat terminal)
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Nice to meet you\n");

        String birthYear = System.console().readLine("What year were you born? ");

        int currentYear = 2023;
        //parseInt/parseDouble = mengkonversi string numerik ke integer/double
        int age = currentYear - Integer.parseInt(birthYear);

        System.out.println("So you are " + age + " years old");
    }
}
