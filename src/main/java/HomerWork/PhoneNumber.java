package HomerWork;

import java.util.Objects;

public class PhoneNumber {
    String phoneNumber;
    PhoneNumberType phoneNumberType;

    PhoneNumber(){}
    public PhoneNumber(String phoneNumber, PhoneNumberType phoneNumberType) {
        this.phoneNumber = phoneNumber;
        this.phoneNumberType = phoneNumberType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumberType getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumber, that.phoneNumber) && phoneNumberType == that.phoneNumberType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, phoneNumberType);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneNumberType=" + phoneNumberType +
                '}';
    }
}
