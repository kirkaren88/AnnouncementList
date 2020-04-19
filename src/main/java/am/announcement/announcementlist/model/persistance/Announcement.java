package am.announcement.announcementlist.model.persistance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "announcement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String description;

    @Column
    private Date postedDate;

    @ManyToOne
    private AnnouncementSubCategory announcementSubCategory;
}
