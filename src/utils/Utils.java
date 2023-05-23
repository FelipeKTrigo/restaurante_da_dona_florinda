package utils;

import entities.Bebidas;
import entities.Itens;
import entities.Mesa;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public final class Utils {
    static Boolean on = true;
    static AtomicReference<Double> conta = new AtomicReference<>((double) 0);
    public static void novoPedido(List<Itens> itens, List<Mesa> mesa, Scanner sc){
        on = true;
        while (on) {
            menupedidos();
            int count;
            try {
                count = Integer.parseInt(sc.next());
            } catch (Exception e) {
                count = -1;
            }
            int qtd = 0;
            switch (count) {
                case 0:
                    System.out.println("Detalhes(burgão): Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.");
                    System.out.println("quantos burgão você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("burgão",
                                "Pão, Queijo, Hambúrguer, Ovo, Alface, Tomate e Molho da casa.",
                                qtd, 35.5));
                    }
                    break;
                case 1:
                    System.out.println("Detalhes(lasanha): lasanha, arroz, feijão, salada.");
                    System.out.println("quantas lasanhas você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("lasanha",
                                "Detalhes(lasanha): lasanha, arroz, feijão, salada.",
                                qtd, 53.9));
                    }

                    break;
                case 2:
                    System.out.println("Detalhes(costela): costela, arroz, feijão, batata frita, salada.");
                    System.out.println("quantas costelas você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("costela",
                                "Detalhes(costela): costela, arroz, feijão, batata frita, salada.",
                                qtd, 65.2));
                    }

                    break;
                case 3:
                    System.out.println("Detalhes(suco de maracuja): um suco feito da poupa do maracuja");
                    System.out.println("quantos sucos você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("suco de maracuja",
                                "Detalhes(suco de maracuja): um suco feito da poupa do maracuja",
                                qtd, 12.5, false));
                    }

                    break;
                case 4:
                    System.out.println("Detalhes(coca): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas cocas você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("coca",
                                "Detalhes(coca): refrigerante pronto retirado junto com o lanche",
                                qtd, 7.5, true));
                    }

                    break;
                case 10:
                    mesa.get(mesa.size()-1).setItens(itens);

                    mesa.forEach(m -> {
                        if(mesa.get(mesa.size()-1) == m) {
                            m.getItens().forEach(i -> {
                                m.setItens(itens);
                                if (m.getConta() == null) {
                                    m.setNota(i.getNome() + " --- R$" + i.getPreco() + " | " + i.getQuantidade() + "X");
                                } else {
                                    m.setNota(m.getNota() + "\n" + i.getNome() + " --- R$" + i.getPreco() + " | " + i.getQuantidade() + "X");
                                }
                                conta.set(conta.get() + (i.getPreco() * i.getQuantidade()));
                                m.setConta(conta.get());
                            });
                        }
                    });
                    conta.set(0.0);
                    itens.clear();
                    on = false;
                    break;

                default:
                    System.out.println("Insira uma entrada valida");
                    break;
            }
        }
    }
    private static int message(Scanner sc) {
        try {
            return Integer.parseInt(sc.next());
        } catch (Exception e) {
            System.out.println("valor informado de maneira incorreta por padrão será encerrada a operação\n");
        }
        return 0;
    }

    private static void menupedidos() {
        System.out.println(
                "\n 0.burgão R$35,5" +
                        "\n 1.lasanha R$53.9" +
                        "\n 2.costela R$65.2" +
                        "\n ---- Bebidas ----" +
                        "\n 3.suco de maracuja R$12,5" +
                        "\n 4.coca R$7,5" +
                        "\n 10.finalizar pedido");
    }
    public static Mesa perguntasmesa(List<Mesa> m, Scanner sc) {
        System.out.println("qual é o numero da mesa");
        try {
            m.add(new Mesa(Integer.parseInt(sc.next())));
        } catch (Exception e) {
            System.out.println("mesa invalida");
        }
        return m.get(m.size() - 1);
    }
    public static void menuat() {
        System.out.println("1.fazer um pedido" +
                "\n2.encerrar primeiro pedido" +
                "\n3.listar pedidos"+
                "\n4.finalizar sessão"
        );
    }
}
