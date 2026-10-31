// 자바에서는 함수(Function)를 메소드(method)라고 부름

class MyMethod {
    // (1) 메소드 정의를 위한 기본 문법
    // 접근제한자 리턴형 메소드 이름( 파라미터 ) { 코드 }
    // 접근제한자 : 누가 이 메소드를 쓸 수 있는가?(접근 할 수 있는가
    // => public / protected / default / private
    // public : 누구나 쓸 수 있다
    // private : 나만 쓸 수 있다 ( 나 = class 현재 클래스만 사용 가능
    // 리턴형 : 메소드를 호출결과로 뭘 받나?
    // => 기본자료형 / 객체형(기본자료형 말고 나머지)
    // => void 리턴값 없음, 코드 실행하고 끝
    // 파라미터 : 메소드를 호출할 때 어떤 값을 넘겨줄건가를 규정
    // 메소드이름 : 메소드 이름, 관례적으로 메소드 이름 첫 문자는 소문자로 사용

    public int add( int x , int y) {
        int result = x + y;
        // 메소드에 리턴값이 지정되어 있을 경우 "return: 문법을 사용하여 결과값 넘김
        return result;
    }
    public int subtract( int x , int y ) {
        int result = x - y;
        return result;
    }
    public double f_add( double x , double y ) {
        double result = x + y;
        return result;
    }
}


public class MethodEx {
    public static void main(String args[]) {
        // (2) 메소드 사용
        // 위에 만들어 놓은 메소드 사용
        // add() 메소드 메모리에 올려놓고 CPU에게 실행을 부탁해야함
        // 자바에서는 메소드만 메모리에 올릴수는 없고
        // 클래스 단위로 메모리에 올리는게 가능
        // 그래서 add()메소드가 포함되어있는 MyMethod class를 통쨰로 메모리에 올림
        MyMethod m = new MyMethod(); // -> MeMethod 클래스를 메모리에 올리겠다
        int r = m.add(10, 20);
        System.out.println( r );

        // 뺄셈 기능을 하는 메소드 정의 + 뺄셈 기능 메소드 호출
        // 위에서 이미 메모리에 올렸기 때문에 "MyMethod m = new MyMethod()"을 할 필요는 없음
        int z = m.subtract(10, 20 );
        System.out.println(z);

        // 실수 덧셈을 위한 메소드 추가 + 호출
        double r2 = m.f_add(0.1, 0.2 );
        System.out.println(r2);

    }
}
