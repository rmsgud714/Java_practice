import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 클릭에 대한 처리
// 1. 버튼 클릭이 되는지 지속적으로 감시
    // 1.1 Listener를 만들어서 버튼 클릭을 감시

// 2. 버튼이 클릭된걸 알게되면 우리가 원하는 코드를 실행
    // 2.1 Listener에 버튼이 클릭되었을때 실행할 코드를 구현

// ActionListener: 버튼 클릭, Enter 입력을 감시할 수 있는 기능을 가지고 있음

// 버튼 클릭을 감시해줄 Listener
class MyListener implements ActionListener {
    JButton b;
    int count=0;
    public MyListener(JButton x) { // x = b;
        b = x;
    }
    // 콜백 메소드
    public void actionPerformed(ActionEvent e) {
        // 버튼이 클릭되었을때 호출되는 메소드
//        System.out.println("버튼이 클릭됨!!!" );
        // 버튼 이름 값 바꾸기

        count++; // 버튼클릭될떄마다 1증가
        b.setText(count+"");
    }
}
class ButtenUI {
    JFrame jf;
    JButton b;

    public ButtenUI() {
        int c = 0;
        jf = new JFrame("타이틀명");
        b = new JButton("눌러라!");
        b.setText("버튼 이름 변경하기");

        jf.add(b); // 판때기에 버튼 추가

        // 버튼클릭 감시 기능을 가지고 있는 감시자 객체화
        MyListener m = new MyListener(b);
        // 누굴 감시할지 지정
        b.addActionListener( m ); // 버튼 b에 감시자 달아주기

        // 강제 종료 기능 활성화
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocation(250, 250);
        jf.setSize(300, 300);
        jf.setVisible(true); // 화면에 판때기 보여주기
    }

}

public class ButtenClickEx {
    // callback method
    public  static void main(String[] args) {
        new ButtenUI();
    }
}
