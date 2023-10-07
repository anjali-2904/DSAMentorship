import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            int flag=1;
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.println("Prime");
            else
            System.out.println("NOT prime");
        }
    }
}
