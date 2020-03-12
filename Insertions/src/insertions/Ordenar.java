package insertions;
public class Ordenar {
    
        public boolean insertionSort (String paises[]) {
    if (paises == null) return false;
    int i, j; String x;
    for ( i=1; i < paises.length; i++ ) {
    x = paises[i]; j = i;
    while ( j > 0 && x.compareTo(paises[j-1]) < 0) {//< 0, Faz com que seja em ordem crescente a-z
    paises[j] = paises[j-1]; // move para direita => abre espaço
    j--; // para apontar ao item anterior
    }
    paises[j] = x; // coloca x na posição j
    }
    return true;
    }

    
    }
