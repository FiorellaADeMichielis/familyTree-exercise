package persona;


public class Persona {
    private String nombre;
    private int edad;
    private String estado;
    private Persona padre;
    private Persona madre;
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona (String nombre, int edad, Persona padre, Persona madre){
        this(nombre, edad);
        this.padre = padre;
        this.madre = madre;
    }
    public Persona(String nombre, String estado){
        this.nombre = nombre;
        if( estado.equalsIgnoreCase("Fallecido") ||estado.equalsIgnoreCase("Fallecida")|| estado.equalsIgnoreCase("vivo") || estado.equalsIgnoreCase("viva")){
            this.estado = estado;
        }else{
            this.estado = "indefinido";
        }
    }
    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Persona getPadre() {
        return padre;
    }
    public Persona getMadre() {
        return madre;
    }
}
