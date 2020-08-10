package my.demo;

public class Main {

    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(replaceSpace("We are happy."));
    }
}
