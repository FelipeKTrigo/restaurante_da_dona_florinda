import entities.Bebidas;
import entities.Itens;
import entities.Mesa;
import entities.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        List<Itens> itens = new ArrayList<>();
        List<Mesa> mesa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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
                    Utils.novoPedido(itens,mesa,sc);
                    break;
                case 2:
                    System.out.println("mesa: "+mesa.get(0).toString()+"pronta");
                    mesa.remove(0);
                    break;
                case 3:
                    mesa.forEach(m->{
                        System.out.println(m.toString());
                    });
                    sessao = false;
                    break;
                default:
                    System.out.println("Insira uma entrada valida");
            }


        }
    }

}