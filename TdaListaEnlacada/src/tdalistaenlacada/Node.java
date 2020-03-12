package tdalistaenlacada;

public class Node {
    
    public int dado;
    public Node proximo;
    public Node(int d){
        this.dado = d;
    }
    
    public Node(int d, Node n){
        dado = d;
        proximo = n;
    }
  
}
