// フィボナッチ数 - ビネの公式
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
public class Bine {
    public static void main(String[] args) throws Exception {
      int number = 50;
      for(int i = 0; i <= number; i++){
      System.out.println(i + ":" + fibonacci(i));
        }
    }

    // フィボナッチ数を求めるビネの公式メソッド
    public static long fibonacci(int num) {
        return Math.round((Math.pow((1 + Math.sqrt(5)) / 2, num)
        - Math.pow((1 - Math.sqrt(5)) / 2,num )) / Math.sqrt(5));
    }
}
