package com.example.project02.interfaces.Iservice;

import com.example.project02.services.DailyReports;
import javafx.collections.ObservableList;

public interface IDailyReport {
    ObservableList<DailyReports> getDailyReports();
}
