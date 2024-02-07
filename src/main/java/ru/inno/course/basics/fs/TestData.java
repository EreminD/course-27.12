package ru.inno.course.basics.fs;

import java.util.Objects;

public class TestData {

    private String userLogin;
    private String userPass;
    private int balance;

    public TestData(String userLogin, String userPass, int balance) {
        this.userLogin = userLogin;
        this.userPass = userPass;
        this.balance = balance;
    }

    public TestData() {
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestData testData)) return false;
        return getBalance() == testData.getBalance() && Objects.equals(getUserLogin(), testData.getUserLogin()) && Objects.equals(getUserPass(), testData.getUserPass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserLogin(), getUserPass(), getBalance());
    }

    @Override
    public String toString() {
        return "TestData{" +
                "userLogin='" + userLogin + '\'' +
                ", userPass='" + userPass + '\'' +
                ", balance=" + balance +
                '}';
    }
}
