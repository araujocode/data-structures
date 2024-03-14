import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
           Pilha p = new Pilha(8);
           Pilha pCopy = new Pilha(8);
           String placa, buscaPlaca;
           boolean achou=false;
           do{
                placa = JOptionPane.showInputDialog(
                "Informe a placa do carro estacionado:");
                if(placa.equals("sair")){
                   break;
                }
                else{
                    p.empilhar(placa);
                    pCopy.empilhar(placa);
                }
           }while(!p.cheia());
           
           buscaPlaca=JOptionPane.showInputDialog(
           "Informe a placa do veículo a ser retirado:");
           
           do{
               placa = pCopy.desempilhar().toString();
               if(placa.equals(buscaPlaca)){
                   achou = true;
               }
           }while(!pCopy.vazia());
           
           if(achou){
               while(!p.vazia()){
                    placa = p.desempilhar().toString();
                    if(!placa.equals(buscaPlaca)){
                    JOptionPane.showMessageDialog(null,
                            "O carro com placa " + placa + 
                                    " deverá ser retirado!");
                    }
                    else{
                        break;
                    }
               } 
           }
           else{
               JOptionPane.showMessageDialog(null,
                       "O carro buscado "
                       + "não está estacionado na rua!");
           }
           
    }
    
}
