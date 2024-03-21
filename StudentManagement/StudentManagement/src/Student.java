import java.util.Scanner;

public class Student {
    // properties
    private String id; 
    private String name;
    private int age;
    private String address;
    private double gpa;

    // constructor
    public Student() {}

    public Student(String id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    // getter and setter
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // input
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.setId(scanner.nextLine());
        System.out.println("Enter name: ");
        this.setName(scanner.nextLine());
        System.out.println("Enter age: ");
        this.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter address: ");
        this.setAddress(scanner.nextLine());
        System.out.println("Enter gpa: ");
        this.setGpa(Double.parseDouble(scanner.nextLine()));
    }
    
    // toString
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", address='" + getAddress() + "'" +
            ", gpa='" + getGpa() + "'" +
            "}";
    }
}
