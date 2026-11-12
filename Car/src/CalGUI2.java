
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame 상속 받는 CalGUI2 클래스
// CalGUI2 클래스가 판때기(JFrame) 기능을 사용하기 위해 상속 받음
// is a 관계 => CalGUI2는 판때기다.
public class CalGUI2 extends JFrame implements ActionListener {

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton clear;
    JTextField jtf;
    JButton bAdd, bSub, bMulti, bDivi, bResult;

    public CalGUI2() {

        // 화면 배치 관리자: FlowLayout
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        jtf = new JTextField(10);

        // 숫자 버튼 생성
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

        // 연산자 버튼 생성
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMulti = new JButton("*");
        bDivi = new JButton("/");
        bResult = new JButton("=");

        // 버튼 감시자 등록
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMulti.addActionListener(this);
        bDivi.addActionListener(this);
        bResult.addActionListener(this);

        // 클리어 버튼 생성
        clear = new JButton("C");
        clear.setBackground(Color.RED);
        clear.addActionListener(this);

        // 화면에 컴포넌트 추가
        this.add(jtf);

        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
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

        // 화면 설정
        this.setSize(500, 300);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalGUI2();
    }

    // 버튼 클릭 시 실행되는 메소드
    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand(); // 클릭된 버튼 이름 가져오기

        switch (str) {

            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case "+":
            case "-":
            case "*":
            case "/":
                jtf.setText(jtf.getText() + str);
                break;

            // 클리어 버튼
            case "C":
                jtf.setText("");
                break;

            // 결과 버튼
            case "=":
                String t = jtf.getText(); // 계산식 가져오기

                CalLogic cl = new CalLogic();

                int result = cl.계산하기(t); // 계산 기능 호출

                // 계산 결과 화면에 보여주기
                jtf.setText("" + result);
                break;
        }
    }
}
