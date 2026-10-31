// 클래스간에 중복되는 코드가 있으면?
// 상속으로 제거

// 추상화 메소드 언제 쓰나?
// 아래와 같이 상위 개념에 클래스에서
// 특정 기능을 구현하다 보면 해당 기능을 가지는 건 맞지만
// 기능 구현이 불가능? 한 경우가 생김, 그때 추상화 메소드 사용

abstract class Animal {
    abstract public void cry();
    // 동물이 어떻게 우나?

}


// 위에 예제 처럼 추상화 메소드를 사용하면 개발관점에서
// 무슨 장점이 있나?
// 추상화 메소드를 상속 받은 하위 클래스에서는
// 추상화 메소드 구현이 강제 되어 지는 장점이 생김

class Pig extends Animal{
    public void cry() {
        System.out.println("꿀꿀");
    }
}

class Cat extends Animal{
    public void cry(){
        System.out.println("야옹");
    }
}


class Dog extends Animal {
    public void cry(){
        System.out.println("멍멍");
    }
}

public class AbstractEx2 {
    public static void main(String args[]){
//        Dog d = new Dog();
//        d.cry();
//        Pig p = new Pig();
//        p.cry();

        Animal a1 = new Cat();
        Animal a2 = new Pig();
        Animal a3 = new Dog();

        // 다향성
        a1.cry();
        a2.cry();
        a3.cry();


    }
}