package co.argm.app;

import static java.lang.System.out;

/**
 * Clase que demuestra cómo intercalar elementos de un arreglo desde el inicio y el final.
 */
public class OrderStartEnd {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] nums2 = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        int aux = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            nums2[aux++] = nums[i];
            nums2[aux++] = nums[nums.length - i - 1];
        }

        if (nums.length % 2 != 0) {
            nums2[aux] = nums[nums.length / 2];
        }

        for (int i = 0; i < nums2.length; i++) {
            out.println("For index = " + i + " value: " + nums2[i]);
        }
    }
}
