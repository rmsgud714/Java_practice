public class IfEx {
    public static void main(String args[]) {
        // 제어문

        // 특정된 조건 제억, 즉 판정을 위해 사용되는 문법
        int score = 70;
//        // 점수가 90점 이상인지 확인
//        if (score >= 90) {
//            System.out.println("90점 이상이다");
//            System.out.println("두 라인 이상 실행 하려면 묶어줘야함");
//        } else  // 조건을 만족하지 않으면
//            System.out.println("90점 미만이다");

        // 자바 제어문 if 기본문법
        // if (조건식) {
        //      참일경우 실행 구문
        //  }  else {
        //      조건식을 만족하지 않을 경우 실행구문
        //  }

        if ( score >= 90 ) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

//        // 자바에서 연산자
        //산술연산자 : + - * /    ++  --  += -=
        int x = 10;
        x += 10; // x = x + 10;
        x -= 10; // x = x - 10;
        //x++; // x = x + 1
        //x--; // x = x - 1
        // ++ 의 위치에 따라 값이 달라짐
        // 앞에 있으면 즉시 +1이 되고 뒤에 있으면 다음 변수가 +1이 됨
//        System.out.println(x++); // 10
//        System.out.println(x); // 11

        // 논리연산자 : &, &&(and), |, ||(or), ==(같다면), !=(다르다면)
        // & 하나를 쓰면 앞에가 False여도 뒤에 코드를 확인하는데
        // && 두개를 쓰면 앞이 False여도 뒷 코드를 확인하지 않는다
        // || 앞에 조건 만족하면 두번째 조건 확인하러 가지 않음
        // | 앞에 조건 만족 여부 상관없이 두번째 조건 확인하러 감

        int k = 10;
        int j = 20;

        if ( k > 100 && (j += 10) > 20) {
            System.out.println("&& 두개사용");
        }
        System.out.println(j); // 20

        if ( k > 100 & (j += 10) > 20) {
            System.out.println("& 두개사용");
        }
        System.out.println(j); // 30

        if ( k == 10 & j != 20){
            System.out.println("둘다 만족");
        }
        if ( k == 10 | j != 20){
            System.out.println("둘중 하나만 만족");
        }
        if ( k > 100 && j > 20){
            System.out.println("&& 두개사용");
        }
    }
}
