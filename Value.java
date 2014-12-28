public class Value{

			//返回普通变量
		public int print(String msg){

			int x = 10;
			System.out.println(msg);
			return x;
		}

		//返回值为空
		public void show(String msg){

			System.out.println(msg);
			return ;
		}

		//返回值为复合数据类型
		public String[] foundArray(){

			return new String[]{"haha","hehe"};
		}

		public static void main(String[] args){

			Value obj = new Value();
			int temp = obj.print("返回常规变量");
			System.out.println(temp);

			obj.show("返回为空");

			String[] str = obj.foundArray();
			System.out.println(str);
		}
}