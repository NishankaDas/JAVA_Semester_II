import java.util.Scanner;

public class assi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of CC1 Out of 100 : ");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of CC2 Out of 100 : ");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of GE1 Out of 100 : ");
        float c = sc.nextFloat();
        int x = (int)(a+b+c)/3;
        if(x<101&& x>94)
        {
            System.out.println("O");
        }
        if(x<95&& x>84)
        {
            System.out.println("A+");
        }
        if(x<85&& x>74)
        {
            System.out.println("A");
        }
        if(x<75&& x>59)
        {
            System.out.println("B");
        }
        if(x<60&& x>49)
        {
            System.out.println("C");
        }
        if(x<50&& x>39)
        {
            System.out.println("D");
        }
        if(x<40){
            System.out.println("F");
        }

    }
}
