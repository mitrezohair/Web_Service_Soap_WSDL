import mypackage.BanqueService;
import mypackage.BanqueWS;
import mypackage.Compte;
import org.glassfish.jaxb.runtime.v2.runtime.output.StAXExStreamWriterOutput;

import java.time.Clock;

public class ClienWS {
    public static void main(String[] args) {
        //stub est un midlle ware
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.print(stub.convert(7600));
        Compte cp= stub.getcompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());






    }
}
