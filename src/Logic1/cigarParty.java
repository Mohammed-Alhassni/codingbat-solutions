package src.Logic1;

public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 || (isWeekend && cigars > 40)) return true;
        return false;
    }
}
