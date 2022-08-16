package com.example.project02.interfaces.Iservice;

import com.example.project02.services.Loan;
import javafx.collections.ObservableList;

public interface ILoan {

    void setLoan(Loan loan);

    Loan getLoan(int phone);

    ObservableList<Loan> getLoans();

}
