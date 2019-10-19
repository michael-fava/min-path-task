package com.mfava.service;

import com.mfava.model.ValuePath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class CalculationService {

    public static void findMinPath(int[][] triangle) {
        Function<ArrayList<Integer>, Integer> calculateCurrentTotal = (u) -> u.stream().mapToInt(Integer::intValue).sum();
        int t = triangle.length - 1;

        ValuePath[] valuePaths = Arrays.stream(triangle[t])
                .mapToObj(element -> {
                    ArrayList m = new ArrayList();
                    m.add(element);
                    return new ValuePath(m, element);
                }).toArray(ValuePath[]::new);

        for (int e = triangle.length - 2; e >= 0; e--) {
            for (int f = 0; f < triangle[e + 1].length - 1; f++) {
                ValuePath minValuePath = Stream.of(valuePaths[f], valuePaths[f + 1])
                        .min(Comparator.comparing((ValuePath::getPathTotalValue)))
                        .get();

                ArrayList<Integer> u = new ArrayList();
                u.add(triangle[e][f]);
                u.addAll(minValuePath.getNodes());

                valuePaths[f].setNodes(u);
                valuePaths[f].setPathTotalValue(calculateCurrentTotal.apply(u));
            }
        }


        System.out.println("Total minimal Path Value :- " + valuePaths[0].getPathTotalValue());
        System.out.println("Nodes in Path below");

        valuePaths[0].getNodes()
                .stream()
                .forEach(x -> System.out.print(x + "|"));

    }

}
