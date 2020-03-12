package ordenandovetor;

import java.util.Arrays;

public class MetodoOrdenar {
    
    String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
    
    public boolean bubblesort_v04(String paises[]){
        if(paises == null){
            return false;
        }
        for(int i = 0; i<paises.length -1;i++){
            int trocas = 0;
            for(int j = 0; j < paises.length -1; j++){
                if(paises[j].compareTo(paises[j+1])> 0){
                    String tmp = paises[j];
                    paises[j] = paises[j+1];
                    paises[j+1] = tmp;
                    trocas++;
                }
            }
            if(trocas == 0){
                break;
            }
        }
        return true;
    }
}
