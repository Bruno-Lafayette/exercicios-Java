package Pilha;

public class No {
 
    private int dado;
    private No refNo = null;

    @Override
    public String toString() {
        return "{" +
            " dado='" + getDado() + "'" +
            "}";
    }

    public No(){

    }
  
    public No(int dado){
        this.dado = dado;
    }

    public int getDado() {
        return this.dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
    
}
