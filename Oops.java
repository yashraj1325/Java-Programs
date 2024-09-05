/*public class Oops {
     public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

       // bankAccount myAcc = new BankAccount();
        //myAcc.userName ="yashraj shegokar";
        //myAcc.setpassword( "lfhaksjd");

    }
}


class pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip =newTip;
    }
}

class student {
    String name;
    int rbt;
    void setname(String newName){
        name = newName;
    }
    void setRbt(int newRbt){
        rbt = newRbt;
    }

}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }

}

//constructor
public class Oops {
    public static void main(String args[]) {
        Student s1 = new Student("yashraj");
        System.out.println(s1.name);
    }
}
class Student {
    String name;
    int roll;
    Student(String name) {//constructor
        this.name = name;
    }
}

public class Oops {
    public static void main(String args[]) {
        Student  s1 = new Student();
        s1.name = "yashraj";
        s1.roll = 456;
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor ,shallo 
   //Student(Student s1) {
       // marks = new int[3];
       // this.name = s1.name;
      //  this.roll = s1.roll;
      //  this.marks = s1.marks;

        //deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }
        }

    }

//InHeritance
public class Oops{
public static void main(String args[]){

}
}
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
//derived class
class fish extends Animal{
    int fins;
    void swim(){

    }

}

//Multilevel In Heritance,Hybrid
public class Oops{
    public static void main(String args[]){
        Dog doggy = new Dog();
        doggy.eat();
       
        
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
class Dog extends Animal{
    int legs;
}
class Fish extends Animal {
    void swim(){
        System.out.println("walk");
    }
  
}
class bird extends Animal {
    void fly(){
        System.out.println("walks");
    }
}

public class Oops{
    public static void main(String args[]){
        horse h = new horse();
        h.eat();
        h.walk();
        
        chicken c = new chicken();
        c.eat();
        c.walk();

    }
}
abstract class animal {
    String color ="brown";

    void eat (){
        System.out.println("animal eat");

    }
    abstract void walk();
}
class horse extends animal {
    horse(){
        System.out.println("horse4 constructor called");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends animal {
    void walk(){
        System.out.println("walk on 2 legs");
    }
}

//interference 
public class Oops {
    public static void main(String args[]){

    }
}
interface ChessPlayer {
    void moves ();

}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all direction)");
    }
}
class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}

//Static Keywokrd
public class Oops {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "jmv";
        Student s2 = new Student();
        System.out.println(s2.schoolName);

    }
}
class Student {

    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name =name;
    }
    String getName(){
        return this.name;
    }
}
*/
//super keyword
public class Oops{
    public static void main(String args[]){
        horse h = new horse();


    }
}
String color;
class animal {
    animal () {
        System.out.println("animal constructor is called ");

    }
}
class horse extends animal {
    horse(){
        super();
        System.out.println("horse constructor is called");

        }
    }
