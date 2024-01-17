package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> cityList;

    @FXML
    private AnchorPane lbl1;

    @FXML
    private Label lblDay;

    @FXML
    private Label lblDay1;

    @FXML
    private Label lblDay10;

    @FXML
    private Label lblDay2;

    @FXML
    private Label lblDay3;

    @FXML
    private Label lblDay4;

    @FXML
    private Label lblDay5;

    @FXML
    private Label lblDay6;

    @FXML
    private Label lblDay7;

    @FXML
    private Label lblDay8;

    @FXML
    private Label lblDay9;

    @FXML
    private Label lblMorning;

    @FXML
    private Label lblMorning1;

    @FXML
    private Label lblMorning10;

    @FXML
    private Label lblMorning2;

    @FXML
    private Label lblMorning3;

    @FXML
    private Label lblMorning4;

    @FXML
    private Label lblMorning5;

    @FXML
    private Label lblMorning6;

    @FXML
    private Label lblMorning7;

    @FXML
    private Label lblMorning8;

    @FXML
    private Label lblMorning9;

    @FXML
    private Label lblNight;

    @FXML
    private Label lblNight1;

    @FXML
    private Label lblNight10;

    @FXML
    private Label lblNight2;

    @FXML
    private Label lblNight3;

    @FXML
    private Label lblNight4;

    @FXML
    private Label lblNight5;

    @FXML
    private Label lblNight6;

    @FXML
    private Label lblNight7;

    @FXML
    private Label lblNight8;

    @FXML
    private Label lblNight9;

    @FXML
    private Label lblWind1;

    @FXML
    private Label lblWind10;

    @FXML
    private Label lblWind2;

    @FXML
    private Label lblWind3;

    @FXML
    private Label lblWind4;

    @FXML
    private Label lblWind5;

    @FXML
    private Label lblWind6;

    @FXML
    private Label lblWind7;

    @FXML
    private Label lblWind8;

    @FXML
    private Label lblWind9;


    @FXML
    void Select(ActionEvent event) throws IOException {
        final String urlKazan10Day = "https://www.gismeteo.ru/weather-kazan-4364/10-days/";
        final String urlMoscow10Day = "https://www.gismeteo.ru/weather-moscow-4368/10-days/";
        final String urlSPB10Day = "https://www.gismeteo.ru/weather-sankt-peterburg-4079/10-days/";
        final String urlOrsk10Day = "https://www.gismeteo.ru/weather-orsk-5163/10-days/";
        final String urlMednogorsk10Day = "https://www.gismeteo.ru/weather-mednogorsk-11415/10-days/";
        final String urlBalashixa10Day = "https://www.gismeteo.ru/weather-balashikha-11447/10-days/";
        final String urlGagri10Day = "https://www.gismeteo.ru/weather-gagra-5246/10-days/";

        String str = cityList.getSelectionModel().getSelectedItem().toString();
        if (str.equals("Казань")) {
            weatherInfo(urlKazan10Day);
        }else if (str.equals("Москва")) {
            weatherInfo(urlMoscow10Day);
        }else if (str.equals("Питербург")) {
            weatherInfo(urlSPB10Day);
        }else if (str.equals("Орск")) {
            weatherInfo(urlOrsk10Day);
        }else if (str.equals("Меднагорск")) {
            weatherInfo(urlMednogorsk10Day);
        }else if (str.equals("Балашиха")) {
            weatherInfo(urlBalashixa10Day);
        }else if (str.equals("Гагры")) {
            weatherInfo(urlGagri10Day);
        }
    }

    @FXML
    void initialize() {
        assert cityList != null : "fx:id=\"cityList\" was not injected: check your FXML file 'info.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay != null : "fx:id=\"lblDay\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay1 != null : "fx:id=\"lblDay1\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay10 != null : "fx:id=\"lblDay10\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay2 != null : "fx:id=\"lblDay2\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay3 != null : "fx:id=\"lblDay3\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay4 != null : "fx:id=\"lblDay4\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay5 != null : "fx:id=\"lblDay5\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay6 != null : "fx:id=\"lblDay6\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay7 != null : "fx:id=\"lblDay7\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay8 != null : "fx:id=\"lblDay8\" was not injected: check your FXML file 'info.fxml'.";
        assert lblDay9 != null : "fx:id=\"lblDay9\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning != null : "fx:id=\"lblMorning\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning1 != null : "fx:id=\"lblMorning1\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning10 != null : "fx:id=\"lblMorning10\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning2 != null : "fx:id=\"lblMorning2\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning3 != null : "fx:id=\"lblMorning3\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning4 != null : "fx:id=\"lblMorning4\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning5 != null : "fx:id=\"lblMorning5\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning6 != null : "fx:id=\"lblMorning6\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning7 != null : "fx:id=\"lblMorning7\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning8 != null : "fx:id=\"lblMorning8\" was not injected: check your FXML file 'info.fxml'.";
        assert lblMorning9 != null : "fx:id=\"lblMorning9\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight != null : "fx:id=\"lblNight\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight1 != null : "fx:id=\"lblNight1\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight10 != null : "fx:id=\"lblNight10\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight2 != null : "fx:id=\"lblNight2\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight3 != null : "fx:id=\"lblNight3\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight4 != null : "fx:id=\"lblNight4\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight5 != null : "fx:id=\"lblNight5\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight6 != null : "fx:id=\"lblNight6\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight7 != null : "fx:id=\"lblNight7\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight8 != null : "fx:id=\"lblNight8\" was not injected: check your FXML file 'info.fxml'.";
        assert lblNight9 != null : "fx:id=\"lblNight9\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind1 != null : "fx:id=\"lblWind1\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind10 != null : "fx:id=\"lblWind10\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind2 != null : "fx:id=\"lblWind2\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind3 != null : "fx:id=\"lblWind3\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind4 != null : "fx:id=\"lblWind4\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind5 != null : "fx:id=\"lblWind5\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind6 != null : "fx:id=\"lblWind6\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind7 != null : "fx:id=\"lblWind7\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind8 != null : "fx:id=\"lblWind8\" was not injected: check your FXML file 'info.fxml'.";
        assert lblWind9 != null : "fx:id=\"lblWind9\" was not injected: check your FXML file 'info.fxml'.";

        ObservableList<String> cityListes = FXCollections.observableArrayList("Казань","Москва","Питербург","Орск","Меднагорск","Балашиха","Гагры");
        cityList.setItems(cityListes);
    }
    public String getLblInfoDay (String url, int days) throws IOException {
        return ("Дата : " + weatherInformatiom.getDaysTen(url,days).text());
    }
    public String getLblInfoWeatherMorningDay (String url, int days) throws IOException {
        return ("Утром : " + weatherInformatiom.getWeatherMorningDaysTen(url,days).text());
    }
    public String getLblInfoWeatherNightDay (String url, int days) throws IOException {
        return ("Вечером : " + weatherInformatiom.getWeatherNightDaysTen(url,days).text());
    }
    public String getLblInfoWindDay (String url, int days) throws IOException {
        return ("ветер " + weatherInformatiom.getImpulseDaysTen(url, days).text() + " м.с");
    }
    void weatherInfo(String url) throws IOException {
        lblDay.setText(getLblInfoDay(url, 0));
        lblMorning.setText(getLblInfoWeatherMorningDay(url, 0));
        lblNight.setText(getLblInfoWeatherNightDay(url, 0));
        Label[] listLbl = {lblDay1, lblDay2, lblDay3, lblDay4, lblDay5, lblDay6, lblDay7, lblDay8, lblDay9, lblDay10};
        int dDays = 0;
        for (Label listLb : listLbl) {
            listLb.setText(getLblInfoDay(url, dDays));
            ++dDays;
        }
        Label[] listLblMorning = {lblMorning1, lblMorning2, lblMorning3, lblMorning4, lblMorning5, lblMorning6, lblMorning7, lblMorning8, lblMorning9, lblMorning10};
        int dMorning = 0;
        for (Label listLb : listLblMorning) {
            listLb.setText(getLblInfoWeatherMorningDay(url, dMorning));
            ++dMorning;
        }
        Label[] listLblNight = {lblNight1, lblNight2, lblNight3, lblNight4, lblNight5, lblNight6, lblNight7, lblNight8, lblNight9, lblNight10};
        int dNight = 0;
        for (Label listLb : listLblNight) {
            listLb.setText(getLblInfoWeatherNightDay(url, dNight));
            ++dNight;
        }
        Label[] listLblWind = {lblWind1, lblWind2, lblWind3, lblWind4, lblWind5, lblWind6, lblWind7, lblWind8, lblWind9, lblWind10};
        int dWind = 0;
        for (Label listLb : listLblWind) {
            listLb.setText(getLblInfoWindDay(url, dWind));
            ++dWind;
        }
    }
}
