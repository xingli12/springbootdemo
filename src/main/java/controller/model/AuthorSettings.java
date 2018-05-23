package controller.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springbootdemo
 * @Package: controller.model
 * @Author: xingli12
 * @Description:
 * @Date: Created in 2018-05-23 11:30
 * @Modified By:
 * @UpdateDate:
 * @Version:
 */
@Component
@ConfigurationProperties(prefix = "author",locations = {"classpath:config/author.properties"})
public class AuthorSettings {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
