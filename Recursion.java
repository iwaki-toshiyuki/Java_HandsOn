// フィボナッチ数 - シンプル再帰
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
public class Recursion {
  public static void main(String[] args) throws Exception {
    int number = 30;
    for(int i =0; i <= number; i++){
    System.out.println(i + ":" + fibonacci(i));
    }
  }

  // フィボナッチ数を求める再帰メソッド
  public static long fibonacci(int num) {
      if(num == 0){
          return 0;
      }
      if(num == 1){
          return 1;
      }
      return fibonacci(num - 1) + fibonacci(num - 2);
  }
}
