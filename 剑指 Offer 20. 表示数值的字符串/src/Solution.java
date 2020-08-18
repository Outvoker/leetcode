public class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        char[] str = s.trim().toCharArray();    //去除头尾空格 trim
        for(int i = 0; i < str.length; i++) {
            if(str[i] >= '0' && str[i] <= '9') numSeen = true;  //看见数字
            else if(str[i] == '.') {       //看见'.'前面不能有'.'不能有'e'
                if(dotSeen || eSeen) return false;
                dotSeen = true;
            }
            else if(str[i] == 'e' || str[i] == 'E') {   //e前面必须没有e，必须有数
                if(eSeen || !numSeen) return false;
                eSeen = true;
                numSeen = false;    //确保e后面有数字
            }
            else if(str[i] == '+' || str[i] == '-') {
                if(i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E')     //+-只有在0位置和e后面第一个位置才可以
                    return false;
            }
            else
                return false;
        }
        return numSeen;
    }
}
//[\+|\-]?[0-9]+[.[0-9]+]?[[e|E][0-9]+]?
