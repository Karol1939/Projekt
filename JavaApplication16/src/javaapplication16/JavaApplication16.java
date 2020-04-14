
package javaapplication16;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JavaApplication16 {
    
    public static void pogodynka(String adres,String nazwaMiasta) throws IOException
{
        Connection connect = Jsoup.connect(adres);
        Document document = connect.get();
        System.out.println(nazwaMiasta);
            //temperatura
        Elements allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.mainParams > div.temperature > div.temp");
        for(Element elem: allH1) {
            System.out.println("Temperatura: "+elem.text());
        }
            //wiater
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(2) > span.restParamValue");
        for(Element elem: allH1) {
            System.out.println("Wiatr: "+elem.text());
        }
            //ciśnienie
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(3) > span.restParamValue");
        for(Element elem: allH1) {
            System.out.println("Ciśnienie: "+elem.text());
        }
            //wilgotność
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(5) > span.restParamValue");
        for(Element elem: allH1) {
            System.out.println("Wilgotność: "+elem.text());
        }
             //zachmórzenie
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(4) > span.restParamValue");
        for(Element elem: allH1) {
           System.out.println("Zachmórzenie: "+elem.text());
        }
            //deszcz
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(1) > span.restParamValue");
        for(Element elem: allH1) {
            System.out.println("Opady deszczu: "+elem.text());
        }
            //śnieg
          allH1 = document.select("#weatherMainWidget > div.widgetContent > div.underSearchBox > div:nth-child(1) > div.mainBox.widgetLeftCol > div.mainBoxContent > div.weatherParams > ul > li:nth-child(6) > span.restParamValue");
        for(Element elem: allH1) {
            System.out.println("Opaady śniegu: "+elem.text());
        }
        System.out.print("\n\n\n");
}
    
    
    
    
    
    
    public static void main(String[] args) throws IOException {
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/krakow-306020","Kraków");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/warszawa-357732","Warszawa");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/bialystok-270085","Białystok");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/bydgoszcz-276560","Bydgoszcz");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/gdansk-287788","Gdańsk");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/kielce-300882","Kielce");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/katowice-299998","Katowice");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/lublin-311624","Lublin");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/lodz-313660","Łódź");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/olsztyn-325715","Olsztyn");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/opole-325985","Opole");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/poznan-335979","Poznań");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/rzeszow-342624","Rzeszów");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/szczecin-351892","Szczecin");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/wroclaw-362450","Wrocław");
        pogodynka("https://pogoda.onet.pl/prognoza-pogody/zielona-gora-368720","Zielona Góra");
    }
}