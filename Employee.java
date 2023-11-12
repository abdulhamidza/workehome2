class Worker {

    private String name;
    private double salary;
    private static int counter = 0;

    public Worker() {
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        }
        this.salary = salary;
    }

    public static int getWorkerCount() {
        return counter;
    }

}
