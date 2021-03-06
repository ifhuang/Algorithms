package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LittlePigsandWolves {

  static BufferedReader in;
  static PrintWriter out;
  static StringTokenizer tok;

  static void solve() throws Exception {
    int n = nextInt(), m = nextInt();
    char[][] c = new char[n][m];
    for (int i = 0; i < n; i++)
      c[i] = next().toCharArray();
    int[][] d = { {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int ans = 0;
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        if (c[i][j] == 'W')
          for (int k = 0; k < d.length; k++) {
            int x = i + d[k][0];
            int y = j + d[k][1];
            if (x >= 0 && x < n && y >= 0 && y < m && c[x][y] == 'P') {
              ans++;
              c[x][y] = '.';
              break;
            }
          }
    out.println(ans);
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
