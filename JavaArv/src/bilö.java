
public class bil� extends Main {

	public String regnmr;
	public int h�rsepowah;
	public double f�rbrukning;
	
	public bil�(int p, int v, String f, String r, int h, double b) {
	super(p, v, f);
	regnmr = r;
	h�rsepowah = h;
	f�rbrukning = b;
	}
	
	public int bensinRequired (int str�cka) {
	return (int)(f�rbrukning*str�cka/10.0);	
	
	}
}
