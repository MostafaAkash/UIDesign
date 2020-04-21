package com.example.listviewwithuidesign;

public class Member {
    private String voCode;
    private int memberNumber;
    private String memberName;

    public Member() {
    }

    public Member(String voCode, int memberNumber, String memberName) {
        this.voCode = voCode;
        this.memberNumber = memberNumber;
        this.memberName = memberName;
    }

    public String getVoCode() {
        return voCode;
    }

    public void setVoCode(String voCode) {
        this.voCode = voCode;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
