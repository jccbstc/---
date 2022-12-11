package com.itheima.test;


import com.tanhua.autoconfig.template.AipFaceTemplate;
import com.tanhua.server.AppServerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppServerApplication.class)
public class FaceTest {
    @Autowired
    private AipFaceTemplate template;
//    //设置APPID/AK/SK
//    public static final String APP_ID = "27838714";
//    public static final String API_KEY = "9vwEwYfpsagpF6fn8ruyhLkX";
//    public static final String SECRET_KEY = "TTItTbGchg78GUYyuLiSEXNcPH2LEGYZ";
//
//    public static void main(String[] args) {
//        // 初始化一个AipFace
//        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
//
//        // 可选：设置网络连接参数
//        client.setConnectionTimeoutInMillis(2000);
//        client.setSocketTimeoutInMillis(60000);
//
//        // 调用接口
//        String image = "https://jcc001.oss-cn-hangzhou.aliyuncs.com/2022/10/10/e660d8b5-7f89-4d94-8850-4b3ad1b37626.png";
//        String imageType = "URL";
//
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("face_field", "age");
//        options.put("max_face_num", "2");
//        options.put("face_type", "LIVE");
//        options.put("liveness_control", "LOW");
//
//        // 人脸检测
//        JSONObject res = client.detect(image, imageType, options);
//        System.out.println(res.toString(2));
//
//    }


    @Test
    public void detectFace() {
        String image = "https://jcc001.oss-cn-hangzhou.aliyuncs.com/2022/10/10/e0c79e2d-2cf9-45ba-a08b-8d73ff8231c9.jpg";
        boolean detect = template.detect(image);
    }
}
