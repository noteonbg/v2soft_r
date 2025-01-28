class LoanCalculator {
    constructor(principal, annualRate, durationMonths) {
      this.principal = principal;
      this.annualRate = annualRate;
      this.durationMonths = durationMonths;
    }
  
    calculateMonthlyPayment() {
      const r = this.annualRate / 12 / 100; // Monthly interest rate
      const n = this.durationMonths;
      
      const numerator = this.principal * r * Math.pow(1 + r, n);
      const denominator = Math.pow(1 + r, n) - 1;
  
      return numerator / denominator;
    }
  }
  
  module.exports = LoanCalculator;