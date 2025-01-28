// BankAccount.js
class BankAccount {
    constructor(balance = 0) {
      this.balance = balance;
    }
  
    deposit(amount) {
      if (amount > 0) {
        this.balance += amount;
        return true;
      }
      return false;
    }
  
    withdraw(amount) {
      if (this.balance >= amount && amount > 0) {
        this.balance -= amount;
        return true;
      }
      return false;
    }
  
    transferTo(account, amount) {
      if (this.withdraw(amount)) {
        account.deposit(amount);
        return true;
      }
      return false;
    }
  
    getBalance() {
      return this.balance;
    }
  }
  
  module.exports = BankAccount;
  