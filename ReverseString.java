package src;


    public class ReverseString {
    static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "cat";
        System.out.println("Reversed string: " + reverse(str));
    }
}



