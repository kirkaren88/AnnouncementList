package am.announcement.announcementlist.repository;

import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementCategoryRepository extends JpaRepository<AnnouncementCategory, Integer> {
}
