package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input numberOfLines
        Scanner inInt = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = inInt.nextInt();
        int i = 0;

        //input of data
        System.out.println("Input a data:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        List<Info> lines = new ArrayList<>();
        String line;

        while ((line = stdin.readLine()) != null && line.length()!= 0) {
            List<String> lineList = Arrays.asList(line.split(" "));
            Info info = new Info();
            info.setD(Integer.parseInt(lineList.get(0)));
            info.setH(Integer.parseInt(lineList.get(1)));
            info.setM(Integer.parseInt(lineList.get(2)));
            info.setId(Integer.parseInt(lineList.get(3)));
            info.setSt(lineList.get(4));
            lines.add(info);
        }
        Calculation calculation = new Calculation();
        calculation.calculate(lines);
    }
}