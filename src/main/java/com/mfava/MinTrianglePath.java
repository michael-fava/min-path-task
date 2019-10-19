package com.mfava;

import com.mfava.service.CalculationService;
import com.mfava.service.ValuesService;

public class MinTrianglePath {


    public static void main(String[] args) {
        int[][] triangle = ValuesService.getInputFromConsole();
        CalculationService.findMinPath(triangle);
    }


}
