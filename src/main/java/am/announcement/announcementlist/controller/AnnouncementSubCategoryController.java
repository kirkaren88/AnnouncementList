package am.announcement.announcementlist.controller;

import am.announcement.announcementlist.model.persistance.AnnouncementCategory;
import am.announcement.announcementlist.model.persistance.AnnouncementSubCategory;
import am.announcement.announcementlist.service.api.AnnouncementCategoryService;
import am.announcement.announcementlist.service.api.AnnouncementSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/subcategory")
public class AnnouncementSubCategoryController {
    @Autowired
    AnnouncementSubCategoryService announcementSubCategoryService;

    @Autowired
    AnnouncementCategoryService announcementCategoryService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping()
    public void addSubCategory( @RequestBody AnnouncementSubCategory announcementSubCategory){

        Optional<AnnouncementCategory> category = announcementCategoryService.findById(announcementSubCategory.getAnnouncementCategory().getId());
        announcementSubCategory.setAnnouncementCategory(category.get());
        announcementSubCategoryService.saveAnnouncementSubCategory(announcementSubCategory);
    }

 //   @ResponseStatus(HttpStatus.OK)


    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping()
    public void deleteCategory(@RequestParam("id") Integer id){
        announcementSubCategoryService.deleteById(id);
    }
}
