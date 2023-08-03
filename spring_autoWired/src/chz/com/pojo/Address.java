package chz.com.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address {
    private String homeAddress;
    private String schoolAddress;

    public Address(String homeAddress, String schoolAddress) {
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }
}
