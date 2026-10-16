package Hotel.Service.Hotel.exception;

import Hotel.Service.Hotel.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ApiResponse> handleHotelNotFoundException(HotelNotFoundException ex){
        String message= ex.getMessage();

        ApiResponse response=ApiResponse
                .builder()
                .message(message)
                .status(HttpStatus.NOT_FOUND)
                .success(true)
                .build();

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}
