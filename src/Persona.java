
public class Persona {
    
    //Definiendo atributos
    String nombre;
    String apellido; 

    public Persona() {
        nombre = "No definido";
        apellido = "No definido";
    }
        
    //Metodos getter and setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
