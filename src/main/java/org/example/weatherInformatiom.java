package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;

public class weatherInformatiom {
    public static Document getWeather(String url) throws IOException {
        return Jsoup.parse(new URL(url), 3000);
    }
    public static Element getInfoDay(String url) throws IOException {
        Element weatherInfo = getWeather(url).select("div[class=weathertab weathertab-block tooltip]").first();
        return weatherInfo.select("div[class=date date-2]").first();
    }
    public static Element getInfoWeatherMorning(String url) throws IOException {
        Element weatherInfo = getWeather(url).select("div[class=weathertab weathertab-block tooltip]").first();
        return weatherInfo.select("span[class=unit unit_temperature_c]").get(0);
    }
    public static Element getInfoWeatherNight(String url) throws IOException {
        Element weatherInfo = getWeather(url).select("div[class=weathertab weathertab-block tooltip]").first();
        return weatherInfo.select("span[class=unit unit_temperature_c]").get(1);

    }
    public static Element getDaysTen(String url, int days) throws IOException {
        Element weatherInfo = getWeather(url).select("section[class=content wrap]").first();
        Element dayElement = weatherInfo.select("div[class=widget-row widget-row-days-date]").first();
        return dayElement.select("a").get(days);
    }
    public static Element getWeatherMorningDaysTen(String url, int days) throws IOException {
        Element weatherInfo = getWeather(url).select("section[class=content wrap]").first();
        Element dayWeatherElement= weatherInfo.select("div[class=values]").first();
        Element dayWeather = dayWeatherElement.select("div[class=value style_size_m]").get(days);
        return dayWeather.select("div[class=maxt] > span[class=unit unit_temperature_c]").first();
    }
    public static Element getWeatherNightDaysTen(String url, int days) throws IOException {
        Element weatherInfo = getWeather(url).select("section[class=content wrap]").first();
        Element dayWeatherElement= weatherInfo.select("div[class=values]").first();
        Element dayWeather = dayWeatherElement.select("div[class=value style_size_m]").get(days);
        return dayWeather.select("div[class=mint] > span[class=unit unit_temperature_c]").first();
    }
    public static Element getImpulseDaysTen(String url, int days) throws IOException {
        Element weatherInfo = getWeather(url).select("section[class=content wrap]").first();
        Element dayWeatherElement= weatherInfo.select("div[class=widget-row widget-row-wind-gust row-with-caption]").first();
        Element dayWeather = dayWeatherElement.select("div[class=row-item]").get(days);
        return dayWeather.select("span[class=wind-unit unit unit_wind_m_s]").first();
    }
}
