public class VerstandigeAlgoritme implements LuciferAlgoritme{
    @Override
    public int doeZet(int aantal) {
        int max = 3; // Maximaal aantal lucifers die je per zet mag verwijderen
        int zet = (aantal - 1) % (max + 1);

        if (zet == 0)
            return 1;

        return zet;
    }
}
