package app.javaBicho.handlers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class HandlerScrapperResult {

    protected static Map<String, String> getScrap() {

        String url = "https://www.resultadofacil.com.br/resultado-banca-federal";
        try {
            Document doc = Jsoup.connect(url).get();

            Element h3 = doc.selectFirst("h3.h4");
            if (h3 != null) {
                String data = h3.text();
                data = data.substring(0, 20) + " :" + data.substring(20);
                System.out.println("                                                " + data + "                   ");
                System.out.println();
            }


            Elements tds = doc.select("td");
            List<String> lista = new ArrayList<>();
            Map<String, String> result = new HashMap<>();

            for (int i = 0; i < Math.min(20, tds.size()); i++) {
                lista.add(tds.get(i).text());
            }


            int i = 0;
            while (i < lista.size()) {
                String chave = lista.get(i);
                if (i + 3 < lista.size()) {
                    List<String> valores = lista.subList(i + 1, i + 4);
                    result.put(chave, String.valueOf(new ArrayList<>(valores)));
                    i += 4;
                } else {
                    break;
                }
            }

            System.out.println(result);
            return result;


        } catch (IOException e) {
            System.out.println("Estamos atualizando o resultado! Tenha paciência... " + LocalDateTime.now());
            System.exit(0);
            return null;
        }
    }
}









