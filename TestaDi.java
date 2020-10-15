import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;


//public class TestaDi {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(feb( n ));
//        sc.close();
//    }
//    public static int feb (int n ){
//        if (n == 1 || n == 2){
//            return 1 ;
//        }
//        return feb(n -1) + feb(n-2);
//    }
//}
//public class TestaDi {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println (sum( n ));
//        sc.close();
//    }
//    public static  int sum (int n ){
//        if (n <= 9){
//            return n ;
//        }
//        return sum (n /10) + n % 10 ;
//    }
//}

//public class TestaDi {
//    public static void main (String[] args){
//        int n = 10;
//        System.out.println(sum (n));
//    }
//    public  static int sum (int n ){
//        if (n ==1 ){
//            return 1 ;
//        }
//        return n  + sum( n -1 );
//    }
//}
//public class TestaDi {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(fac(n));
//        sc.close();
//    }
//    public static int fac (int n  ){
//        if (n == 1){
//            return 1;
//        }
//        return n * fac(n-1 );
//    }
//}
//public class TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入台阶数");
//        int n = sc.nextInt();
//        System.out.println(jump(n )+ "种跳法");
//    }
//    public static int jump (int n ){
//        if (n == 1|| n == 2 ){
//            return n ;
//        }
//        return jump(n-1)+ jump(n -2);
//    }
//}
//public class TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入盘子个数");
//        int n = sc.nextInt();
//        System.out.println("移动塔的步骤");
//        hanNuoTa(n,'A','B','C');
//
//    }
//    public static void move (char A,char B){
//        System.out.println( A+ "------>" + B );
//    }
//    public static void hanNuoTa (int n , char A,char B ,char C ){
//        if (n ==1){
//            move( A,C );
//            return ;
//        }
//        hanNuoTa(n-1,A,B,C);
//        move( A,C );
//        hanNuoTa( n-1 ,B,A,C);
//    }
//}
//public class TestaDi {
////    public static void main (String[] args){
////        int []arr = {2,3,4,2,4,2,6,7,9,5,3};
////        for (int i = 0; i < 11  ; i++) {
////            for (int j = i+1; j < 11 ; j++) {
////                if (arr[j] % 2 != 0 ) {
////                    int tmp = arr[j];
////                    arr[j] = arr [i];
////                    arr[i] = tmp;
////                }
////            }
////            System.out.print(arr[i] + " ");
////        }
////    }
////}
//求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
//public class TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("请输入两个整数");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max1 = max(a,b );
//        System.out.println("最大的整数是" + max1);
//        System.out.println("请输入两个小数");
//        double j = sc.nextDouble();
//        double k = sc.nextDouble();
//        double max2 = max(j,k);
//        System.out.println("最大的小数是" + max2);
//        max(a,j,k);
//        max1(b,j,k);
//        sc.close();
//    }
//    public static int max (int a, int b ){
//        if (a > b ) {
//            return a;
//        }
//        return b ;
//    }
//    public static  double max (double j ,double k ){
//        if (j > k ){
//            return j;
//        }
//        return k ;
//    }
//    public static double min  (double j, double k  ){
//        if (j > k ){
//            return k;
//        }
//        return j;
//    }
//    public static double  max ( int a ,double j, double k  ) {
//        if (a > max(j, k)) {
//            System.out.println(a + ">"+max(j,k) + " >" + min(j,k ));
//            return a;
//        }
//        if (a < min(j,k)){
//            System.out.println( max(j,k) + " >"  + min(j ,k ) +" >"+ a );
//            return max(j,k);
//        }
//        System.out.println(max(j,k )+ " > " + a + " >" + min(j,k ));
//        return max(j,k);
//    }
//    public  static double max1 (int  b ,double j ,double k ){
//        if (b > max(j,k) ){
//            System.out.println(b + ">"+max(j,k) + " >" + min(j,k ));
//            return b ;
//        }
//        if (b < min(j,k)){
//            System.out.println( max(j,k) + " >"  + min(j ,k ) +" >"+ b );
//        }
//        System.out.println(max(j,k )+ " > " + b + " >" + min(j,k ));
//        return max(j,k );
//    }
//}
//public class TestaDi {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入两个整数，三个小数");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        double c = sc.nextDouble();
//        double j = sc.nextDouble();
//        double k = sc.nextDouble();
//        int ret = add(a,b );
//        double ret2 = add(c,j,k );
//        System.out.println(ret );
//        System.out.println(ret2);
//        sc.close();
//    }
//    public static int add(int a , int b){
//        return a + b ;
//    }
//    public static double add (double c,double j ,double k ){
//        return c + j + k ;
//    }
//}
//public class TestaDi {
//        public static void main (String[] args){
//            Scanner sc = new Scanner(System.in );
//            System.out.println("请输入一个整数");
//            int n = sc.nextInt();
//            sum (n );
//        }
//        public static void sum (int n ){
//            if (n <= 9 ){
//                System.out.println(n );
//                return ;
//            }
//            sum( n / 10);
//            System.out.println(n % 10);
//        }
//}
//public class TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(sum(n ));
//
//    }
//    public static int sum (int n ){
//        if (n <= 9){
//            return n ;
//        }
//        return sum( n/ 10) +  n % 10 ;
//    }
//}
//public class   TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("输入整数");
//        int n = sc.nextInt();
//        every(n );
//
//    }
//    public static int every (int n ){
//        if ( n <= 9){
//            System.out.println(n );
//            return n;
//        }
//        every(n / 10);
//        System.out.println( n % 10);
//        return n;
//    }
//}
//public class TestaDi {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("输入整数");
//        int n = sc.nextInt();
//        sum(n);
//    }
//    public static int res = 0;
//    public static void sum(int n){
//        res += (n % 10);
//        if (n <= 9){
//            System.out.println(res);
//            return;
//        }
//        sum(n / 10);
//    }
//}
// 判断素数
//public class TestaDi {
//    public static void main(String[] args) {
//        for (int i = 3; i <= 100; i++) {
//            boolean flag = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//            System.out.println(i);
//            }
//        }
//    }
//}

//public  class TestaDi {
//    public static void main (String[] args){
//        fun();
//    }
//    public static void  fun () {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字1");
//        int n = sc.nextInt();
//        while( true ){
//            if (n != 1){
//                System.out.println("不听话，拜拜");
//                break;
//            }
//            if ( n == 1) {
//                System.out.println("真机智，游戏继续");
//                game();
//            }
//        }
//    }
//    public static void game  (  ){
//        Random random = new Random();
//        int guess = random.nextInt(100);
//        System.out.println("请输入数字");
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            int n = sc.nextInt();
//            if ( n  == guess ){
//                System.out.println( "猜对了，真聪明");
//                break;
//            }
//            if ( n > guess ){
//                System.out.println("高了，请继续");
//            }
//            if ( n < guess ){
//                System.out.println("低了，再来一次吧");
//            }
//        }
//    }
//}