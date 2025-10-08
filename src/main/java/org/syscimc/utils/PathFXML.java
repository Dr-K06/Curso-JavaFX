package org.syscimc.utils;

import java.nio.file.Paths;

public class PathFXML {
    public static String pathBase() {
        return Paths.get("src/main/java/org/syscimc/view").toAbsolutePath().toString();
    }
}
