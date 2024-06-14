//RECURSION
// public class ClimbStaircase {
//   public static int climb(int n){
//     if(n==1)return 1;
//     if(n==2)return 2;
//     return climb(n-1)+climb(n-2);
//   }
//   public static void main(String[] args) {
//     int n=4;
//     System.out.println(climb(n));
//   }
// }


//MEMOIZATION
// import java.util.*;
// public class ClimbStaircase {
//   public static int climb(int n){
//     if(n==1)return 1;
//     if(n==2)return 2;
//     if(dp[n]!=-1) return dp[n];
//     dp[n]=climb(n-1)+climb(n-2);
//     return dp[n];
//   }
//   public static void main(String[] args) {
//     int n=5;
//     dp=new int[n+1];
//     Arrays.fill(dp,-1);
//     System.out.println(climb(n));
//   }
//   public static int[] dp;
// }


//TABULATION
// public class ClimbStaircase {
//   public static void main(String[] args) {
//     int n=1;
//     int dp[]=new int[n+1];
//     dp[1]=1;
//     if(n==1){
//       System.out.println(dp[n]);return;
//     }
//     dp[2]=2;
//     for(int i=3;i<=n;i++){
//       dp[i]=dp[i-1]+dp[i-2];
//     }
//     System.out.println(dp[n]);
//   }
// }




//OPTIMIZED
public class ClimbStaircase {
  public static void main(String[] args) {
    int n=5;
    if(n==1){
      System.out.println(n);return;
    }
    int mprev=1;
    int prev=2;
    int curr;
    for(int i=3;i<=n;i++){
      curr=mprev+prev;
      mprev=prev;
      prev=curr;
    }
    System.out.println(prev);
  }
}