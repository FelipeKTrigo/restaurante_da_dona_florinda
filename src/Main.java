import entities.Comidas;
import entities.Mesa;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        List<Comidas> itens = new ArrayList<>();
        List<Mesa> mesa = new ArrayList<>();
        List<Mesa> remove = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        Boolean sessao = true;
        while (sessao) {
            Utils.menuat();
            int atendente;
            try {
                atendente = Integer.parseInt(sc.next());
            } catch (Exception e) {
                atendente = -1;
            }
            switch (atendente) {
                case 1:
                    Utils.perguntasmesa(mesa, sc);
                    Utils.novoPedido(itens, mesa, sc);
                    break;
                case 2:
                    System.out.println("Mesas para finalizar:");
                    mesa.forEach(m->{
                        System.out.print(m.getNumero()+", ");
                    });
                    if (!mesa.isEmpty()) {
                        System.out.println("\nqual é o numero da mesa");
                        try {
                            num = Integer.parseInt(sc.next());
                        }catch (Exception e){
                            System.out.println("valor invalido");
                        }
                        Integer finalNum = num;
                        mesa.forEach(m -> {
                            if (m.getNumero() == finalNum) {
                                try {
                                    Utils.pagamento(sc);
                                }catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                                System.out.println("PEDIDO  :\n" + m + "\n PRONTO");
                                remove.add(m);
                            }
                        });
                        if(remove.isEmpty()){
                            System.out.println("mesa ou pedido não encontrado");
                        }
                        mesa.removeAll(remove);
                        remove.clear();
                    } else {
                        System.out.println("todos pedidos prontos\n");
                    }
                    break;
                case 3:
                    if (!mesa.isEmpty()) {
                        mesa.forEach(m -> {
                            System.out.println(m.toString());
                        });

                    } else {
                        System.out.println("todos pedidos prontos");
                    }
                    break;
                case 4:
                    System.out.println("finalizando sessão");
                    sessao = false;
                    break;
                default:
                    System.out.println("Insira uma entrada valida");
            }


        }
    }

}