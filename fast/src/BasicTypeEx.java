public class BasicTypeEx {
    public static void main(String[] args){
        // 자바의 기본 자료형
        // 1) 정수형
        // byte(용량 1바이트) - short(2바이트) - int(4바이트) - long(8바이트)
        // 바이트가 2배씩 늘어남
        byte b = 10; // 1바이트는 0~256까지 표현 가능 음수 포함은 -128~127
//        byte a = 129; // 129 는 에러가 나오는 모습
//
//        byte result = b + 1; // 불가능
        // int result = b + 1; 가능
        // short result = b + 1; 불가능


        // 2) 실수형 - 명시적으로 default 형이 double
        float f = 0.1f; // float type은 default type이 아니므로 사용이 f, F를 달아줘야함
        double d = 0.1;

        // 3) 문자형: 문자 하나를 저장하기 위한 기본 자료혈
        char c = 'A';
        char c2 = 65; // 아스키코드표 상에 값으로 저장도 가능
        System.out.println( c ); // A
        System.out.println( c2 ); // A

        // 4) 불린형 : true / false만 저장 가능
        boolean boo = true;
        boo = false;

    }
}
