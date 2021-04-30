package ltd.newbee.mall.dao;
import ltd.newbee.mall.api.mall.vo.NewBeeMallCommentsVo;
import java.util.List;

/**
 * description:
 * Created by YGP on 2021-4-18
 */
public interface NewBeeMallCommentsMapper {
    List<NewBeeMallCommentsVo> getCommentsByGoodsId(String goodsIds);
}
