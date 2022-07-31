import java.util.*;

public class LongestSubstringWithoutRepeatation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);
        System.out.println(Solve(s));
    }
    public static int Solve(String str)
    {
        String current = "";
        int max = 0;
        
        for (int i = 0; i < str.length(); i++)
        {
            String temp = Character.toString(str.charAt(i));

            if (!current.contains(temp))
            {
                current += temp;
            }
            else
            {
                max = Math.max(max, current.length());
                current = current.substring(current.indexOf(temp)+1);
                current += temp;
            }

        }

        return Math.max(max, current.length());
    }
}
