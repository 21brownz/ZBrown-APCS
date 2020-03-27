package Assesment;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String n, int i){
        this.name = n;
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name) == 0 ? (this.id - other.id) : this.name.compareTo(other.name);
    }
}
