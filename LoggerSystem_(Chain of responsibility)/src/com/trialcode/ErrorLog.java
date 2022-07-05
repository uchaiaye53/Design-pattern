package com.trialcode;

public class ErrorLog extends Logger{

    public ErrorLog(int loggerLevel){
        this.loggerLevel = loggerLevel;
    }

    @Override
    protected void write(String message){
        System.out.println("Error Log: "+ message);
        System.out.println();
    }
}
