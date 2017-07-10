/*
 * Main.c
 *
 *  Created on: 2017/07/10
 *      Author: 3sodn
 *
 *  judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1172
 *
 */
#include <stdio.h>

int main(void);
int cntPrimeNumber(int n);
int isPrimeNumber(int n);

int main(void) {
  int data;
  scanf("%d", &data);

  while(data != 0) {
    printf("%d\n", cntPrimeNumber(data));
    scanf("%d", &data);
  }
}


int cntPrimeNumber(int n) {
  int cnt = 0, i;

  for (i = n + 1; i < n * 2; i++) {
    if (isPrimeNumber(i) == 1) {
      cnt++;
    }
  }

  return cnt;
}

int isPrimeNumber(int n) {
  int i;

  if ((n % 2) == 0) {
    return 0;
  }

  for (i = 3; i < n; i += 2) {
    if ((n % i) == 0) {
      return 0;
    }
  }
  return 1;
}
