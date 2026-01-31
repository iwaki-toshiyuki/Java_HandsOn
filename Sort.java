// バブルソート
public class Sort {
    public static void main(String[] args) {
    int[] numbers = {5, 3, 8, 1};

    for (int i = 0; i < numbers.length - 1; i++) {
        for (int j = 0; j < numbers.length - 1 - i; j++) {
            if (numbers[j] > numbers[j + 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                }
            }
        }
    // ソート結果を表示
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println(); // 改行
    }
}