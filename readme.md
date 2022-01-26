# 알고리즘 공부

---

[유튜브] 바킹독 알고리즘 강의, 문제 풀기 전 풀이법 생각 (종이에 써가며)

<aside>
💡 Lv1. 언어 기본 문법 익히기

</aside>

- 백준 브론즈 ~ 실버

<aside>
💡 Lv2.기본 알고리즘 공부/  자료구조 공부

</aside>

- 완전 탐색, DFS/BFS, 시뮬레이션, 큐, 스택, 우선순위 큐, 해시맵
- 문제 풀어가며 습득 - ***삼성 기출 문제***

<aside>
💡 Lv3. 공부 순서

</aside>

- 시간 재고 문제 풀기
- 실제 시간 보다 넉넉하게 -> 같게 -> 부족하게
- 반복 , 또 반복

<aside>
💡 Lv4. 공부 순서

</aside>

- 중상급 알고리즘 개념 공부

 — DP, 문자열 처리, 이분탐색, 투포인터, 위상정렬, 크루스칼, 다익스트라, 플로이드 와샬, 트라이, 유니온 파인드

- 문제 풀어서 습득 - ***카카오 기출 문제 (인턴/ 블라인드 공채)***

---

### ***쉬운 문제 먼저 풀기***

- 기본 알고리즘 (DFS/BFS, 구현 문제)
- 1 Round 무작정 풀기, 2 Round 시간 재고 풀기 > 하루 이틀에 한 문제씩
- 삼성 기출 풀기 & 프로그래머스
    
    프로그래머스 고득점 키트 및 연습 문제 풀이
    
    ---
    

# Basic

- 소수점이 나오는 연산에는 double 자료형 활용

---

# Array

- 배열 선언
    - 자료형[] 변수 = {데이터1, 데이터2, 데이터3, ...};
    - 자료형[] 변수 = new 자료형[배열크기];
    - 크기 할당 없이 → int A[] = null;
    - int []A = new int[length]
    - 최대/ 최소/ 값 인덱스 구하기
    
    ```java
    int max, min, maxIndex 선언 -> 
    if(A[j]>=max){
    	max = A[j];
    	maxIndex = j;
    	}
    ```
    

---

# Scanner

- **Scanner 주요 메소드**
    - String next() → 문자열로 리턴
    - int nextInt() → 정수로 리턴
    - String nextLine() → ‘\n’을 포함하는 한 라인을 읽고 ‘\n’을 버린 나머지만 리턴
- **System.in ?**
    - InputStream 타입의 필드
    ```java
    Scanner scan = new Scanner(System.in) 
    =>
    InputStream inputstream = System.in
    Scanner scan = new Scanner(inputstream);
    ```
- 입력 값으로 **배열 생성하기**
    
    ```java
    int A[] = new int[];
    	for(int i=0; i<A.lenght; i++){
    		A[i] = scanner.nextInt()
    ```
    
- **EOF  → 입력에서 더이상의 읽을 수 있는 데이터가 없을 때 반복문 종료.**
    
    ```java
    while(scanner.hasNext()){
    
    }
    #hasNextInt() -> 입력값이 정수일경우 true를 반환하고 정수가 아닐 경우 바로 입력 종료
    ```
    
- **CharAt → String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환**
    - charAt → 쓸 경우 아스키코드 대응 문자가 나오지 않게 -’0’ 선언
    
    ```java
    String str =new String();
    str = '안녕하세요';
    char c ='';
    c = str.charAt(0);
    System.out.println(c) ==> '안'
    ```
- **charAt()**
    - Scanner는 char타입 데이터 받을 수 없음 -> 효율
    - String으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 변환
    - charAt(0) -> 원래의 값