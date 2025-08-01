package src.Functional1;

import java.util.List;

public class lower {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(str->str.toLowerCase());
        return strings;
    }
}
