package entidades;

import java.util.List;

public class Asignatura {

    private static final double NOTA_MINIMA_APROB = 12.5;

    private String descripcion;
    private String codigoUnico;
    private String modalidad;
    private int credito;
    private String profesor;
    private List<EvaluacionPermanente> evaluacionesPermanentes;
    private EvaluacionParcial evaluacionParcial;
    private EvaluacionFinal evaluacionFinal;

    @Override
    public String toString() {
        return "Asignatura{" +
                "descripcion='" + descripcion + '\'' +
                ", codigoUnico='" + codigoUnico + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", credito=" + credito +
                ", profesor='" + profesor + '\'' +
                ", evaluacionesPermanentes=" + evaluacionesPermanentes +
                ", evaluacionParcial=" + evaluacionParcial.toString() +
                ", evaluacionFinal=" + evaluacionFinal.toString() +
                '}';
    }

    public boolean estaAprobada(){
        return  getNotaDefinitiva()>NOTA_MINIMA_APROB;
    }

    public double getNotaDefinitiva(){
        double sumaEp = 0;
        for ( EvaluacionPermanente evaluacionPermanente : this.evaluacionesPermanentes){
            sumaEp +=   evaluacionPermanente.getNotaFinal();
        }
        return  this.evaluacionFinal.getNotaFinal() + this.evaluacionParcial.getNotaFinal() + sumaEp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<EvaluacionPermanente> getEvaluacionesPermanentes() {
        return evaluacionesPermanentes;
    }

    public void setEvaluacionesPermanentes(List<EvaluacionPermanente> evaluacionesPermanentes) {
        this.evaluacionesPermanentes = evaluacionesPermanentes;
    }

    public EvaluacionParcial getEvaluacionParcial() {
        return evaluacionParcial;
    }

    public void setEvaluacionParcial(EvaluacionParcial evaluacionParcial) {
        this.evaluacionParcial = evaluacionParcial;
    }

    public EvaluacionFinal getEvaluacionFinal() {
        return evaluacionFinal;
    }

    public void setEvaluacionFinal(EvaluacionFinal evaluacionFinal) {
        this.evaluacionFinal = evaluacionFinal;
    }
}
