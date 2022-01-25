//Sum of two numbers

import java.util.*;
class oops
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n=obj.nextInt();
        System.out.println("Enter second number:");
        int m=obj.nextInt();
        int sum=0;
        sum=n+m;
        System.out.println("Sum="+sum);
    }
}