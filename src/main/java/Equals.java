public class Equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s2); // true
        System.out.println(s1 != s3); // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true
    }
}
