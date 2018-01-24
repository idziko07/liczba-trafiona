import java.util.Locale;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int number;

        while(true){
            System.out.println("Podaj liczbe");
            number = input.nextInt();

            if(number > 100 && number < 200 && number%3 == 0 ){
                System.out.println("Twoja liczba jest prawidłowa.");
                break;
            }else if (number <100){
                System.out.println("liczba jest za mała");
            }else if (number>200){
                System.out.println("Liczba za duża");
            }else if(number%3 != 0){
                System.out.println("Liczba jest niepodzielna przez 3");
            }
        }
    }
}
