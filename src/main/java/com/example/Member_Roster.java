package com.example;

import java.util.ArrayList;

public class Member_Roster {
    ArrayList<Member> members = new ArrayList<Member>();

    public void add(String memberID, String firstname, String lastname, String email, int age, int monthly_visit1, int monthly_visit2, int monthly_visit3) {
        int[] monthlyVisits = {monthly_visit1, monthly_visit2, monthly_visit3};
        Member member = new Member(memberID, firstname, lastname, email, age, monthlyVisits);
        members.add(member);
    }

    public void remove(String memberID) {
        boolean result = members.removeIf(member -> member.getID().equals(memberID));
        if (!result) {
            System.out.println("Member not found");
        }
    }

    public void print_all() {
        for (Member member : members) {
            member.print();
        }
    }

    public void print_average_monthly_visits(String memberID) {
        for (Member member : members) {
            if (member.getID().equals(memberID)) {
                int[] monthlyVisits = member.getMonthly_visits();
                int totalVisits = 0;
                int monthCount = monthlyVisits.length;

                for (int visitNumber : monthlyVisits) {
                    totalVisits += visitNumber;
                }

                int averageMonthlyVisits = totalVisits / monthCount;

                System.out.println("Average monthly visits: " + averageMonthlyVisits);

            }
        }
    }

}
