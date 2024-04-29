package Recurssion;

import java.util.ArrayList;

public class Recurssion {
  public static void main(String args[]){
    // printSum(1,5,0);
    // int fact = factorial(10);
    // System.out.println(fact);
    // int[] a = printFibb(1);
    // for(int i=0;i<a.length;i++){
    //   System.out.print(a[i]+" ");
    // }
    // System.out.println();
    
    // int a = 0;
    // int b = 1;
    // int n= 12;
    // System.out.print(a+" ");
    // System.out.print(b+" ");
    // printFibbRecursion(a,b,n-2);

    // int x = 2,n=5;
    // int ans = powerOfX(x, n);
    // System.out.println(ans);


    int x = 2,n=8;
    int ans = powerOfXWithStackSizeLogN(x, n);
    System.out.println(ans);
   
  }
  public static void printSum(int i,int n,int sum){
    if(i==n+1){
     
      System.out.println(sum);
   
      return;
    }
    sum = i+sum;
    printSum(i+1, n, sum);
    System.out.println(i);
  }
  public static int factorial(int n){
    if(n==0 || n==1){
      return 1;
    }
    return n*factorial(n-1);
  }
  public static int[] printFibb(int n) 
  {
     int[] ans = new int[n];
      int a = 0;
      int b = 1;
      int c = 0;
      ans[0] = b;
     ans[1] = a+b;
        a = b;
        for(int i=2;i<n;i++){
          c = a+b;
          ans[i] = c;
          a = b;
          b = c;
        }
      return ans;
  }
  public static void printFibbRecursion(int a, int b, int n) 
  {
    if(n==0){
      return;
    }
    int c = a + b;
    System.out.print(c+" ");
       printFibbRecursion(b, c, n-1);
  }
  
  public static int powerOfX(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int xPown1 = powerOfX(x, n-1);
    return x * xPown1;
    
  }

  public static int powerOfXWithStackSizeLogN(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    if(n%2==0){
      return powerOfX(x, n/2) * powerOfX(x, n/2);
    }
    else{
      return powerOfX(x, n/2) * powerOfX(x, n/2) * x;
    }   
  }
}
