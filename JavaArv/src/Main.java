public abstract class Main {

		public int vikt;
		public int pris;
		public String color;
		
		public Main(int v, int p, String f) {
		vikt = v;
		pris = p;
		color = f;		
		}
		public int nyttPris(int kek) {
			return (int)(pris*(1.0-kek/100.0));
		  }

}
