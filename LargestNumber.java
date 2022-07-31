import java.util.*;

public class LargestNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
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
            words[i] = Integer.toString(nums[i]);


        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(Arrays.asList(words));
        result = String.join("", words);

        return result;
    }
    
}
