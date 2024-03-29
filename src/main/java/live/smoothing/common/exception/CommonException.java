package live.smoothing.common.exception;

import live.smoothing.common.dto.ErrorResponse;
import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {

    private final HttpStatus status;
    private final String errorMessage;

    public CommonException(HttpStatus status, String errorMessage) {

        this.status = status;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatus(){
        return status;
    }

    public ErrorResponse toEntity(String path) {

        return new ErrorResponse(status, errorMessage, path);
    }
}
