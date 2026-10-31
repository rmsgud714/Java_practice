// 문자열 쪼개기
// 화면에서 입력받은 값들은 기본적으로 전무 문자열로 취급됨
// 예를 들어서 계산기 화면에서 입력한 계산식은
// 실제 2+3+1이라고 입력되었다 할지라도
// 얘네들은 "2+3+1"이라는 문자열로 취급됨

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String args[]) {
        // 계산기에서 입력된 계산식이 아래와 같다고 가정
         String str = "2+3+1";
        // 위 계산식 중간에 연산자가 뭔지를 파악하고
        // 그에따라 적절한 사칙연산 계산을 해주기 위해
        // 우선적으로 연산자와 피연산자를 분리해낸다

        // 문자열을 분리해낼때 기본적으로 자바에서
        // 제공하고 있는 클래스 StringTokenizer 클래스 사용
        StringTokenizer t = new StringTokenizer(str, "+");
        String temp = t.nextToken(); // 분리된 값 순서대로 가져오기
        // 뽑아낸 2랑 3 덧셈 -> 문자열을 숫자형으로 바꾸는 방법
        // 문자열 숫자형으로 변경
        int a = Integer.parseInt(temp);
        temp = t.nextToken();
        int b = Integer.parseInt(temp);

        int result = a + b;
        System.out.println(result);
        System.out.println( temp );

        temp = t.nextToken();
        System.out.println( temp );





    }
}
