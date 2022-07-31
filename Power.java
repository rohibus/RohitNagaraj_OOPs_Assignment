import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base ");
        int a = sc.nextInt();

        System.out.println("Enter the power");
        int b = sc.nextInt();

        int result = Solve(a, b);

        System.out.println(a + " power " + b +" = " + result);
    }

    public static int Solve(int a, int b)
    {
        int result = 1;

        while (b > 0)
        {
            if ((b&1) == 1)
            {
                result *= a;
            }

            a = a*a;
            b = b/2;
        }

        return result;
    }
}
