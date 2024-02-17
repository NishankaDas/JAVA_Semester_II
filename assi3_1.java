import java.util.*;
class A{
	Scanner sc = new Scanner(System.in);
	void ab(){
		int d,r,f,q;
		System.out.print("Enter a how many times you want the oporetion");
		int x = sc.nextInt();
		System.out.println("Enter The 1st Number For Operation");
			q = sc.nextInt();
			d=f=r = q;
			int num;
		for(int i=0; i<x;i++)
		{
			System.out.println("Enter The Number For Operation");
			num = sc.nextInt();
			d = d+num;
			f = f*num;
			r = r-num;
			
		}
		System.out.println("The result of Addition is : "+d+"  \nThe result of multliplication is : "+f+"  \nThe resultof substraction is : "+r);
	}


}
class assi3_1{
	
	public static void main(String[] ar)
	{
		A abc = new A();
		abc.ab();
		



	}
}
