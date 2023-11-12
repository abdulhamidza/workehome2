class main {

    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        try {
            worker1.setName("John Doe");
            worker1.setSalary(1000.0);

            worker2.setName("Jane Smith");
            worker2.setSalary(-500.0); // Throws an exception

            worker3.setName("Bob Johnson");
            worker3.setSalary(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Total Workers: " + Worker.getWorkerCount());
    }
}