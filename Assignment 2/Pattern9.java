import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j==n+1-i)
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        
        }
        sc.close();
    }
}
