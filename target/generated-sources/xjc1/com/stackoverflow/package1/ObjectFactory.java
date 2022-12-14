//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.23 at 05:02:35 PM MSK 
//


package com.stackoverflow.package1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.stackoverflow.package1 package. 
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

    private final static QName _SendRsRqData_QNAME = new QName("", "SendRsRqData");
    private final static QName _SendRqRqData_QNAME = new QName("", "SendRqRqData");
    private final static QName _SendRsRsData_QNAME = new QName("", "SendRsRsData");
    private final static QName _GetRsRsData_QNAME = new QName("", "GetRsRsData");
    private final static QName _GetRqRsData_QNAME = new QName("", "GetRqRsData");
    private final static QName _SendRqRsData_QNAME = new QName("", "SendRqRsData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.stackoverflow.package1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendRsRqDataType }
     * 
     */
    public SendRsRqDataType createSendRsRqDataType() {
        return new SendRsRqDataType();
    }

    /**
     * Create an instance of {@link AttachType }
     * 
     */
    public AttachType createAttachType() {
        return new AttachType();
    }

    /**
     * Create an instance of {@link SendRqRsDataType }
     * 
     */
    public SendRqRsDataType createSendRqRsDataType() {
        return new SendRqRsDataType();
    }

    /**
     * Create an instance of {@link FtpAttachType }
     * 
     */
    public FtpAttachType createFtpAttachType() {
        return new FtpAttachType();
    }

    /**
     * Create an instance of {@link SendRqRqDataType }
     * 
     */
    public SendRqRqDataType createSendRqRqDataType() {
        return new SendRqRqDataType();
    }

    /**
     * Create an instance of {@link GetRsRsDataType }
     * 
     */
    public GetRsRsDataType createGetRsRsDataType() {
        return new GetRsRsDataType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link SendRsRsDataType }
     * 
     */
    public SendRsRsDataType createSendRsRsDataType() {
        return new SendRsRsDataType();
    }

    /**
     * Create an instance of {@link GetRqRsDataType }
     * 
     */
    public GetRqRsDataType createGetRqRsDataType() {
        return new GetRqRsDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRsRqDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendRsRqData")
    public JAXBElement<SendRsRqDataType> createSendRsRqData(SendRsRqDataType value) {
        return new JAXBElement<SendRsRqDataType>(_SendRsRqData_QNAME, SendRsRqDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRqRqDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendRqRqData")
    public JAXBElement<SendRqRqDataType> createSendRqRqData(SendRqRqDataType value) {
        return new JAXBElement<SendRqRqDataType>(_SendRqRqData_QNAME, SendRqRqDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRsRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendRsRsData")
    public JAXBElement<SendRsRsDataType> createSendRsRsData(SendRsRsDataType value) {
        return new JAXBElement<SendRsRsDataType>(_SendRsRsData_QNAME, SendRsRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRsRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetRsRsData")
    public JAXBElement<GetRsRsDataType> createGetRsRsData(GetRsRsDataType value) {
        return new JAXBElement<GetRsRsDataType>(_GetRsRsData_QNAME, GetRsRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRqRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetRqRsData")
    public JAXBElement<GetRqRsDataType> createGetRqRsData(GetRqRsDataType value) {
        return new JAXBElement<GetRqRsDataType>(_GetRqRsData_QNAME, GetRqRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRqRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendRqRsData")
    public JAXBElement<SendRqRsDataType> createSendRqRsData(SendRqRsDataType value) {
        return new JAXBElement<SendRqRsDataType>(_SendRqRsData_QNAME, SendRqRsDataType.class, null, value);
    }

}
