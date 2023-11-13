package view;

public abstract class LogHabit {
    private static final String[] days = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
    private static String[][] mat = new String[6][7];
    private static void addDays(){
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 7; j++){
                mat[i][j] = days[j];
            }
        }
    }

    public static boolean hasDone(char value){
        addDays();
        if (value == 'y' || value == 'Y'){
            for (int i = 1; i < 6; i++){
                for (int j = 0; j < 7; j++){
                    if(mat[i][j] == null){
                        mat[i][j] =  "✓";
                        return true;
                    }
                }
            }
        }
        else if(value == 'n' || value == 'N'){
            for (int i = 1; i < 6; i++){
                for (int j = 0; j < 7; j++){
                    if(mat[i][j] == null){
                        mat[i][j] = " x ";
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void printLogHabit(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (mat[i][j] != null){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
