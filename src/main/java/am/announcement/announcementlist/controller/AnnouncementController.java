package am.announcement.announcementlist.controller;

import am.announcement.announcementlist.model.persistance.Announcement;
import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;
import am.announcement.announcementlist.service.api.AnnouncementService;
import am.announcement.announcementlist.service.api.AnnouncementSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
    @Autowired
    AnnouncementService announcementService;

    @Autowired
    AnnouncementSubCategoryService announcementSubCategoryService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping()
    public void announcementAdd( @RequestBody Announcement announcement){
        Optional<AnnouncementSubCategory> announcementSubCategory  = announcementSubCategoryService.findById(announcement.getAnnouncementSubCategory().getId());
        announcement.setAnnouncementSubCategory(announcementSubCategory.get());
        announcementService.saveAnnouncement(announcement);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Announcement> findAllByKeyWord(@RequestParam("keyword") String keyWord){
        return announcementService.findByNameContainsKeyWord(keyWord);
    }
}
