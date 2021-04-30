package ltd.newbee.mall.api.mall;

import io.swagger.annotations.Api;
import ltd.newbee.mall.service.NewBeeMallFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


/**
 * description:
 * Created by YGP on 2021-4-14
 */
@RestController
@Api(value = "v1", tags = "文件接口")
@RequestMapping("/api/v1")
public class NewBeeMallFileAPI {

    private static final Logger logger = LoggerFactory.getLogger(NewBeeMallGoodsAPI.class);

    @Resource
    private NewBeeMallFileService newBeeMallFileService;


    @RequestMapping(value = "/image/get")
    public void getImage(@RequestParam(required = true) String imageName, HttpServletResponse response) {
        newBeeMallFileService.getImage(imageName, response);
    }

}
