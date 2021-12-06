package application;

public class model {
	public float calculate(float number1,float number2,String operator) {
		switch(operator) {
		case "+":
			return number1+number2;
		case "-":
			return number1-number2;
		case "*":
			return number1*number2;
		case "/":
			if(number2==0) {
				return 0;
			}
			return number1/number2;
		
		default:
			break;
		}
		return 0;
	}
	public float calculateUnaryNumber(float number1,String operator){
		switch (operator) {
		case "sqr_root":
			return (long)Math.sqrt(number1);
		case "Sin":
			return (float)Math.sin(number1);
		case "Cos":
			return (long)Math.cos(number1);
		case "Tan":
			return (float)Math.tan(number1);
		
		case "x^2":
			return number1*number1;
		case "x^3":
			return number1*number1*number1;
		case "Log":
			return (float) Math.log10(number1);
		case "ln":
			return (float) Math.log(number1);
		case "x!":
			int fact=1;
			for(int i=1;i<=number1;i++)
				fact=fact*i;
			return fact;
		default:
			break;
		}
		return 0;
	}
}
