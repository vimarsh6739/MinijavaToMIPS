class Test24 {
 public static void main(String[] a) {
  System.out.println(new TestClass().TestMethod());
 }
}
class TestClass {
 public int TestMethod() {
  if (1 <= 2) System.out.println(5 + 10);
  else System.out.println(5 + 11);
  return 999;
 }
}
