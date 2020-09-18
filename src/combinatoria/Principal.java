
package combinatoria;


public class Principal {
    public static void main(String[] args){
        Combinatoria com = new Combinatoria();
        
        int respuesta = com.combinatoria_resultado(3,0);
        
        System.out.println("La combinatoria es " + respuesta);
    }
}
