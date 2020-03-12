package tdalistaenlacada;

public class Lista {
    protected Node inicio, fim;
    public Lista(){
        inicio = null;
        fim = null;
    }
    
    public void AdicionarNoInicio(int elemento){
        inicio = new Node(elemento, inicio);
        if(fim == null){
            fim = inicio;
        }    
    }
    
    public void MostrarLista(){
        Node pegar = inicio;
        System.out.println();
        while(pegar != null){
            System.out.print("[" + pegar.dado + "]--->");
            pegar = pegar.proximo;
        }
    }  
}
