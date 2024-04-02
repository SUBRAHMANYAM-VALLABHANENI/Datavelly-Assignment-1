import java.util.Arrays;
import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,a,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        a=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==a)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}