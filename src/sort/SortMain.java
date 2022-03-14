package sort;

import sort.impl.BubbleSort;
import sort.impl.SelectionSort;

/**
 * 排序测试类
 *
 * @author wangcb （juzou@tuya.com）
 * @date 4:11 下午 2022/3/10
 **/
public class SortMain {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 10, 20, 1, 5, -10, 100, 21};
        ISort bubbleSort = new BubbleSort();
        ISort selectionSort = new SelectionSort();
        bubbleSort.sort(nums);
        selectionSort.sort(nums);
    }
}
