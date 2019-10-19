package com.mfava.service;

import org.apache.commons.lang.math.RandomUtils;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ValuesService {

    public static int[][]  getInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to form triangle Split values by a space: ");
        String rowvalue = "";
        ArrayList<int[]> rowList = new ArrayList();
        do {
            rowvalue = scanner.nextLine();
            if (rowvalue.equalsIgnoreCase("EOF")) {
                break;
            }
            String[] split_strings = rowvalue.split(" ");
            rowList.add(Stream.of(split_strings).mapToInt(Integer::parseInt).toArray());
        } while (!rowvalue.equalsIgnoreCase("EOF"));
        scanner.close();
        int[][] triangle =  new int[rowList.size()][];
        for (int i = 0; i < rowList.size(); i++) {
            triangle[i] = rowList.get(i);
        };

        return  triangle;
    }

    public static int[][] generateRandom(int rows) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int row = 1; row < rows; row++) {
            int[] tempArray = new int[row];
            for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = RandomUtils.nextInt(15);
            }
            res.add(tempArray);
        }
       int[][] triangle =  new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            triangle[i] = res.get(i);
        };

        return  triangle;
    }
}
