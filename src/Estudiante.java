
public class Estudiante extends Persona{
    
    int nota1;
    int nota2;
    String curso;
        

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int promedioNota(){
        int promedio;
        promedio = (nota1+nota2)/2;
        return promedio;
    }
}
