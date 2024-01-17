//package org.example;
//
//import java.util.Scanner;
//
//public class test {
//    Scanner sc = new Scanner(System.in);
//        while (!isStatus) {
//        String request = null;
//        System.out.println("Узнать погоду, доступные Казань|Москва|Питербург");
//        System.out.println("Для остановки команда стоп");
//        request = sc.nextLine();
//        if (request.equalsIgnoreCase("казань")) {
//            System.out.println("Дата: " + getInfoDay(urlKazan).text());
//            System.out.println("Градус днем = " + getInfoWeatherMorning(urlKazan).text());
//            System.out.println("Градус вечером = " + getInfoWeatherNight(urlKazan).text());
//            System.out.println("Напиши ДА если хочешь узнать погоду на следующии 10 дней,в пративном случаи пиши нет");
//            String requestWeatherTenDays = sc.nextLine();
//            if (requestWeatherTenDays.equalsIgnoreCase("да")) {
//                System.out.println("Пиши дни от 1 до 10");
//                int day = sc.nextInt() - 1;
//                if (0 < day && day <= 10) {
//                    System.out.println("Дата: " + getDaysTen(urlKazan10Day, day).text());
//                    System.out.println("Градус днем = " + getWeatherMorningDaysTen(urlKazan10Day, day).text());
//                    System.out.println("Градус вечером = " + getWeatherNightDaysTen(urlKazan10Day, day).text());
//                    System.out.println("Порыв ветра= " + getImpulseDaysTen(urlKazan10Day, day).text() + " м.с");
//                } else {
//                    System.out.println("Не корректный день");
//                }
//            }else {
//                System.out.println("Продолжим >>");
//            }
//        } else if (request.equalsIgnoreCase("москва")) {
//            System.out.println("Дата: " + getInfoDay(urlMoscow).text());
//            System.out.println("Градус днем = " + getInfoWeatherMorning(urlMoscow).text());
//            System.out.println("Градус вечером = " + getInfoWeatherNight(urlMoscow).text());
//            System.out.println("Напиши ДА если хочешь узнать погоду на следующии 10 дней,в пративном случаи пиши нет");
//            String requestWeatherTenDays = sc.nextLine();
//            if(requestWeatherTenDays.equalsIgnoreCase("да")) {
//                System.out.println("Пиши дни от 1 до 10");
//                int day = sc.nextInt()- 1;
//                if (0 <= day && day <= 10) {
//                    System.out.println("Дата: " + getDaysTen(urlMoscow10Day, day).text());
//                    System.out.println("Градус днем = " +  getWeatherMorningDaysTen(urlMoscow10Day, day).text());
//                    System.out.println("Градус вечером = " + getWeatherNightDaysTen(urlMoscow10Day, day).text());
//                    System.out.println("Порыв ветра = " + getImpulseDaysTen(urlKazan10Day, day).text() + " м.с");
//                } else {
//                    System.out.println("Не корректный день");
//                }
//            }else {
//                System.out.println("Продолжим >>");
//            }
//        } else if (request.equalsIgnoreCase("питербург")) {
//            System.out.println("Дата: " + getInfoDay(urlSPB).text());
//            System.out.println("Градус днем = " + getInfoWeatherMorning(urlSPB).text());
//            System.out.println("Градус вечером = " + getInfoWeatherNight(urlSPB).text());
//            System.out.println("Напиши ДА если хочешь узнать погоду на следующии 10 дней,в пративном случаи пиши нет");
//            String requestWeatherTenDays = sc.nextLine();
//            if(requestWeatherTenDays.equalsIgnoreCase("да")) {
//                System.out.println("Пиши дни от 1 до 10");
//                int day = sc.nextInt() -1;
//                if (0 < day && day <= 10) {
//                    System.out.println("Дата: " + getDaysTen(urlSPB10Day, day).text());
//                    System.out.println("Градус днем = " + getWeatherMorningDaysTen(urlSPB10Day, day).text());
//                    System.out.println("Градус вечером = " + getWeatherNightDaysTen(urlSPB10Day, day).text());
//                    System.out.println("Порыв ветра = " + getImpulseDaysTen(urlKazan10Day, day).text() + " м.с");
//                } else {
//                    System.out.println("Не корректный день");
//                }
//            }else {
//                System.out.println("Продолжим >>");
//            }
//        } else if (request.equalsIgnoreCase("стоп")) {
//            System.out.println("Программа выключена");
//            break;
//        }
//    }
//}
