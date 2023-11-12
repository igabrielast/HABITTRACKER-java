package entities;

public class StudyHabit extends Habit {
    private String subject;
    private String amountTheoryTime;
    private String amountPracticeTime;

    public StudyHabit(String name, String description, StreakGoal streakGoal,
                      String subject, String amountTheoryTime,
                      String amountPracticeTime) {
        super(name, description, streakGoal);
        this.subject = subject;
        this.amountTheoryTime = amountTheoryTime;
        this.amountPracticeTime = amountPracticeTime;
    }

    public StudyHabit(String name, String description, StreakGoal streakGoal,
                      String subject) {
        super(name, description, streakGoal);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAmountTheoryTime() {
        return amountTheoryTime;
    }

    public void setAmountTheoryTime(String amountTheoryTime) {
        this.amountTheoryTime = amountTheoryTime;
    }

    public String getAmountPracticeTime() {
        return amountPracticeTime;
    }

    public void setAmountPracticeTime(String amountPracticeTime) {
        this.amountPracticeTime = amountPracticeTime;
    }

    @Override
    public String toString() {
        if (getAmountTheoryTime() == null){
            return String.format("NOME: %s\nDESCRIÇÃO: %s\nQUERO TER UM HÁBITO: %s\n" +
                            "MATÉRIA DE ESTUDO: %s",
                    getName(), getDescription(), getStreakGoal(), getSubject());
        }
        return String.format("NOME: %s\nDESCRIÇÃO: %s\nQUERO TER UM HÁBITO: %s\n" +
                "MATÉRIA DE ESTUDO: %s\nTEMPO DE ESTUDOS ESTIMADO: %S",
                getName(), getDescription(), getStreakGoal(), getSubject(), getAmountTheoryTime());
    }
}
