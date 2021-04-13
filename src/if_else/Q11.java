package if_else;
/*Question 11
Write a program to check whether a entered character is
lowercase ( a to z ) or uppercase ( A to Z ).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // we use buffereader to read a text from a character
        System.out.println("Enter the char: ");
        int ch=bf.read();
        if(ch>=97 && ch<=123){
            System.out.println("Lowercase");
        }else if(ch>=65 && ch<=96){
            System.out.println("Uppercase");
        }
    }
}