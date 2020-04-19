package am.announcement.announcementlist.repository;

import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnnouncementSubCategoryRepository extends JpaRepository<AnnouncementSubCategory, Integer> {
}
