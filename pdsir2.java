public class pdsir2 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            System.out.println(arr[70]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array not found");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format not found");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array size in -ve");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You divided by 0");
        }
        try{
            int x = 1;
            x = x/0;
        }
       
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array not found");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format not found");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array size in -ve");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You divided by 0");
        }
        
    }
}
