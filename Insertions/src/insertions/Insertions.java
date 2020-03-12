package insertions;
public class Insertions {
    public static void main(String[] args) {
        
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        Ordenar o = new Ordenar();
        o.insertionSort(paises);
        
        for(String i : paises){
            System.out.println(i + "");
        }
        
    }
}
