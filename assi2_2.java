import java.util.Scanner;

public class assi2_2 {
    public static void main(String[] args) {
        int a,b,c;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        a = sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element ");
        b = sc.nextInt();
        for(int i = 0; i<a;i++)
        {
           if( arr[i] == b)
           {
            System.out.println("The index number is  = "+i);
            break;
           }
        }

    }
}
