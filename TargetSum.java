import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int[] result = new int[2];
        result = Solve(array, target);

        System.out.println("index 1 = " + result[0] + " index 2 = " + result[1]);
    }

    public static int[] Solve(int[] nums, int target)
    {
        int[] result = new int[2];

        HashMap<Integer, Integer> hset = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if (hset.containsKey(nums[i]))
            {
                result[0] = hset.get(nums[i]);
                result[1] = i;
                break;
            }
            else
            {
                if (!hset.containsKey(target - nums[i]))
                {
                    hset.put(target-nums[i], i);
                }
            }
        }

        return result;
    }


    public static bool Solve1(int[] nums, int target)
    {
	Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++)
        {
            int element = target - nums[i];
	    if (Search(nums, element, i))
		return true;
        }

        return false;
    }

    public static boolean Search(int[] nums, int key, int index)    
    {
        int left = 0;
        int right = nums.length-1;
        int temp = nums[index];
        nums[index] = index > 0 ? nums[index-1] : -1;
        while (left <= right)
        {
            int mid = left + (right-left)/2;
            
            if (nums[mid] == target)
                return true;
            if (nums[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        nums[index] = temp;
        
        return false;
    }
}
