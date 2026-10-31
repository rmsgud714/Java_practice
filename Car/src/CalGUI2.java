import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame 상속 받는 CalGUI2 클래스
// CalGUI2 클래스가 판때기(JFrame) 기능을 사용하기 위해 상속 받음
// is a 관계 => CalGUI2는 판때기다.
public class CalGUI2 extends JFrame implements ActionListener {
    //    JFrame f;   // 판때기
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;  // 버튼
    JButton clear;
    JTextField jtf; // 한 줄 입력
    JButton bAdd, bSub,bMulti, bDivi, bResult;
    public CalGUI2() {
//        f = new JFrame();
        // 화면 배치 관리자: FlowLayout -> 가장 기본 배치관리자 들어오는 순서대로 화면에 배치
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);  // 판때기에 화면 배치 관리 설정
        jtf = new JTextField(10);
//        b = new JButton("상속된 판때기");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMulti = new JButton("*");
        bDivi = new JButton("/");
        bResult = new JButton("=");

        b0.addActionListener(this);
        b1.addActionListener(this); // b1 버튼 감시자 등록
        b2.addActionListener(this); // b2 버튼 감시자 등록
        b3.addActionListener(this); // b3 버튼 감시자 등록
        b4.addActionListener(this); // b4 버튼 감시자 등록
        b5.addActionListener(this); // b5 버튼 감시자 등록
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);



        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMulti.addActionListener(this);
        bDivi.addActionListener(this);
        bResult.addActionListener(this);


        clear = new JButton("C");
        clear.setBackground(Color.RED);
        clear.addActionListener(this);
        this.add(jtf);
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);

        this.add(clear);
        this.add(bAdd);
        this.add(bSub);
        this.add(bMulti);
        this.add(bDivi);
        this.add(bResult);


        this.setSize(500, 300); // 판때기 크기
        this.setLocation(300, 300); // 판때기 위치
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // 강제 종료 활성화
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalGUI2();
    }

    //callmethod
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // 클릭된 버튼 이름 가져오기


        // 클리어 버튼
        if (str.equals("C")) {
            jtf.setText("");
        } else{
            jtf.setText(jtf.getText() + str);
        }


//        switch ( str ) {
//            case "1":
//                jtf.setText("1");
//                break;
//            case "2":
//                jtf.setText("2");
//            case "3":
//                jtf.setText("3");
//
//
//        }

//        if (str.equals("1")) {
//            jtf.setText("1");
//        } else if (str.equals("2")) {
//            jtf.setText("2");
//        } else if (str.equals("3")) {
//            jtf.setText("3");
//        } else if (str.equals("4")) {
//            jtf.setText("4");
//        } else if (str.equals("5")) {
//            jtf.setText("5");
//        }
    }
}