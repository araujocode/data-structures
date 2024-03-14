import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
        Pilha P = new Pilha(8);
        Pilha N = new Pilha(8);
        int[] numeros = new int[8];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Integer.parseInt(
              JOptionPane.showInputDialog("Informe o número"
              + "a ser inserido na posição " + i + " do Array:"));
        }
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>0){
                P.empilhar(numeros[i]);
            }
            else if(numeros[i]<0){
                N.empilhar(numeros[i]);
            }
            else{
                P.desempilhar();
                N.desempilhar();
            }
        }
        System.out.println("Valores da Pilha P");
        P.exibePilha();
        System.out.println("Valores da Pilha N");
        N.exibePilha();
    }
    
}
