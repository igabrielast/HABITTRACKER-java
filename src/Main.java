import controller.HabitController;
import entities.Habit;
import entities.HealthyHabit;
import entities.StreakGoal;
import entities.StudyHabit;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HabitController controller = new HabitController();

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

        System.out.println("Digite a opção que você quer atualizar? nome 1, desc 2, streak goal 3");
        int opt = input.nextInt();
        input.nextLine();

        if (opt == 3){
            System.out.println("Escolha entre as opções! ");
            System.out.print("DIÁRIO, SEMANAL, MENSAL: ");
        }
        String value = input.nextLine();
        controller.att(opt, track5, value);

        System.out.println("Novo Track: ");
        System.out.println(track5);

        System.out.println("Digite a opção que você quer remover? nome 1, desc 2, streak goal 3");
        controller.remove(opt, track5);
        System.out.println(track5);

    }
    public static LocalDate tomorrow(LocalDate today){
        return today.plusDays(1);
    }
}
