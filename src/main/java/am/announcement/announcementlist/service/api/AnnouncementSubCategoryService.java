package am.announcement.announcementlist.service.api;

import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;

import java.util.List;
import java.util.Optional;

public interface AnnouncementSubCategoryService {
    AnnouncementSubCategory saveAnnouncementSubCategory(AnnouncementSubCategory announcementSubCategory);

    List<AnnouncementSubCategory> findAll();

    Optional<AnnouncementSubCategory> findById(Integer id);

    List<AnnouncementSubCategory> findAllByAnnouncementCategoryId(Integer id);

    void updateById(Integer id, AnnouncementSubCategory announcementSubCategory);

    void deleteById(Integer id);
}
