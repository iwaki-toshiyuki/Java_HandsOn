public class Fibo {
    // フィボナッチ数 - 配列
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

    public static void main(String[] args) throws Exception {
        int number = 50;
        long fibo[] = new long[number + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 0; i <= number; i++) {
            if(i >= 2){
                fibo[i] = fibo[i -1] + fibo[i -2];
            }
          System.out.println(i + ":" + fibo[i]);
        }
    }

}
