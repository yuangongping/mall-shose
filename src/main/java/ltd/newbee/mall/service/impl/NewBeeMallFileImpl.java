package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.service.NewBeeMallFileService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * description:
 * Created by YGP on 2021-4-15
 */
@Service
public class NewBeeMallFileImpl implements NewBeeMallFileService {

    @Override
    public void getImage(String imageName, HttpServletResponse response){
        FileInputStream fis = null;
        response.setContentType("image/png");
        try {
            OutputStream out = response.getOutputStream();
            File file = new File("D:" + File.separator + "upload" + File.separator + imageName);
            fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            out.write(b);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
