package sort;

/**
 * 选择排序
 *
 * @Author: wj
 * @Date: 2019/10/9 15:38
 */
public class ChoiceSort {

    public static int[] sort(int[] array) {
        //总共经过n-1轮比较
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            //每轮需要比较的次数
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                //交换
                if (i != min) {
                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;

                }
            }
        }
        return array;
    }

}
