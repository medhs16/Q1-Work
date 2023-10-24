
public class MathPracticeCode {
	public static void main(String[] args) {
		//All math methods are accessible through the Math Class
		//+,-,/,*,% -> no Math methods required for these
		
		//Square Root?
		System.out.println(Math.sqrt(144));
		double res = Math.sqrt(144);
		
		//Powers
		System.out.println(Math.pow(2,3));
		double res2 = Math.pow(3, 4);
		
		int x1 = 3;
		int y1 = 5;
		int x2 = 80;
		int y2 = 50;
		
		double res3 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		System.out.println(res3);
		
		
		//calculating the time it takes
		//a bowling ball to fall to the ground
		//at a height of 100 metres
		double v_i = 0;
		double d = 100;
		double a = 9.81;
		double timeBall = Math.sqrt((2*d)/a);
		System.out.println(timeBall);
		
		Math.abs(-37596);
		Math.min(-3, 5);
		Math.max(-3,5);
		
		/*
		 * *Random numbers in java
		 * Math.random returns a decimal in the range [0 1) not including 1
		 * 
		 * Generating random #s in Java ina  given range
		 * 
		 * int reanValue = (int)(Math.random) * (range +1) +min;
		 * 
		 * 
		 */
		System.out.println("random number " + Math.random());
		
		//generate a random # between 3 and 7 inclusive
		int randValue = (int)(Math.random() * (7-3+1))+3;
		System.out.println(randValue);
		
		//generate a random # between -13 and 22 inclusive
		int randomValue = (int)(Math.random() * (22+13+1))-13;
		System.out.println(randomValue);
		
		//for the formula below
		//what is the max number generated  for the following?
		//what is the min # that can be generated
		//(int)(Math.random()* 31) - 3;
		//min = -30
		//max = 27
		
		//min and max
		//(int)(Math.random() * 22)
		//min = 0; max = 21
		
		//max and min
		//(int)(Math.random() * 22) + 7
		//min = 7; max =14;
		
		
		
	}
	

}
