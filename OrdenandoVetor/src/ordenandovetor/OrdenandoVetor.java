package ordenandovetor;

public class OrdenandoVetor {

    public static void main(String[] args) {
        
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        MetodoOrdenar m = new MetodoOrdenar();
        m.bubblesort_v04(paises);
        
        for(String i : paises){
            System.out.println(i + " ");
        }
        
    }
    
}
