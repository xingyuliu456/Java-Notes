package arraydemo;

public class ArrUtil {
    private ArrUtil() {
    }

    /***
     * 打印数组
     * @param arr 要打印的数组
     * @return 数组的字符串表示
     */
    public static String printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    /***
     * 计算数组的平均值
     * @param arr 要计算平均值的数组
     * @return 数组的平均值
     */
    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
