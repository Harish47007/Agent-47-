public class test4 {
    public static void main(String[] args) {
        String input = "Java is platform independent programming language";
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
