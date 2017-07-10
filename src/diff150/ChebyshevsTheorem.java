package diff150;

import java.util.Scanner;

/**
 * @author 3sodn
 * 
 *         judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1172
 *
 */
public class ChebyshevsTheorem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int data = sc.nextInt();

    while (data != 0) {
      System.out.println(cntPrimeNumber(data));
      data = sc.nextInt();
    }

    sc.close();
  }

  public static int cntPrimeNumber(int n) {
    int cnt = 0;

    for (int i = n + 1; i < n * 2; i++) {
      if (isPrimeNumber(i)) {
        cnt++;
      }
    }

    return cnt;
  }

  public static boolean isPrimeNumber(int n) {
    if ((n % 2) == 0) {
      return false;
    }

    for (int i = 3; i < n; i += 2) {
      if ((n % i) == 0) {
        return false;
      }
    }
    return true;
  }

}
