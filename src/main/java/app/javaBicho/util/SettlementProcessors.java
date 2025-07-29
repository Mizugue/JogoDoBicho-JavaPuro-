package app.javaBicho.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SettlementProcessors {

    public static void processMilharSeca(String bet, List<String> numbers) {
        if (Objects.equals(bet, numbers.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da milhar seca -> " + numbers.get(0));
        }
    }

    public static void processMilharCercada(String bet, List<String> numbers) {
        if (numbers.contains(bet)) {
            System.out.println("Parabens! Voce conseguiu o jogo da milhar cercada -> " + bet);
        }
    }

    public static void processMilharInvertidaSeca(String bet, List<String> numbers) {
        if (NumberPermutationGenerator.generatePermutation(bet).contains(numbers.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da milhar invertida seca -> " + numbers.get(0));
        }

    }

    public static void processMilharInvertidaCercada(String bet, List<String> numbers) {
        List<String> bets = NumberPermutationGenerator.generatePermutation(bet);
        for (String milhar : bets) {
            if (numbers.contains(milhar)) {
                System.out.println("Parabens! Voce conseguiu o jogo da milhar invertida cercada -> " + milhar);
            }


        }
    }

    public static void processCentenaSeca(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(1)).collect(Collectors.toList());
        if (Objects.equals(bet, result.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da centena seca -> " + result.get(0));
        }
    }

    public static void processCentenaCercada(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(1)).collect(Collectors.toList());
        if (result.contains(bet)) {
            System.out.println("Parabens! Voce conseguiu o jogo da centena cercada -> " + bet);
        }
    }

    public static void processCentenaInvertidaSeca(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(1)).collect(Collectors.toList());
        List<String> centsInv = NumberPermutationGenerator.generatePermutation(bet);
        if (centsInv.contains(result.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da centena invertida seca -> " + result.get(0));
        }
    }

    public static void processCentenaInvertidaCercada(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(1)).collect(Collectors.toList());
        List<String> centsInv = NumberPermutationGenerator.generatePermutation(bet);
        for (String centInv : centsInv) {
            if (result.contains(centInv)) {
                System.out.println("Parabens! Voce conseguiu o jogo da centena invertida cercada -> " + centInv);
            }
        }
    }

    public static void processDezenaSeca(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (Objects.equals(bet, result.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da dezena seca -> " + result.get(0));
        }
    }

    public static void processDezenaCercada(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (result.contains(bet)) {
            System.out.println("Parabens! Voce conseguiu o jogo da dezena cercada -> " + bet);
        }
    }

    public static void processDezenaInvertidaSeca(String bet, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (NumberPermutationGenerator.generatePermutation(bet).contains(result.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo da dezena invertida seca -> " + result.get(0));
        }
    }

    public static void processDezenaInvertidaCercada(String bet, List<String> numbers) {
        List<String> bets = NumberPermutationGenerator.generatePermutation(bet);
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        for (String dezena : bets) {
            if (result.contains(dezena)) {
                System.out.println("Parabens! Voce conseguiu o jogo da dezena invertida cercada -> " + dezena);
            }
        }
    }

    public static void processDuqueDeDezena(List<String> dezenas, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (result.contains(dezenas.get(0)) && (result.contains(dezenas.get(1)))) {
            System.out.println("Parabens! Voce conseguiu o jogo de duque de dezena -> " + dezenas.get(0) + " " + dezenas.get(1));
        }
    }

    public static void processTernoDeDezena(List<String> dezenas, List<String> numbers) {
        System.out.println(dezenas);
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (result.contains(dezenas.get(0)) && (result.contains(dezenas.get(1))) && (result.contains(dezenas.get(2)))) {
            System.out.println("Parabens! Voce conseguiu o terno de dezena -> " + dezenas.get(0) + " " + dezenas.get(1) + " " + dezenas.get(2));
        }
    }

    public static void processGrupoSeco(String grupo, List<String> numbers) {
        List<String> result = numbers.stream().map(x -> x.substring(2)).collect(Collectors.toList());
        if (Objects.equals(grupo, numbers.get(0))) {
            System.out.println("Parabens! Voce conseguiu o jogo do grupo seco ->" + " " + grupo);
        }
    }

    public static void processGrupoCercado(String grupo, List<String> numbers) {
        if (numbers.contains(grupo)) {
            System.out.println("Parabens! Voce conseguiu o grupo cercado ->" + " " + grupo);
        }
    }

    public static void processDuplaGrupoSeco(List<String> grupos, List<String> numbers) {
        List<String> init2 = new ArrayList<>();
        init2.add(String.valueOf(Arrays.asList(numbers.get(0), numbers.get(1))));
        if (init2.contains(grupos.get(0)) && init2.contains(grupos.get(1))) {
            System.out.println("Parabens! Voce conseguiu o jogo da dupla de grupo seco ->" + " " + grupos);
        }
    }

    public static void processDuplaGrupoCercado(List<String> grupos, List<String> numbers) {
        if (numbers.contains(grupos.get(0)) && numbers.contains(grupos.get(1))) {
            System.out.println("Parabens! Voce conseguiu o jogo da dupla de grupo cercado ->" + " " + grupos);
        }
    }

    public static void processTernoGrupoSeco(List<String> grupos, List<String> numbers) {
        List<String> init3 = new ArrayList<>();
        init3.add(String.valueOf(Arrays.asList(numbers.get(0), numbers.get(1), numbers.get(2))));
        if (init3.contains(grupos.get(0)) && init3.contains(grupos.get(1)) && init3.contains(grupos.get(2))) {
            System.out.println("Parabens! Voce conseguiu o jogo do terno de grupo seco ->" + " " + grupos);
        }
    }

    public static void processTernoGrupoCercado(List<String> grupos, List<String> numbers) {
        if (numbers.contains(grupos.get(0)) && numbers.contains(grupos.get(1)) && numbers.contains(grupos.get(2))) {
            System.out.println("Parabens! Voce conseguiu o jogo do terno de grupo cercado ->" + " " + grupos);
        }
    }

    public static void processPasseSeco(List<String> grupos, List<String> numbers) {
        String firstGroup = grupos.get(0);
        String secondGroup = grupos.get(1);
        if (Objects.equals(grupos.get(0), numbers.get(0)) && Objects.equals(grupos.get(1), numbers.get(1))) {
            System.out.println("Parabens! Voce conseguiu o jogo do passe seco ->" + " " + TableAnimal.getAnimalByGroup(firstGroup) + " " + TableAnimal.getAnimalByGroup(secondGroup));
        }
    }


    public static void processPasseCercado(List<String> grupos, List<String> numbers) {
        String firstGroup = grupos.get(0);
        String secondGroup = grupos.get(1);
        List<Boolean> checkerOne = new ArrayList<>();
        List<Boolean> checkerTwo = new ArrayList<>();

        for (String number : numbers) {
            checkerOne.add(Objects.equals(firstGroup, number));
        }

        for (String number : numbers) {
            checkerTwo.add(Objects.equals(secondGroup, number));
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (checkerOne.get(i)) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (checkerTwo.get(j)) {
                        System.out.println("Parabens! Voce conseguiu o jogo do passe seco ->" + " "
                                + TableAnimal.getAnimalByGroup(firstGroup) + " " + TableAnimal.getAnimalByGroup(secondGroup));
                    }
                    return;
                }
            }

        }
    }


    public static void processPasseInvertidoSeco(List<String> grupos, List<String> numbers) {
        String firstGroup = grupos.get(0);
        String secondGroup = grupos.get(1);
        List<String> init2 = new ArrayList<>();
        init2.add(String.valueOf(Arrays.asList(numbers.get(0), numbers.get(1))));
        if (init2.contains(grupos.get(0)) && init2.contains(grupos.get(1))) {
            System.out.println("Parabens! Voce conseguiu o jogo do Passe invertido seco  ->" + " " + TableAnimal.getAnimalByGroup(firstGroup) + " " + TableAnimal.getAnimalByGroup(secondGroup));
        }
    }

    public static void processPasseInvertidoCercado(List<String> grupos, List<String> numbers) {
        String firstGroup = grupos.get(0);
        String secondGroup = grupos.get(1);
        if (numbers.contains(grupos.get(0)) && numbers.contains(grupos.get(1))) {
            System.out.println("Parabens! Voce conseguiu o jogo da dupla de grupo cercado ->" + " " + TableAnimal.getAnimalByGroup(firstGroup) + " " + TableAnimal.getAnimalByGroup(secondGroup));
        }
    }

// Voltar aqui para lembrar de tirar essa duvida: Qual a diferenca entre dupla de grupo seco e passe invertido seco, ou dupla de grupo cercado e passe invertido cercado. (Pois os dois na teoria nao dependem da ordem)





}
