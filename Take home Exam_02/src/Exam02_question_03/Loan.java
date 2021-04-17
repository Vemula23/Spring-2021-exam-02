/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question_03;

/**
 *
 * @author S542404
 */
public class Loan {

    private String loanAmount;
    private String issueDate;
    private int interestRate;

    public Loan(String loanAmount, String issueDate, int interestRate) {
        this.loanAmount = loanAmount;
        this.issueDate = issueDate;
        this.interestRate = interestRate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanAmount=" + loanAmount + ", issueDate=" + issueDate + ", interestRate=" + interestRate + '}';
    }

}
