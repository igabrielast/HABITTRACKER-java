package repository;

import entities.Habit;

public interface HabitRepository {
     void att(int option, Habit obj, String value);
     void remove(int option, Habit obj);
}
