package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Member_Main {
    static void main() {

        Member_Roster roster = new Member_Roster();

        String[] members = {"1,Brian,Davis,Brian.Davis1989@gmail.com,37,26,20,23",
                "2,Jessica,Hendricks,Hendricks1994@gmail.com,32,25,22,6",
                "3,Gerald,Rivian,The_drifter2001@yahoo.com,25,30,27,2",
                "4,Miranda,Greene,Miranda.greene@comcast.net,26,19,16,21",
                "5,Jonas,Mooney,jmoone16wgu.edu,26,31,32,33"};

        for (String member : members) {
            String[] memberData = member.split(",");

            String ID = memberData[0];
            String fname = memberData[1];
            String lname = memberData[2];
            String email = memberData[3];
            int age = Integer.parseInt(memberData[4]);
            int[] visits = {
                    Integer.parseInt(memberData[5]),
                    Integer.parseInt(memberData[6]),
                    Integer.parseInt(memberData[7])
            };

            Member memberToSend = new Member(ID, fname, lname, email, age, visits);

            roster.members.add(memberToSend);
        }

        roster.print_all();

        System.out.println(" ");

        roster.print_invalid_emails();

        for (Member member : roster.members) {
        roster.print_average_monthly_visits(member.getID());
        }

        System.out.println(" ");

        roster.remove("3");

        roster.remove("3");
    }
}
