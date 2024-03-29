package live.smoothing.common.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import live.smoothing.common.util.DateFormatter;

public class ErrorResponse {
    private final String timeStamp;
    private final HttpStatus status;
    private final String errorMessage;
    private final String path;

    public ErrorResponse(HttpStatus status, String errorMessage, String path) {

        this.timeStamp = DateFormatter.formatDateTime(LocalDateTime.now());
        this.status = status;
        this.errorMessage = errorMessage;
        this.path = path;
    }
}