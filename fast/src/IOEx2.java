// character steam 계열을 사용해서
// 파일에 데이터 일고 쓰기


import java.io.*;

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
            BufferedReader br = new BufferedReader( fr );
            String str = br.readLine(); // 한줄 읽기
            System.out.println( str.trim() );  // trim　빈공백 제거

//            char[] c = new char[256];
//            fr.read( c );
//            String str = new String(c);

//            System.out.println(c[0]);
//            System.out.println(c[1]);
//
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();
//            System.out.print((char)result);
//            result = fr.read();





        } catch (FileNotFoundException e) {
            System.out.println("파일 없음, 오류 발생");
        } catch (IOException e) {
            System.out.println("파일에서 읽는 도중 문제 발생");
        }

    }
}