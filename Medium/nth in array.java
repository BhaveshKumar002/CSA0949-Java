import java.util.*;
public class nthnum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n,i,f;
        System.out.println("Enter Limit");
        n = sc.nextInt();
        System.out.println("Enter finding element");
        f= sc.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter eleemnts");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("The Value is "+a[f-1]);
    }
}
