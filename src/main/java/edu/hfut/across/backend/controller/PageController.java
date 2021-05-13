package edu.hfut.across.backend.controller;

import edu.hfut.across.backend.entity.Response;
import edu.hfut.across.backend.entity.Type;
import edu.hfut.across.backend.service.PageService;
import edu.hfut.across.backend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("page")
public class PageController {

    final
    PageService pageService;

    @Autowired
    PageController(PageService pageService) {
        this.pageService = pageService;
    }
    @PostMapping("/sort")
    @ResponseBody
    public Response getSortPage() {

        List<Type> typeList = pageService.getSortPage();
        return ResponseUtil.success("分类页获取成功", typeList);
    }
}
