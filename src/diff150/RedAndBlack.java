package diff150;

import java.util.Scanner;

/**
 * @author 3sodn
 * 
 *         http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1130
 *         今の僕には理解できない
 *
 */
public class RedAndBlack {
  static int cnt = 0;
  static int sx, sy;
  static int[][] map = new int[20][20];
  static char[][] ch = new char[20][20];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    sc.nextLine();

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

    dfs(sy, sx);
    System.out.println(cnt);
    sc.close();

  }

  public static void dfs(int y, int x) {
    if (x < 0 || y < 0 || x > 20 || y > 20 || map[x][y] != 0) {
      return;
    }

    map[x][y] = 1;
    cnt++;
    dfs(y, x + 1);
    dfs(y, x - 1);
    dfs(y + 1, x);
    dfs(y - 1, x);

  }

  public static void show(int maxX, int maxY) {
    for (int i = 0; i < maxY; i++) {
      for (int j = 0; j < maxY; j++) {
        System.out.print(ch[i][j]);
      }
      System.out.println();
    }
  }

  public static int parse(char ch) {
    if (ch == '.') {
      return 0;
    } else if (ch == '#') {
      return 1;
    }
    return 2;
  }

}
