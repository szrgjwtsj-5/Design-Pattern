package utils;

import java.util.Collection;

public class CollectionUtils {

    public static boolean isNotEmpty(Collection c) {
        return c != null && !c.isEmpty();
    }
}
