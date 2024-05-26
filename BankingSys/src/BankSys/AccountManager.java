package BankSys;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private static long nextAccountNumber = 0;
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(Account account) {
        accounts.put(account.getUsername(), account);
        saveAccountToFile(account);
    }

    public Account getAccount(String username) {
        return accounts.get(username);
    }

    private void saveAccountToFile(Account account) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("NewAccount.txt", true))) {
            writer.write(account.getUsername() + "," + account.getPassword() + "," + account.getPinCode() + "," + account.getFirstName() + "," + account.getMiddleName() + "," + account.getLastName() + "," + account.getBirthdate() + "," + account.getGender() + "," + account.getAddress() + "," + account.getFatherName() + "," + account.getMotherName() + "," + account.getContactNo() + "," + account.getBalance() + "," + account.getAccountNo());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long getNextAccountNumber() {
        return nextAccountNumber++;
    }
}