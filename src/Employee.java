class Employee extends Person {
    private double salary;
    private String position;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.salary = salary;
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}