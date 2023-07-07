
public class PadreFamilia extends Persona{
    
    int numeroHijos;

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }    
    
    public String incentivar(int promedio){
        if(promedio >= 3){
            return "Muy bien";
        }else{
            return "Debe mejorar";
        }
    }
}
