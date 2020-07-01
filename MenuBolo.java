package menubolo;
import java.util.Scanner;
/**
 *
 * @author Leandro
 */
public class MenuBolo {

   
     
    public static void main(String[] args) {
        
        char sn;
        float valorDesconto, porcento;
        
        Scanner input = new Scanner(System.in);
        Bolo bolo = new Bolo();
        Conta conta = new Conta();
        
        System.out.println("Bem vindo ao cadastro de bolos!");
        System.out.println("-------------------------------");
        System.out.print("Digite o sabor do bolo: ");
        bolo.setSabor(input.next());
        System.out.println();
        System.out.print("O bolo possui cobertura (S/N)");
        sn = input.next().charAt(0);
        
        if (sn == 'S' || sn == 's'){
             System.out.print("Digite a cobertura do bolo de " + bolo.getSabor() + ": ");
             bolo.setCobertura(input.next());
        }
        
        System.out.print("Digite o o preço do bolo: ");
        conta.setValor(input.nextFloat());
        System.out.println();
        System.out.print("Gostaria de aplicar um desconto? (S/N)");
        sn = input.next().charAt(0);
        
        if (sn == 'S'|| sn == 's'){
            System.out.print("Quantos porcento de desconto?");
            porcento = input.nextFloat();
            valorDesconto = conta.desconto(porcento, conta.getValor());
            System.out.println();
            
            if (bolo.getCobertura() == null){
            System.out.println();
            System.out.print("O bolo de " + bolo.getSabor() +" custa: " + conta.getValor()+
                    " com desconto de " + porcento + " % fica por " + valorDesconto);
            
        }
            else{
                System.out.println();
                System.out.print("O bolo de " + bolo.getSabor() + "com cobertura de " + bolo.getCobertura() +" custa: " + conta.getValor()+
                    " com desconto de " + porcento + " % fica por " + valorDesconto);
            }
        }
    }
    
}
