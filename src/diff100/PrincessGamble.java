package diff100;

import java.util.Scanner;

/**
 * @author 0x306e
 * 
 *         http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=2018
 *
 */
public class PrincessGamble {

  public static void main(String[] args) {
    int n, m, p, sum = 0;
    int[] x = new int[1001];
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    p = sc.nextInt();
    sc.nextLine();

    while (n != 0) {
      for (int i = 0; i < n; i++) {
        x[i] = Integer.parseInt(sc.nextLine());
        sum += x[i];
      }

      try {
        System.out.println((sum * (100 - p)) / x[m - 1]);
      } catch (ArithmeticException e) {
        System.out.println("0");
      }

      sum = 0;
      n = sc.nextInt();
      m = sc.nextInt();
      p = sc.nextInt();
      sc.nextLine();
    }
    sc.close();
  }

}
