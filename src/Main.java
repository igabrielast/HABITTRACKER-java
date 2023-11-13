import controller.HabitController;

import entities.Habit;
import enums.StreakGoal;
import entities.StudyHabit;

import java.time.LocalDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Habit track = null;
        HabitController controller = new HabitController();

        int opt;

        System.out.println("Bem vindo ao Habit Tracker!");
        System.out.println("\nVocê deseja criar um hábito de Estudos (1) ou Saúde (2)?");
        opt = input.nextInt();
        input.nextLine();
        char r;

        if (opt == 1){
            System.out.print("\nDigite o NOME do seu Study Habit Tracker: ");
            String name = input.nextLine();

            System.out.print("Digite a DESCRIÇÃO do seu Study Habit Tracker: ");
            String description = input.nextLine();

            System.out.print("Digite a META DE SEQUÊNCIA do seu Study Habit Tracker: ");
            String streakGoal = input.nextLine().toUpperCase();

            System.out.print("Digite a MATÉRIA do seu Study Habit Tracker: ");
            String subject = input.nextLine();

            System.out.println("Deseja adicionar uma meta de tempo de ESTUDO TEORIA e PRÁTICA? (Y/N)");
            r = input.next().charAt(0);
            input.nextLine();
            if (r == 'y' || r == 'Y'){
                System.out.print("Digite o TEMPO DE ESTUDO TEORIA do seu Habit Tracker: ");
                String amountTheoryTime = input.nextLine();

                System.out.print("Digite o TEMPO DE ESTUDO PRÁTICA do seu Habit Tracker: ");
                String amountPracticeTime = input.nextLine();
                track = new StudyHabit(name, description, StreakGoal.valueOf(streakGoal), subject, amountTheoryTime,
                        amountPracticeTime);
            }
            else{
                track = new StudyHabit(name, description, StreakGoal.valueOf(streakGoal), subject);
            }
            System.out.println("\nSeu Habit Tracker é... ");
            System.out.println(track);
        }
        else if(opt == 2){

        }
        do {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1: CHECK DAY;\n2: ATUALIZAR ATRIBUTO HABIT TRACKER;\n" +
                    "3: REMOVER ATRIBUTO DO HABIT TRACKER;\n0: SAIR;");
            opt = input.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Você manteve seu hábitos hoje? (Y/N)");
                    r = input.next().charAt(0);
                    track.done(r);
                    System.out.println("\nLOG Habit Tracker: ");
                    track.show();
                    break;
                case 2:
                    System.out.println("\nQual atributo você quer atualizar?\n1: NOME;\n2: DESCRIÇÃO;\n" +
                            "3: META DE SEQUÊNCIA;");
                    opt = input.nextInt();
                    input.nextLine();
                    System.out.print("\nDigite a atualização para o atributo: ");
                    String value;
                    if (opt == 3){
                        value = input.nextLine().toUpperCase();
                    }
                    else {
                        value = input.nextLine();
                    }
                    controller.att(opt, track, value);
                    System.out.println("\nTracker atualizado com sucesso!");
                    System.out.println(track);
                    break;
                case 3:
                    System.out.println("\nQual atributo você quer remover?\n1: NOME;\n2: DESCRIÇÃO;");
                    opt = input.nextInt();
                    controller.remove(opt, track);
                default:
                    System.out.println("Obrigada por utilizar o Habit Tracker!");
            }
        } while (opt != 0);
        input.close();
    }
    public static LocalDate tomorrow(LocalDate today){
        return today.plusDays(1);
    }
}
