import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int n=sc.nextInt();
        if(n>90)
        System.out.println("Excellent");
        else if(n>80 && n<=90)
        System.out.println("Good");
        else if(n>70 && n<=80)
        System.out.println("Fair");
        else if(n>60 && n<=70)
        System.out.println("Meets expectation");
        else 
        System.out.println("below par");

    }
}
