package com.trialcode;

public class WarningLog extends Logger{

    public WarningLog(int loggerLevel){
        this.loggerLevel = loggerLevel;
    }

    @Override
    protected void write(String message){
        System.out.println("Warning Log: "+ message);
        System.out.println();
    }
}
