package bubblesort;
public class BubbleSort {
    
    String paises[] = {"Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
    public boolean bubbleSort_v05(double vetor[]){
        if(paises == null)return false;
        for(int i = 0; i < paises.length -1; i++){
            int trocas = 0;
            for(int j = 0; j < paises.length -1 -i; j++){
                if(paises[j].compareTo(paises[j + 1]) > 0){
                    String tmp = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = tmp;
                    trocas++;
                }
            }
            if(trocas == 0)break;
        }
        return true;
    }
}

