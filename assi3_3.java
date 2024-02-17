import java.util.*;
 interface specialArithmatic{

    

     void all_devisors();
    

}
 abstract class B implements specialArithmatic{
    static void all_devisors(int x)
    {
        int count =0;
    int arr[] = new int[x+1];
    for(int j =1;j<x;j++)
    {
        if(x%j==0)
        {
            arr[count]=j;
            count = count+1;
        }
    }
    System.out.println("These are the devisors");
    for(int j =0; j<count;j++)
    {   
        System.out.println(arr[j]);
    
    }
    
    }
}

public class assi3_3 {
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int c ;
        System.out.println("Enter the number : ");
        c = sc.nextInt();
        try{
        B.all_devisors(c);
        }
        catch(Exception ex){
            System.out.println("Cought");
        }

}
}
