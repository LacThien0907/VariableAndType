public enum Season {
    SPRING("XUAN"),
    SUMMER("HA"),
    AUTUMN("THU"),
    WINTER("DONG");

    String value;
    Season (String value) {
        this.value = value;

    }
    public String getValue(){
    return this.value;
    }
}
