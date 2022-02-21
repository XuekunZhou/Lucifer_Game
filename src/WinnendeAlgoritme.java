public class WinnendeAlgoritme implements LuciferAlgoritme{
    @Override
    public int doeZet(int aantal) {
        switch (aantal)
        {
            case 15: return 2;
            case 14: return 1;
            case 13: return 0;
            case 12: return 3;
            case 11: return 2;

            case 10: return 1;
            case 9: return 0;
            case 8: return 3;
            case 7: return 2;
            case 6: return 1;

            case 5: return 0;
            case 4: return 3;
            case 3: return 2;
            case 2: return 1;
            default: return 1;
        }
    }
}
