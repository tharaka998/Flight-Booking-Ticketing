// GlobalVariables.java
package config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GlobalVariables {
    public static final String FROM_LOCATION = "DXB";
    public static final String TO_LOCATION = "CMB";
    public static final String DEPARTURE_DATE = LocalDate.now().plusDays(90).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    public static final int ADULTS_COUNT = 2;
    public static final int CHILDREN_COUNT = 1;
}
