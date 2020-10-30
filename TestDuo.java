
import java.util.Arrays;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-14
 * Time : 18:46
 */
// 讲数组逆序输出
//public class TestDuo {
//    public static void main (String[] args){
//        int[] array = {2,3,43,54,34,53,8,232};
//        niXu(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void niXu(int[] array){
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right){
//            int tmp = array[left];
//            array[left] = array[right];
//            array[right] = tmp;
//            left ++;
//            right -- ;
//        }
//    }
//}
// 将数组偶数放在前，奇数放在后排序
//public class TestDuo{
//    public static void main (String[] args){
//        int[] array = {3,4,5,6,2,5,3,32,4,3} ;
//        jiaoHuan(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void jiaoHuan (int[] array){
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right){
//            while (left < right && array[left] % 2 == 0){
//                left ++ ;
//            }
//            while (left < right && array[right] % 2 != 0 ) {
//                right --;
//            }
//            int tmp = array[left];
//            array[left] = array[right];
//            array[right]= tmp;
//        }
//    }
//    public static void main (String[] args){
//        int[] array = {2,4,5,3,5,353,24,2};
//        jiaoHuan(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void jiaoHuan (int[] array){
//        int left = 0;
//        int right = array.length - 1;
//        while (left< right){
//            while (left< right && array[left] % 2 ==0){
//                left ++ ;
//            }
//            while(left < right && array[right ] % 2 != 0){
//                right--;
//            }
//            int tmp = array[left];
//            array[left] = array[right];
//            array[right] = tmp;
//        }
//    }
//    public static void main (String[] args){
//        int[] array = {2,3,45,23,356,5,35,4,5,263,};
//        niXu(array);
//        System.out.println(Arrays.toString(array));
//
//    }
//    public static void niXu (int[] array){
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right){
//            int tmp = array[left];
//            array[left ]= array[right];
//            array[right] = tmp;
//            left ++;
//            right --;
//        }
//    }
//}
//public class  TestDuo{
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,6,7,8,89};
//        System.out.println((chaZhao(array,3)));
//    }
//    public static int  chaZhao(int[] array,int key){
//        int left = 0;
//        int right = array.length - 1 ;
//        while (left  < right ){
//            int mid = (left + right) / 2;
//            if (key < array[mid]){
//                right = mid - 1;
//            }else if (key > array[mid]){
//                left = mid + 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
//优化的冒泡排序
//public class TestDuo{
//    public static void main (String[] args){
//        int[] array = {1,34,50,90,32,4,35,8,5,6,7};
//        maoPao(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void maoPao ( int[] array){
//        boolean flag = true;
//        for (int i = 1; i <array.length ; i++) {
//            flag = true;
//            for (int j = 0; j < array.length - i ; j++) {
//                if (array[j] > array[j +1]){
//                    int tmp = array[j];
//                    array[j] = array[j+ 1];
//                    array[j+1] = tmp;
//                    flag= false;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }
//    }
//}
//public  class  TestDuo{
//    public static void main (String[] args){
//        int[] array = {1,2,3,4,5,6,7,8,9,70};
//        chaZhao(array,10);
//        System.out.println(chaZhao(array,5));
//
//    }
//    public static int chaZhao (int[] array,int key){
//        int left = 0;
//        int right = array.length -1;
//        while ( left < right ){
//            int mid = (left + right ) / 2 ;
//            if (key < array[mid]){
//                right = mid - 1;
//            }else if (key > array[mid]){
//                left = mid + 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
//public class  TestDuo{
//    public static void main (String[] args){
//        int[] array = {2,3,64,6,4,364,34,3,45};
//        maoPao(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void maoPao(int[] array){
//        boolean flag = true;
//        for (int i = 1; i <array.length ; i++) {
//            for (int j = 0; j < array.length - i; j++) {
//                if (array[j] > array[j + 1]){
//                    int tmp = array[j];
//                    array[j]= array[j + 1];
//                    array [j+1] = tmp;
//                    flag = false;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
//    }
//}
//public class TestDuo{
//    public static void main (String[] args){
//        int[] array = new int[10];
//        Arrays.fill(array,2);//全部为2；
//        Arrays.fill(array,3,6,99);//[3,6)赋值99；
//        System.out.println(Arrays.toString(array));
//    }
//}
//查找数组种出现元素次次数超过一半的
//public  class TestDuo {
//    public static void main(String[] args) {
//        int[] nums = {1, 3, 4, 6, 3, 3, 7, 4, 3, 3};
//        majorityElement(nums);
//        System.out.println(majorityElement(nums));
//    }
//
//    public static int majorityElement(int[] nums) {
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
//矩阵转置
//public int[][] transpose(int[][] A) {
//        int row = A[0].length;   //用原矩阵的列当作转置矩阵的行
//        int column = A.length;   //用原矩阵的行当作转置矩阵的列
//        int [][] ans = new int[row][column];
//
//        if(row == column){     //判断是否为方阵
//          for(int i=0;i<row;i++){
//              for(int j=i;j<column;j++){
//                  ans[i][j] = A[j][i];    //若为方阵，直接内部对称交换，节约时间
//                  ans[j][i] = A[i][j];
//              }
//          }
//        }else{
//        for(int i=0;i<row;i++){
//          for(int j=0;j<column;j++){
//              ans[i][j] = A[j][i];   //不为方阵，按顺序赋值
//              }
//           }
//        return ans;
//        }
