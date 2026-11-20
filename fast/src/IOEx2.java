// character steam 계열을 사용해서
// 파일에 데이터 일고 쓰기


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx2 {
    public static void  main(String args[]){

        // 파일에 문자 데이터 쓰기
//        try {
        try {
            FileWriter fw = new FileWriter("c://swtest/test3.txt");
            fw.write("김근형2423003");
            fw.flush();
        } catch (IOException e) {
            System.out.println("파일에 데이터 쓰다가 문제 발생");
        }
//        }

//        catch (Exception e) {
//            System.out.println("파일에 데이터 쓰다가 문제 발생");
//        }

        try {
            FileReader fr = new FileReader("c://swtest/test3.txt");
            int result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();
            System.out.print((char)result);
            result = fr.read();





        } catch (FileNotFoundException e) {
            System.out.println("파일 없음, 오류 발생");
        } catch (IOException e) {
            System.out.println("파일에서 읽는 도중 문제 발생");
        }

    }
}