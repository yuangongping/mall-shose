package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.NewBeeMallCommentsMapper;
import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.service.NewBeeMallCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import ltd.newbee.mall.api.mall.vo.NewBeeMallCommentsVo;
/**
 * description:
 * Created by YGP on 2021-4-18
 */
@Service
public class NewBeeMallCommentsImpl implements NewBeeMallCommentsService {
    @Autowired
    NewBeeMallCommentsMapper commentsMapper;


    @Override
    public List<NewBeeMallCommentsVo> getComments(String goodsId, MallUser loginMallUser){
        return commentsMapper.getCommentsByGoodsId(goodsId);
    }

}
