# [Silver V] 단어 정렬 - 1181 

[문제 링크](https://www.acmicpc.net/problem/1181) 

### 성능 요약

메모리: 24132 KB, 시간: 460 ms

### 분류

정렬, 문자열

### 제출 일자

2025년 1월 14일 22:08:35

### 문제 설명

<p>알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.</p>

<ol>
	<li>길이가 짧은 것부터</li>
	<li>길이가 같으면 사전 순으로</li>
</ol>

<p>단, 중복된 단어는 하나만 남기고 제거해야 한다.</p>

### 입력 

 <p>첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.</p>

### 출력 

 <p>조건에 따라 정렬하여 단어들을 출력한다.</p>

### 풀이
1. 중복된 문자열을 제거하기위해 문자열을 stream으로 변환 후 distinct메소드를 사용한다
```
arr = Arrays.stream(arr).distinct().toArray(String[]::new);
```
2. 주어진 조건대로 길이가 짧은 것부터 정렬을 하고 길이가 같을 경우 사전 순으로 정렬을 하기 위해 sort함수를 overrite한다
```
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				return o1.compareTo(o2);
			}
		});
```
- compare함수를 재정의하여 길이가 다르다면 두 문자열의 차이를 리턴한다
- - 리턴 값이 음수일 경우 위치가 바뀌지 않고
  - 리턴 값이 양수일 경우 o2 문자열이 앞으로 오게 된다.
