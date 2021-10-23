public class BonusMilesService {
    public int calculate(int price) {
        int count = 20;
        int miles = price / count;
        return miles;
    }
}
