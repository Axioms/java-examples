
public class Tests {
    public static void main(String[] args) {
        Person p1 = new Person("John Dou", "1100 South Marietta Pkwy Marietta, GA 30060", "1234566789", "john@gmail.com");
        Student s1 = new Student("firstname last name", "1100 South Marietta Pkwy Marietta, GA 30060", "1156484645611","firstname@kennesaw.edu","Freshmen");
        Employee e1 = new Employee("Worker One", "1100 South Marietta Pkwy Marietta, GA 30060", "54864455465465", "worker@kennesaw.edu", "J-158", "$10000", 10, 5, 2010);
        Staff st1 = new Staff("Staff One", "1100 South Marietta Pkwy Marietta, GA 30060", "15164464560", "Staff@kennesaw.edu", "Q-200", "$10000", 10, 5, 2000, "Chef");
        Faculty f1 = new Faculty("Admin One", "1100 South Marietta Pkwy Marietta, GA 30060", "489984545", "Admin@kennesaw.edu", "O-100", "$50000", 5, 2, 2005, "1:00pm - 3:00 pm", "Admin");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(st1);
        System.out.println(f1);
    }
}
