import java.util.logging.Level;
import java.util.logging.Logger;

public class demo {
    public static void main(String[] args) {
        //Logger logger = Logger.getGlobal();
        Logger logger = Logger.getLogger("sss");
        logger.info("suhua is a good boy!");
        logger.warning("suhua is a good boy!");
        logger.fine("aaa");
    }
}