class Test20 {
 public static void main(String[] a) {
  System.out.println(new TestClass().TestMethod());
 }
}
class TestClass {
 int[] array;
 public int TestMethod() {
  array = new int[10]; {
   array[(10 / 5)] = 5 * 2;
  } {
   array[(10 / 5)] = (array[(10 / 5)]) + 1;
   System.out.println((array[(10 / 5)]));
  }
  return 10;
 }
}
