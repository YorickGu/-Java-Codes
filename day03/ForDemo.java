class ForDemo 
{
	public static void main(String[] args) 
	{

		/*
		for(初始化表达式；循环条件表达式；循环后的操作表达式)
		{
			执行语句；
		}

		*/

		for(int x = 0; x<3 ; x++)
		{
			System.out.println("x="+x);

		}
		//System.out.println("x===="+x);
		
		int y=0;
		while(y<3)
		{
			System.out.println("y="+y);
			y++;
		}
		System.out.println("y===="+y);

		/*
		1,变量有自己的作用域。对于for来讲：如果将用于控制循环的增量定义在for语句中。那么该变量只在for语句内有效。
		for语句执行完毕。该变量在内存中被释放。

		2，for和while可以进行互换。如果需要定义循环增量。用for更为合适。

		
		总结：
		什么时候使用循环结构？
		当要对某些语句执行很多次时，就使用循环结构。


		*/
	}
}
