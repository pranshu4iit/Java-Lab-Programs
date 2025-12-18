import java.util.Scanner;
class noofobject
{
    static int count = 0;
    {
        count = count + 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            noofobject obj = new noofobject();
        }
        System.out.println("Number of objects created = " + count);
    }
}
