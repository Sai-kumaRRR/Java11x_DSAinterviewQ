import java.util.*;

public class Lab24_LinkedList {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>(Arrays.asList(
                new Person("John",26),
                new Person("Jane",24),
                new Person("tom",22)
        ));

        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        for(Person person : list) {
            System.out.println(person.getName()+" - "+ person.getAge());
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;

    }

}
