import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//public class TestChun {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System. in );
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(sum(n ));
//    }
//    public static int sum ( int n ){
//        if (n <= 9){
//            return n ;
//        }
//        return sum( n /10) + n % 10;
//    }
//}
// 青蛙台阶 循环
//public  class TestChun {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("输入n");
//        int n = sc.nextInt();
//        System.out.println(floor(n ));
//    }
//    public static int floor (int  n ){
//        if (n == 1 || n == 2){
//            return n ;
//        }
//        int a = 1;
//        int b = 2;
//        int sum = 0;
//        for (int i = 3; i <= n ; i++) {
//            sum = a + b;
//            a = b;
//            b = sum;
//        }
//        return sum;
//    }
//}
//变态跳
//public  class TestChun {
//    public  static int JumpFloorII(int target) {
//        if (target == 1 ){
//             return 1;
//        }
//        return 2 *JumpFloorII(target-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入n");
//        int target = sc.nextInt();
//        int ret = JumpFloorII(target);
//        System.out.println(ret);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入n");
//        int n = sc.nextInt();
//        System.out.println(floor(n));
//    }
//    public static int floor (int n ){
//        if (n == 1 || n == 2){
//            return n;
//        }
//        if (n == 3){
//            return 4;
//        }
//        return floor(n-1)+ floor(n-2)+floor(n-3);
//    }
//}
//public class TestChun {
//    public static void main (String[] args){
//        int[] array  = { 1,2,4,4,5};
//        System.out.println(avg(array));
//    }
//    public static double   avg (int [] array) {
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum  = sum  + array [i ];
//        }
//        return sum / array.length ;
//    }
//public  class TestChun {
//    public static void main (String[] args){
//        int []array = {3,5,7,8,16};
//        System.out.println(sum(array));
//    }
//    public static int sum (int []array ){
//        int ret = 0;
//        for (int i = 0; i < array.length; i++) {
//            ret = ret + array[i];
//        }
//        return ret ;
//    }
//}
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,6};
//        System.out.println(Arrays.toString(transform(array)) );
//    }
//    public static int[] transform ( int  []array){
//        int[] tmp = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            tmp [i] = array [i];
//        }
//        for (int i = 0; i <tmp.length ; i++) {
//            tmp[i] = tmp [i] * 2 ;
//        }
//        return tmp;
//    }
//}
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {3,4,2,5,3,5,2,4,};
//       printArray(array);
//    }
//    public static int  printArray (int[] array){
//      int n = 0;
//        for (int i = 0; i < array.length; i++) {
//           n = array[i] ;
//            System.out.print( n + " " );
//        }
//        return n ;
//    }
//}
//public class TestChun{
//    public static void main (String[] args){
//        int[] array = new int [100];
//        for (int i = 1; i < array.length; i++) {
//            array[i] = i+1;
//        }
//        System.out.println(Arrays.toString(array));
//}
//}
//
import java.util.Scanner;
//public class Solution {
//    public  static int JumpFloor(int target) {
//        if(target == 1|| target == 2){
//            return target ;
//        }
//        return JumpFloor(target-1)+JumpFloor(target-2);
//    }
//    public static void main (String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int traget = sc.nextInt();
//        System.out.println(JumpFloor(traget));
//        sc.close ();
//    }
//}
//public  class  TestChun {
//    public static void main (String[] args){
//    int[] array = {2,4,5,6,3,4,89,345,5,3,5,};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] % 2 != 0){
//                    int tmp = array[j];
//                    array[j] = array[i];
//                    array[i ]= tmp;
//                }
//            }
//            System.out.print(array[i] + " ");
//        }
//    }
//}
//    public static void main (String[] args){
//        int[]array  = {1,2,3,4,5};
//        String su = myToString(array);
//        System.out.println(su );
//    }
//    public static String myToString (int [] array){
//        if (array == null ) {
//            return "";
//        }
//        if (array.length == 0){
//                return "[]";
//        }
//        String ret = " [";
//        for (int i  = 0; i  < array.length; i ++) {
//            ret = ret + array [ i ] ;
//           if (i != array.length - 1){
//               ret = ret +",";
//           }
//        }
//        ret = ret + "]";
//        return ret ;
//    }
//}
//将数组进行字符串输出
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,3};
//        System.out.println(toMyString( array ));
//    }
//    public static String toMyString (int[] array){
//        String ret = " [";
//        if (array == null ){ //如果是null
//            return " ";
//        }
//        if (array.length == 0 ){ // 如果数组长度为0 ;
//            return "[]";
//        }
//        for (int i = 0; i < array.length; i++) {
//            ret = ret + array[i];
//            if (i != array.length - 1) {
//                ret = ret + ",";
//            }
//        }
//        ret = ret + "]" ;
//        return ret ;
//    }
//}
//使用int 类型返回值尝试打印字符串失败;
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = { 2,3,2,4,2,4};
//        toMyString(array );
//    }
//    public static int toMyString (int[] array ){
//        if (array == null ){
//            return ' ';
//        }
//        if (array.length == 0){
//            return ' ';
//        }
//        int n = 0;
//        for (int i = 0 ; i < array.length; i ++){
//            n = array[i];
//            System.out.print(n + "," );
//            }
//        return n ;
//    }
//}
// 找最大元素
//public class TestChun {
//    public static void main (String[] args) {
//        int[] array = {1, 23, 4, 5, 43,};
//        System.out.println(maxMax(array));
//    }
//        public static int maxMax (int[] array){
//        if (array == null || 0 == array.length) {
//            return -1;
//        }
//        int max = array[0];
//        for (int i = 1; i <array.length ; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        return max ;
////        int[] copy = Arrays.copyOf(array,array.length);
////        System.out.println(Arrays.toString(copy));
////        int[] copy = new int[array.length];
////        for (int i = 0; i < array.length; i++) {
////           copy[i ] = array[i];
////        }
//    }
//}
// 冒泡排序法，
//public class TestChun {
//    public static void main(String[] args) {
//        int[] array = {1, 34, 5, 56, 434, 6, 5};
//        maoPao(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void maoPao(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[j - 1] > array[j]) {
//                    // 接下俩的操作单纯为了调换两者位置；
//                    int tmp = array[j ];
//                    array[j ] = array[j-1];
//                    array[j-1] = tmp;
////                    int tmp = array[j-1 ];
////                    array[j-1 ] = array[j];
////                    array[j] = tmp;
//                }
//            }
//        }
//    }
//}
//    public static void main (String[] args){
//        int[] array = {1,2,3,4,5,6,7,};
//        System.out.println(binarySearch(array,4));
//    }
//    public static int binarySearch (int[] array,int key ){
//        int left = 0;
//        int right = array.length -1;
//        while (left <= right ) {
//            int mid = (left + right)/ 2;
//            if (key < array[mid]) {
//                right = mid - 1;
//            }else if (key > array[mid]) {
//                left = mid + 1;
//            }else {
//                return mid;
//            }
//
//        }
//        return  -1;
//    }
//}
//public class TestChun{
//    public static void main (String[] args){
//        int[] array = {1,2,3,43,4,4532,43};
//    }
//    public static void swap(int[] array,int a ,int b ){
//        int tmp = array[a];
//        array[a]= array[b];
//        array[b] = tmp;
//    }
//    public static void   bubbleSort(int[] array) {
//        if (array == null || array.length == 0){
//            return;
//        }
//        for (int i = 0; i <array.length-1 ; i++) {
//            for (int j = 0; j <array.length - 1 - j; j--) {
//                if (array[j+1] < array[i]){
//                    swap(array,j,j+1);
//                }
//            }
//
//        }
//    }
//}
//交换顺序
//public class TestChun {
//    public static void main(String[] args) {
//        int[] array = {1, 54, 3, 54, 6, 45332, 4645};
//        niXu(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void  niXu (int[] array){
//        int left = 0;
//        int right = array.length-1;
//        while (left < right ){
//            int tmp = array[left];
//            array[ left] = array[right];
//            array[right ] = tmp ;
//            right --;
//            left  ++ ;
//        }
//    }
//}
//public class TestChun{
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,6,3,4,3,2};
//        System.out.println(toSring(array));
//    }
//    public static String toSring (int[] array){
//        String ret = "[ ";
//        for (int i = 0; i <array.length ; i++) {
//            ret = ret + array[i];
//            if (i != array.length-1){
//                ret = ret + ",";
//            }
//        }
//        ret = ret + "]";
//        return ret ;
//    }
//}
//错误的二分查找；
//public class TestChun{
//    public static void main (String[] args){
//        int[] array= {1,2,3,4,5,6,7,8,9,10,22,24,25};
//        System.out.println(binarySearch(array,10));
//    }
//    public static int   binarySearch(int[] array , int key ) {
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (key < array[mid]){
//                    right = mid - 1;
//                }else if (key > array[mid]){
//                    left = mid - 1;
//                }else{
//                    return mid;
//                }
//            }
//        }
//        return -1;
//    }
//}
//降序排列
//public class TestChun{
// public static void main (String[] args){
//        int[] array= {1,2,3,34,4,5,65,6,7,67,6};
//        maoPao(array);
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static void maoPao (int[] array){
//        for (int i = 1; i < array.length ; i++) {
//            for (int j = 0; j < array.length-1 ; j++) {
//                if ( array[j] < array[ j+1 ] ){
//                  int   tmp = array[j];
//                    array [j ]= array [j+1 ];
//                    array [j+1] = tmp;
//                }
//            }
//        }
//    }
//}
//public class TestChun {
//    public static void main (String[] args){
//        int[]array = {1,2,3,4,6,7} ;
//        jianChan(array);
//    }
//    public static void jianChan (int[] array){
//        int i = 0;
//        for (; i < array.length-1; i++) {
//            if (array[i] > array[i + 1]) {
//                System.out.println("该数组不是升序");
//                break;
//            }
//        }
//        if(i >= array.length-1) {
//            System.out.println("是升序的！");
//        }
//    }
//}
//public class TestChun{
//    public static void main (String[] args){
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(copyOf(array)));
//
//    }
//    public static int[] copyOf (int[] array){
//      int[] ret = new int[array.length];
//        for (int i = 0; i <array.length ; i++) {
//            ret [i] = array[i];
//        }
//        return ret ;
//    }
//}
//优化后的冒泡排序
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,46,1,4,6,3,5,67,34};//9个数
//        bubbleSort(array );
//        System.out.println(Arrays.toString (array));
//    }
//    public static void  bubbleSort (int[] array){
//        boolean flag = true;//默认没有发生交换
//        for (int i = 1; i <= array.length ; i++) {  //i表示趟数
////            flag = false;//每一趟可能都没有交换；
//            for (int j = 0; j < array.length-i; j++) {
//                if (array[j] > array[j+1]){
//                    int tmp = array[j];
//                    array[j]= array[j+1];
//                    array[j+1] = tmp;
//                    flag = false;
//                }
//            }
//            if (flag ){
//                break;
//            }
//        }
//    }
//}

//public class TestChun{
//    public static void main (String[] args){
//        int[]array = {1,2,3,4,5};
//        for (int i = 0; i <array.length ; i++) {
//           int  abs = Math.abs(array[i]);
//            System.out.println(abs);
//        }
//    }
//}
//利用按位与或代替加法，a+b；
//class Solution {
//    public int add(int a, int b) {
//        while (a != 0) {
//            int temp = a ^ b;
//            a = (a & b) << 1;
//            b = temp;
//        }
//        return b;
//    }
//}
//class Solution {
//    public int add(int a, int b) {
//        while(b != 0) { // 当进位为 0 时跳出
//            int c = (a & b) << 1;  // c = 进位
//            a ^= b; // a = 非进位和
//            b = c; // b = 进位
//        }
//        return a;
//    }
//}
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,6,7,8};
//        int[] copy = Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(copy));
//    }
//}
//二分查找；
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,3,4,5,6,7,8,34,56};
//        System.out.println(chaZhao(array,56));
//    }
//    public static int chaZhao(int[]array , int key){
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//                if (key < array[mid]) {
//                    right = mid - 1;
//                } else if (key > array[mid]) {
//                    left = mid + 1;
//                } else {
//                    return mid;
//                }
//            }
//        return -1;
//    }
//}
// 冒泡排序优化；
//public class TestChun {
//    public static void main (String[] args){
//        int[] array = {2,3,42,45,432,482,43,21,49,63,34};
//        maoPao(array);
////        System.out.println(Arrays.toString(array));
//    }
//    public static void  maoPao ( int[] array ){
//        boolean flag = true;
//        for (int i = 1; i <array.length; i++) {
//            for (int j = 0; j <array.length-i ; j++) {
//                if (array[j] > array[j +1]){
//                    int  tmp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1]= tmp;
//                    flag = false;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}

















































































