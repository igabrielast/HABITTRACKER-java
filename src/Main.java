import entities.Habit;
import entities.HealthyHabit;
import entities.StreakGoal;
import entities.StudyHabit;

public class Main {
    public static void main(String[] args) {
        Habit track = new StudyHabit("Estudos Exatas","Algebra, Estatística e Probabilidade",
                StreakGoal.DIARIO, "Matemática", "3H","2H");
        System.out.println("Habit Tracker!");
        System.out.println(track);
        System.out.println();

        Habit track2 = new StudyHabit("Estudos Exatas","Algebra, Estatística e Probabilidade",
                StreakGoal.DIARIO, "Matemática");

        System.out.println("Habit Tracker!");
        System.out.println(track2);
        System.out.println();

        Habit track3 = new HealthyHabit("Rotina Saúdavel", "Exercícios Físicos e Alimentação",
                StreakGoal.MENSAL,"1500cal");

        System.out.println("Habit Tracker!");
        System.out.println(track3);
        System.out.println();

        Habit track4 = new HealthyHabit("Rotina Saúdavel", "Exercícios Físicos e Alimentação",
                StreakGoal.MENSAL, "Caminhada","1h","1500cal");
        System.out.println("Habit Tracker!");
        System.out.println(track4);
        System.out.println();

        Habit track5 = new HealthyHabit("Rotina Saúdavel", "Exercícios Físicos e Alimentação",
                StreakGoal.MENSAL, "Caminhada","1h");
        System.out.println("Habit Tracker!");
        System.out.println(track5);
        System.out.println();
    }
}
