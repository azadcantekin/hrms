package kodlama.io.hrms.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kodlama.io.hrms.entities.concretes.City;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertisementModel extends BaseDto{

    private String definition;
    private City city;
    private int positionNumber;
    private boolean active;
    private Date lastApplicationDate;
    private String companyName;
    private Employer employer;
}
