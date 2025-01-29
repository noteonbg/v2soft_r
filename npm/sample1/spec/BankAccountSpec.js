// BankAccountSpec.js
const BankAccount = require('../src/BankAccount');

describe('BankAccount', () => {
  let account1, account2;

  // Setup before each test
  beforeEach(() => {
    account1 = new BankAccount(100);  // Account with $100
    account2 = new BankAccount();      // Account with $0
  });

  // Test for deposits
  it('should deposit money into the account', () => {
    const result = account1.deposit(50);
    expect(result).toBe(true);
    expect(account1.getBalance()).toBe(150);
  });

  // Test for withdraws
  it('should withdraw money from the account', () => {
    const result = account1.withdraw(50);
    expect(result).toBe(true);
    expect(account1.getBalance()).toBe(50);
  });

  it('should not withdraw more money than the balance', () => {
    const result = account1.withdraw(200);
    expect(result).toBe(false);
    expect(account1.getBalance()).toBe(100);
  });

  // Test for account transfer
  it('should transfer money between accounts', () => {
    const result = account1.transferTo(account2, 50);
    expect(result).toBe(true);
    expect(account1.getBalance()).toBe(50);
    expect(account2.getBalance()).toBe(50);
  });

  it('should not transfer more money than available', () => {
    const result = account1.transferTo(account2, 200);
    expect(result).toBe(false);
    expect(account1.getBalance()).toBe(100);
    expect(account2.getBalance()).toBe(0);
  });

  // Test for spies (e.g., spying on method calls)
  it('should spy on deposit method', () => {
    const spy = spyOn(account1, 'deposit').and.callThrough();
    account1.deposit(50);
    expect(spy).toHaveBeenCalled();
    expect(spy).toHaveBeenCalledWith(50);
  });

  // Test for asynchronous code (e.g., fakeAsync or done)
  it('should test asynchronous behavior with done', (done) => {
    setTimeout(() => {
      account1.deposit(200);
      expect(account1.getBalance()).toBe(300);
      done();
    }, 1000);
  });

  // Test for setup/teardown (beforeAll/afterAll)
  beforeAll(() => {
    console.log('Setting up tests...');
  });

  afterAll(() => {
    console.log('Cleaning up after tests...');
  });

  afterEach(() => {
    console.log('After each test...');
  });

  // Test for matcher "toBeTruthy" and "toBeFalsy"
  it('should check truthy/falsy conditions', () => {
    const isValid = account1.getBalance() > 0;
    expect(isValid).toBeTruthy();

    const isEmpty = account2.getBalance() === 0;
    expect(isEmpty).toBeFalsy();
  });
});
