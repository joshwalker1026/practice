package array;

public class reverse {

    final int result=0;

  public int ClimbStairs(int n) {
    {
      if (n == 1) return 1;
      if (n == 2) return 2;
      return ClimbStairs(n - 1) + ClimbStairs(n - 2);
    }
  }


    public int Solution (int n){
        int [] dp = new int[n+1];

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        for (int i=3; i <= n; i++ ){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main(String [] args){

      reverse cs = new reverse();
      System.out.println(cs.ClimbStairs(7));
      System.out.println(cs.Solution(7));


  }

}