public class Solution2 {
    //递归
    /*
        特判，同时也是递归出口，如果p是空串，返回s是否为空串。如果p不为空，保证一定存在p[1]（可能是字符串结尾\0）
        假如p[1] == * 的话，可以尝试两种情况：情况一是递归比较s和p.substr(2)；情况二是当s[0]可以匹配p[0]时,
        尝试递归比较s.substr(1)和p，这里没有必要比较s.substr(1) 和 p.substr(2)，因为这种情况已经包含在递归比较s.substr(1)和p当中了
        假如p[1] != *,如果p[0]不匹配s[0]，返回false，否则递归判断s.substr(1)和p.substr(1)
     */
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return s.isEmpty();
        boolean b = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if(p.length() >= 2 && p.charAt(1) == '*') return isMatch(s, p.substring(2)) || (b && isMatch(s.substring(1), p));
        return b && isMatch(s.substring(1), p.substring(1));
    }
}
