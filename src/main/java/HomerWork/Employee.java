package HomerWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlRootElement(name = "employeeXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement
    private int age;
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private Address address;
    @XmlElement
    private List<PhoneNumber> phone=new ArrayList<>();

    Employee(){}
    public Employee(int age, String firstName, String lastName, Address address, List<PhoneNumber> phone) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }
    public void addNumber(PhoneNumber p){
        phone.add(p);
}


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneNumber> phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) && Objects.equals(address, employee.address)
                && Objects.equals(phone, employee.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, address, phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }
}
