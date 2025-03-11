class Person {
    // Attributes
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("👤 Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating original object
        Person person1 = new Person("Alice", 25);

        // Cloning using copy constructor
        Person person2 = new Person(person1);

        // Display details
        person1.displayPerson();
        person2.displayPerson();
    }
}
