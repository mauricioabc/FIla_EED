package eed_fila_1;

public class EED_Fila_1 {

    public static void main(String[] args) {
        
        Fila fila = new Fila();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        novoNodo.setProximo(null);
        fila.insereFila(novoNodo);
        
        System.out.println(fila.toString());
        
        novoNodo = new Nodo();
        novoNodo.setValor(34);
        novoNodo.setProximo(null);
        fila.insereFila(novoNodo);
        
        System.out.println(fila.toString());
        
        novoNodo = new Nodo();
        novoNodo.setValor(67);
        novoNodo.setProximo(null);
        fila.insereFila(novoNodo);
        
        System.out.println(fila.toString());
        
        fila.removeFila();
        
        System.out.println(fila.toString());
        
        fila.removeFila();
        
        System.out.println(fila.toString());
        
        fila.removeFila();
        
        System.out.println(fila.toString());
        
        
    }

}
