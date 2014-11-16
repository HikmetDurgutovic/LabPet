
public class nasumicnecifre {
	public static void main(String args[]){
		double randombroj=10000+Math.random()*90000;
		System.out.println("Nasumicni broj je: " + (int) randombroj);
		int cifra;
		System.out.println("Cifre nasiumicnog broja: ");
		for(int brojac=0; brojac<5; brojac++)
		{
		   cifra=(int)randombroj%10;
		   randombroj=randombroj/10;
		   System.out.println(cifra);
		}
	}

}


