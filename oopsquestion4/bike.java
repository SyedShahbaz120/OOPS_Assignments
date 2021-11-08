package oopsquestion4;



//testing abstract class principles
public abstract class bike {
	//private abstract class bike
	//abstract void run();
	void run()//abstract class without abstract method
	{
		System.out.println("running safely");
	}
}
//}

class honda extends bike {
	/* void run()
	{
		System.out.println("running safely");
	}
	*/
	
	public static void main(String args[])
	{
		bike obj = new honda();
		obj.run();
	}
}
	
	

//1.The abstract method run in type bike can only be defined by an abstract class
/* 2.An abstract class cannot be instantiated directly,
 i.e. the object of such class cannot be created directly using the new keyword. ... 
 An abstract method is declared by abstract keyword, such methods cannot have a body.
 If a class contains an abstract method,
 then it also needs to be abstract without abstract method declared with ;.
 >The method run() is undefined for the type bike
*/
//3.override all methods from abstract class or make subclass as abstract class
/*4.abstract class cannot be private >--Illegal modifier for the class bike;
only public, abstract & final are permitted
*/
//5.abstract class cannot be final
/*6.declare abstract class without having abstract method
 */
