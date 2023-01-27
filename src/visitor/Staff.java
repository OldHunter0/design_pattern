package visitor;

import java.util.Random;

public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(11);
    }
    public abstract void accept(Visitor visitor);
}
