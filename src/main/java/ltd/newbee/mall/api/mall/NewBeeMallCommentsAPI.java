package ltd.newbee.mall.api.mall;

import io.swagger.annotations.Api;
import ltd.newbee.mall.config.annotation.TokenToMallUser;
import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.service.NewBeeMallCommentsService;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * description:
 * Created by YGP on 2021-4-18
 */
@RestController
@Api(value = "v1", tags = "评论接口")
@RequestMapping("/api/v1")
public class NewBeeMallCommentsAPI {
    private static final Logger logger = LoggerFactory.getLogger(NewBeeMallGoodsAPI.class);

    @Resource
    private NewBeeMallCommentsService newBeeMallCommentsService;


    @RequestMapping(value = "/comments")
    public Result getImage(@RequestParam(required = true) String goodsId, @TokenToMallUser MallUser loginMallUser) {
        return ResultGenerator.genSuccessResult(newBeeMallCommentsService.getComments(goodsId, loginMallUser));
    }

}
