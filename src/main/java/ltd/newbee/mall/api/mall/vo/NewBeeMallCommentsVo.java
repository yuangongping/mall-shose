package ltd.newbee.mall.api.mall.vo;

import lombok.Data;

/**
 * description:
 * Created by YGP on 2021-4-18
 */
@Data
public class NewBeeMallCommentsVo {
    private Long id;

    private String createTime;

    private String updateTime;

    private Long goodsId;

    private String content;

    private Long userId;

    private Long parentId;

    private String userNickName;
}


