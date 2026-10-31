public class GUGUDAN {
    public static void main(String args[]) {
        // 구구단 2단 출력을 위한 코드
        int dan = 2;
        for ( int i = 1 ; i < 10 ; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
        // 2단부터 9단까지 반복
        for ( dan = 2 ; dan < 10 ; dan++) {
            System.out.println("----------" + dan + "단----------");
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d%n", dan, i, dan * i);
            }
        }
    }
}
