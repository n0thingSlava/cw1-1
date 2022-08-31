public class Employee {
    private String FIO;
    private int Department;
    private float Salary;

    private int Id;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
}

    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id ++;

    }
    @Override
    public String toString() {
        return "№: " + Id + " ФИО: " + FIO + " Отдел: " + Department + " ЗП: " + Salary;

    }
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Ivanov Ivan Ivanovich1", 1, 75500f);
        empl[1] = new Employee("Ivanov Ivan Ivanovich2", 2, 83450f);
        empl[2] = new Employee("Ivanov Ivan Ivanovich3", 3, 71200f);
        empl[3] = new Employee("Ivanov Ivan Ivanovich4", 4, 90200f);
        empl[4] = new Employee("Ivanov Ivan Ivanovich5", 5, 94200f);
        empl[5] = new Employee("Ivanov Ivan Ivanovich5", 1, 95300f);
        empl[6] = new Employee("Ivanov Ivan Ivanovich5", 2, 96400f);
        empl[7] = new Employee("Ivanov Ivan Ivanovich5", 3, 97500f);
        empl[8] = new Employee("Ivanov Ivan Ivanovich5", 4, 98600f);
        empl[9] = new Employee("Ivanov Ivan Ivanovich10", 5, 99700f);

        for (Employee e : empl) {
            System.out.println(e);
        }
    }

}