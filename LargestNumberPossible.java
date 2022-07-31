import java.util.*;

public class LargestNumberPossible 
{
    public static void main(String[] args) 
    {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        String result = Solve(nums);
        System.out.println("Largest number possible form array of integers = " + result);
    }

    public static String Solve(int[] nums)
    {
        String result = "";
        String[] words = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            char[] temp =  Integer.toString(nums[i]).toCharArray();
            Arrays.sort(temp);
            Reverse(temp);
            words[i] = new String(temp);
        }

        for (String word : words)
        {
            System.out.println(word);
        }
            
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(Arrays.asList(words));
        result = String.join("", words);

        return result;
    }

    public static void Reverse(char[] obj)
    {
        int n = obj.length;

        for (int i = 0; i < n/2; i++)
        {
            char temp = obj[i];
            obj[i] = obj[n-1-i];
            obj[n-1-i] = temp;
        }
    }

}
