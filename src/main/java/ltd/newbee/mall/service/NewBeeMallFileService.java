package ltd.newbee.mall.service;

import javax.servlet.http.HttpServletResponse;

/**
 * description:
 * Created by YGP on 2021-4-15
 */
public interface NewBeeMallFileService {
    public void  getImage(String imageName, HttpServletResponse response);
}
