import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = sc.nextLine();

        boolean result = IsPalindrome(input);
        System.out.println(result);
    }

    public static boolean IsPalindrome(String s)
    {
        if (s.length() <= 1)
            return true;
        
        if (s.length() == 2)
            return s.charAt(0) == s.charAt(1);
        
        return s.charAt(0) == s.charAt(s.length()-1) &&
                IsPalindrome(s.substring(1, s.length()-2));
    }
}
