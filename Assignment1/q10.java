import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=2;
        while(n!=0 &&i<=n){
            if(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }else{
                i++;
            }
           
        }
    }
}
