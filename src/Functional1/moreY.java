package src.Functional1;
import java.util.List;

public class moreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(str->"y"+str+"y");
        return strings;
    }
}
