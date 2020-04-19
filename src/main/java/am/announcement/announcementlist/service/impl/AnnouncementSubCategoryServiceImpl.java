package am.announcement.announcementlist.service.impl;

import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;
import am.announcement.announcementlist.repository.AnnouncementSubCategoryRepository;
import am.announcement.announcementlist.service.api.AnnouncementSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementSubCategoryServiceImpl implements AnnouncementSubCategoryService{

    @Autowired
    AnnouncementSubCategoryRepository announcementSubCategoryRepository;

    @Transactional
    @Override
    public AnnouncementSubCategory saveAnnouncementSubCategory(AnnouncementSubCategory announcementSubCategory) {
        return announcementSubCategoryRepository.save(announcementSubCategory);
    }

    @Transactional
    @Override
    public List<AnnouncementSubCategory> findAll() {
        return announcementSubCategoryRepository.findAll();
    }

    @Override
    public List<AnnouncementSubCategory> findAllByAnnouncementCategoryId(Integer id) {
        return announcementSubCategoryRepository.findAllByAnnouncementCategoryId(id);
    }

    @Transactional
    @Override
    public Optional<AnnouncementSubCategory> findById(Integer id) {
        return announcementSubCategoryRepository.findById(id);
    }

    @Transactional
    @Override
    public void updateById(Integer id, AnnouncementSubCategory announcementSubCategory){

    }

    @Transactional
    @Override
    public void deleteById(Integer id) {
        announcementSubCategoryRepository.deleteById(id);
    }
}
