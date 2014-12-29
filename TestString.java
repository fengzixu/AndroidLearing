public class TestString{

	public static void main(String[] args){

		//两种对String对象创建的形式
		//1.只是把一个常量赋值给一个变量
		//只创建了一个对象
		String name1 = "hello world";

		/*2和3实际上都创建了两个对象，一个是
		new出来的对象，还有一个就是name2，name3，
		他们是一个引用对象会指向我们刚刚创建的对象。
		*/
		//2
		String name2 = new String();
		name2 = "hahaha";

		//3.
		String name3 = new String("aaa");

		int len = name1.length();
		System.out.println(len);

		char c = name1.charAt(0);
		System.out.println(c);

	}
}