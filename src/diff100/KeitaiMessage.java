package diff100;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 0x306e
 *
 *         http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=2006
 * 
 */
public class KeitaiMessage {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String raw;
    char ch[] = new char[1025];
    int times = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < times; i++) {
      int cnt = 0;
      raw = sc.nextLine();

      for (int j = 0; j < raw.length(); j++) {
        ch[j] = raw.charAt(j);
      }

      for (int j = 0; j < raw.length(); j++) {
        try {
          if (ch[j] == '0' && ch[j - 1] != '0') {
            chooseLiteral(ch[j - 1], cnt);
            cnt = 0;
          } else if (ch[j] == '0') {
          } else {
            cnt++;
          }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
      }
      System.out.println();
    }

    sc.close();
  }

  public static void chooseLiteral(char c, int times) {
    switch (c) {
    case '1':
      times %= 5;

      switch (times) {
      case 1:
        System.out.print('.');
        break;

      case 2:
        System.out.print(',');
        break;

      case 3:
        System.out.print('!');
        break;

      case 4:
        System.out.print('?');
        break;

      case 0:
        System.out.print(' ');
        break;

      default:
        System.out.println("there is a bug");
      }
      break;

    case '2':
      printMes('a', times, 3);
      break;

    case '3':
      printMes('d', times, 3);
      break;

    case '4':
      printMes('g', times, 3);
      break;

    case '5':
      printMes('j', times, 3);
      break;

    case '6':
      printMes('m', times, 3);
      break;

    case '7':
      printMes('p', times, 4);
      break;

    case '8':
      printMes('t', times, 3);
      break;

    case '9':
      printMes('w', times, 4);
      break;

    default:
      System.out.println("there is a bug");
    }
  }

  public static void printMes(char c, int times, int maxTimes) {
    while (times > maxTimes) {
      times -= maxTimes;
    }
    for (int i = 0; i < times - 1; i++) {
      c++;
    }
    System.out.print(c);
  }

}
