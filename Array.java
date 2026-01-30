public class Array {
    public static void main(String[] args) {
            int[] numbers = {3, 5, 2, 9, 1};

            // 最初の要素を最大値として初期化
            int max = numbers[0];

            // 2番目以降を確認
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i]; // 最大値を更新
                }
            }

            System.out.println(max);
        }
}
