import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();
        System.out.println(str1.contains(str2) ? "Str 1 contains Str 2" : "Str 1 does not contain Str 2");
    }
}
