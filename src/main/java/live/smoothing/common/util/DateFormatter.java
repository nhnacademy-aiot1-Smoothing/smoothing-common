package live.smoothing.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }
}