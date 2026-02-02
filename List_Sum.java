// 偶数の合計を計算するJavaプログラム
public class List_Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("偶数の合計: " + sumEvenNumbers(numbers));
    }

    // 偶数の合計を計算するメソッド
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
        }
    }
