import java.util.*;
class fac
{
    public static int fact(int a)
    {
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }  
        return f;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,c;
        System.out.println("Enter limit");
        n = sc.nextInt();
        c = fact(n);
        System.out.println("The factorial is "+c);
    }
}
