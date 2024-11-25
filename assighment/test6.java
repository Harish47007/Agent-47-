public class test6 {
    public static void main(String[] args) {
        String input ="madamf+";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed) ? "Palindrome" : "Not a Palindrome");
    }
}
-