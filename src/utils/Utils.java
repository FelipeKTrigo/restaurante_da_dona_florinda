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

    public static void novoPedido(List<Itens> itens, List<Mesa> mesa, Scanner sc) {
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

                /* Pratos */

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
                                qtd, 24.9));
                    }

                    break;
                case 2:
                    System.out.println("quantas costelas você deseja ?");
                    System.out.println("Detalhes(costela): costela, arroz, feijão, batata frita, salada.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("costela",
                                "Detalhes(costela): costela, arroz, feijão, batata frita, salada.",
                                qtd, 65.2));
                    }

                    break;
                case 3:
                    System.out.println("quantas sanduiche de frango você deseja ?");
                    System.out.println("Detalhes(sanduiche de frango): pão, frango, maionese, batata rustica, salada.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("sanduiche de frango",
                                "Detalhes(sanduiche de frango): pão, frango, maionese, batata rustica, salada.",
                                qtd, 7.0));
                    }
                    break;

                case 4:
                    System.out.println("quantas Feijoada você deseja ?");
                    System.out.println("Detalhes(Feijoada): Arroz, Feijão, Linguica defumada, Orelha, Pé do porco, Costelinha, Couve refogada, Laranja.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Feijoada",
                                "Detalhes(Feijoada): Arroz, Feijão, Linguica defumada, Orelha, Pé do porco, Costelinha, Couve refogada, Laranja",
                                qtd, 25.5));
                    }
                    break;
                case 5:
                    System.out.println("quantas Picanha você deseja ?");
                    System.out.println("Detalhes(Picanha): Arroz, feijão, Polenta Frita, batata frita, Vinagrete,Picanha.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Picanha",
                                "Detalhes(Picanha): Arroz, feijão, Polenta Frita, batata frita, Vinagrete,Picanha.",
                                qtd, 40.5));
                    }
                    break;
                case 6:
                    System.out.println("quantas Lagosta você deseja ?");
                    System.out.println("Detalhes(Lagosta): Lagosta, Arroz, Molho Branco, Majericão, Limão, Salada");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Lagosta",
                                "Detalhes(Lagosta): pão, frango, maionese, batata rustica, salada.",
                                qtd, 70.5));
                    }
                    break;
                case 7:
                    System.out.println("quantas Spaguete você deseja ?");
                    System.out.println("Detalhes(Spaguete): macarrão, molho de tomate, almodegas (patinho).");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Spaguete",
                                "Detalhes(Spaguete): macarrão, molho de tomate, almodegas (patinho)",
                                qtd, 15.5));
                    }
                    break;
                case 8:
                    System.out.println("quantas Escondidinho você deseja ?");
                    System.out.println("Detalhes(Escondidinho): Arroz, Feijão, Escondidnho:Pure de batata, molho branco, frango desfiado, Batata Roche.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Escondidinho",
                                "Detalhes(Escondidinho): Arroz, Feijão, Escondidnho:Pure de batata, molho branco, frango desfiado, Batata Roche.",
                                qtd, 22.2));
                    }
                    break;
                case 9:
                    System.out.println("quantas Strogonoff você deseja ?");
                    System.out.println("Detalhes(Strogonoff): Arroz, Strogonoff de Frango, batara palha, salada.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Strogonoff",
                                "Detalhes(Strogonoff): Arroz, Strogonoff de Frango, batara palha, salada.",
                                qtd, 25.5));
                    }
                    break;
                case 10:
                    System.out.println("quantas Ovo Porche você deseja ?");
                    System.out.println("Detalhes(Ovo Porche): Arroz, feijão, batata rustica, Ovo, molho Branco, salada de tomate, farofa de alho.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Ovo Porche",
                                "Detalhes(Ovo Porche): Arroz, feijão, batata rustica, Ovo, molho Branco, salada de tomate, farofa de alho.",
                                qtd, 12.5));
                    }
                    break;
                case 11:
                    System.out.println("quantas Panqueca você deseja ?");
                    System.out.println("Detalhes(Panqueca): Arroz, feijão, batata rustica, Panmqueca de carne, molho de tomate, farofa de flocão.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Panqueca",
                                "Detalhes(Panqueca): Arroz, feijão, batata rustica, Panmqueca de carne, molho de tomate, farofa de flocão.",
                                qtd, 12.5));
                    }
                    break;
                case 12:
                    System.out.println("quantas Sanduiche de Presunto (vegano) você deseja ?");
                    System.out.println("Detalhes(Sanduiche de Presunto (vegano)): Pão, Presunto de soja, alface, tomate, maionese,Ketchup.");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Itens("Sanduiche de Presunto (vegano)",
                                "Detalhes(Sanduiche de Presunto (vegano)): Pão, Presunto de soja, alface, tomate, maionese,Ketchup.",
                                qtd, 7.0));
                    }
                    break;
                    /* Bebidas */
                case 13:
                    System.out.println("Detalhes(suco de maracuja): um suco feito da poupa do maracuja");
                    System.out.println("quantos sucos você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("suco de maracuja",
                                "Detalhes(suco de maracuja): um suco feito da poupa do maracuja",
                                qtd, 12.5, false));
                    }

                    break;
                case 14:
                    System.out.println("Detalhes(coca): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas cocas você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("coca",
                                "Detalhes(coca): refrigerante pronto retirado junto com o lanche",
                                qtd, 7.5, true));
                    }

                    break;
                case 15:
                    System.out.println("Detalhes(Guarana Jesus): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas Guarana Jesus você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("Guarana Jesus",
                                "Detalhes(Guarana Jesus): refrigerante pronto retirado junto com o lanche",
                                qtd, 8.0, true));
                    }

                    break;
                case 16:
                    System.out.println("Detalhes(itubaina): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas itubaina você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("itubaina",
                                "Detalhes(itubaina): refrigerante pronto retirado junto com o lanche",
                                qtd, 7.5, true));
                    }

                    break;
                case 17:
                    System.out.println("Detalhes(cafe): Cafe, sem mosca");
                    System.out.println("quantas Cafes você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("cafe",
                                "Detalhes(cafe): cafe, sem mosca",
                                qtd, 5.5, true));
                    }

                    break;
                case 18:
                    System.out.println("Detalhes(cafe com mosca): cafe, mosca");
                    System.out.println("quantas cafes com moscas você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("cafe",
                                "Detalhes(cafe com mosca): cafe, mosca",
                                qtd, 0.0, true));
                    }

                    break;
                case 19:
                    System.out.println("Detalhes(Schweppes): refrigerante pronto retirado junto com o lanche");
                    System.out.println("quantas Schweppes você deseja ?");

                    qtd = message(sc);
                    if (qtd > 0) {
                        itens.add(new Bebidas("Schweppes",
                                "Detalhes(Schweppes): refrigerante pronto retirado junto com o lanche",
                                qtd, 12.50, true));
                    }

                    break;
                case 20:
                    mesa.get(mesa.size() - 1).setItens(itens);

                    mesa.forEach(m -> {
                        if (mesa.get(mesa.size() - 1) == m) {
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
                        "\n 1.lasanha R$24.9" +
                        "\n 2.costela R$65.2" +
                        "\n 3.sanduiche de frango R$7.0" +
                        "\n4. Feijoada R$ 25.5\n" +
                        "5.Picanha R$ 40.5\n" +
                        "6.lagosta R$ 70.5\n" +
                        "7. Espaguete com almondegas R$ 15.5\n" +
                        "8.Escondidinho R$ 22.5\n" +
                        "9. Strogonoff R$ 25.5\n" +
                        "10.Ovo Poche R$ 12.5\n" +
                        "11. panqueca R$ 15.5\n" +
                        "12. sanduiche de presunto (vegano) R$ 7.5"+
                        "\n ---- Bebidas ----" +
                        "\n 13.suco de maracuja R$12,5" +
                        "\n 14.coca R$7,5" +
                        "\n 15 Guarana Jesus R$ 8.0"+
                        "\n 16 itubaina R$ 7.5"+
                        "\n 17 café (uma xicara) Sem mosca R$ 5.5"+
                        "\n 18 café com mosca R$ 0.0"+
                        "\n 19 schweppes R$ 12.5"+
                        "\n 20.finalizar pedido");
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
                "\n2.encerrar um pedido" +
                "\n3.listar pedidos" +
                "\n4.finalizar sessão"
        );
    }
}
