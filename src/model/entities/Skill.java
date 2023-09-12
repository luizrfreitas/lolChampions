package model.entities;

import model.enums.SkillLetter;

public class Skill {

    private SkillLetter skillLetter;
    private Integer manaCost;
    private String name;

    public Skill (SkillLetter letter, Integer manaCost, String name) {
        this.skillLetter = letter;
        this.manaCost = manaCost;
        this.name = name;
    }

    public SkillLetter getSkillLetter() {
        return skillLetter;
    }

    public Integer getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }
}
