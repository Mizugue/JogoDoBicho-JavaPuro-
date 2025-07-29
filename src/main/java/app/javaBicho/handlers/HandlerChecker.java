package app.javaBicho.handlers;



import java.util.*;


import static app.javaBicho.util.SettlementProcessors.*;

public class HandlerChecker {


    public static void start() {

        List<String> numbers = new ArrayList<>();
        List<String> groups = new ArrayList<>();
        List<String> animals = new ArrayList<>();
        Map<String, String> result = HandlerScrapperResult.getScrap();

        for (Map.Entry<String, String> entry : result.entrySet()) {
            String data = entry.getValue().replace("[", "").replace("]", "").trim();

            String[] parts = data.split(",");

            numbers.add((parts[0].trim()));
            groups.add(parts[1].trim());
            animals.add(parts[2].trim());
        }

        Collections.reverse(numbers);
        Collections.reverse(groups);
        Collections.reverse(animals);

        List<List<?>> log = HandlerInputData.setData();





        for (int i = 0; i < log.size(); i++){
            if (log.get(i).isEmpty()) continue;

            switch (i) {
                case 0 -> log.get(i).forEach(bet -> processMilharSeca(bet.toString(), numbers));
                case 1 -> log.get(i).forEach(bet -> processMilharCercada(bet.toString(), numbers));
                case 2 -> log.get(i).forEach(bet -> processMilharInvertidaSeca(bet.toString(), numbers));
                case 3 -> log.get(i).forEach(bet -> processMilharInvertidaCercada(bet.toString(), numbers));
                case 4 -> log.get(i).forEach(bet -> processCentenaSeca(bet.toString(), numbers));
                case 5 -> log.get(i).forEach(bet -> processCentenaCercada(bet.toString(), numbers));
                case 6 -> log.get(i).forEach(bet -> processCentenaInvertidaSeca(bet.toString(), numbers));
                case 7 -> log.get(i).forEach(bet -> processCentenaInvertidaCercada(bet.toString(), numbers));
                case 8 -> log.get(i).forEach(bet -> processDezenaSeca(bet.toString(), numbers));
                case 9 -> log.get(i).forEach(bet -> processDezenaCercada(bet.toString(), numbers));
                case 10 -> log.get(i).forEach(bet -> processDezenaInvertidaSeca(bet.toString(), numbers));
                case 11 -> log.get(i).forEach(bet -> processDezenaInvertidaCercada(bet.toString(), numbers));
                case 12 -> ((List<List<String>>) log.get(i)).forEach(dezenas -> processDuqueDeDezena(dezenas, numbers));
                case 13 -> ((List<List<String>>) log.get(i)).forEach(dezenas -> processTernoDeDezena(dezenas, numbers));
                case 14 -> log.get(i).forEach(bet -> processGrupoSeco(bet.toString(), groups));
                case 15 -> log.get(i).forEach(bet -> processGrupoCercado(bet.toString(), groups));
                case 16 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processDuplaGrupoSeco(grupos, groups));
                case 17 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processDuplaGrupoCercado(grupos, groups));
                case 18 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processTernoGrupoSeco(grupos, groups));
                case 19 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processTernoGrupoCercado(grupos, groups));
                case 20 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processPasseSeco(grupos, groups));
                case 21 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processPasseCercado(grupos, groups));
                case 22 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processPasseInvertidoSeco(grupos, groups));
                case 23 -> ((List<List<String>>) log.get(i)).forEach(grupos -> processPasseInvertidoCercado(grupos, groups));
                }
        }


        result.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(
                        Integer.parseInt(e2.getKey().replace("º", "")),
                        Integer.parseInt(e1.getKey().replace("º", ""))
                ))
                .forEach(entry -> {
                    String posicao = entry.getKey();
                    String[] partes = entry.getValue().replace("[", "").replace("]", "").split(",");
                    String milhar = partes[0].trim();
                    String grupo = partes[1].trim();
                    String animal = partes[2].trim();

                    System.out.printf("%s: %s  -  Grupo: %s - Animal: %s%n", posicao, milhar, grupo, animal);
                });


    }
}







