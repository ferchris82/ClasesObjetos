
public class Main {
    public static void main(String[] args) {
        
        //Instanciar objeto
        Estudiante estudiante1 = new Estudiante();
        //aqui deja de ser clase y pase a ser objeto
        estudiante1.setNombre("Karina");
        estudiante1.getNombre();
        System.out.println(estudiante1.getNombre());
        System.out.println("-------");
        
        estudiante1.setNota1(3);
        estudiante1.setNota2(1);
        estudiante1.promedioNota();
        System.out.println(estudiante1.promedioNota());
        System.out.println("-------");
        
        PadreFamilia padreFamilia = new PadreFamilia();
        padreFamilia.incentivar(estudiante1.promedioNota());
        System.out.println(padreFamilia.incentivar(estudiante1.promedioNota()));
        
        
    }
}
