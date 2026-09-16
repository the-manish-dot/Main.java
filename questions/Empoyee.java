class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("salary " + salary);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Employee obj = new Employee(101, "manish", 2000000);
        obj.displayEmployee();
    }
}
