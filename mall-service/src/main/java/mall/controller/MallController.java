package mall.controller;

import mall.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:50
 */
@RestController
@RequestMapping("/mall/v1")
public class MallController {
    @Resource
    MallService mallService;

    @RequestMapping("/createOrderFromMall")
    public String createOrderFromMall() {
        return mallService.createOrderFromMall("1");
    }


}
