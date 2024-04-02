public class Mathoperations {
    void addition(int a,int b)
    {
        int c=a+b;
        System.out.print(c+"\n");

    }
    void addition(double p,double q,double r)
    {
        double t=p+q+r;
        System.out.print(t+"\n");
    }
    void addition(String s1,String s2)
    {
        String s3=s1+s2;
        System.out.print(s3);
    }
}
class mathop{
    public static void main(String args[]){
        Mathoperations a=new Mathoperations();
        a.addition(10,20);
        a.addition(1.2,6.3,9.8);
        a.addition("subbu","prasad");
    }
}