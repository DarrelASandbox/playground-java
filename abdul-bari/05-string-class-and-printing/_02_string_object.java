public class _02_string_object {
  public static void main(String[] args) {
    String str1 = "Java";
    String str2 = "Java";
    String str3 = "java";
    String str4 = new String("Java");

    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    System.out.println(str1 == str4); // false
  }
}
