package model;

public enum Color {
    RED("RED"),
    WHITE("WHITE"),
    ;
    private final String name;
    Color(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
