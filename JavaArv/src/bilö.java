
public class bilö extends Main {

	public String regnmr;
	public int hörsepowah;
	public double förbrukning;
	
	public bilö(int p, int v, String f, String r, int h, double b) {
	super(p, v, f);
	regnmr = r;
	hörsepowah = h;
	förbrukning = b;
	}
	
	public int bensinRequired (int sträcka) {
	return (int)(förbrukning*sträcka/10.0);	
	
	}
}
