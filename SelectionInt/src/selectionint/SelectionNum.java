package selectionint;
public class SelectionNum {
    
    public boolean selectionSort (int numeros[]) {
    if (numeros == null) return false;
    for (int i = 0; i < numeros.length - 1; i++) {
    // Determina a posição min do menor valor encontrado entre as
    // posições i+1 e vetor.length. Desta forma, estamos selecionando o menor
    // valor, para efetuar uma troca.
    int min = i;
    for (int j = i+1; j < numeros.length; j++) {
    if ( numeros[j] > numeros[min] ) min = j;
    }
    // troca os valores do vetor:
    int temp = numeros[i];
    numeros[i] = numeros[min];
    numeros[min] = temp;
    }
    return true;
    }
}

