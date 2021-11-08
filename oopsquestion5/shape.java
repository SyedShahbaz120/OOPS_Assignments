package oopsquestion5;



//question 5 from assignments

//base class
abstract class shape{
	abstract void draw();
	{
		System.out.println("Drawing shapes");
	}
	public static void main(String[] args)
	{
		shape s1 = new cube();
		s1.draw();
		shape s2 = new rectangle();
		s2.draw();
		shape s3 = new line();
		s3.draw();
	}
	
}
class line extends shape{
	void draw()
	{
		System.out.println("Drawing line");
	}
	
}

class rectangle extends shape{
	void draw()
	{
		System.out.println("Drawing Rectangle");
		
	}
	
}

class cube extends shape{
	void draw()
	{
		System.out.println("Drawing Cube");
	}
}
	


