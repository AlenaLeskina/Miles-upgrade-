public class BonusMilesService {
    public int calculate(int cost) {
        int rub = 20;
        int bonus = 1;
        int mili = cost/rub * bonus;
        return mili;
    }
}
