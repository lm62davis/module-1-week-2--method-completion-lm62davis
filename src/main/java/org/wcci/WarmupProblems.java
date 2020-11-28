package org.wcci;

public class WarmupProblems {

    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        return null;
        
        String str = "Hi";
        int n = 1;

        System.out.println(str.repeat(2));
        System.out.println(str.repeat(3));
        System.out.println(str);

    }

    /*
     * icyHot()
     *
     * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
     *
     * Examples:
     * - icyHot(120, -1) → true
     * - icyHot(-1, 120) → true
     * - icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        return false;
    }

}
import java.util.Arrays;
import java.util.Random;

public class IcyHot {
    public static void main(String[] args) {
        // Return true if one is less than 0 and the other is greater than 100
        int[] temps = {-1, 2, 120};
        Random randTemp1 = new Random();
        Random randTemp2 = new Random();
        int strTemp1 = randTemp1.nextInt(temps.length);
        int strTemp2 = randTemp2.nextInt(temps.length);
       if (strTemp1 < 0) {
            System.out.println(strTemp1);
        } else if (strTemp1 > 100); {
            System.out.println(strTemp1);
        }
        if (strTemp2 < 0) {
            System.out.println(strTemp2);
        } else if (strTemp2 > 100); {
            System.out.println(strTemp2);
        }
        System.out.println(Arrays.toString(temps));
    }
}
