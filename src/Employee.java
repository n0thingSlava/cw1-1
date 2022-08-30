public class Employee {
    private String FIO;
    private int Department;
    private float Salary;
    private static int Counter;

    private int Id;
    public int getId() {
        return this.Id; }
    public String getFIO() {
        return this.FIO; }
    public int getDepartment() {
        return this.Department; }
    public float getSalary() {
        return this.Salary; }

    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = ++Counter;

    }
    @Override
    public String toString() {
        return "№: " + Id + " ФИО: " + FIO + " Отдел: " + Department + " ЗП: " + Salary;

    }

}