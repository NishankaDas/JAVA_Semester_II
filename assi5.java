import java.util.*;
class assi5{
    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers :");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
       int max = (n1 > n2 && n1 > n3 && n1 > n4) ? n1 : ((n2 > n3 && n2 > n4) ? n2 : (n3 > n4 ? n3 : n4));
        System.out.println("Largest is "+ max);
    }
}