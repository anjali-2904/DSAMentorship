import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++)
            System.out.print("\t");
            System.out.print("*\t");
        
            System.out.println();
        }
        
        sc.close();
    }
}
