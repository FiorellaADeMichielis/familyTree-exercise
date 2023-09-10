import persona.Persona;
import java.util.Scanner;
public class ArbolGenealogico {

    public static void main (String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre y la edad de la persona: ");
        Persona hijo = new Persona(lectura.nextLine(), lectura.nextInt());
        lectura.nextLine();
        System.out.println("Ingrese el nombre y la edad del padre: ");
        Persona padre = new Persona(lectura.nextLine(), lectura.nextInt());
        lectura.nextLine();
        System.out.println("Ingrese el nombre y la edad de la madre: ");
        Persona madre = new Persona(lectura.nextLine(), lectura.nextInt());
        lectura.nextLine();

        hijo.setPadre(padre);
        hijo.setMadre(madre);

        System.out.println("¿Desea agregar abuelos al árbol? si-no");
        String respuesta = lectura.nextLine();
        if(respuesta.equalsIgnoreCase("si")){
            System.out.println("Ingrese el nombre y estado del abuelo paterno: \n Estados: vivo | fallecido");
            Persona abueloPaterno = new Persona(lectura.nextLine(), lectura.nextLine());
            System.out.println("Ingrese el nombre y estado de la abuela paterna: ");
            Persona abuelaPaterna = new Persona(lectura.nextLine(), lectura.nextLine());
            System.out.println("Ingrese el nombre y estado del abuelo materno: ");
            Persona abueloMaterno = new Persona(lectura.nextLine(), lectura.nextLine());
            System.out.println("Ingrese el nombre y estado de la abuela materna: ");
            Persona abuelaMaterna = new Persona(lectura.nextLine(), lectura.nextLine());

            padre.setMadre(abuelaPaterna);
            padre.setPadre(abueloPaterno);
            madre.setPadre(abueloMaterno);
            madre.setMadre(abuelaMaterna);

            System.out.println("  Arbol genealógico");
            System.out.println("---------------------");
            System.out.println("Hijo/a: "+ hijo.getNombre() +" "+ hijo.getEdad() + " años.");
            System.out.println("Padre: "+ padre.getNombre() +" "+ padre.getEdad() + " años.");
            System.out.println("Madre: "+ madre.getNombre() +" "+ madre.getEdad() + " años. ");
            System.out.println("Abuelo paterno: "+ abueloPaterno.getNombre() + " - "+ abueloPaterno.getEstado());
            System.out.println("Abuela paterna: "+ abuelaPaterna.getNombre() + " - "+ abuelaPaterna.getEstado());
            System.out.println("Abuelo materno: "+ abueloMaterno.getNombre()+ " - " + abueloMaterno.getEstado());
            System.out.println("Abuela materna: "+ abuelaMaterna.getNombre()+ " - " + abuelaMaterna.getEstado());
        }else{
            System.out.println("  Arbol genealógico");
            System.out.println("---------------------");
            System.out.println("Hijo/a: "+ hijo.getNombre() +" "+ hijo.getEdad() + " años.");
            System.out.println("Padre: "+ padre.getNombre() +" "+ padre.getEdad() + " años.");
            System.out.println("Madre: "+ madre.getNombre() +" "+ madre.getEdad() + " años. ");
        }
    }
}
