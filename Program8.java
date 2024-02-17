import java.util.*;
 class Program8
{
    int sumld,sumrd,n,arr[][];

   Program8()
    {
        sumld=0;
        sumrd=0;
    }
    Program8(int sz)
    {
        this();
        n=sz;
    }
    public void Accept()
    {
        arr=new int[n][n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array arr[][]");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            arr[i][j]=sc.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("The matrix formed:");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public String toString()
    {
        for (int i=0;i<n;i++)
        sumld+=arr[i][i];
        System.out.println("Sum of left diagonal elements:"+sumld);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if ((i+j)==n-1)
                sumrd+=arr[i][j];
            }
        }
        System.out.println("Sum of right diagonal elements:"+sumrd);
        if (sumrd>sumld)
        return(Integer.toString(sumrd));
        else
        return (Integer.toString(sumld));
    }
    public static void main(String [] args)
    {
        Program8 ob8=new Program8(Integer.parseInt(args[0]));
        ob8.Accept();
        ob8.Display();
        System.out.println("Maximum diagonal sum result:"+ob8);
    }
}