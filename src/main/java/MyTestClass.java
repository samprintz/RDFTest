import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;


public class MyTestClass {

    public static void main(String[] args) {
        System.out.println("Hello World!2");

        Model model = ModelFactory.createDefaultModel() ;
        model.read("data.rdf");
        model.write(System.out,"TURTLE");
        
        
        System.out.println("Hallo");
    }

}
