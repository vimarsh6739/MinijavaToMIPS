class Test3 {
 public static void main(String[] a) {
  System.out.println(new TestClass().TestMethod(10 + 0));
 }
}
class TestClass {
 public int TestMethod(int num) {
  {
   System.out.println(num);
  }
  return 999;
 }
}
