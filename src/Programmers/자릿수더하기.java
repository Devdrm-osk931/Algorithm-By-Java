package Programmers;

import java.util.*;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    /**
     * 숫자로 주어진 값 n을 문자열 배열로 변경한다
     */
    public String[] intToStr(int n) {
        String[] array = String.valueOf(n).split("");
        for (String string : array) {
            System.out.println("string = " + string);
        }
        return array;
    }

    public Integer[] strToInt(String s) {
        Integer[] digits = new Integer[s.length()];

        for(int i = 0; i < s.length(); i++) {
//            digits[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            digits[i] = s.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }


    public static void main(String[] args) {
        자릿수더하기 test = new 자릿수더하기();
        test.intToStr(1234);

        test.strToInt("1234");
    }
}
