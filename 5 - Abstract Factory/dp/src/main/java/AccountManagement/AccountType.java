package AccountManagement;


3
public enum AccountType {
4
5
    SAVING(2.0d), CURRENT(1.0d), HOME_LOAN(3.0d), VEHICLE_LOAN(4.0d), PERSONAL_LOAN(5.0d), RECURRING_DEPOSIT(2.5d), FIXED_DEPOSIT(3.5d);
6
7
    private double rate;
8
9
    AccountType(final double rate) {
10
        this.rate = rate;
11
    }
12
13
    public double getRate() {
14
        return rate;
15
    }
16
17
}
