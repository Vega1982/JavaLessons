package main.java.Lesson7;

public class Dragon {
    Integer dragonRun;
    Integer dragonJump;
    Integer dragonFly;
    String dragonName;

    public Dragon(Integer dragonRun, Integer dragonJump, Integer dragonFly, String dragonName) {
        this.dragonRun = dragonRun;
        this.dragonJump = dragonJump;
        this.dragonFly = dragonFly;
        this.dragonName = dragonName;
    }

    public Integer getDragonRun() {
        return dragonRun;
    }

    public void setDragonRun(Integer dragonRun) {
        this.dragonRun = dragonRun;
    }

    public Integer getDragonJump() {
        return dragonJump;
    }

    public void setDragonJump(Integer dragonJump) {
        this.dragonJump = dragonJump;
    }

    public Integer getDragonFly() {
        return dragonFly;
    }

    public void setDragonFly(Integer dragonFly) {
        this.dragonFly = dragonFly;
    }

    public String getDragonName() {
        return dragonName;
    }

    public void setDragonName(String dragonName) {
        this.dragonName = dragonName;
    }

    void DragonName() {
        System.out.println("Склонитесь перед великим драконон по имени " + dragonName + "!");

    }

    void DragonRun() {
        if (dragonRun == null) {
            System.out.println("Дракон " + dragonName + " не умеет бегать");
            System.out.println("--------------------");
        } else {
            System.out.println("Дракон " + dragonName + " бегает на " + dragonRun + " километров.");
            System.out.println("--------------------");
        }
    }

    void DragonJump() {
        if (dragonJump == null) {
            System.out.println("Дракон " + dragonName + " не умеет прыгать");
            System.out.println("--------------------");
        } else {
            System.out.println("Дракон " + dragonName + " прыгает на " + dragonJump + " километров.");
            System.out.println("--------------------");
        }
    }


    void DragonFly() {
        if (dragonFly == null) {
            System.out.println("Дракон " + dragonName + " не умеет летать");
            System.out.println("--------------------");
        } else {
            System.out.println("Дракон " + dragonName + " летает на " + dragonFly + " километров.");
            System.out.println("--------------------");
        }
    }
}
