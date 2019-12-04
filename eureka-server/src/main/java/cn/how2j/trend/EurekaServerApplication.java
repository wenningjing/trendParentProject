package cn.how2j.trend;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.awt.*;

/**
 * ClassName EurekaServerApplication
 *
 * @Description:
 * @Author: wnj
 * @Date:Create in 19:49 2019/10/25
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
   public static void main(String[] args){
       //8761端口是默认端口
       int port=8761;
       if (!NetUtil.isUsableLocalPort(port)) {

           System.out.printf("端口%d被占用了，无法启动%n",port);
           System.exit(1);
       }
       new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port="+port).run(args);
   }
}
