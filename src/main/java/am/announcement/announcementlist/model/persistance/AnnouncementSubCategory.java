package am.announcement.announcementlist.model.persistance;

import am.announcement.announcementlist.model.persistance.Announcement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subcategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementSubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne
    private AnnouncementCategory announcementCategory;
}
