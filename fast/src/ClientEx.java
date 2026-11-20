import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


//// 엔터 입력 감시 / 처리를 위한 클래스
//class MyEnterListener implements ActionListener {
//    // callback method
//    @Override
//    public void actionPerformed(ActionEvent e) {
////         엔터 눌러졌을 때 콜백으로 호출
//        try {
//
//
////         TCP 기반 통신을 위해 클라이언트에서 종이컵 생성
//            Socket client = new Socket("210.101.236.171", 8888);
////        Socket client = new Socket("217.0.0.1",8888); // 서버주소, 포트번호
//            // 서버로 데이터 보내기
//            OutputStream os = client.getOutputStream(); // 종이컵에서 데이터출력을 위한 실뽑아내기
//            String msg = "점심 뭐 먹어요?";
//            os.write(msg.getBytes());   // 문자열 -> byte 배열로 변경후 전송
//        } catch ( IOException ignore ) {
//            System.out.println("문제 발생");
//        }
//    }
//}




// 한줄짜리 채팅메시지 전송을 위한 입력창
class ClientUI extends JFrame{
    JTextField jf;

    // 엔터 입력 감시 / 처리를 위한 클래스
    class MyEnterListener implements ActionListener {
        // callback method
        @Override
        public void actionPerformed(ActionEvent e) {
//         엔터 눌러졌을 때 콜백으로 호출
            try {
//         TCP 기반 통신을 위해 클라이언트에서 종이컵 생성
                Socket client = new Socket("210.101.236.171", 8888);
//        Socket client = new Socket("217.0.0.1",8888); // 서버주소, 포트번호
                // 서버로 데이터 보내기
                OutputStream os = client.getOutputStream(); // 종이컵에서 데이터출력을 위한 실뽑아내기
                String msg = jf.getText();
                os.write(msg.getBytes());   // 문자열 -> byte 배열로 변경후 전송
                jf.setText("");
                client.close();
            } catch ( IOException ignore ) {
                System.out.println("문제 발생");
            }
        }
    }

    public ClientUI(){
        jf = new JTextField(30);
        this.add(jf); // 한줄 입력창 판때기(현재 클래스)에 추가

        MyEnterListener m  = new MyEnterListener(); // 엔터 삼시자 객체화
        jf.addActionListener( m ); // 입력창에 감시자 달아주기

        // 판때기 강제종료 기능 활성화
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setSize(300,100);
        this.setLocation(300,300);
        this.setVisible(true);

    }
}




// TCP / IP Client
public class ClientEx {

    public static void  main(String args[]) throws IOException {
        new ClientUI();
//        // TCP 기반 통신을 위해 클라이언트에서 종이컵 생성
//        Socket client = new Socket("210.101.236.171",8888);
////        Socket client = new Socket("217.0.0.1",8888); // 서버주소, 포트번호
//        // 서버로 데이터 보내기
//        OutputStream os =  client.getOutputStream(); // 종이컵에서 데이터출력을 위한 실뽑아내기
//        String msg = "";
//        os.write(msg.getBytes());   // 문자열 -> byte 배열로 변경후 전송


    }
}