// 화면에 입력된 계산식 전달 받아서
// 실제 계산을 처리하기 위한 클래스


import java.util.StringTokenizer;

public class CalLogic {
    // 계산식을 문자열로 던져주면 계산결과를 리턴해주는 메소드 구현
    public int 계산하기(String str) {

            // 위 계산식 중간에 연산자가 뭔지를 파악하고
            // 그에따라 적절한 사칙연산 계산을 해주기 위해
            // 우선적으로 연산자와 피연산자를 분리해낸다

            // 문자열을 분리해낼때 기본적으로 자바에서
            // 제공하고 있는 클래스 StringTokenizer 클래스 사용
            StringTokenizer t = new StringTokenizer(str, "+-*/", true);

            // 뽑아낸 2랑 3 덧셈 -> 문자열을 숫자형으로 바꾸는 방법
            // 문자열 숫자형으로 변경
            int result = 0;
            while (t.hasMoreTokens()) { // 더 가져올 토큰이 있다면
                String temp = t.nextToken(); // 분리된 값 순서대로 가져오기

                switch (temp) {
                    case "+":
                        result = result + Integer.parseInt(t.nextToken());
                        break;
                    case "-":
                        result = result - Integer.parseInt(t.nextToken());
                        break;
                    case "*":
                        result = result * Integer.parseInt(t.nextToken());
                        break;
                    case "/":
                        result = result / Integer.parseInt(t.nextToken());
                        break;
                    default: // 위 모든 케이스에 해당하지 않는다면
                        // 숫자가 오게됨

                        result = result + Integer.parseInt(temp);
                }
            }

            // 결과값을 return 해줌
            return result;
        }
    }
