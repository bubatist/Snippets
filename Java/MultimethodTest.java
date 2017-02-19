public class MultimethodTest {
	public static void main(String[] args) {
		Object o1 = new Integer(1);
		Object o2 = new String("string");
		doStuff(o1);
		doStuff(o2);
	}
	public static void doStuff(Object o) {
		System.out.println("Object o");
	}
	public static void doStuff(String str) {
		System.out.println("String str");
	}
}