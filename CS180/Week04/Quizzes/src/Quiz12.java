public class Quiz12 {
    public static void main(String[] args) {
        String s1 = "Purdue:University";
        String s2 = "West Lafayette";
        String combine = s1.substring(3,7)+","+s2.substring(0);
        int len = s1.length();
        String length = Integer.toString(len);
        System.out.println(combine+length);
    }
}