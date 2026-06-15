package JavaLearning.OOP.Encapsulation;

public class EncapTest {
    public EncapTest() {
    }

    public static void main(String[] args) {
        EncapPerson person = new EncapPerson();
        person.setName("Khalid");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}