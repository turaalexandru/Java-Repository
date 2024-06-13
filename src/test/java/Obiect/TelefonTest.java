package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void testmethod(){

        System.out.println("=== Telefon: Iphone 15===");
        Map<String, String> iphone15 = new HashMap<>();
        iphone15.put("Versiune sistem operare", "17");
        iphone15.put("Model procesor", "Apple A16 Bionic");
        iphone15.put("Numar nuclee", "6");
        iphone15.put("Memorie RAM", "6");
        iphone15.put("Numar camere", "2");


        List<String> iphone15accesorii = new ArrayList<>();
        iphone15accesorii.add("Telefon");
        iphone15accesorii.add("USB Type-C");
        iphone15accesorii.add("Casti");
        iphone15accesorii.add("Wall-brick");
        iphone15accesorii.add("Sticker");

        Telefon Iphone15 = new Telefon("Apple", "iPhone15", "Verde", "512", 12000, iphone15, iphone15accesorii, false,"");
        Iphone15.infoTelefon();

        System.out.println("-----------------------------");

        System.out.println("=== Telefon: Samsung Galaxy===");
        Map<String, String> galaxyA54 = new HashMap<>();
        galaxyA54.put("Versiune sistem operare", "Android 13");
        galaxyA54.put("Model procesor", "Samsung Exynos 1380");
        galaxyA54.put("Numar nuclee", "8");
        galaxyA54.put("Memorie RAM", "8");
        galaxyA54.put("Numar camere", "3");

        List<String> galaxyA53accesorii = new ArrayList<>();
        galaxyA53accesorii.add("Telefon");
        galaxyA53accesorii.add("Cablu de date");
        galaxyA53accesorii.add("Cheie SIM");
        galaxyA53accesorii.add("Wall-brick");

        Telefon GalaxyA54 = new Telefon("Samsung", "A54", "Negru", "128", 5000, galaxyA54, galaxyA53accesorii, false, "");
        GalaxyA54.infoTelefon();

        System.out.println("-----------------------------");

        System.out.println("=== Telefon: Xiaomi Redmi===");
        Map<String, String> note13pro = new HashMap<>();
        note13pro.put("Versiune sistem operare", "MIUI 14");
        note13pro.put("Model procesor", "SMediatek Dimensity 7200 Ultra");
        note13pro.put("Numar nuclee", "8");
        note13pro.put("Memorie RAM", "12");
        note13pro.put("Numar camere", "3");

        List<String> note13proaccesorii = new ArrayList<>();
        note13proaccesorii.add("Telefon");
        note13proaccesorii.add("Cablu de date");
        note13proaccesorii.add("Cheie SIM");
        note13proaccesorii.add("Wall-brick");

        Telefon XiaomiRedmi = new Telefon("Xiaomi", "Note 13 Pro", "Rosu", "258", 2000,note13pro, note13proaccesorii, true, "Produs cu urme fine de utilizare");
        XiaomiRedmi.infoTelefon();
    }
}
