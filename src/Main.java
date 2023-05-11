import entities.Bebidas;
import entities.Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {


    public static void main(String[] args) {
        List<Itens> itens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        AtomicReference<Double> conta = new AtomicReference<>((double) 0);
        Boolean on = true;


        while (on){
            menu();
            int count;
            try {
                count  = Integer.parseInt(sc.next());
            }catch (Exception e){
                count = -1;
            }
            int qtd;
            switch (count){
                case 0:
                    System.out.println("Detalhes(burgão): Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.");
                    System.out.println("quantos burgão você deseja ?");

                    try{
                         qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Itens("burgão",
                                "Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.",
                                qtd, 35.5));
                    }
                    qtd = 0;
                break;
                case 1:
                    System.out.println("Detalhes(lasanha): lasanha, arroz, feijão, salada.");
                    System.out.println("quantas lasanhas você deseja ?");

                    try{
                        qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Itens("lasanha",
                                "Detalhes(lasanha): lasanha, arroz, feijão, salada.",
                                qtd, 53.9));
                    }
                    qtd = 0;
                break;
                case 2:
                    System.out.println("Detalhes(costela): costela, arroz, feijão, batata frita, salada.");
                    System.out.println("quantas costelas você deseja ?");

                    try{
                        qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Itens("costela",
                                "Detalhes(costela): costela, arroz, feijão, batata frita, salada.",
                                qtd, 65.2));
                    }
                    qtd = 0;
                break;
                case 3:
                    System.out.println("Detalhes(suco de maracuja): um suco feito da poupa do maracuja");
                    System.out.println("quantos sucos você deseja ?");

                    try{
                        qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Bebidas("suco de maracuja",
                                "Detalhes(suco de maracuja): um suco feito da poupa do maracuja",
                                qtd, 12.5,false));
                    }
                    qtd = 0;
                break;
                case 4:
                    System.out.println("Detalhes(coca): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas cocas você deseja ?");

                    try{
                        qtd = Integer.parseInt(sc.next());
                    }catch (Exception e){
                        System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação");
                        qtd = 0;
                    }
                    if(qtd > 0) {
                        itens.add(new Bebidas("coca",
                                "Detalhes(coca): refrigerante pronto retirado junto com o lanche",
                                qtd, 12.5,true));
                    }
                    qtd = 0;
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
        itens.forEach(i ->{
             conta.set(conta.get() + (i.getPreco() * i.getQuantidade()));
        });
        System.out.println("conta tem o preço final de : R$"+conta);
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