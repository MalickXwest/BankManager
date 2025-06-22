public class BankAccount {
        protected String account;
        protected double balance;

    public class CheckingAccount extends BankAccount {
        private double limit;

        public CheckingAccount(String account, double balance, double limit) {
            super(account, balance);
            this.limit = limit;
        }

        public double getLimit() {
            return limit;
        }

        public void setLimit(double limit) {
            this.limit = limit;
        }
    }

        public BankAccount(String account, double balance) {
            this.account = account;
            this.balance = balance;
        }

        public String getAccount() {
            return account;
        }

        public double getBalance() {
            return balance;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }



