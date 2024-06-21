import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class demo {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        b.add();
    }
}

class A {
    protected final Log log = LogFactory.getLog(getClass());
}

class B extends A {
    public void print() {
        this.log.info("suhua");
    }

    public void add() {
        this.print();
    }
}