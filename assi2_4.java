public class assi2_4{
    public static void main(String[] args) {
        int a=1,b,c;
        for(int i =1; i<5;i++)
        { b=a;
            for(int j=1;j<=i;j++)
            {
               
                System.out.print(b +" ");
                b = b*a;
                
            }
            System.out.println( );
            a++;
        }
    }
}