
package inserevetor;
import java.util.Scanner;

    
public class InsereVetor {
    static Scanner ler = new Scanner(System.in);
    
    public static void  insere (){
        int indice , aux ,aux1, contador;
        System.out.print("Digite o tamanho do vetor : ");
        indice=ler.nextInt();
        int vet[] = new int [indice];
        
        System.out.println("digite o que sera armazenado no vetor :");
        for (int i = 0; i < indice; i++) {
            vet[i]=ler.nextInt();
        }
        
        System.out.println("Seu vetor é :");
        
        for (int i = 0; i < indice; i++) {
            System.out.print(vet[i]+" ");
        }
        System.out.println("Deseja alterar algum indice?");
        System.out.println("1-Sim");
        System.out.println("2-Não");
        contador=ler.nextInt();
        while(contador==1){
        
            System.out.print("digite o indice que deseja ser alterado de 0 a "+(indice-1)+" :");
            aux=ler.nextInt();
            if(aux>=(aux+1)){
                System.out.println("indice não existe ");
            }else{
            
            System.out.print("Digite o valor a ser adicionado nesse indice : ");
            aux1=ler.nextInt();
            vet[aux]=aux1;
            
            System.out.println("seu vetor : ");
            for (int i = 0; i < indice; i++) {
                System.out.print(vet[i]+" ");               
            } 
            System.out.println("Deseja alterar mais algum indice?");
                 System.out.println("1-Sim");
                System.out.println("2-Não");
                 contador=ler.nextInt();
            }
            
        }
        System.out.print("Seu vetor ficou : ");
             for (int i = 0; i < indice; i++) {
                 System.out.print(vet[i]+" ");
         }
        }
    public static void main(String[] args) {
         insere();
            
        }
}
        
        
        
        
    
    

