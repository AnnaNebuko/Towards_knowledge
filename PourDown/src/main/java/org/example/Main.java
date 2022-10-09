package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int [][] dataOrders = new int[200000][100];
        String[] line;
        int ordersNum = 0;
        while (ordersNum==0) ordersNum = stdin.read();

        for (int i = 0; i < ordersNum; i++) {
            line = stdin.readLine().split(" ");
            for(int j = 0;j < 3;j++)
                dataOrders[i][j] = Integer.parseInt(line[j]);
        }
        int [][] dataRequests = new int[200000][100];
        int requestNum;
        do {
            requestNum = stdin.read();
        }
        while (requestNum==0);

        int i = 0;
        while (i < requestNum) {
            line = stdin.readLine().split(" ");
            for(int j = 0;j < 3;j++)
                dataRequests[i][j] = Integer.parseInt(line[j]);
            i++;
        }

        int z = 0;
        while (z < requestNum) {
            int sum = 0;
            if (dataRequests[z][2] == 1) {
                for (i = 0; i < ordersNum; i++) {
                    if (dataOrders[i][0] >= dataRequests[z][0] && dataOrders[i][0] <= dataRequests[z][1]) {
                        sum += dataOrders[i][2];
                    }
                }
            }
            else {
                for (i = 0; i < ordersNum; i++) {
                    if (dataOrders[i][1] <= dataRequests[z][1] && dataOrders[i][1] >= dataRequests[z][0]) {
                        sum += dataOrders[i][1] - dataOrders[i][0];
                    }
                }
            }
            System.out.print(sum + " ");
            z++;
        }
    }
}