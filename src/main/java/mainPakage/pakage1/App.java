package mainPakage.pakage1;

public class App {

    static Person firstPerson = new Person();
    static mainPakage.pakage2.Person secondPerson = new mainPakage.pakage2.Person("yo");

    public static void main(String[] args) {
        System.out.println(firstPerson.age + " " + secondPerson.gender);
    }
}
