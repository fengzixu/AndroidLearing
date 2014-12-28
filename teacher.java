public class teacher{
	
	private String teacherName;
	private String gendar;
	
	//构造对象，调用构造方法，隐式包含在类中，也可以显示定义，但是函数名要和类名相同
	//初始化对象的属性值,没有返回类型
	public teacher(){

		System.out.println("构造函数");
	}	

	public void teach(){
		
		System.out.println("备课");
		System.out.println("授课");		
	}

	public static void main(String[] args){
		teacher cindy = new teacher();
		cindy.teach();
	}
}