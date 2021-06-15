public class LucasNumbers
{
    public static void main(String[] args) {
        int a=2,b=1,c,i;
        System.out.print("First 10 Lucas Numbers:\n2\n1\n");
        for(i=1;i<=8;i++){
            c=a+b;
            System.out.print(c+"\n");
            a=b;
            b=c;
        }
    }
}