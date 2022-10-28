public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.puertas();
        miCoche.puertas();
        miCoche.puertas();
        miCoche.puertas();
        System.out.println(miCoche.puertas);

    }
}
class Coche {
    int puertas = 4;
    public void puertas(){
        this.puertas ++;
    }
}




