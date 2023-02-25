package Fila;

public class No {
    private Object object;
    private No refNo;

    public No() {
        
    }

    public No(Object object){
        this.object = object;
        this.refNo = null;
    }


    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "{" +
            " object='" + getObject() + "'" +
            ", refNo='" + getRefNo() + "'" +
            "}";
    }

    
}
