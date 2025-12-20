public class Student {
    private int id, marks;
    private String name, city;

    Student(int id, String name, int marks, String city) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.city = city;
    }

    public int getId() { return id; }

    public int getMarks() { return marks; }

    public String getName() { return this.name; }

    public String getCity() { return city; }

    @Override
    public String toString() {
        return "Student [ " + id + ", " + name + ", " + marks + ", " + city + " ]";
    }

}