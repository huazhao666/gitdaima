////public class Test {
////    public static void main(String[] args) {
////        int count = 0;
////        for (int i = 1; i <= 100; i++) {
////            if (i % 10 == 9) {
////                count++;
////            }
////
////                if ((i / 10) % 10 == 9) {
////                    count++;
////                }
////            }
////
////        System.out.print(count);
////    }
////}
//import java.util.Scanner;
//public class Test {
////    public static void main (String[] args){
////        Scanner sc = new Scanner(System.in);
////        while (sc.hasNext()) {
////            int n = sc.nextInt();
////            fun(n);
////        }
////    }
////
////    public static void fun(int num) {
////        char[] chars = String.valueOf(num).toCharArray();
////        for (int i = 0; i < chars.length; i++) {
////            System.out.print(chars[i] + " ");
////        }
////        System.out.println();
////    }
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数");
//        int value = sc.nextInt();
//        System.out.print("偶数序列");
//        for (int i = 31 ; i > 0; i = i - 2){
//            System.out.print((value>>i )& 1);
//        }
//        System.out.println("");
//        System.out.print("奇数序列");
////        for ( int i = 30 ; i > = 0 ; i = i - 2）{
////            System.out.println((value>> i )& 1);
////        }
//        for (int i = 30; i >= 0  ; i-=2) {
//            System.out.print((value>> i )& 1);
//        }
//        sc.close();
//    }
//}


//import java.util.Random;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        fun();
//    }
//
//    public static void fun() {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("请选择：0：进入游戏；1：退出游戏");
//            int n = sc.nextInt();
//            if (n == 0) {
//                System.out.println("进入游戏");
//                game();
//            } else if (n == 1) {
//                System.out.println("退出游戏");
//                sc.close();
//                break;
//            } else {
//                System.out.println("错误");
//            }
//        }
//    }
//
//    public static void game() {
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        int value = r.nextInt(100);
//        System.out.println("请输入答案");
//        while (true) {
//            int count = sc.nextInt();
//            if (count > value) {
//                System.out.println("高了");
//            } else if (count < value) {
//                System.out.println("低了");
//            } else {
//                System.out.println("对了");
//                return;
//            }
//        }
//

//import com.sun.org.apache.xpath.internal.operations.String;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
// 前五项阶乘和
//public class Test {
//    public static void main(String[] args) {
//        System.out.println(facSum(5));
//    }
//
//    public static int facSum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += facNum(i);
//        }
//        return sum;
//    }
//    public static int facNum(int n) {
//        int fac = 1;
//        for (int i = 1; i <= n; i++) {
//            fac = fac * i;
//        }
//        return fac;
//    }
//}
// 输出整数的每一位
//    public static void main (String[] args){
//        int n = 123;
//        while ( n != 0 ){
//            System.out.println(n % 10);
//            n = n /10;
//        }
//    }

//求二进制的偶数序列和奇数序列
// public class Test{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个整数");
//         int n  = sc.nextInt();
//         for (int i = 31; i >= 1; i -= 2) {
//             System.out.print(((n >>i ) &1) +"");
//         }
//         System.out.println();
//         for (int i = 30; i >= 0 ; i -= 2) {
//             System.out.print(((n >>i )&1) +"");
//         }
//         sc.close();
//     }
//
//}
// 求二进制位一的数字
//public class  Test {
//    public static void main(String[] args) {
//        int n = 7;
//        int count = 0;
//        while (n != 0) {
//            count++;
//            n = n & (n - 1);
//        }
//        System.out.println(count );
//    }
//}

// 三次密码游戏
//public  class  Test{
//  public static void main (String[] args){
//  Scanner sc = new Scanner(System.in);
//  int count = 3;
//  System.out.println("请输入密码");
//  String password = sc.nextLine();
//      if (password.equals("4856345")){
//            System.out.println("登陆成功");
//       }else{
//            count --;
//            System.out.println("登陆失败");
//            System.out.println("你还剩下：" + count + "次机会");
//       }
//  }
//}
//最大公约数
//public class  Test{
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入两个整数");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//            while(a % b != 0){
//            int c = a % b ;
//            a = b;
//            b = c;
//            }
//        System.out.println("最大公约数是"+ b);
// 分数和，1 - 0.5+ 1/3 - .....
//        int n = sc.nextInt();
//        double sum = 0;
//        int flag = 1;
//        for (int i = 1; i <= n; i++) {
//            sum += ( 1.0/ i) * flag;
//            flag = - flag ;
//        }
//        System.out.println(sum);
// 求自幂数
//        for (int i = 0; i <n  ; i++) {
//            int count = 0;
//            int tmp = i ;
//            while (tmp != 0){
//                count ++;
//                tmp = tmp / 10 ;
//            }
//            tmp = i;
//            int sum = 0;
//            while (tmp != 0 ){
//                sum += Math.pow(tmp % 10, count );
//                tmp /= 10;
//            }
//            if (sum == i ){
//                System.out.println(i + "是自幂数");
//            }
//        }
//    }
//}

//比较三个数的大小
//
//public  class Test {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入三个整数");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(maxMax( a,b,c ));
//        sc.close();
//    }
//    public static int maxTwoNumber (int a ,int b ){
//
//          if (a > b ){
//              return a ;
//          }else {
//              return b;
//          }
//    }
//    public static int maxMax ( int a ,int b,int c ) {
//
//        if (c > maxTwoNumber(a, b)) {
//            return c;
//        } else {
//            return maxTwoNumber(a, b);
//        }
//    }
//}
//斐波那契数列
//public class Test  {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        int sum = feiBo( n );
//        System.out.println("sum =" + sum );
//        sc.close();
//    }
//    public static int feiBo ( int n ){
//        int sum = 0;
//        if (n == 1 || n == 2){
//            sum = 1;
//        }
//        int a = 1;
//        int b = 1;
//        for (int i = 3; i <= n  ; i++) {
//            sum = a + b ;
//            a = b ;
//            b = sum ;
//        }
//        return sum;
//    }
//}
// N的阶乘的和
//public  class  Test {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//            System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//            System.out.println( facSum( n ));
//        sc.close();
//    }
//    public static int facNum (int n ){
//        int fac = 1;
//        for (int i = 1; i <= n ; i++){
//            fac = fac * i;
//        }
//        return fac ;
//    }
//
//    public  static  int facSum (int n ){
//        int ret = 0;
//        for (int i = 1; i <= n; i++) {
//            ret += facNum(i) ;
//        }
//        return ret ;
//    }
//}

//N的阶乘
//public  class  Test {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(facSum(n));
//        sc.close();
//    }
//    public static int facSum (int n ){
//        int fac = 1;
//        for (int i = 1; i <= n; i++) {
//            fac = fac *i;
//        }
//        return fac;
//    }
//}
//输出整数的每位数字求和
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int num = sc.nextInt();
//        System.out.println(sum(num));
//        sc.close();
//    }
//
//    public static int sum(int num) {
//        if (num < 10) {
//            return num;
//        }
//        return num % 10 + sum(num / 10);
//    }
//}
//}斐波那契数列
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(fib (n));
//        sc.close();
//    }
//    public static int fib (int n ){
//        if (n ==1 || n ==2) {
//            return 1;
//        }
//        return fib (n-1 )+ fib( n - 2 );
//    }
//}
//青蛙跳台阶
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(qiWa(n));
//        sc.close();
//    }
//    public static int qiWa (int n ){
//        if(n == 0 ||n ==1 || n ==2 ){
//            return n ;
//        }
//        return qiWa(n - 1)+ qiWa(n - 2) ;
//    }
//}
// 汉诺塔
//public class Test {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//            System.out.println("请输入一个整数");
//            int n = sc.nextInt();
//            System.out.println("移动塔的步骤：");
//        hanNuoTa(n ,'a' , 'b','c' );
//        sc.close();
//    }
//    public static void move (char  a , char c ){//执行最大盘子的从a-c的移动
//        System.out.println("move:" + a + " ---->"+ c);
//    }
//    public static void hanNuoTa (int n , char a , char b, char c ){
//        if (n == 1){
//           move ( a ,c  );
//        }else {
//            hanNuoTa(n-1,a,c,b);//步骤一： 按照abc数序执行n-1的汉诺塔移动
//            move(a,c);//执行最大盘子移动
//            hanNuoTa(n-1,b,a,c);//按bac顺序执行n-1的汉诺塔移动
//        }
//    }
//}
// 数组找出现过一次的数字
//public class  Test {
//    public static void main (String[] args){
//        int[] arry = {2,3,5,6,2,3,6};
//        int ret = 0;
//        for (int i = 0; i < 7; i ++ ){
//            ret = ret ^arry[i] ;
//        }
//        System.out.println(ret );
//    }
//}
//public class  Test {
//    public static int findShuZi (int [] arry ){
//        int ret = 0;
//        for (int i = 0; i < 7; i ++ ){
//            ret = ret ^arry[i] ;
//        }
//        return ret ;
//    }
//    public static void main (String[] args){
//        int[] arry = {2,3,5,6,2,3,6};
//        int b = findShuZi(arry );
//        System.out.println( b );
//    }
//}
//public class  Test {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("请输入一个整数");
//        int num = sc.nextInt();
//        sum (num  );
//    }
//    public static void  sum ( int num   ){
//        if (num <=9 ) {
//            System.out.print(num + " " );
//            return  ;
//        }
//        sum(num  /10 );
//        System.out.print (num %10 + " ");
//    }
//
//}
//public class  Test {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in );
//        System.out.println("请输入一个整数");
//        int num = sc.nextInt();
//        System.out.println(sum ( num  ));
//    }
//    public static int sum ( int num ) {
//        if (num  == 1 ){
//            return 1;
//        }else {
//            return num + sum(num - 1 );
//        }
//    }
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = sc.nextInt();
        sum(n);
    }

    public static void sum(int n) {
        if (n <= 9) {
            System.out.println(n);
            return;
        }
        sum(n / 10);
        System.out.println(n % 10);
    }
}



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = sc.nextInt();
//        System.out.println(sum(n));
//    }
//
//    public static int sum(int n) {
//        if (n <= 9) {
//            return n;
//        }
//        return sum(n / 10) + n % 10;
//    }
//}





