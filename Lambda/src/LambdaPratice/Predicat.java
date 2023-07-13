package LambdaPratice;

import java.util.function.IntPredicate;

public class Predicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//predicated with lamba expression
       IntPredicate lessThen18 = (i)-> i<18;
       System.out.println(lessThen18.test(19));
      
	}

}
