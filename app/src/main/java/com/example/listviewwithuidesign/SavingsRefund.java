package com.example.listviewwithuidesign;

public class SavingsRefund {
    private int memberId;
    private String projectCode;
    private String orgNumber;
    private String orgMemNumber;
    private String memberName;
    private int savingBalance;
    private String phoneNumber;
    private String walletNumber;
    private int savingsRefundAmount;
    private String poSubmitDate;
    private String sentDateTime;

    public SavingsRefund() {
    }

    public SavingsRefund(String orgNumber, String orgMemNumber, String memberName, int savingBalance, String phoneNumber, String walletNumber, int savingsRefundAmount) {
        this.orgNumber = orgNumber;
        this.orgMemNumber = orgMemNumber;
        this.memberName = memberName;
        this.savingBalance = savingBalance;
        this.phoneNumber = phoneNumber;
        this.walletNumber = walletNumber;
        this.savingsRefundAmount = savingsRefundAmount;
    }

    public SavingsRefund(String projectCode, String orgNumber, String orgMemNumber, String memberName, int savingBalance, String phoneNumber, String walletNumber, int savingsRefundAmount, String poSubmitDate, String sentDateTime) {
        this.projectCode = projectCode;
        this.orgNumber = orgNumber;
        this.orgMemNumber = orgMemNumber;
        this.memberName = memberName;
        this.savingBalance = savingBalance;
        this.phoneNumber = phoneNumber;
        this.walletNumber = walletNumber;
        this.savingsRefundAmount = savingsRefundAmount;
        this.poSubmitDate = poSubmitDate;
        this.sentDateTime = sentDateTime;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getOrgMemNumber() {
        return orgMemNumber;
    }

    public void setOrgMemNumber(String orgMemNumber) {
        this.orgMemNumber = orgMemNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWalletNumber() {
        return walletNumber;
    }

    public void setWalletNumber(String walletNumber) {
        this.walletNumber = walletNumber;
    }

    public int getSavingsRefundAmount() {
        return savingsRefundAmount;
    }

    public void setSavingsRefundAmount(int savingsRefundAmount) {
        this.savingsRefundAmount = savingsRefundAmount;
    }

    public String getPoSubmitDate() {
        return poSubmitDate;
    }

    public void setPoSubmitDate(String poSubmitDate) {
        this.poSubmitDate = poSubmitDate;
    }

    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }

    public int getMemberId() {
        return memberId;
    }
}
