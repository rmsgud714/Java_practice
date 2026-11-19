public class ExceptionEx {
    public static void main(String args[]) {


        System.out.println("[Start]");

        int x = 10;
        int y = 0;
        int r = 0;
        try {
            r = x / y; // 예외가 발생하는곳
        }catch ( ArithmeticException e ) {
            System.out.println("산술연산 오류가 발생했습니다. 다시 입력하세요");
        }
        System.out.println( r );

        int [] xx = new int[3];
        xx[0] = 10;
        xx[1] = 20;
        try {
            xx[3] = 30;
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("배열 범위 넘어서는 문제가 발생됨");
        }



        int[] yy = {2,20};
        int result = 0;

        try{
            result = yy[1] / yy[0];
            System.out.println("나누기 성공");
        }catch (ArithmeticException e) {
            System.out.println("산술연산 오류 발생 2");
        }catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과 예외 발생2");
        }catch ( Exception e ) {
            System.out.println("뭔진 모르겠지만 오류 발생");
        }


        System.out.println("result = " + result);


        System.out.println("[End]");
    }
}
