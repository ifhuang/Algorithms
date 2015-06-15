package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PetyaandCountryside {

  static BufferedReader in;
  static PrintWriter out;
  static StringTokenizer tok;

  static void solve() throws Exception {
    int n = nextInt();
    int[] a = nextIntArray(n, 0);
    int[] left = new int[n];
    left[0] = 0;
    for (int i = 1; i < n; i++)
      if (a[i] >= a[i - 1])
        left[i] = left[i - 1];
      else
        left[i] = i;
    int[] right = new int[n];
    right[n - 1] = n - 1;
    for (int i = n - 2; i >= 0; i--)
      if (a[i] >= a[i + 1])
        right[i] = right[i + 1];
      else
        right[i] = i;
    int max = 0;
    for (int i = 0; i < n; i++)
      max = Math.max(max, right[i] - left[i] + 1);
    out.println(max);
  }

  public static void main(String args[]) {
    try {
      in = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(new OutputStreamWriter(System.out));
      solve();
      in.close();
      out.close();
    } catch (Throwable e) {
      e.printStackTrace();
      System.exit(1);
    }
  }

  static int nextInt() throws IOException {
    return Integer.parseInt(next());
  }

  static int[] nextIntArray(int len, int start) throws IOException {
    int[] a = new int[len];
    for (int i = start; i < len; i++)
      a[i] = nextInt();
    return a;
  }

  static long nextLong() throws IOException {
    return Long.parseLong(next());
  }

  static long[] nextLongArray(int len, int start) throws IOException {
    long[] a = new long[len];
    for (int i = start; i < len; i++)
      a[i] = nextLong();
    return a;
  }

  static String next() throws IOException {
    while (tok == null || !tok.hasMoreTokens()) {
      tok = new StringTokenizer(in.readLine());
    }
    return tok.nextToken();
  }

}
