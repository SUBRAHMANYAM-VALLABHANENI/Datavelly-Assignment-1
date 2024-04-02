import java.util.Scanner;
public class maximumelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    } 
}