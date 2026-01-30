public class Sum {
    public static void main(String[] args) {
        int N = 10; // 入力値（本番では標準入力）

        int sum = 0; // 合計を保持する変数

        // 1からNまで繰り返す
        for (int i = 1; i <= N; i++) {
            sum += i; // 現在の値を合計に加算
        }

        // 結果を出力
        System.out.println(sum);
    }
}
