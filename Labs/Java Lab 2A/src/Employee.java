
public class Employee extends Person {
    public String office;
    public String salary;
    MyDate dateHired = new MyDate();

    public Employee(){}

    public Employee(String name, String address, String phoneNumber, String email, String office, String salary, int month, int day, int year) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        dateHired.setMonth(month);
        dateHired.setDay(day);
        dateHired.setYear(year);
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "office " + office + "\n" + "salary " + salary + "\n" + "date hired " + dateHired;
    }
}
