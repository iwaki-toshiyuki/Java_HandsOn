// 全探索（線形探索）
public class Search {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9};
        int target = 3;

        boolean found = false;

        // 配列を先頭から順に確認
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break; // 見つかったら終了
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}
