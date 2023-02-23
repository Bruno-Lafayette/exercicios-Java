import java.util.function.Function;

import digitalinnovation.No;
import digitalinnovation.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha minhaPilha = new Pilha();
        
        minhaPilha.push(new No(23));
        minhaPilha.push(new No(33));
        minhaPilha.push(new No(53));
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(44));

        minhaPilha.push(new No(26));
        minhaPilha.push(new No(0));

        System.out.println(minhaPilha);

    }


}
