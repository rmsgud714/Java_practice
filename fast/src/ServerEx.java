// TCP/IP 기반의 서버

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    public static void main(String args[]) throws IOException {
        // TCP 기반의 통신을 위해서 일단 종이컵 필요
        // 서버에서 종이컵(Socket) 만들기
        ServerSocket ss = new ServerSocket(8888);
        // accept 기능
        // 클라이언트 접속을 대기 > 클라이언트가 접속하면 그 클라이언트랑 통신을 위한 종이컵 만들어 넘겨줌
        Socket server = ss.accept();
        InputStream is = server.getInputStream(); // 종이컵에서 read 를 위한 실
        byte[] b = new byte[256];
        is.read( b ); // b배열 크기만큼 읽어서 b배열에 저장

        System.out.println((char)is.read());

    }
}