package blocoTryCatch.excecaoPersonalizada.model.exceptions;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
