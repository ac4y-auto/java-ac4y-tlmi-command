package tlmi.command.domain;

import tlmi.command.algebra.TestAlgebra;

public class Test extends TestAlgebra {

    public Test() {
        setCommandName("TEST");
    }

    public void process(){
        System.out.println("TEST command!");
    }
}
