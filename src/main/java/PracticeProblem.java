public class PracticeProblem {

	public static void main(String args[]) {

	}



	public static int sumOfDigits(int x){

		if (x == 0){
			return 0;
		}

		if (x < 0){
			x *= -1;
		}

		return (x % 10) + sumOfDigits(x /= 10);
	}



	public static int factorial(int num){
		if (num == 0){
			return 1;
		}

		if (num < 0){
			return 0;
		}

		return factorial(num - 1) * num;


	}

	

}
