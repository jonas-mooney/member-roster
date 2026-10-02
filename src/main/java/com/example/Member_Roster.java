package com.example;

import java.util.ArrayList;

public class Member_Roster {
    ArrayList<Member> members = new ArrayList<Member>();

    public void add(String memberID, String firstname, String lastname, String email, int age, int monthly_visit1, int monthly_visit2, int monthly_visit3) {

        int[] monthlyVisits = {monthly_visit1, monthly_visit2, monthly_visit3};

        Member member = new Member(memberID, firstname, lastname, email, age, monthlyVisits);
    }

    public void remove(String memberID) {
//        members.remove(memberID);
    }

}
