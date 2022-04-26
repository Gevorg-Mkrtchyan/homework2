package HomerWork;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;

public class XmlConvert {
    public static void main(String[] args) {
        String file = "src/main/resources/employee.xml";
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Employee employee = new Employee(36, "Bob", "Smith",
                    new Address("Yerevan", "Armenia", "Moldovakan", "005"), new ArrayList<>());
            PhoneNumber pp = new PhoneNumber("077", PhoneNumberType.Home);
            employee.addNumber(pp);
            marshaller.marshal(employee, new File(file));
        } catch (
                JAXBException e) {
            e.printStackTrace();
        }

        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(new File(file));
            System.out.println(employee.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}