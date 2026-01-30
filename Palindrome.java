// 文字列が回文かどうかを判定する
public class Palindrome {
    public static void main(String[] args) {
            String s = "level";

            boolean isPalindrome = true;

            // 前後から1文字ずつ比較
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    isPalindrome = false;
                    break; // 1つでも違えば終了
                }
            }

            System.out.println(isPalindrome ? "YES" : "NO");
        }
}
