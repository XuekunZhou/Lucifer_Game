public class VerstandigeAlgoritme implements LuciferAlgoritme{
    @Override
    public int doeZet(int aantal) {
        return switch (aantal) {
            case 15, 11, 7, 3 -> 2;
            case 12, 8, 4 -> 3;
            default -> 1;
        };
    }
}
