package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Member_Main {
    static void main() {

        String[]members={"1,Brian,Davis,Brian.Davis1989@gmail.com,37,26,20,23",
                "2,Jessica,Hendricks,Hendricks1994@gmail.com,32,25,22,6",
                "3,Gerald,Rivian,The_drifter2001@yahoo.com,25,30,27,2",
                "4,Miranda,Greene,Miranda.greene@comcast.net,26,19,16,21",
                "5,Jonas,Mooney,jmoone16@wgu.edu,26,31,32,33"};

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
