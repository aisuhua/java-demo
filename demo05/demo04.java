
public class demo {
    public static void main(String[] args) {
        throw new UserException();
        //throw new BaseException("suhua is a good boy");
    }
}

class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

class UserException extends BaseException {}
class OhMyGodException extends BaseException {}
