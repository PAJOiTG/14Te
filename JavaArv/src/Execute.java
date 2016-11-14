public class Execute {

  public static void main(String[] args) {

    bilö bmw = new bilö(85000, 950, "grön", "SHREK", 42, 0.1);

    System.out.println("Min bil är " + bmw.color);
    System.out.println("Min bil har registreringsnummer " + bmw.regnmr);
    System.out.print("Bränslebehov efter 50km: ");
    System.out.println(bmw.bensinRequired(50) + " liter bensin");
    System.out.println();

    storbilö lastbil = 
      new storbilö(45000, 3710, "gul", "KEK123", 210, 0.4, 34);

    System.out.println("Min lastbil är " + lastbil.color);
    System.out.println("Min lastbil väger " + lastbil.vikt + " kg");
    System.out.print("Om det är 20% rabatt så kostar lastbilen ");
    System.out.println(lastbil.nyttPris(40) + " $$dollarz$$");
  }

}