import Fila.Fila;
import Fila.No;

public class App {
    public static void main(String[] args) throws Exception {
        Fila minhaFila = new Fila();
        
        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("Segundo"));
        minhaFila.enqueue(new No("quarto"));
        minhaFila.enqueue(new No("terceiro"));
        System.out.println(minhaFila);



    }


}
