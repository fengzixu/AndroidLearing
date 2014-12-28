public class While{

	public static void main(String[] args){

		int sum = 0;
		int count = 1;
		//for循环实现1+。。。。+100
		for(int i = 1; i <= 100; i++)
			sum += i;
		System.out.println(sum);

		//清除sum数据，利用while循环来实现
		sum = 0;
		while(count <= 100)
		{
			sum += count;		//先执行核心语句，然后改变循环控制变量，以至于循环能够正常退出
			count++;
		}
		System.out.println(sum);


		//清除sum,count数据，根据do while循环语句来实现
		count = 1;
		sum = 0;
		do{

			sum += count;
			count++;

		}while(count <= 100);

		System.out.println(sum);

		//清除sum count数据，根据while-break来实现
		count = 1;
		sum = 0;
		while(true){

			sum += count;
			count++;
			if(count > 100)  //循环多余100次的时候，即使count在累加，但是sum已经不再进行加法
			{
				count = 1;
				break;
			}
		}
		System.out.println(sum);

		//初始化sum和count，利用coutinue来实现
		sum = 0;
		count = -1;
		while(true)
		{
			if(count < 1)
			{
				System.out.println("count = " + count);
				count++;
				continue;
			}
			sum += count;
			count++;
			if(count > 100)
				break;
		}
		System.out.println(sum);
	}
}