import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// java -cp .:./commons-logging-1.3.2.jar:./log4j-api-2.23.1.jar:./log4j-core-2.23.1.jar:./log4j-jcl-2.23.1.jar demo05.java
// 或者
// javac -cp ./commons-logging-1.3.2.jar:./log4j-api-2.23.1.jar:./log4j-core-2.23.1.jar:./log4j-jcl-2.23.1.jar demo05.java
// java -cp .:./commons-logging-1.3.2.jar:./log4j-api-2.23.1.jar:./log4j-core-2.23.1.jar:./log4j-jcl-2.23.1.jar demo05
public class demo05 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(demo05.class);
        log.info("suhua is a good boy.");
        log.error("suhua is a good boy...");
    }
}
