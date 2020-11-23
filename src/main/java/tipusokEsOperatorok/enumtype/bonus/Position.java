package tipusokEsOperatorok.enumtype.bonus;

public enum Position {

   BOSS(50000), MANAGER(30000), ASSISTANT(20000);

    private int bonus;

    Position(int bonus) {
        this.bonus = bonus;
    }
}