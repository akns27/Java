package ex04;
class Animal{
    void cry(){
        System.out.println("짹짹");
    }
}
class Bird extends Animal{
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}
class Cat extends Animal{
    @Override
    void cry() {

        System.out.println("야옹");
    }
}
class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.cry();

        Bird bb = new Bird();
        bb.cry();

        Cat cc = new Cat();
        cc.cry();

        Dog dd = new Dog();
        dd.cry();

        //하나의 배열로 세개의 객체를 모두 관리하고 싶음
        Animal[] animals = {bb, cc, dd};
        //each-for문으로 배열에 있는 모든 객체를 끄집어내기
        for(Animal animal: animals){
            animal.cry();
        }

    }
}
