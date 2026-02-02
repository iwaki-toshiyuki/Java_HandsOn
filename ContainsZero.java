// 配列にゼロが含まれているかをチェックするJavaプログラム
public class ContainsZero {

public static void main(String[] args) {
    int[] numbers = {1, 2, 0, 4, 5};
    System.out.println("配列にゼロが含まれているか: " + containsZero(numbers));
}

// 配列にゼロが含まれているかをチェックするメソッド
    public static boolean containsZero(int[] numbers) {
    for (int num : numbers) {
        if (num == 0) {
            return true;
        }
    }
    return false;
}

}
