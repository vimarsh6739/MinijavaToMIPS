class Test33 {
 public static void main(String[] a) {
  System.out.println(new TestClass().TestMethod());
 }
}
class TestClass {
 int a;
 public int TestMethod() {
  a = 1; {
   if (a <= 1) System.out.println(100);
   else System.out.println(0);
  }
  return 999;
 }
}
