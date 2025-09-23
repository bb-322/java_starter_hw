public class Task3 {
    public static void main(String[] args) {
        String str1, str2, str3;
        str1 = "\nмій рядок 1";
        str2 = "\tмій рядок 2";
        // str3 = "\aмій рядок 3"; <- err
        str3 = "мій рядок 3";

        System.out.printf("str1: %s%nstr2: %s%nstr3: %s", str1, str2, str3);
    }
}