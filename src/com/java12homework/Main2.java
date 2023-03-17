package com.java12homework;

public class Account {
    private String accountNumber;
    private int balance;
    
    Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return balance + "원 (계좌번호=" + accountNumber.trim() + ")";
    }
// 계좌번호 4649, 잔액 1592원 Account 인스턴스를 변수 a 에 생성하고 
// System.out.println(a); 를 실행하면, 화면에 1592원 (계좌번호=4649)) 라고 표시
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account other = (Account) obj;
            return accountNumber.trim().equals(other.getAccountNumber().trim());
        }
        return false;
    }
}
