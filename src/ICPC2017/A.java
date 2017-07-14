package ICPC2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {

  public static void main(String[] args) throws IOException {
    int n, m, max = 0;
    int[] a = new int[1001];
    String tmp;
    StringTokenizer st;
    
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Aans.txt"))); //ｲｷﾘﾌﾟｽなので入出力すディレクトリはsrcとbinとかあるとこ
    Scanner sc = new Scanner(new BufferedReader(new FileReader("test.txt"))); //同上
    
    while (true) {
      tmp = sc.nextLine();
       st = new StringTokenizer(tmp);
       n = Integer.parseInt(st.nextToken()); //問題のエラー箇所
       m = Integer.parseInt(st.nextToken()); //parseInt()がNumberFormatExceptionを吐く
                                             //本番用のテストケースだとNoSuchElementExceptionとか出た(解決の糸口) 但し眠いので寝る
      
      if(n == 0) {
        break;
      }
      
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
    }
    
    /*一番大事な処理部分(by 無料@steam1523)*/
    for (int i = 0; i < n;i++) {
      if (a[i] > m) {}
      else {

        for (int j = 0; j < n; ++j) {
          if (i==j){}//
          else if (a[i] + a[j] > m) {}
          else if (a[i] + a[j] > max) {
            max = a[i] + a[j];
          }
          else {}
        }
      }
    }
    /*--一番大事な処理部分--*/

    if (max != 0) {
      pw.println(max);
    } else {
      pw.println("NONE");
    }
    
    pw.close();
    sc.close();
    
  }

}

/* C++で書いたやつ(by 無料@steam1523)
int main(){
  int n, m, max;
  int a[1000];
  while(true){
    max = 0;
    cin >> n >> m;
    if (n == 0)break;
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
    }

    for (int i = 0; i < n;++i) {
      if (a[i] > m) {}
      else {

        for (int j = 0; j < n; ++j) {
          if (i==j){}//
          else if (a[i] + a[j] > m) {}
          else if (a[i] + a[j] > max) {
            max = a[i] + a[j];
          }
          else {}
        }
      }
    }

    //cout << max << endl;
    if (max == 0)cout << "NONE" << endl;
    else cout << max << endl;
  
  }
*/
