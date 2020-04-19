package am.announcement.announcementlist.controller;

import am.announcement.announcementlist.model.persistance.Announcement;
import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;
import am.announcement.announcementlist.service.api.AnnouncementCategoryService;
import am.announcement.announcementlist.service.api.AnnouncementSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/category")
public class AnnouncementCategoryController {

    @Autowired
    AnnouncementCategoryService announcementCategoryService;

    @Autowired
    AnnouncementSubCategoryService announcementSubCategoryService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping()
    public void addCategory( @RequestBody AnnouncementCategory announcementCategory){
        announcementCategoryService.saveAnnouncementCategory(announcementCategory);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<AnnouncementSubCategory> getAllSubCategoriesById(@RequestParam("id") Integer id){
        return announcementSubCategoryService.findAllByAnnouncementCategoryId(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping()
    public void deleteCategory(@RequestParam("id") Integer id){
        announcementCategoryService.deleteById(id);
    }
}
