package am.announcement.announcementlist.service.impl;

import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import am.announcement.announcementlist.repository.AnnouncementCategoryRepository;
import am.announcement.announcementlist.service.api.AnnouncementCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementCategoryServiceImpl implements AnnouncementCategoryService {

    @Autowired
    AnnouncementCategoryRepository announcementCategoryRepository;

    @Transactional
    @Override
    public AnnouncementCategory saveAnnouncementCategory(AnnouncementCategory announcementCategory) {
        return announcementCategoryRepository.save(announcementCategory);
    }

    @Transactional
    @Override
    public List<AnnouncementCategory> findAll() {
        return announcementCategoryRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<AnnouncementCategory> findById(Integer id) {
        return announcementCategoryRepository.findById(id);
    }

    @Transactional
    @Override
    public void updateById(Integer id, AnnouncementCategory announcementCategory) {

    }

    @Transactional
    @Override
    public void deleteById(Integer id) {
        announcementCategoryRepository.deleteById(id);
    }
}
