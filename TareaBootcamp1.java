public class TareaBootcamp1 {
    public static void main (String[] args) {
        //Ejercicio 1
      int a=1;
      int b=2;
      int c=3;
      var result =Suma(a,b,c);
        System.out.println(result);
        //Ejercicio 2
      var MiCoche = new Coche();
        MiCoche.AñadirPuertas();
        System.out.println(MiCoche.Puertas);
    }
    public static int Suma (int a, int b, int c) {
        return a+b+c;
    }
}
 class Coche {
   public int Puertas =4;
    public int AñadirPuertas(){
        return this.Puertas++;
    }
}
