package my.demo;

public class Main {

    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        int m = 0;
        while(i < j) {
//            m = (i + j) / 2;
            m = i + (j - i) / 2; //防止溢出
            if(numbers[m] > numbers[j]) i = m + 1;
            else if(numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        int[] a = {3,1};
        System.out.println(minArray(a));
    }
}
