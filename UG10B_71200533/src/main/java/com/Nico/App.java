package com.Nico;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
    public static void main( String[] args ) throws UsernameException,TweetException,BioException,LoginException {
        System.out.println("Selamat datang di Twitter!");
        System.out.println("Silahkan login dengan akun anda.");
        User user = new User("u71200533", "p71200533");
        Scanner Username = new Scanner(System.in);
        System.out.print("Username : ");
        String newUsername;
        newUsername = Username.nextLine();
        Scanner Password = new Scanner(System.in);
        System.out.print("Password : ");
        String newPassword;
        newPassword = Password.nextLine();
        Boolean login = false;
        try {
            if (newUsername.isEmpty()) {
                throw new UsernameException(1);
            } else if (newUsername.length() < 6) {
                throw new UsernameException(2);
            } else if (newPassword.isEmpty()) {
                throw new UsernameException(4);
            } else {
                System.out.print("Berhasil login!\n");
            }
        } catch (UsernameException e) {
            System.out.println("Error: " + e.getErrorMessage());
        }
        Scanner Bio = new Scanner(System.in);
        System.out.print("BIO : ");
        String newBio;
        newBio = Bio.nextLine();
        try {
            if (newBio.isEmpty()) {
                throw new BioException(1);
            }
            else if (newBio.length() < 5 || newBio.length() > 30) {
                throw new BioException(2);
            }
            else {
                System.out.print("Bio berhasil diganti!\n");
            }
        } catch (BioException e) {
            System.out.println("Error: " + e.getErrorMessage());
        }
        Scanner Tweet = new Scanner(System.in);
        System.out.print("Tweet sesuatu : ");
        String newTweet;
        newTweet = Tweet.nextLine();
        try {
            if (newTweet.isEmpty()) {
                throw new TweetException(1);
            }
            else if (newBio.length() < 8 || newBio.length() > 140) {
                throw new TweetException(2);
            }
            else {
                System.out.print("Berhasil mencuit!");
            }
        } catch (TweetException e) {
            System.out.println("Error: " + e.getErrorMessage());
        }
    }
}


