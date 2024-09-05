public class Ch {
	public static int calculator(int num1, char operator, int num2) {
	if(operator =='/'&& num2 == 0){
	throw new ArithmeticException
	("Division by zero is not allowed");
	}
		switch(operator){
				case '+':
				return num1 + num2;
				case '-':
				return num1-num2;
				case '*':
				return num1*num2;
				case '/':
				return num1/num2;
   default :
		     throw new IllegalArgumentException(
				 "Invalid operator:"+operator); 
			}
	
		
		
  }
}

