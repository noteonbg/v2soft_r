//LoanCalculatorSpec.js

const LoanCalculator = require('../LoanCalculator');

describe('LoanCalculator', function() {
  it('should calculate the correct monthly payment', function() {
    const calculator = new LoanCalculator(10000, 5, 60); // $10,000 loan, 5% annual rate, 60 months duration

    const result = calculator.calculateMonthlyPayment();
    
    // Expect the result to be approximately 188.71
    expect(result).toBeCloseTo(188.71, 2);
  });

  it('should handle zero interest rate correctly', function() {
    const calculator = new LoanCalculator(10000, 0, 60); // $10,000 loan, 0% annual rate, 60 months duration

    const result = calculator.calculateMonthlyPayment();
    
    // With 0% interest, the monthly payment should simply be the principal divided by the number of months
    expect(result).toBe(10000 / 60);
  });

  it('should handle zero duration correctly', function() {
    const calculator = new LoanCalculator(10000, 5, 0); // $10,000 loan, 5% annual rate, 0 months duration

    const result = calculator.calculateMonthlyPayment();
    
    // With zero duration, monthly payment should be NaN or Infinity
    expect(result).toBeNaN();
  });
})