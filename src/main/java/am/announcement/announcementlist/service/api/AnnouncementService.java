package am.announcement.announcementlist.service.api;

import am.announcement.announcementlist.model.persistance.Announcement;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface AnnouncementService {
    Announcement saveAnnouncement(Announcement announcement);

    List<Announcement> findAll();

    Optional<Announcement> findById(Integer id);

    List<Announcement> findByNameContainsKeyWord(String keyWord);

    void updateById(Integer id, Announcement announcement);

    void deleteById(Integer id);
}
