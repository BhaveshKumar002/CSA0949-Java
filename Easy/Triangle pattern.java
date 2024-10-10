import java.util.*;

class pattern
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,i,j;
        System.out.println("Enter a Limit");
        a = sc.nextInt();
        for(i=0;i<a;i++)
        {
            for(j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
