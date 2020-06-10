package comm.example.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name="/todo")
public class ToDo {

    private int Id;
    @Column(name = "description")
    @NotNull(message = "Field cannot be empty")
    @Size(min=1, message="is required")
    private String description;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date datepicker;

    public ToDo() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(Date datepicker) {
        this.datepicker = datepicker;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "Id=" + Id +
                ", description='" + description + '\'' +
                ", datepicker=" + datepicker +
                '}';
    }
}