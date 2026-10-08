package com.example;

public class Member {
    private String memberID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] monthlyVisits;

    public Member(String ID, String first_name, String last_name, String email, int age, int[] monthly_visits) {
        this.memberID = ID;
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.age = age;
        this.monthlyVisits = monthly_visits;
    }

    public String getID() {
        return memberID;
    }

    public void setID(String ID) {
        this.memberID = ID;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMonthly_visits() {
        return monthlyVisits;
    }

    public void setMonthly_visits(int[] monthly_visits) {
        this.monthlyVisits = monthly_visits;
    }

    void print() {
        String tempID = this.getID();
        String tempFirst_Name = this.getFirst_name();
        String tempLast_Name = this.getLast_name();
        String tempEmail = this.getEmail();
        int tempAge = this.getAge();
        int[] tempMonthly_Visits = this.getMonthly_visits();

        System.out.println(
                tempID + "  " + "First Name: " + tempFirst_Name + "  " +
                "Last Name: " + tempLast_Name + "  " + "Email: " + tempEmail + "  " +
                "Age: " + tempAge + "  " + "Number of visits: " + tempMonthly_Visits[0] +
                ", " + tempMonthly_Visits[1] + ", " + tempMonthly_Visits[2]
        );


    }

}

