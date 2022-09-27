public class Zabawka {
    private String type;
    private String color;
    static int licznikZabawek;

    public Zabawka(String type, String color) {
        this.type = type;
        this.color = color;
        licznikZabawek++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Zabawka {" +
                "type = '" + getType() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
