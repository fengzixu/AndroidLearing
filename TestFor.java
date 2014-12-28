public class TestFor{
	public static void main(String[] args){

		//1.0 version
		int x = 1;
		for(;x <= 3; x++)
			System.out.println(x);

		//2.0 version
		for(int i = 1; i <= 3; i++)
			System.out.println(i);

		//3.0 version
		int y = 1;
		for(;;){
			System.out.println(y);
			y++;
			if(y > 3)
				break;
		}
	}
}