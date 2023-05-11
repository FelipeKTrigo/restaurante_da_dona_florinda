import entities.Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Itens> itens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Boolean on = true;


        while (on){
            menu();
            int count;
            try {
                count  = Integer.parseInt(sc.next());
            }catch (Exception e){
                count = -1;
            }
            switch (count){
                case 0:
                    System.out.println("Detalhes(burgão): Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.");
                    System.out.println("quantos burgão você deseja ?");
                    int qtd;
                    try{
                         qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Itens("burgão", "Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.", qtd, 35.5));
                    }
                break;
                case 1:
                    System.out.println("almoço adicionado");
                break;
                case 10:
                    System.out.println("finalizando pedido ...");
                    on = false;
                break;

                default:
                    System.out.println("Insira uma entrada valida");
                break;
            }
        }
        itens.forEach(System.out::println);
    }
    public static void menu(){
        System.out.println("------ Ola seja bem vindo ------"+
                "\n------ Suas opções estão listadas abaixo ------"+
                "\n 0.burgão"+
                "\n 1.lasanha"+
                "\n 2.costela"+
                "\n ---- Bebidas ----"+
                "\n 3.suco de maracuja"+
                "\n 4.coca"+
                "\n 10.finalizar pedido");
    }
    public static double prices(int menuId){
        double res;
        switch (menuId){
            case 1 :
                res = 63.9;
            break;
            case 2:
                res = 45.2;
            break;
            case 3:
                res = 12.5;
            break;
            case 4:
                res = 6.5;
            break;
            default:
                res = 0;
            break;
        }
        return res;
    }
}