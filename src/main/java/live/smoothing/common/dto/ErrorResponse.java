package live.smoothing.common.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import live.smoothing.common.util.DateFormatter;

public class ErrorResponse {
    private final String timeStamp;
    private final HttpStatus status;
    private final String errorMessage;
    private final String path;

    private ErrorResponse(Builder builder) {
        this.timeStamp = DateFormatter.formatDateTime(LocalDateTime.now());
        this.status = builder.status;
        this.errorMessage = builder.errorMessage;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String timeStamp;
        private HttpStatus status;
        private String errorMessage;
        private String path;

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(this);
        }
    }
}