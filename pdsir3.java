public class pdsir3 {
  
        public static void main(String[] args) {
            try{
                int arr[] = new int[5];
                System.out.println(arr[-9]);
    
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
               int a[] = new int[6];
                a[1] = 5;
                a[1]= a[1]/0;
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
            finally{
                System.out.println("I am finally I will obviouly be EXECUTED");
            }
            
        }
    
    
}
