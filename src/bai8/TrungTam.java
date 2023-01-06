package bai8;

public class TrungTam {

    private Student student;
    private The the;

    public TrungTam() {

    }

    public TrungTam(Student student, The the) {
        this.student = student;
        this.the = the;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public The getThe() {
        return the;
    }

    public void setThe(The the) {
        this.the = the;
    }

    @Override
    public String toString() {
        return "TrungTam{" +
                "student=" + student +
                ", the=" + the +
                '}';
    }
}
