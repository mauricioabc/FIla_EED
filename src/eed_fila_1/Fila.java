package eed_fila_1;

public class Fila {
    private Nodo fila;
    private Nodo topo;
    private int totalElementos;
    
    public Fila(){ // criação da fila
    this.fila = null; // fila vazia   
    this.totalElementos = 0;
    } 
    
    
        public void removeFila(){
        if (this.fila == null) { // fila vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
            if (totalElementos == 1) {
                this.fila = null;
                this.topo = null;
                this.totalElementos--;
            } else {
            this.fila = this.fila.getProximo();
            this.totalElementos--;
            }
        }
    }
        
        public void insereFila(Nodo novoNodo) {
        if (this.fila == null) { 
            this.fila = novoNodo;
        } else { 
            novoNodo.setAnterior( this.topo );
            this.topo.setProximo( novoNodo ); 
        }
        
        this.topo = novoNodo;
        this.totalElementos++;
      
    }

    @Override
    public String toString() {
        return "Fila{" + "fila=" + fila + ", totalElementos=" + totalElementos + '}';
    }    
        
//    @Override
//    public String toString() {
//        return "Fila{" + "fila=" + fila + ", head=" + fila + ", tail=" + topo + ", totalElementos=" + totalElementos + '}';
//    }
        
        
    
}
