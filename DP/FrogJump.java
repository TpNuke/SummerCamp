//MEMOIZATION
 public class FrogJump {

  private int[] a; // Array representing the positions
  private Integer[] memo; // Array for memoization

  public FrogJump(int[] a) {
      this.a = a;
      this.memo = new Integer[a.length];
  }

  public int f(int ind) {
      // Base case: if the frog is at the first step, no energy is required
      if (ind == 0) {
          return 0;
      }

      // Check if result is already computed
      if (memo[ind] != null) {
          return memo[ind];
      }

      // Calculate energy cost to jump from step (ind-1) to step ind
      int l = f(ind - 1) + Math.abs(a[ind] - a[ind - 1]);

      // Calculate energy cost to jump from step (ind-2) to step ind
      int r = Integer.MAX_VALUE;
      if (ind > 1) {
          r = f(ind - 2) + Math.abs(a[ind] - a[ind - 2]);
      }

      // Take the maximum of the two calculated energies
      memo[ind] = Math.min(l, r);

      return memo[ind];
  }

  public static void main(String[] args) {
      int[] a = {30,10,60,10,60,50}; // Example array representing positions
      int n = a.length; // Number of steps

      FrogJump frogJump = new FrogJump(a);
      int result = frogJump.f(n - 1); // Calculate the maximum energy required to reach the last step
      System.out.println("Maximum energy required: " + result);
  }
}
