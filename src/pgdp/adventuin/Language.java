package pgdp.adventuin;

public enum Language {
    ENGLISH, GERMAN, UKRAINIAN;

    public String getLocalizedChristmasGreeting(String greeterName) {
        switch (this) {
            case ENGLISH:
                return greeterName + " wishes you a Merry Christmas!";
            case GERMAN:
                return "Fröhliche Weihnachten wünscht dir " + greeterName + "!";
            case UKRAINIAN:
                return greeterName + " бажає Вам щастливого Різдва!";
        }
        return null;
    }
}
