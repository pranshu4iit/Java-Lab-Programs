import java.util.Scanner;
class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int number;
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++)
        {
            number = sc.nextInt();

            if (number % 2 == 0)
            {
                even = even + 1;
            }
            else
            {
                odd = odd + 1;
            }
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}
