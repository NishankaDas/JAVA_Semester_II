public class pdsir1 {
    public static void main(String[] args) {
        try{
            int a = 5;
            a = a/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
        
    }
}
