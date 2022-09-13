package Programmers;

class 정수제곱근판별 {
    public long solution(long n) {
        long answer;

        for (answer = 1; answer <= n; answer++) {
            double remainder = (double)n/answer;
            if (remainder == answer) {
                return (answer + 1) * (answer + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        정수제곱근판별 test = new 정수제곱근판별();
        System.out.println(test.solution(121));
        System.out.println(test.solution(3));

        double sqrt = Math.sqrt(3);
        if (sqrt == (int)sqrt) {
            System.out.println("양의 제곱근이다");
        }
        else {
            System.out.println("양의 제곱근이 아니다");
        }
    }
}