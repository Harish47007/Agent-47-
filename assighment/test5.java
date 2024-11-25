public class test5 {
    public static void main(String[] args) {
        String original = "Sathyabama";
        String toInsert = " University";
        int position = 10;
        
        String result = original.substring(0, position) + toInsert + original.substring(position);
        System.out.println(result);
    }
}
