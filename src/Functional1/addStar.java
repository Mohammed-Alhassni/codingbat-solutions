package src.Functional1;
import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(str -> str+"*");
        return strings;
    }
}
