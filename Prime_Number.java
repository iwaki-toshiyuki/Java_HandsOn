// 素数判定プログラム
public class Prime_Number {
    public static void main(String[] args) {
        int N = 29;

        boolean isPrime = true;

        if (N <= 1) {
            isPrime = false;
        } else {
            // 2〜√Nまで調べれば十分
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "YES" : "NO");
    }
}
