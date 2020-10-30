import java.util.Arrays;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-14
 * Time : 18:48
 */
//找数组元素超过一半的元素
//public  class TestWen {
//    public static void main (String[] args){
//        int[] arr = {1,4,2,5,3};
//        System.out.println(sumOddLengthSubarrays(arr));
//    }
//    public static int sumOddLengthSubarrays(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return 0;
//        }
//        int count = 1;
//        int res = 0;
//        while (true) {
//            for (int i = 0; i < arr.length; i++) {
//                if (i + count > arr.length) {
//                    continue;
//                }
//                res += fun(arr, i, count);
//            }
//            count += 2;
//            if (count > arr.length) {
//                break;
//            }
//        }
//        return res;
//    }
//
//    public static int fun(int[] arr, int index, int len) {
//        int res = 0;
//        while(len > 0) {
//            res += arr[index];
//            index++;
//            len--;
//        }
//        return res;
//    }
//}
//    public static void main(String[] args) {
//        int[] nums = {1, 3, 4, 6, 3, 3, 7, 4, 3, 3,3,32,3,3,3};
//        System.out.println(majorityElement(nums));
//    }
//
//    public static int  majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int mid = nums.length / 2;
//        for (int i = 0; i < nums.length - mid; i++) {
//            if (nums[i] == nums[i + mid]) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
//}
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引i和j，使得nums[i] = nums[j],并且i和j的差的绝对值至多为 k。
//public class TestWen {
//    public static int dominantIndex(int[] nums) {
//        int[] copy = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            copy[i] = nums[i];
//        }
//        Arrays.sort(copy);
//        if (copy.length == 1 ) {
//            return -1;
//        }
//        if (copy[copy.length - 2] < 0) {
//            return max(nums);
//        } else if (copy[copy.length - 1] / copy[copy.length - 2] < 2) {
//            return -1;
//        }
//        return max(nums);
//    }
//    public static void main (String[] args) {
//        int[]nums =  {0,1,0,4};// 可以给任意值；
//        System.out.println(dominantIndex(nums));
//    }
//    public static  int   max (int[] nums){
//        int max = 0;
//        int count = 0;
//        for (int j = 0; j < nums.length; j++) {
//            if( max < nums[j]){
//                max = nums[j] ;
//                count = j;
//            }
//        }
//        return count ;
//    }
//}
//        int[]nums = {1,2,3,1};
//        int k = 3;
//        System.out.println(containsNearbyDuplicate(nums ,k));
//    }
//    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i =0;i <= nums.length - 2;i ++  ){
//            for(int j = 1+i;j <= nums.length - 1 ;j ++){
//                if (nums[i] == nums[j] && Math.abs(j - i ) <= k){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

