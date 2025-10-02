package hw5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float premium;
        System.out.print("enter length of service: ");
        int service = sc.nextInt();
        System.out.print("enter salary: ");
        int salary = sc.nextInt();
        if (service < 5) {
            premium = 0.1f;
            System.out.println((float) salary + (salary * premium));
        } else if (service >= 5 && service < 10) {
            premium = 0.15f;
            System.out.println((float) salary + (salary * premium));
        } else if (service >= 10 && service < 15) {
            premium = 0.25f;
            System.out.println((float) salary + (salary * premium));
        } else if (service >= 15 && service < 20) {
            premium = 0.35f;
            System.out.println((float) salary + (salary * premium));
        } else if (service >= 20 && service < 25) {
            premium = 0.45f;
            System.out.println((float) salary + (salary * premium));
        } else if (service >= 25) {
            premium = 0.5f;
            System.out.println((float) salary + (salary * premium));
        } else {
            System.out.println("invalid data");
        }
    }
}
