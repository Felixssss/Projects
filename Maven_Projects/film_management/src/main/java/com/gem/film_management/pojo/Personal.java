package com.gem.film_management.pojo;

public class Personal {
    private int pid;
    private String name;
    private String gender;
    private String buy;

    public Personal(){
        super();
    }

    public Personal(int pid, String name, String gender, String buy) {
        this.pid = pid;
        this.name = name;
        this.gender = gender;
        this.buy = buy;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "PersonalService{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", buy='" + buy + '\'' +
                '}';
    }
}
