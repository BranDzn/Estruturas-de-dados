package selections;
public class OrdenandoSelec {
    
    
        public boolean selectionSort (String paises []) {
    if (paises == null) return false;
    for (int i = 0; i < paises.length - 1; i++) {
    // Determina a posição min do menor valor encontrado entre as
    // posições i+1 e vetor.length. Desta forma, estamos selecionando o menor
    // valor, para efetuar uma troca.
    int min = i;
    for (int j = i+1; j < paises.length; j++) {
    if ( paises[j].compareTo(paises[min]) < 0 ) min = j;
    }
    // troca os valores do vetor:
    String temp = paises[i];
    paises[i] = paises[min];
    paises[min] = temp;
    }
    return true;
    }
}
