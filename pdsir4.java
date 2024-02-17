import java.util.*;
public class pdsir4 {
    static void checkAge(int age) throws ArithmeticException {
      if (age < 18) {
        throw new ArithmeticException("You Can't Vote");
      }
      else {
        System.out.println("Access granted");
      }
    }
    
  
    public static void main(String[] args) {
     pdsir4 a = new pdsir4();
    
      a.checkAge(17); 
    }
  }
