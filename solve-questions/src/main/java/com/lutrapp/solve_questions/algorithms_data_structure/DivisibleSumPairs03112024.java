package com.lutrapp.solve_questions.algorithms_data_structure;

import java.util.List;

public class DivisibleSumPairs03112024 {
     /*
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n ( ar size)
     *  2. INTEGER k (factor)
     *  3. INTEGER_ARRAY ar
     */
    static int divisibleSumPairs(int n, int k, List<Integer> ar){
        int numberOfPairs = 0;
        int[] count = new int[k];

        for(int num : ar){
            int rest = num % k;
            int complement = (k - rest)% k;
            numberOfPairs += count[complement];
            count[rest]++;
        }
        return numberOfPairs;
    }

    public static void main(String[] args){
        int n = 6;
        int k = 3;

        List<Integer> ar = List.of(1,3,2,6,1, 2);

        int result = divisibleSumPairs(n, k, ar);
        System.out.println("The number of pairs divisible by " + k + " is " + result);
    }
}
