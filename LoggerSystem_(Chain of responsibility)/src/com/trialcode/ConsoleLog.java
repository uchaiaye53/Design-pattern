package com.trialcode;

public class ConsoleLog extends Logger{

    public ConsoleLog(int loggerLevel){
        this.loggerLevel = loggerLevel;
    }

    @Override
    protected void write(String message){
        System.out.println("Console Log: "+ message);
        System.out.println();
    }
}
