
package mypackage;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Convert_QNAME = new QName("http://ws/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws/", "ConvertResponse");
    private final static QName _Getcompte_QNAME = new QName("http://ws/", "getcompte");
    private final static QName _GetcompteResponse_QNAME = new QName("http://ws/", "getcompteResponse");
    private final static QName _ListeComptes_QNAME = new QName("http://ws/", "listeComptes");
    private final static QName _ListeComptesResponse_QNAME = new QName("http://ws/", "listeComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link Getcompte }
     * 
     * @return
     *     the new instance of {@link Getcompte }
     */
    public Getcompte createGetcompte() {
        return new Getcompte();
    }

    /**
     * Create an instance of {@link GetcompteResponse }
     * 
     * @return
     *     the new instance of {@link GetcompteResponse }
     */
    public GetcompteResponse createGetcompteResponse() {
        return new GetcompteResponse();
    }

    /**
     * Create an instance of {@link ListeComptes }
     * 
     * @return
     *     the new instance of {@link ListeComptes }
     */
    public ListeComptes createListeComptes() {
        return new ListeComptes();
    }

    /**
     * Create an instance of {@link ListeComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListeComptesResponse }
     */
    public ListeComptesResponse createListeComptesResponse() {
        return new ListeComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getcompte")
    public JAXBElement<Getcompte> createGetcompte(Getcompte value) {
        return new JAXBElement<>(_Getcompte_QNAME, Getcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getcompteResponse")
    public JAXBElement<GetcompteResponse> createGetcompteResponse(GetcompteResponse value) {
        return new JAXBElement<>(_GetcompteResponse_QNAME, GetcompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeComptes")
    public JAXBElement<ListeComptes> createListeComptes(ListeComptes value) {
        return new JAXBElement<>(_ListeComptes_QNAME, ListeComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeComptesResponse")
    public JAXBElement<ListeComptesResponse> createListeComptesResponse(ListeComptesResponse value) {
        return new JAXBElement<>(_ListeComptesResponse_QNAME, ListeComptesResponse.class, null, value);
    }

}
