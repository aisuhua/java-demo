import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// java -cp ./commons-logging-1.3.2.jar demo04.java
public class demo {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        b.add();
    }
}

class A {
    protected final Log log = LogFactory.getLog(this.getClass());
}

class B extends A {
    public void print() {
        this.log.info("suhua");
        //this.log.error("error: ", new Exception("ok?"));
    }

    public void add() {
        print();
        bbb();
    }

    public static void bbb() {
        System.out.println("bbb");
    }
}