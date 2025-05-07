package library;

public class Student extends Member {

    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public String getMemberType() {
        return "Student";
    }

}
