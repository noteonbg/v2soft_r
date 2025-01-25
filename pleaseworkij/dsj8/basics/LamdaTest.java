package dsj8.basics;

public class LamdaTest {
	
	public static void main(String[] args) {
		
		
		//here you were forced to write a class and then a function and then create object
//this is slower , inefficient hold on let us measure...
		
		
		FuncInterface fobj = new ABC();
		//fobj.abstractFun(3);
		
		f1(fobj);//what is input? an object whose class implements FunnInterface
		
		//all the above has been done in just one line so lines of code will reduce, will it make a big difference measure.
		
		//FuncInterface gobj = (int x)->System.out.println("hello");
		//gobj.abstractFun(4);
		
		long y = System.currentTimeMillis();
		
		//this is faster(?) lines of code reduces totally agreed.
		f1((int x)->System.out.println("fine")); //what is input required for the function
		//you should never tell the answer..
		
		long z = System.currentTimeMillis();
		
		System.out.println(z-y);
		
				
				
				//
		  
        // This calls above lambda expression and prints 10.
       // fobj.abstractFun(5);
	}

	private static void f1(FuncInterface fobj) {
		// TODO Auto-generated method stub
		
		
		System.out.println(fobj.getClass().getName());
		//fobj.abstractFun(3);
		
		// inside that function we are teling who cares how i got the input
		
		//all I need some object whose class imlements FuncInterface, i am sure
		// i have function abstractfun
		
		
		
	}

}


/*

Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.

() -> {  
//Body of no parameter lambda  
}  

(p1) -> {  
//Body of single parameter lambda  
}  


(p1,p2) -> {  
//Body of multiple parameter lambda  
}  




*/
