package ordenar;
public class OrdenarBubbleSort {
    private String[] paises;

    public String[] getPaises() {
        return paises;
    }

    public void setPaises(String[] paises) {
        this.paises = paises;
    }

    public void BubbleSort(){
        //Declarar váriavel tamanho
        int tamanho = paises.length;
        
        for(int i = 0; i < tamanho -1; i++){
            for(int j = 0; j < tamanho -1 - i; j++){
                if(paises[j].compareTo(paises [j + 1]) > 0){
                    String auxiliar = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = auxiliar;
                }
            }
        }
    }
    
}
