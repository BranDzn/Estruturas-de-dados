package selections;
public class Selections {
    public static void main(String[] args) {
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        OrdenandoSelec p = new OrdenandoSelec();
        
        p.selectionSort(paises);
        
        for(String i : paises){
            System.out.println(i + "");
        }
    }
    
}
