package leetcode.algorithms;

// https://leetcode.com/problems/bitwise-and-of-numbers-range/
public class BitwiseANDofNumbersRange {

  public int rangeBitwiseAnd(int m, int n) {
    int c = 0;
    while (m != n) {
      m >>= 1;
      n >>= 1;
      c++;
    }
    return m << c;
  }

}
