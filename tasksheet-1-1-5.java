import java.util.*;

class StringTask {
    
    public static void main(String[] args) {
    System.out.println("enter a word");
    try (Scanner input = new Scanner(System.in)) {
        String a = "level";
        StringBuilder b = new StringBuilder(input.nextLine());

        if (b.toString().equals(a)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome");
        }
    }
    }
}
