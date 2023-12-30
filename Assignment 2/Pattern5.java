import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            System.out.print("\t");
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<i;j++)
                System.out.print("*\t");

            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++)
            System.out.print("\t");
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<i;j++)
                System.out.print("*\t");

            System.out.println();
        }
        sc.close();
    }
}
