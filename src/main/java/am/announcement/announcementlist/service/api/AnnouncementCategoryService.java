package am.announcement.announcementlist.service.api;

import am.announcement.announcementlist.model.persistance.Announcement;
import am.announcement.announcementlist.model.persistance.AnnouncementCategory;

import java.util.List;
import java.util.Optional;

public interface AnnouncementCategoryService {
    AnnouncementCategory saveAnnouncementCategory(AnnouncementCategory announcementCategory);

    List<AnnouncementCategory> findAll();

    Optional<AnnouncementCategory> findById(Integer id);

    void updateById(Integer id, AnnouncementCategory announcementCategory);

    void deleteById(Integer id);
}
