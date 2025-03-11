package Oops.accessModifiers;

import Oops.accessModifiers.defaultt.Defaultt;
import Oops.accessModifiers.privatee.Privatee;
import Oops.accessModifiers.proctectedd.Protectedd;

public class Main {
    public static void main(String[] args) {
        Defaultt d = new Defaultt();
        // d.check(); { Error }

        Privatee pv = new Privatee();
        // pv.check(); { Error }

        Protectedd pr = new Protectedd();
        // pr.check(); { Error }

        Publicc pb = new Publicc();
        pb.check();

      
    }
}

class PrivateExtension extends Privatee{
    public static void main(String[] args) {
        
    }
}

class ProtectedExtension extends Protectedd {
    public static void main(String[] args) {
        call();
    }
    static void call(){
        check();
    }
}