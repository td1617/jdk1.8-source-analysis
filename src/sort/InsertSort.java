package sort;

/**
 * 直接插入排序
 *
 * @Author: wj
 * @Date: 2019/10/9 15:51
 */
public class InsertSort {


    //2 1
    public static int[] sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }
}
