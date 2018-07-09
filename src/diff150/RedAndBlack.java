package diff150;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 3sodn
 * 
 *         http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1130
 *         今の僕には理解できない
 *
 */
public class RedAndBlack {
  static int cnt;
  static int w, h;
  static int[][] map = new int[21][21];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] ch = new char[21][21];
    int sx = 0, sy = 0;

    while (true) {
    for (int i = 0; i < map.length; i++) {
      Arrays.fill(map[i], 1);
    }
      cnt = 0;
      w = sc.nextInt();
      h = sc.nextInt();
      sc.nextLine();

      if (w == 0) {
        break;
      }
      for (int i = 0; i < h; i++) {
        String str = sc.nextLine();
        ch[i] = str.toCharArray();

        for (int j = 0; j < w; j++) {
          map[i][j] = parse(ch[i][j]);
          if (parse(ch[i][j]) == 2) {
            sx = i;
            sy = j;
          }
        }
      }

      show(21, 21);

      dfs(sx, sy);
      System.out.println(cnt);
      
      show(21, 21);
    }

  }

  public static void dfs(int x, int y) {
    show(10, 10);
    if (x < 0 || y < 0 || x > w + 1 || y > h + 1 || map[x][y] == 1) {
      return;
    }

    map[x][y] = 1;
    cnt++;
    dfs(x, y + 1);
    dfs(x, y - 1);
    dfs(x + 1, y);
    dfs(x - 1, y);
    return;
  }

  public static void show(int maxX, int maxY) { //map[][]の中身を表示するやつ
    for (int i = 0; i < maxY; i++) {
      for (int j = 0; j < maxY; j++) {
        System.out.print(map[i][j]);
      }
      System.out.println(".");
    }
  }

  public static int parse(char ch) { //0, 1, 2 に変換するやつ
    if (ch == '.') {
      return 0;
    } else if (ch == '#') {
      return 1;
    }
    return 2;
  }

}
