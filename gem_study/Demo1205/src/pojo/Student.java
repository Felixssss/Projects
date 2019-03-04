package pojo;

public class Student {
    private int id;
    private  String sname;
    private  String gender;
    private  int age;
    private  SClass sClass;

    public Student() {
        super();
    }

    public Student(int id, String sname, String gender, int age, SClass sClass) {
        this.id = id;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
        this.sClass = sClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SClass getsClass() {
        return sClass;
    }

    public void setsClass(SClass sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "StudentMapper{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", sClass=" + sClass +
                '}';
    }
}




