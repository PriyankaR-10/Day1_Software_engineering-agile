Java 

package com.company;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
{
//PRIME NUMBERS
          int a,b;
        System.out.println("Enter two numbers : \n");
          Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("sum of 2 numbers : "+c);
        String str;
        System.out.println("Enter your name : ");
        str=sc.nextLine();
        System.out.println("Name entered is "+str);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is a even number");
        }
        else
        {
            System.out.println(n+" is a odd number");
       }

// TO FIND LARGEST OF 3 NUMBERS using ternary operator:
       System.out.println("Enter the 3 digits");
       int a= sc.nextInt();
       double b= sc.nextDouble(
       long c= sc.nextLong();
        double l1 = (a>b)?a:b;
     double l2 = (l1>c)?l1:c;
     System.out.println("Largest number : "+l2);

//TYPE CASTING : (1).IMPLICIT (2).EXPLICIT
      float f1=13.33F;
         double  d1=f1;
        System.out.println(f1);
        System.out.println(d1);
          float f2=d1; throws an error coz d1 = 8B n f2 = 4B; to avoid this v implement type casting
        int i1=(int)d1; // EXPLICIT CONVERSION N DECIMAL POINTS ARE TRUNCATED
        System.out.println(i1);
        System.out.printf(" formatted d1 : %.2f ",d1);

//UNARY OPERATOR : Operator working on single operand
        int i=10;
        int ans = ++i; // inc n assign to ans
        System.out.println("pre-inc");
        System.out.println(i);
        System.out.println(ans);
        int a1=i++;
        System.out.println("post-inc");
        System.out.println(i);
        System.out.println(ans);
        int a2=--i;
        System.out.println("pre-dec");
        System.out.println(i);
        System.out.println(ans);
        int a3=i--;
        System.out.println("post-dec");
        System.out.println(i);
        System.out.println(ans);
        int x=3,y=5,z=10;
        int r1=z+++y-y+z+++x;
        System.out.println(r1);
        int r2 = ++z+ y -y +z + x++;
        System.out.println(r2);
        int r3 = z + ++y - y++ + ++z + ++x;
        System.out.println(r3);

//PALINDROME 
        System.out.println("Enter the number to be reversed ");
        int num=sc.nextInt();
        int rnum = reverseNum(num);
        System.out.println(rnum);
    }
    public static int reverseNum(int n)
    {
        int rem=0,revnum=0;
        while(n!=0)
       {
            rem=n%10;
            revnum=revnum*10+rem;
            n=n/10;
       }
        return revnum;
//PRIME NUMBER
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(isPrime(num))
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
   }
    public static boolean isPrime(int num)
    {
        boolean flag=false;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0) {
                flag = true;
                break;
            }
        }
       return flag;
   }
//FACTORIAL OF A NUMBER
    int n=sc.nextInt();
    int f=fact(n);
        System.out.println(f);
    }
    public static int fact(int n)
    {
        if(n==0||n==1)
            return 1;
       else
            return(n*fact(n-1));
   }
//SWITCH CASE STATEMENTS
        System.out.println("Enter the month number : ");
        int mno=sc.nextInt();
        String days = tofinddays(mno);
        System.out.println("The month number "+mno+" "+ days);
    }
    public static String tofinddays(int mno)
    {
        String msg;
        switch(mno)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:  msg= " has 31 days";
                        break;
            case 2:   msg = "has 28/29 days";
                        break;
            case 4:
            case 6:
            case 9:
            case 11: msg=" Has 30 days";
                    break;
            default: return("Invalid month number");
        }
        return msg;
   }
}
