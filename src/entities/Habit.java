package entities;

import view.LogHabit;

public abstract class Habit {
    private String name;
    private String description;
    private StreakGoal streakGoal;

    public Habit() {
    }

    public Habit(String name, String description, StreakGoal streakGoal) {
        this.name = name;
        this.description = description;
        this.streakGoal = streakGoal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStreakGoal(StreakGoal streakGoal) {
        this.streakGoal = streakGoal;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public StreakGoal getStreakGoal() {
        return streakGoal;
    }

    public void done(char value){
        LogHabit.hasDone(value);
    }
    public void show(){
        LogHabit.printLogHabit();
    }

    @Override
    public String toString() {
        return "";
    }
}
