package com.example.project02.dao.servicedeo;

import com.example.project02.interfaces.Iservice.ILoan;
import com.example.project02.services.Loan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LoanDAO implements ILoan {

    @Override
    public void setLoan(Loan loan) {
        System.out.println(loan);
    }

    @Override
    public Loan getLoan(int phone) {
        var loan = new Loan("Jamac", "Muuse", "458483", 55, "Zaad", "blahblah");
        return loan;
    }

    @Override
    public ObservableList<Loan> getLoans() {
        ObservableList<Loan> loans = FXCollections.observableArrayList();


        var loan = new Loan("Jamac", "Muuse", "458483", 55, "Zaad", "blahblah");
        var loan2 = new Loan("Husein", "Kaar", "458483", 55, "eDahab", "blahblah");
        var loan3 = new Loan("Jamac", "Kahadar", "458483", 55, "Zaad", "blahblah");
        var loan4 = new Loan("Luul", "Kuur", "458483", 55, "Zaad", "blahblah");

        loans.addAll(loan, loan2, loan3, loan4);
        return loans;
    }
}
