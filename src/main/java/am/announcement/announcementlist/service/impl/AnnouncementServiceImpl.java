package am.announcement.announcementlist.service.impl;

import am.announcement.announcementlist.model.persistance.Announcement;
import am.announcement.announcementlist.repository.AnnouncementRepository;
import am.announcement.announcementlist.service.api.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    AnnouncementRepository announcementRepository;

    @Transactional
    @Override
    public Announcement saveAnnouncement(Announcement announcement) {
        announcement.setPostedDate(new Date());
        return announcementRepository.save(announcement);
    }

    @Transactional
    @Override
    public List<Announcement> findAll() {
        return announcementRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Announcement> findById(Integer id) {
        return announcementRepository.findById(id);
    }

    @Transactional
    @Override
    public List<Announcement> findByNameContainsKeyWord(String keyWord) {
        return announcementRepository.findByNameContaining(keyWord);
    }

    @Transactional
    @Override
    public void updateById(Integer id, Announcement announcement) {

    }

    @Transactional
    @Override
    public void deleteById(Integer id) {

    }
}
