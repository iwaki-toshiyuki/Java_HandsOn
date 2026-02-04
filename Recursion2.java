// フィボナッチ数 - 再帰1回
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
public class Recursion2 {
    public static void main(String[] args) throws Exception {
        int number = 50;
        for(int i = 0; i <= number; i++){
        System.out.println(i + ":" + fibonacci(i));
        }
    }

    // フィボナッチ数を求める再帰メソッド
    public static long fibonacci(int num) {
        return fib2(0,1, num);
    }

    // フィボナッチ数を求める再帰メソッド（補助メソッド）
    public static long fib2(long a, long b, long c) {
        if(c < 1){
            return a;
        }
        return fib2(a + b,a, c -1);
    }
}
