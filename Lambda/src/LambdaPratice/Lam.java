package LambdaPratice;

interface Lambda{
	public void demo();
}
public class Lam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Lambda l1 = new Lambda() {
//        	public void demo()
//        	{
//        		System.out.println("DEMO is Calling...");
//        	}
//        };
		
		//lambda expression
		Lambda l1 = ()-> System.out.println("DEMO is Calling...");
        l1.demo();
        
        //thread written using lambda method
        Thread t1 = new Thread(()-> System.out.println("I am inside the lambda.."));
        
        //for multiple statement
        Thread t2 = new Thread(()-> {
        	System.out.println("I am inside the lambda..");
        	System.out.println("I am inside the lambda2..");
        });
        t2.start();
	}

}
