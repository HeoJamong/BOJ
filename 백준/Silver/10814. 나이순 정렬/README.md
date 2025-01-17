# [Silver V] 나이순 정렬 - 10814 

[문제 링크](https://www.acmicpc.net/problem/10814) 

### 성능 요약

메모리: 59992 KB, 시간: 1300 ms

### 분류

정렬

### 제출 일자

2025년 1월 14일 22:28:32

### 문제 설명

<p>온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)</p>

<p>둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.</p>

### 출력 

 <p>첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.</p>

### 풀이
1. 나이와 이름을 입력 받기 때문에 2차원 배열을 할당하여 값을 입력 받는다
```
		String[][] arr = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
```
2. 나이순으로 정렬하기위해 arr[][0] 값을 기준으로 정렬한다
```
Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
```
- 나이가 작은순으로 정렬을 해야하기 때문에 s1[0] - s2[0]을 한다
- 만약 나이가 같더라면 들어온 순서대로 배열에 저장되어 있기 때문에 따로 처리를 하지 않아도 된다.
