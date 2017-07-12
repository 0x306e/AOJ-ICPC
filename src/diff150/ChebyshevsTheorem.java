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
      if (data != 1) {
        System.out.println(cntPrimeNumber(data));
        data = sc.nextInt();
      } else {
        System.out.println(1);
        data = sc.nextInt();
      }
    }

    sc.close();
  }

  public static int cntPrimeNumber(int n) {
    int cnt = 0;
    if (isPrimeNumber(n)) {
      cnt--;
    }

    for (int i = n; i < n * 2; i++) {
      if (isPrimeNumber(i)) {
        cnt++;
      }
    }

    return cnt;
  }

  public static boolean isPrimeNumber(int n) {
    if (n < 2) {
      return false;
    } else if (n == 2) {
      return true;
    } else if ((n % 2) == 0) {
      return false;
    }

    double sqrtNum = Math.sqrt(n);
    for (int i = 3; i <= sqrtNum; i += 2) {
      if ((n % i) == 0) {
        return false;
      }
    }
    return true;
  }

}
