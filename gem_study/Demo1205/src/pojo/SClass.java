package pojo;

import java.util.List;

public class SClass {
    private int id;
    private String cname;
    //学生
    private List<Student> students;
    public SClass(int id, String cname, List<Student> students) {
        super();
        this.id = id;
        this.cname = cname;
        this.students = students;
    }
    public SClass() {
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "SClass [id=" + id + ", cname=" + cname + ", students="
                + students + "]";
    }
}
