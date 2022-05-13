package com.Nico;

public class TweetException extends Exception{
    private int errCode;
    private String errorMessage;
    public TweetException (int errCode) {
        super() ;
        this.errCode = errCode ;
        if(errCode==1) {
            this.errorMessage = "Tweet tidak boleh kosong!";
        }
        else if(errCode==2) {
            this.errorMessage = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }
    public TweetException (String errorMessage) {
        super(errorMessage);
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
