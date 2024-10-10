import java.util.*;
class rectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l,b,i,j;
        System.out.println("Enter a Length");
        l=sc.nextInt();
        System.out.println("Enter a Breath");
        b=sc.nextInt();

        for(i=0;i<b;i++)
        {
            for(j=0;j<l;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
