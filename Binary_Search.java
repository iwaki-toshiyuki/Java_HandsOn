// 二分探索
public class Binary_Search {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 7;

        int left = 0;
        int right = numbers.length - 1;

        boolean found = false;

        // 探索範囲がなくなるまで繰り返す
        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                found = true;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1; // 右側を探索
            } else {
                right = mid - 1; // 左側を探索
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}

