package entidades;

public class Evaluacion {

    private int nota;
    private int porcentaje;

    public String toString() {
        return "Nota : "+ nota + " Porcentaje :"+  porcentaje;
    }

    public Evaluacion(int nota, int porcentaje){
        this.nota= nota;
        this.porcentaje= porcentaje;
    }

    public double getNotaFinal (){
        return ((double)this.nota * (double)this.porcentaje)/100.0;
    }

}
