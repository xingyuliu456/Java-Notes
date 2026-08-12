package arraydemo;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        String res = ArrUtil.printArray(arr);
        System.out.println("Array: " + res);
        System.out.println("Average: " + ArrUtil.average(arr));
    }
}
