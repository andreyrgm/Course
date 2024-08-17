package co.argm.app.model;

public class PremiumClient extends Client implements Comparable<PremiumClient> {
    public PremiumClient(String name, String surname) {
        super(name, surname);
    }

    @Override
    public int compareTo(PremiumClient o) {
        return 0;
    }
}
