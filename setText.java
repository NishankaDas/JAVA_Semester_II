class MyException extends Exception {
    public MyException(String s)
    {
        
        super(s);
    }
}
 
public class setText {
   
    public static void main(String args[])
    {
        try {
           
            throw new MyException("RKMVCC");
        }
        catch (MyException ex) {
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        }
    }
}
