import javax.swing.*;
import java.awt.*;

public class CarMain {

    public static void main(String[] args) {

//        CalGUI c = new CalGUI();
//            CalGUI2 c2 = new CalGUI2();
        CalLogic cl = new CalLogic();
        int result = cl.계산하기("3*2+1");
        System.out.println( result );


    }
}