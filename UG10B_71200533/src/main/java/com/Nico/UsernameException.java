package com.Nico;

public class UsernameException extends Exception {
    private int errCode;
    private String errorMessage;

    public UsernameException (int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            this.errorMessage = "Input username tidak boleh kosong!";
        }
        else if (errCode==2){
            this.errorMessage = "Username minimal harus terdiri dari 6 karakter!";
        }
        else if (errCode==3){
            this.errorMessage = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";
        }
        else if (errCode==4){
            this.errorMessage = "Password tidak boleh kosong!";
        }
    }
    public UsernameException(String errorMessage){
        super(errorMessage);
    }
    public int getErrCode(){
        return this.errCode;
    }
    public String getErrorMessage(){
        return this.errorMessage;
    }
}
