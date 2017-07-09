package diff100;

import java.util.Scanner;

/**
 * @author 0x306e
 * 
 *         http://judge.u-aizu.ac.jp/onlinejudge/review.jsp?rid=2417129
 * 
 */
public class SumOfConsecutiveIntegers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    while (num != 0) {
      int cnt = -0;
      for (int i = 1; i < num + 1; i++) {
        int sum = 0;
        for (int j = i; j < num + 1; j++) {
          sum += j;
          if (sum == num) {
            cnt++;
            break;
          } else if (sum > num) {
            continue;
          }
        }
      }
      System.out.println(cnt - 1);
      num = sc.nextInt();
    }

    sc.close();
  }

}
