package app.javaBicho.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandlerInputData {

    protected static List<List<?>> setData() {

        Scanner sc = new Scanner(System.in);

        List<List<?>> allLists = new ArrayList<>();

        List<String> milharSeca = new ArrayList<>();
        List<String> milharCercada = new ArrayList<>();
        List<String> milharInvertidaSeca = new ArrayList<>();
        List<String> milharInvertidaCercada = new ArrayList<>();

        List<String> centenaSeca = new ArrayList<>();
        List<String> centenaCercada = new ArrayList<>();
        List<String> centenaInvertidaSeca = new ArrayList<>();
        List<String> centenaInvertidaCercada = new ArrayList<>();

        List<String> dezenaSeca = new ArrayList<>();
        List<String> dezenaCercada = new ArrayList<>();
        List<String> dezenaInvertidaSeca = new ArrayList<>();
        List<String> dezenaInvertidaCercada = new ArrayList<>();

        List<List<String>> duqueDeDezena = new ArrayList<>();
        List<List<String>> ternoDeDezena = new ArrayList<>();

        List<String> grupoSeco = new ArrayList<>();
        List<String> grupoCercado = new ArrayList<>();

        List<List<String>> duplaDeGrupoSeco = new ArrayList<>();
        List<List<String>> duplaDeGrupoCercado = new ArrayList<>();
        List<List<String>> ternoDeGrupoSeco = new ArrayList<>();
        List<List<String>> ternoDeGrupoCercado = new ArrayList<>();

        List<List<String>> passeSeco = new ArrayList<>();
        List<List<String>> passeCercado = new ArrayList<>();
        List<List<String>> passeInvertidoSeco = new ArrayList<>();
        List<List<String>> passeInvertidoCercado = new ArrayList<>();



        allLists.add(milharSeca);
        allLists.add(milharCercada);
        allLists.add(milharInvertidaSeca);
        allLists.add(milharInvertidaCercada);

        allLists.add(centenaSeca);
        allLists.add(centenaCercada);
        allLists.add(centenaInvertidaSeca);
        allLists.add(centenaInvertidaCercada);

        allLists.add(dezenaSeca);
        allLists.add(dezenaCercada);
        allLists.add(dezenaInvertidaSeca);
        allLists.add(dezenaInvertidaCercada);

        allLists.add(duqueDeDezena);
        allLists.add(ternoDeDezena);

        allLists.add(grupoSeco);
        allLists.add(grupoCercado);

        allLists.add(duplaDeGrupoSeco);
        allLists.add(duplaDeGrupoCercado);
        allLists.add(ternoDeGrupoSeco);
        allLists.add(ternoDeGrupoCercado);

        allLists.add(passeSeco);
        allLists.add(passeCercado);
        allLists.add(passeInvertidoSeco);
        allLists.add(passeInvertidoCercado);



        System.out.println("Quantos jogos foram feitos? ");
        int qtd = sc.nextInt();


        for (int i = 0; i < qtd; i++) {
            System.out.println("""
                    Escolha o tipo de jogo que você fez:
                    1  - MILHAR_SECA
                    2  - MILHAR_CERCADA
                    3  - MILHAR_INVERTIDA_SECA
                    4  - MILHAR_INVERTIDA_CERCADA
                    5  - CENTENA_SECA
                    6  - CENTENA_CERCADA
                    7  - CENTENA_INVERTIDA_SECA
                    8  - CENTENA_INVERTIDA_CERCADA
                    9  - DEZENA_SECA
                    10 - DEZENA_CERCADA
                    11 - DEZENA_INVERTIDA_SECA
                    12 - DEZENA_INVERTIDA_CERCADA
                    13 - DUQUE_DE_DEZENA
                    14 - TERNO_DE_DEZENA
                    15 - GRUPO_SECO
                    16 - GRUPO_CERCADO
                    17 - DUPLA_DE_GRUPO_SECO
                    18 - DUPLA_DE_GRUPO_CERCADO
                    19 - TERNO_DE_GRUPO_SECO
                    20 - TERNO_DE_GRUPO_CERCADO
                    21 - PASSE_SECO
                    22 - PASSE_CERCADO
                    23 - PASSE_INVERTIDO_SECO
                    24 - PASSE_INVERTIDO_CERCADO
                    """);

            int op = sc.nextInt();

            switch (op) {
                case 1, 2, 3, 4 -> {
                    System.out.println("Qual milhar foi jogada?");
                    String milhar = sc.next();
                    if (op == 1) {
                        milharSeca.add(milhar);
                    } else if (op == 2) {
                        milharCercada.add(milhar);
                    } else if (op == 3) {
                        milharInvertidaSeca.add(milhar);
                    } else {
                        milharInvertidaCercada.add(milhar);
                    }
                }
                case 5, 6, 7, 8 -> {
                    System.out.println("Qual centena foi jogada? ");
                    String centena = sc.next();
                    if (op == 5) {
                        centenaSeca.add(centena);
                    } else if (op == 6) {
                        centenaCercada.add(centena);
                    } else if (op == 7) {
                        centenaInvertidaSeca.add(centena);
                    } else {
                        centenaInvertidaCercada.add(centena);
                    }
                }
                case 9, 10, 11, 12 -> {
                    System.out.println("Qual dezena foi jogada? ");
                    String dezena = sc.next();
                    if (op == 9) {
                        dezenaSeca.add(dezena);
                    } else if (op == 10) {
                        dezenaCercada.add(dezena);
                    } else if (op == 11) {
                        dezenaInvertidaSeca.add(dezena);
                    } else {
                        dezenaInvertidaCercada.add(dezena);
                    }
                }
                case 13 -> {
                    System.out.println("Digite as dezenas do duque de dezena: ");
                    String d1 = sc.next();
                    String d2 = sc.next();
                    duqueDeDezena.add(List.of(d1, d2));
                }
                case 14 -> {
                    System.out.println("Digite as dezenas do terno de dezena: ");
                    String d1 = sc.next();
                    String d2 = sc.next();
                    String d3 = sc.next();
                    ternoDeDezena.add(List.of(d1, d2, d3));
                }
                case 15, 16 -> {
                    System.out.println("Qual grupo foi jogado? ");
                    String grupo = sc.next();
                    if (op == 15) {
                        grupoSeco.add(grupo);
                    } else {
                        grupoCercado.add(grupo);
                    }
                }
                case 17, 18 -> {
                    System.out.println("Digite os dois grupos da dupla de grupo: ");
                    String g1 = sc.next();
                    String g2 = sc.next();
                    if (op == 17) {
                        duplaDeGrupoSeco.add(List.of(g1, g2));
                    } else {
                        duplaDeGrupoCercado.add(List.of(g1, g2));
                    }
                }
                case 19, 20 -> {
                    System.out.println("Digite os três grupos do terno de grupo: ");
                    String g1 = sc.next();
                    String g2 = sc.next();
                    String g3 = sc.next();
                    if (op == 19) {
                        ternoDeGrupoSeco.add(List.of(g1, g2, g3));
                    } else {
                        ternoDeGrupoCercado.add(List.of(g1, g2, g3));
                    }
                }
                case 21, 22, 23, 24 -> {
                    System.out.println("Digite os dois grupos do passe: ");
                    String g1 = sc.next();
                    String g2 = sc.next();
                    if (op == 21) {
                        passeSeco.add(List.of(g1, g2));
                    } else if (op == 22) {
                        passeCercado.add(List.of(g1, g2));
                    } else if (op == 23) {
                        passeInvertidoSeco.add(List.of(g1, g2));
                    } else {
                        passeInvertidoCercado.add(List.of(g1, g2));
                    }
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    i--;
                }
            }
        }
        return allLists;
    }





}



















