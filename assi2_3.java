import java.util.Scanner;

public class assi2_3 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and collum of the squre matrix");
        a = sc.nextInt();
        int arr[][] = new int[a][a];
        for(int i =0; i<a;i++)
        {
         for(int j =0; j<a; j++)
         {
            System.out.print("Enter the element: ");
            arr[i][j]= sc.nextInt();
         }   
        }
        b =0;
        for(int i =0; i<a;i++)
        {
         for(int j =0; j<a; j++)
         {
            if(i==j)
            {
                b = b + arr[i][j];
            }
         }   
        }
        System.out.println("The Sum of the right diagonal is : "+b);
        c=0;
        for(int i =a-1; i>=0;i--)
        {
         for(int j =0; j<a; j++)
         {
            c = c+arr[i][j];
         }   
        }
        System.out.println("The sum of the left diagonal is : "+c);
        int max = b>c?b:c;
        System.out.println("The naximum value of sum is : "+max);
    }
}
