package eed_fila_1;

public class Nodo {
    private int valor;
    private Nodo proximo;
    private Nodo anterior;
    
    public Nodo(){
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + '}';
    }
    
//    @Override
//    public String toString() {
//        return "Nodo{" + "valor=" + valor + ", proximo=" + proximo + '}';
//    }
    

}
