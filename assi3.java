import java.util.Scanner;

public class assi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length and width of rectangle : ");
        int l = scan.nextInt();
        int w = scan.nextInt();
        System.out.println("The area of the rectangle is = "+ l*w);
        System.out.println("The perameter of the rectangle is = "+ 2*(l+w));
    }
}
