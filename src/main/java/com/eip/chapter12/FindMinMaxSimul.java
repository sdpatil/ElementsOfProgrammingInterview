package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class FindMinMaxSimul {
    public static class MinMax {
        public Integer min;
        public Integer max;

        public MinMax(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }


    }

    public MinMax findMinMax(int[] A) {
        if (A.length <= 1)
            return new MinMax(A[0], A[1]);
        int globalMin = -1;
        int globalMax = -1;
        if (A[0] > A[1]) {
            globalMax = A[0];
            globalMin = A[1];
        } else {
            globalMax = A[1];
            globalMin = A[0];
        }
        for (int i = 2; i + 1 < A.length; i = i + 2) {
            int localMin = Math.min(A[i], A[i + 1]);
            int localMax = Math.max(A[i], A[i + 1]);

            globalMin = Math.min(globalMin, localMin);
            globalMax = Math.max(globalMax, localMax);
        }
        if (A.length % 2 != 0) {
            globalMin = Math.min(globalMin, A[A.length - 1]);
            globalMax = Math.max(globalMax, A[A.length - 1]);
        }
        return new MinMax(globalMin, globalMax);

    }

    public MinMax findMinMax2(int[] A) {
        int globalMin = -1;
        int globalMax = -1;
        if (A[0] > A[1]) {
            globalMax = A[0];
            globalMin = A[1];
        } else {
            globalMax = A[1];
            globalMin = A[0];
        }
        for (int i = 2; i < A.length; i++) {
            if (A[i] > globalMax)
                globalMax = A[i];
            else if (A[i] < globalMin)
                globalMin = A[i];
        }
        return new MinMax(globalMin, globalMax);
    }
}
