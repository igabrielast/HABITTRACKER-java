package entities;

import enums.StreakGoal;

public class HealthyHabit extends Habit{
    private String nameExercise;
    private String amountExerciseTime;
    private String amountCal;

    public HealthyHabit(String name, String description, StreakGoal streakGoal,
                        String nameExercise, String amountExerciseTime,
                        String amountCal) {
        super(name, description, streakGoal);
        this.nameExercise = nameExercise;
        this.amountExerciseTime = amountExerciseTime;
        this.amountCal = amountCal;
    }

    public HealthyHabit(String name, String description, StreakGoal streakGoal,
                        String nameExercise, String amountExerciseTime) {
        super(name, description, streakGoal);
        this.nameExercise = nameExercise;
        this.amountExerciseTime = amountExerciseTime;
    }
    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public String getAmountExerciseTime() {
        return amountExerciseTime;
    }

    public void setAmountExerciseTime(String amountExerciseTime) {
        this.amountExerciseTime = amountExerciseTime;
    }

    public String getAmountCal() {
        return amountCal;
    }

    public void setAmountCal(String amountCal) {
        this.amountCal = amountCal;
    }

    @Override
    public String toString() {
        if (getAmountCal() == null){
            return String.format("NOME: %s\nDESCRIÇÃO: %s\nQUERO TER UM HÁBITO: %s\n"+
                "NOME EXERCÍCIO: %S\nTEMPO EXERCÍCIO ESTIMADO: %s", getName(), getDescription(),
                 getStreakGoal(),getNameExercise(), getAmountExerciseTime());
        }
        return String.format("NOME: %s\nDESCRIÇÃO: %s\nQUERO TER UM HÁBITO: %s\n"+
                "NOME EXERCÍCIO: %S\nTEMPO EXERCÍCIO ESTIMADO: %s\n" +
                "QUANTIDADE DE CALORIAS: %s", getName(), getDescription(),
        getStreakGoal(),getNameExercise(), getAmountExerciseTime(), getAmountCal());
    }
}
