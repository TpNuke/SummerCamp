import java.util.*;

class FrogjumpRecursion{
  static int[] arr;
  public static int f(int n){
    if(n==0)return 0;
    int r;
    int l=f(n-1)+ Math.abs(arr[n]-arr[n-1]);
    if(n<=1)
    r=Integer.MAX_VALUE;
    else
    r=f(n-2)+ Math.abs(arr[n]-arr[n-2]);
    return Math.min(l,r);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    int n=sc.nextInt();
    System.out.println("Enter values: ");
    arr= new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Min cost of frog jump: "+f(n-1));
    sc.close();
  }
  
}
