package logarea.demo.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    private Long id;

    private Date created;
    private Date updated;
    private  Status status;
}
