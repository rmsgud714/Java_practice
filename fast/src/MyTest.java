public class MyTest {
    public static void main(String[] args){
        int x = 10;
        int y = x;
        x = 100;
        System.out.println( "x == " + x); // 100
        System.out.println( "y == " + y); // 10

        int[] xx = {10, 20, 30};
        int[] yy = xx;
        xx[0] = 1000;
        System.out.println("xx[0] ==" + xx[0]); // 1000
        System.out.println("xx[0] ==" + yy[0]); // 1000
    }
}
