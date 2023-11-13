package controller;

import entities.Habit;
import enums.StreakGoal;
import repository.HabitRepository;

public class HabitController implements HabitRepository {
    @Override
    public void att(int option, Habit obj, String value) {
        switch (option){
            case 1:
               obj.setName(value);
               break;
            case 2:
                obj.setDescription(value);
                break;
            case 3:
                obj.setStreakGoal(StreakGoal.valueOf(value));
        }
    }
    public void remove(int option, Habit obj){
        switch (option){
            case 1:
                obj.setName(null);
                break;
            case 2:
                obj.setDescription(null);
                break;
        }
    }
}
