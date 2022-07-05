package com.trialcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Logger want to see: console/warning/error?? ");

        Scanner scanner = new Scanner(System.in);
        String log = scanner.nextLine();

        Logger consoleLog = new ConsoleLog(Logger.console);
        Logger warningLog = new WarningLog(Logger.warning);
        Logger errorLog = new ErrorLog(Logger.error);

        errorLog.setNextLogger(warningLog);
        warningLog.setNextLogger(consoleLog);

        if (log.equals("console")){
            errorLog.showMessage(Logger.console,"This is console logger message");
        }
        else if(log.equals("warning")){
            errorLog.showMessage(Logger.warning,"This is warning logger message");
        }
        else if (log.equals("error")){
            errorLog.showMessage(Logger.error,"This is error logger message");
        }
        else {
            System.out.println("null...,,give the appropriate word");
        }
    }
}
