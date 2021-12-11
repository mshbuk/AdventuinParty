package pgdp.adventuin;

import pgdp.color.RgbColor;

public class Adventuin {
    private final String name;
    private final int height;
    private final RgbColor color;
    private final HatType hat;
    private final Language language;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public RgbColor getColor() {
        return color;
    }

    public HatType getHat() {
        return hat;
    }

    public Language getLanguage() {
        return language;
    }

    public Adventuin(String name, int height, RgbColor color, HatType hat, Language language) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.hat = hat;
        this.language = language;
    }

    @Override
    public String toString() {
        if(name == null || height == 0 || color == null || hat == null || language == null)
            return "Not allowed";
        return "name='" + name +
                ", height=" + height +
                ", color=" + color +
                ", hat=" + hat +
                ", language=" + language;
    }
}
