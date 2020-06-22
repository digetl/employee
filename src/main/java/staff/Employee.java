package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    };

    public String getName() {
        return this.name;
    };
}
