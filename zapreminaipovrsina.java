
public class zapreminaipovrsina {
	public static void main(String args[]){
		double prvibroj=Math.random()*51;
		double drugibroj=Math.random()*51;
		System.out.println("Prvi nasumicni broj je: " + (int) prvibroj);
		System.out.println("Drugi nasumicni broj je: " + (int) drugibroj);
		double zapreminapiramide=((int)prvibroj*(int)prvibroj*(int)drugibroj)/3;
		double stranicapiramide=(prvibroj*Math.sqrt((int)prvibroj*(int)prvibroj-((int)prvibroj*(int)prvibroj))/4)/2;
		double povrsinapiramide=(int)prvibroj*(int)prvibroj+4*stranicapiramide;
		System.out.println("Zapremina piramide je: " + zapreminapiramide + 
				   ", a povrsina stranica i baze piramide je: " + povrsinapiramide);
		double zapreminasfere = (4*(int)prvibroj*(int)drugibroj*(int)prvibroj*Math.PI)/4;
		double povrsinasfere = 4*(int)prvibroj*(int)prvibroj*Math.PI;
		System.out.println("Zapremina sfere je: " + zapreminasfere + ", a povrsina sfere je: " + povrsinasfere);
		
    }

}