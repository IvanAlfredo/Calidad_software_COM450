
public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    boolean Validar(int edad) {
        //Valida si la edad es mayor a 18 retorna verdadero
        if(edad > 18){
            return false;
        }
        return true;
    }
    
    
}
