import entities.Itens;
import entities.Mesa;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        List<Itens> itens = new ArrayList<>();
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
                    if (!mesa.isEmpty()) {

                        System.out.println("qual é o numero da mesa");
                        try {
                            num = Integer.parseInt(sc.next());
                        }catch (Exception e){
                            System.out.println("valor invalido");
                        }
                        Integer finalNum = num;
                        mesa.forEach(m -> {
                            if (m.getNumero() == finalNum) {
                                System.out.println("PEDIDO  :\n" + m + "\n PRONTO");
                                remove.add(m);
                            }
                        });
                        mesa.removeAll(remove);
                        remove.clear();
                    } else {
                        System.out.println("todos pedidos prontos");
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