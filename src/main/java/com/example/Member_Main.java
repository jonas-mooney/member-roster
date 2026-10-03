package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Member_Main {
    static void main() {

        Member_Roster roster = new Member_Roster();

        String[]members={"1,Brian,Davis,Brian.Davis1989@gmail.com,37,26,20,23",
                "2,Jessica,Hendricks,Hendricks1994@gmail.com,32,25,22,6",
                "3,Gerald,Rivian,The_drifter2001@yahoo.com,25,30,27,2",
                "4,Miranda,Greene,Miranda.greene@comcast.net,26,19,16,21",
                "5,Jonas,Mooney,jmoone16@wgu.edu,26,31,32,33"};

        for (String member : members) {
//            roster.members.add(member);
        }

    }
}
