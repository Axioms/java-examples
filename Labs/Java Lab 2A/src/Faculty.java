
public class Faculty extends Employee {
    public String officeHours;
    public String rank;

    public Faculty (String name, String address, String phoneNumber, String email, String office, String salary, int month, int day, int year, String officeHours, String rank){
        super(name, address, phoneNumber, email, office, salary, month, day, year);
        this.officeHours = officeHours;
        this.rank = rank;

    }
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "office Hours " + officeHours + "\n" + "Rank " + rank;
    }
}
