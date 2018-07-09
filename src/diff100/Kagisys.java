package diff100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kagisys {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N, M;
    String[] U = new String[256];
    String[] T = new String[256];

    N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      U[i] = br.readLine();
    }

    M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++) {
      T[i] = br.readLine();
    }

    boolean state = false;
    for (int i = 0; i < M; i++) {
      if (search(T[i], U)) {
        if (!state) {
          System.out.println("Opened by " + T[i]);
        } else {
          System.out.println("Closed by " + T[i]);
        }
        state = !state;
      } else {
        System.out.println("Unknown " + T[i]);
      }
    }

  }

  public static boolean search(String s, String[] list) {
    for (int i = 0; i < list.length; i++) {
      if (s.equals(list[i])) {
        return true;
      } else if (s.equals(null)) {
        break;
      }
    }

    return false;
  }

}
