import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();

        // Default account
        accounts.add(
                new Account(
                        "ACC1001",
                        "ashwini",
                        "1234",
                        10000.00
                )
        );
    }

    public Account login(String userId, String pin) {

        for (Account account : accounts) {

            if (account.getUserId().equals(userId)
                    && account.getPin().equals(pin)) {

                return account;
            }
        }

        return null;
    }
}