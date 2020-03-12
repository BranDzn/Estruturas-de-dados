package ordenar;
public class Ordenar {
    public static void main(String[] args) {
        String paises[] = {"Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        OrdenarBubbleSort o = new OrdenarBubbleSort();//Instanciando a classe OrdenarBubbleSort
        o.setPaises(paises);
        o.BubbleSort();
        paises = o.getPaises();
        
        for(String i : paises){
            System.out.println(i + " ");
        }
    }
    
}
