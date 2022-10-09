package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainEncryption {
    public static void main(String[] args) throws IOException {
        //input numberOfCandidates
        Scanner inInt = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = inInt.nextInt();

        //input of data
        System.out.println("Input a data:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String [][] data = new String[num][];
        int i = 0;
        while ((line = stdin.readLine()) != null && line.length()!= 0) {
            String[] input = line.split(",");
            if (input.length == 6) {
                data[i] = input;
            }
            i++;
        }
        Encryption encryption = new Encryption();
        encryption.crypt(num, data);
    }
}