package ex01;
//상속
class human{
    String name;
    int age;
    void eat(){
        System.out.println("먹음");
    };
    void sleep(){
        System.out.println("잤음");
    };

}
class Student extends human{

    int studentID;

    void goToSchool(){
        System.out.println("등교함");
    };
}
class Worker extends human{
    int workerID;
    void goToWork(){
        System.out.println("출근함");
    };
}
public class Inheritance {
    public static void main(String[] args) {
        human h = new human();
        h.name="jake";
        h.age = 11;
        h.eat();
        h.sleep();

        //Student 객체 생성
        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        //Worker 객체 생성
        Worker w = new Worker();
        w.name = "김민성";
        w.age = 16;
        w.workerID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

    }
}
