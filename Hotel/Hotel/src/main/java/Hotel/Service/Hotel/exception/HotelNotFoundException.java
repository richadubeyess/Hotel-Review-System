package Hotel.Service.Hotel.exception;

public class HotelNotFoundException extends RuntimeException{

    public HotelNotFoundException(){
        super("Hotel Not Found");
    }

    public HotelNotFoundException(String message){
        super(message);
    }
}
