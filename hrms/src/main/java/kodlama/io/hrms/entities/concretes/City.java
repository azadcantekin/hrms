package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City extends EntityWithUUID {


	private static final long serialVersionUID = 4682683801732359339L;

	@Column(name="name")
	private String name;

}
