package com.tanhua.autoconfig.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
//@Component
@ConfigurationProperties(prefix = "jcc.oss")
public class OssProperties {

    private String accessKey;
    private String secret;
    private String bucketName;
    private String url; //域名
    private String endpoint;
}
