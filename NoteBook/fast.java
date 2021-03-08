import java.util.Arrays;
import java.util.Scanner;

public class fast {
        public static void main(String[] args) {

            int[] nums = new int[]{1, 9, 5, 4, 2, 7, 0, 2, 6, 8};
            QuickSort(nums, 0, nums.length - 1);
            System.out.println(Arrays.toString(nums));


        }
        public static void QuickSort(int nums[], int low, int high) {
            int temp;
            int i = low, j = high;
            if (low < high) {
                temp = nums[low];
                while (i < j) {
                    while (i < j && nums[j] >= temp) j--;
                    if (i < j) {
                        nums[i++] = nums[j];
                    }
                    while (i < j && nums[i] < temp) i++;
                    if (i < j) {
                        nums[j--] = nums[i];
                    }
                }
                nums[i] = temp;
                QuickSort(nums, low, i - 1);
                QuickSort(nums, i + 1, high);
            }
        }
    }
