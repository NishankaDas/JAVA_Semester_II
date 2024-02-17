import java.util.*;
public class assi2_6 {
    int add(int a, int b)
    {
        return a+b;
    }
    int sub(int a, int b)
    {
        return a-b;
    }
    int mul(int a, int b)
    {
        return a*b;
    }
    float div(float a, float b)
    {
        return a/b;
    }
    void display()
    {   Scanner s = new Scanner(System.in) ;
        int d,r;
        d = s.nextInt();
        r = s.nextInt();
        System.out.println("The result of Addition is : " +add(d,r));
        System.out.println("The result of Substraction is : " +sub(d,r));
        System.out.println("The result of Multiplication is : " +mul(d,r));
        System.out.println("The result of Division is : " +div((float)d,(float)r));
    }
    public static void main(String[] args) {
        assi2_6 a = new assi2_6();
        a.display();
    }
}
