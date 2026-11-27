
// 자바에서 Thread 사용을 위한 문법 2가지

// (1)Thread 상속 받아서 구현
class MyThread extends Thread {

    public void run() {
        // 현재 Thread가 수행할 작업 여기에 코딩
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
// (2) Runnable interface 구현
class MyThread2 implements Runnable{
    public void run() {
        // 현재 thread가 해줘야 할 작업 여기(run() 메소드)에 코딩
        for (int i = 100; i < 1000; i+= 100 ) {
            System.out.println(i);
        }
    }
}

public class ThreadEx {
    // main thread : main method에 있는 코드를 실행해주는 thread
    public static void main(String args[]) {
        System.out.println("start");
        // 1번 방식으로 만든 thread에 사용
        MyThread m1 = new MyThread();
        //m1.run();  // 잘못된 코드 이렇게 사용하면 안됨
        m1.start(); // thread 구동시에는 start() 메소드 사용할것
        // m2.start(); // 2번째 방식에서는 start()바로 호출 안됨
        MyThread2 m2 = new MyThread2();
        Thread m2t = new Thread(m2);

        System.out.println("end");

    }
}
