package hw3;

public class Main {
    public static void main(String[] args) {
        // byte uberflu?; syntax err
        byte _Identifier = 1; // good
        byte \u006fldentifier = 1; // good
        // byte &myVar; syntax err
        byte myVariab1le = 1; //good

        System.out.println("" + _Identifier + \u006fldentifier + myVariab1le);
    }
}
