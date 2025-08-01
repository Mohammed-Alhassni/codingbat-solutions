package src.Functional1;
import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(str->str+str+str);
        return strings;
    }
}
