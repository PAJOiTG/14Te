public class Execute {

  public static void main(String[] args) {

    bil� bmw = new bil�(85000, 950, "gr�n", "SHREK", 42, 0.1);

    System.out.println("Min bil �r " + bmw.color);
    System.out.println("Min bil har registreringsnummer " + bmw.regnmr);
    System.out.print("Br�nslebehov efter 50km: ");
    System.out.println(bmw.bensinRequired(50) + " liter bensin");
    System.out.println();

    storbil� lastbil = 
      new storbil�(45000, 3710, "gul", "KEK123", 210, 0.4, 34);

    System.out.println("Min lastbil �r " + lastbil.color);
    System.out.println("Min lastbil v�ger " + lastbil.vikt + " kg");
    System.out.print("Om det �r 20% rabatt s� kostar lastbilen ");
    System.out.println(lastbil.nyttPris(40) + " $$dollarz$$");
  }

}