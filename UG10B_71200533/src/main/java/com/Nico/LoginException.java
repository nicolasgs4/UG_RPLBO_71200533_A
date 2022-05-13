package com.Nico;

public class LoginException extends Exception{
    private int errCode;
    private String errorMessage;
    public LoginException (int errCode) {
        super() ;
        this.errCode = errCode ;
        if(errCode==1) {
            this.errorMessage = "Username tidak boleh kosong!";
        }
        else if (errCode==2) {
            this.errorMessage = "Password tidak boleh kosong!";
        }
        else if(errCode==3) {
            this.errorMessage = "Username dan Password  harus sesuai dengan yang telah dibuat di awal program!";
        }
    }
    public LoginException (String errorMessage) {
        super(errorMessage);
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
