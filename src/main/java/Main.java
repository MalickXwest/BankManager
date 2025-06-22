public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CHK001", 1000.0, 500.0);
        SavingsAccount savings = new SavingsAccount("SAV001", 3000.0, 2.5);
        COD cod = new COD("COD001", 5000.0, 12);

        System.out.println("Compte courant : " + checking.getAccount() + ", Solde : " + checking.getBalance());
        System.out.println("Compte épargne : " + savings.getAccount() + ", Solde : " + savings.getBalance());
        System.out.println("Certificat de dépôt : " + cod.getAccount() + ", Solde : " + cod.getBalance());
    }
}
