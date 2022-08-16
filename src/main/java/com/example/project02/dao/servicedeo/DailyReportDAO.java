package com.example.project02.dao.servicedeo;

import com.example.project02.interfaces.Iservice.IDailyReport;
import com.example.project02.services.DailyReports;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DailyReportDAO implements IDailyReport {
    @Override
    public ObservableList<DailyReports> getDailyReports() {
        ObservableList<DailyReports> dailyReports = FXCollections.observableArrayList();

        DailyReports reports = new DailyReports(0, 1, 1, 1, 0, 0, "today");
        DailyReports reports1 = new DailyReports(0, 2, 1, 2, 0, 0, "today");
        DailyReports reports2 = new DailyReports(0, 1, 0, 1, 1, 0, "today");
        DailyReports reports3 = new DailyReports(0, 1, 1, 1, 0, 0, "today");
        DailyReports reports4 = new DailyReports(0, 2, 1, 2, 0, 0, "today");
        DailyReports reports5 = new DailyReports(0, 1, 0, 1, 1, 0, "today");

        dailyReports.addAll(reports, reports1, reports2,reports3,reports4,reports5);
        return dailyReports;

    }
}
