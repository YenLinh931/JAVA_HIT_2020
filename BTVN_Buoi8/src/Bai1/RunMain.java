package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person=new Employee("Yến Linh", "Nghệ An", 10000);
        person.display();
        person=new Customer("Tuấn", "Hà Tĩnh", 34);
        person.display();
    }
}
