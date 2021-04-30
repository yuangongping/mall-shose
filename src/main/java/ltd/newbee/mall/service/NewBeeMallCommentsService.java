package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.api.mall.vo.NewBeeMallCommentsVo;

import java.util.List;

/**
 * description:
 * Created by YGP on 2021-4-18
 */
public interface NewBeeMallCommentsService {
    List<NewBeeMallCommentsVo> getComments(String goodsId, MallUser loginMallUser);
}
