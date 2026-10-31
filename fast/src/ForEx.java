public class ForEx {
    public static void main(String args[]) {
        // 반복문 : 특정 작업을 반복 수행하기 위해 사용
        //         연달아 이어오는 중복되는 코드 제거하기 위해 사용
        //         유지 보수 관리를 하기 위해
        // 반복문 문법
        // for ( 변수초기화 ; 조건식 ; 증감식 ) {
        //   반복할 코드 ;
        // }

        for ( int i = 0 ; i < 10 ; i++) {
            System.out.println("ABC"); // ABC 10번 반복
        }

        double num = 0;
        for (int i = 0; i < 10; i++) {
            num += 0.1; // 10진수 0.1을 이진수로 변경 불가
        } // 10 곱해서 나중에 10 나누는것도 방법
        System.out.println(num);  // 0.9999999...

        // 1~10까지 누적해서 덧셈 후 결과값 출력
        int total = 0;
        for (int i = 0 ; i <= 10 ; i++) {
            total = total + i;
        }
        System.out.println(total);
    }
}
