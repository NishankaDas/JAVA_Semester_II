import java.util.*;

class assi2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of temperature in degree celcious : \t");
        float c = scan.nextFloat();
        float f ;
        float x = 1.8f;
        f = (x*c) + 32 ;
        System.out.println("The temperature in farenhite is = "+f);
    }
}