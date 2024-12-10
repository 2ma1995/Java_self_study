package chapter3.ch11;

public class Person {
    private final String name;
    private final int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        System.out.println(person.getPerson());

    Person person1 = new Person("asd",12);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.getPerson());
    }

}
