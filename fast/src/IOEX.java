import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

import static java.nio.file.Files.write;
// 여기 코드 통째로 외워야함 중요한 부분
// 자바에서 데이터 입출력 하는 방법
public class IOEX {
    public static void main(String args[]) throws IOException {
        // byte stream 계열을 사용한 입출력
        FileOutputStream fos = new FileOutputStream( "C://swtest/test.txt");
//        fos.write('가'); // 한글은 1byte로 표현이 불가

        // 버퍼기능 사용 가능
        BufferedOutputStream bos = new BufferedOutputStream(fos); // 체이닝

        String str ="ABC김길동";
        byte[] b = str.getBytes(); // 문자열 -> byte 배열로 변경
        bos.write( b ); // 여기서 파일에 바로 쓰는게 아니라 버퍼에 쌓는다
        bos.flush(); // 버퍼가 꽉차지 않아도 지금 밀어내자

        FileInputStream fis = new FileInputStream("C://swtest/test.txt");
//        int result = fis.read();
//        System.out.println( result ); // 아스키번호로 출력됨

        // 문자열로 꺼내도 안됨
//        char result = (char)fis.read();
//        System.out.println( result );
//        result = (char)fis.read();
//        System.out.println( result );
//        result = (char)fis.read();
//        System.out.println( result );
//        result = (char)fis.read();
//        System.out.println( result );
//        result = (char)fis.read();
//        System.out.println( result );

        byte [] t = new byte[256];
        fis.read( t ); // 256바이트 만큼 읽어서 배열 t에 저장
        // 여러 바이트를 한꺼번에 -> 문자열로
        String temp = new String( t ); // 바이트배열 -> 문자열
        System.out.println(temp);
        System.out.println(temp.trim()); // 빈공백 제거
        System.out.println("END");

    }
    }

