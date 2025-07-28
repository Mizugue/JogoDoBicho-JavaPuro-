package app.javaBicho.handlers;

import app.javaBicho.util.NumberPermutationGenerator;
import app.javaBicho.util.SettlementProcessors;

import java.util.*;
import java.util.stream.Collectors;

import static app.javaBicho.util.SettlementProcessors.*;

public class HandlerChecker {


    public static void checker() {

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

        List<List<?>> log = HandlerInputData.start();


        System.out.println(log);


        if (!log.get(0).isEmpty()) {
            log.get(0).stream().map(Object::toString).forEach(bet -> processMilharSeca(bet, numbers));
        }

        if (!log.get(1).isEmpty()) {
            log.get(1).stream().map(Object::toString).forEach(bet -> processMilharCercada(bet, numbers));
        }
        if (!log.get(2).isEmpty()) {
            log.get(2).stream().map(Object::toString).forEach(bet -> processMilharInvertidaSeca(bet, numbers));
        }

        if (!log.get(3).isEmpty()) {
            log.get(3).stream().map(Object::toString).forEach(bet -> processMilharInvertidaCercada(bet, numbers));
        }

        if (!log.get(4).isEmpty()) {
            log.get(4).stream().map(Object::toString).forEach(bet -> processCentenaSeca(bet, numbers));
        }

        if (!log.get(5).isEmpty()) {
            log.get(5).stream().map(Object::toString).forEach(bet -> processCentenaCercada(bet, numbers));
        }
        if (!log.get(6).isEmpty()) {
            log.get(6).stream().map(Object::toString).forEach(bet -> processCentenaInvertidaSeca(bet, numbers));
        }

        if (!log.get(7).isEmpty()) {
            log.get(7).stream().map(Object::toString).forEach(bet -> processCentenaInvertidaCercada(bet, numbers));
        }
        if (!log.get(8).isEmpty()) {
            log.get(8).stream().map(Object::toString).forEach(bet -> processDezenaSeca(bet, numbers));
        }

        if (!log.get(9).isEmpty()) {
            log.get(9).stream().map(Object::toString).forEach(bet -> processDezenaCercada(bet, numbers));
        }
        if (!log.get(10).isEmpty()) {
            log.get(10).stream().map(Object::toString).forEach(bet -> processDezenaInvertidaSeca(bet, numbers));
        }

        if (!log.get(11).isEmpty()) {
            log.get(11).stream().map(Object::toString).forEach(bet -> processDezenaInvertidaCercada(bet, numbers));
        }
        if (!log.get(12).isEmpty()) {
            ((List<List<String>>) log.get(12)).forEach(dezenas -> processDuqueDeDezena(dezenas, numbers));
        }

        if (!log.get(13).isEmpty()) {
            ((List<List<String>>) log.get(13)).forEach(dezenas -> processTernoDeDezena(dezenas, numbers));
        }

        if (!log.get(14).isEmpty()) {
            log.get(14).stream().map(Object::toString).forEach(bet -> processGrupoSeco(bet, groups));
        }

        if (!log.get(15).isEmpty()) {
            log.get(15).stream().map(Object::toString).forEach(bet -> processGrupoCercado(bet, groups));
        }

        if (!log.get(16).isEmpty()) {
            ((List<List<String>>) log.get(16)).forEach(grupos -> processDuplaGrupoSeco(grupos, groups));
        }

        if (!log.get(17).isEmpty()) {
            ((List<List<String>>) log.get(17)).forEach(grupos -> processDuplaGrupoCercado(grupos, groups));
        }

        if (!log.get(18).isEmpty()) {
            ((List<List<String>>) log.get(18)).forEach(grupos -> processTernoGrupoSeco(grupos, groups));
        }

        if (!log.get(19).isEmpty()) {
            ((List<List<String>>) log.get(19)).forEach(grupos -> processTernoGrupoCercado(grupos, groups));
        }

        if (!log.get(19).isEmpty()) {
            ((List<List<String>>) log.get(19)).forEach(grupos -> processTernoGrupoCercado(grupos, groups));
        }
    }
}







