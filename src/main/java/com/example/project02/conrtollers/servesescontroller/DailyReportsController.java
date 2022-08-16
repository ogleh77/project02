package com.example.project02.conrtollers.servesescontroller;

import com.example.project02.dao.servicedeo.DailyReportDAO;
import com.example.project02.model.Model;
import com.example.project02.services.DailyReports;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DailyReportsController implements Initializable {

    @FXML
    private TableColumn<DailyReports, Integer> reportId;

    @FXML
    private TableColumn<DailyReports, Integer> regstraion;

    @FXML
    private TableColumn<DailyReports, Integer> shortRegist;

    @FXML
    private TableColumn<DailyReports, Integer> male;

    @FXML
    private TableColumn<DailyReports, Integer> female;

    @FXML
    private TableColumn<DailyReports, Integer> vipBox;

    @FXML
    private TableColumn<DailyReports, String> date;

    @FXML
    private BarChart<?, ?> barChart;

    private DailyReportDAO dailyReportDAO;

    public DailyReportsController() {
        this.dailyReportDAO = new DailyReportDAO();
    }


    @FXML
    private TableView<DailyReports> tableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        reportId.setCellValueFactory(new PropertyValueFactory<DailyReports, Integer>("reportId"));
        regstraion.setCellValueFactory(new PropertyValueFactory<DailyReports, Integer>("regstraion"));
        shortRegist.setCellValueFactory(new PropertyValueFactory<DailyReports, Integer>("shortRegist"));
        male.setCellValueFactory(new PropertyValueFactory<DailyReports, Integer>("male"));
        female.setCellValueFactory(new PropertyValueFactory<DailyReports, Integer>("female"));
        date.setCellValueFactory(new PropertyValueFactory<DailyReports, String>("date"));

        tableView.setItems(dailyReportDAO.getDailyReports());

        for (DailyReports dailyReports : dailyReportDAO.getDailyReports()) {
            XYChart.Series series = new XYChart.Series();
            if (dailyReports.getDate().equals("today")) {
                series.setName("Today");
            } else {
                series.setName("Erlier");
            }
            series.getData().add(new XYChart.Data("Registrations", dailyReports.getRegstraion()));
            barChart.getData().addAll(series);
        }


    }


}
