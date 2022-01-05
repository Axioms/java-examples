
public class Staff extends Employee {
    public String title;

    public Staff() {}

    public Staff(String name, String address, String phoneNumber, String email, String office, String salary, int month, int day, int year, String title) {
        super(name, address, phoneNumber, email, office, salary, month, day, year);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "title" + title;
    }
}
