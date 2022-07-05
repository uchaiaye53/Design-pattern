package com.trialcode;

public abstract class Logger {

    protected Logger nextLogger;

    public static int console = 1;
    public static int warning = 2;
    public static int error = 3;
    protected int loggerLevel;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    abstract protected void write(String message);

    public void showMessage(int loggerLevel, String message){
        if(this.loggerLevel <= loggerLevel){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.showMessage(loggerLevel, message);
        }
    }

}
