// 連続する重複要素があるかどうかをチェックするJavaプログラム
public class HasConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3};
        System.out.println("連続する重複要素があるか: " + hasConsecutiveDuplicates(numbers));
    }

    // 連続する重複要素があるかどうかをチェックするメソッド
    public static boolean hasConsecutiveDuplicates(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
