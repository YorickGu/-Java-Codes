class OtherDemo 
{
	public static void main(String[] args) 
	{
		//break：
		w:for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}				
		}

		//continue:只能作用于循环结构。继续循环。特点：结束本次循环，继续下一次循环。

		for(int x=1; x<=10; x++)
		{
			if(x%2==1)
				continue;
			System.out.println("x="+x);
			
		}

		w:for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				continue w;
			}				
		}

		/*
		记住：
		1，break和continue语句作用的范围。
		2，break和continue单独存在时，下面可以有任何语句。因为都执行不到。
		*/

//		break;
//		continue;
	}
}
