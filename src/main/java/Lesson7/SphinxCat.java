package Lesson7;

public class SphinxCat {
    Integer catRun;
    Integer catJump;
    Integer catFly;
    String catName;

    public SphinxCat(Integer catRun, Integer catJump, Integer catFly, String catName) {
        this.catRun = catRun;
        this.catJump = catJump;
        this.catFly = catFly;
        this.catName = catName;


    }

    public void setCatRun(Integer catRun) {
        this.catRun = catRun;
    }

    public void setCatJump(Integer catJump) {
        this.catJump = catJump;
    }

    public void setCatFly(Integer catFly) {
        this.catFly = catFly;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    void catRun() {
        System.out.println("Кошка " + catName + " пробежала " + catRun + " метров.");
    }

    void catJump() {
        System.out.println("Кошка " + catName + " прыгает на " + catJump + " сантиметров.");
    }

    void catFly() {
        if (catFly == null) {
            System.out.println("Кошка " + catName + " не умеет летать");
            System.out.println("--------------------");
        } else {
            System.out.println("Кошка " + catName + " летает " + catFly + " километров.");
            System.out.println("--------------------");
        }
    }
}
