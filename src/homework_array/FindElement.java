package homework_array;

import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        Arrays.sort(arr);
        int index = findElement(arr, target);
        System.out.println(index);
    }

    public static int findElement(int[] arr, int target) {
        int len = arr.length;
        int i = 0;
        while(i < len) {
            if(arr[i] >= target) {
                break;
            } else {
                i++;
            }
        }

        return i;
    }
}
