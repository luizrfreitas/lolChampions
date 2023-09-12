package model.entities;


import java.util.ArrayList;
import  model.*;

public class Kit {

    private Skill qSkill;
    private Skill wSkill;
    private Skill eSkill;
    private Skill rSkill;

    public Kit(ArrayList<Skill> kit) {
        this.qSkill = kit.get(0);
        this.wSkill = kit.get(1);
        this.eSkill = kit.get(2);
        this.rSkill = kit.get(3);
    }

}
