package Lesson8;

public class Mammals {
    private String kind;
    private int age;
    private double height;
    private String voice;
    private String name;


    public Mammals() {

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void doVoice() {
        System.out.println(getKind() + " по имени " + getName() + " говорит " + getVoice());
    }
}
