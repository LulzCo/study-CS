# Chapter 1. 기본 알고리즘

중간값을 구하는 비효율적인 코드

```java
static int med3(int a, int b, int c) {
	if ((b >= a && c <= a) || (b <= a && c >= a)) return a;
	else if ((a > b && c < b) || (a < b && c > b)) return b;
	return c;
}
```

- b >= a 와 a < b 처럼 같은 판단을 요구하는 연산이 중복으로 발생하기 때문에 비효율적이다



사전 판단 반복문과 사후 판단 반복문의 차이점

- 사전 판단 -> for, while -> 제어식이 먼저 실행한 후 본문 실행
- 사후 판단 -> do-while -> 본문이 먼저 실행한 후 제어식 실행
  - 무조건으로 본문이 최소 한번은 실행된다.

