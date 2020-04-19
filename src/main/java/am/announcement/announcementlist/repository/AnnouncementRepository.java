package am.announcement.announcementlist.repository;

import am.announcement.announcementlist.model.persistance.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
    List<Announcement> findByNameContaining(String keyWord);
}
