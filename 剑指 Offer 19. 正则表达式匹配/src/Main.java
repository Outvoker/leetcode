public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("a",".*..a*"));
        System.out.println();
        System.out.println(solution.isMatch2("a",".*..a*"));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isMatch("aa", "a*"));
    }
}
