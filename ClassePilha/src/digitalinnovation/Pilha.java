package digitalinnovation;



public class Pilha {
    private No refNoEntradaPilha;
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        // if(refNoEntradaPilha == null){
        //     return true
        // }
        // return false

        return refNoEntradaPilha == null ? true : false;

    }

    public No pop(){
        if(!isEmpty()){
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;

        }
        return null;
    }


    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }


    @Override
    public String toString() {
        
        String stringRetorno = "-------------------------\n";
        stringRetorno += "         Pilha\n";
        stringRetorno += "-------------------------\n";
        No noAuxiliar = refNoEntradaPilha;
        
        while(true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {break;}
        }
        stringRetorno += "-------------------------\n";
        return stringRetorno;
        
    }


}
