package tdalistaenlacada;

import javax.swing.JOptionPane;

public class TdaListaEnlacada {

    public static void main(String[] args) {

        Lista listinha = new Lista();
        int opcao = 0, elemento;
        do{
            try{
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Adicionar um elemento no inicio da lista\n2. Mostrar os dados da lista\n3. Sair", "Menú de opções", 3));
            
            switch(opcao){
                case 1:
                        try{
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o elemento", "ADICIONANDO NO INICIO", 3));
                            listinha.AdicionarNoInicio(elemento);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
                        }
                    break;
                case 2:
                    listinha.MostrarLista();
                    break;
                case 3:          
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "[ERROR] Digite 3 para sair\nOBS: vc clicou em FECHAR KSKS"); // <-- e.getMessage();
            }
        }while(opcao != 3);
    }
    
}
