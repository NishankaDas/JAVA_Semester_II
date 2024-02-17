import java.util.*;


public class assi2_1 {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    int x=0,i;
    int arr[] = new int[10];
    for( i =0; i<10;i++)
    {
        arr[i] = sc.nextInt();
        x = x + arr[i];
    }
    System.out.print("The sum of the array is : " + x);
}

}
