package hw4;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Enter a word in ukrainian: ");
        String weather = sc.nextLine().trim().toLowerCase();
        switch (weather) {
            case "сонячно":
                System.out.println("sunny");
                break;
            case "дощ":
                System.out.println("rain");
                break;
            case "облачно":
                System.out.println("cloudy");
                break;
            case "сиро":
                System.out.println("wet");
                break;
            case "жарко":
                System.out.println("hot");
                break;
            case "прохолодно":
                System.out.println("cold");
                break;
            case "тепло":
                System.out.println("warm");
                break;
            case "вітряно":
                System.out.println("windy");
                break;
            case "суха":
                System.out.println("dry");
                break;
            case "ідеальна":
                System.out.println("perfect");
                break;
            default:
                System.out.printf("Weather not implemented");
        }
    }
}
