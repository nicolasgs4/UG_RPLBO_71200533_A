package com.ug11.channelsahamukdw;

public class EmailException extends Exception{
    private int errCode;
    private String errMessage;
    public EmailException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage = "Email tidak terdaftar dalam UKDW!";
        }
        else if(errCode==2){
            this.errMessage = "Email UKDW tidak Valid!";
        }
    }

    public EmailException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}
