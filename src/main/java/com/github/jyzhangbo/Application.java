package com.github.jyzhangbo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

/**
 * @author zhangbo
 *
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
      ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

      String[] profiles = run.getEnvironment().getActiveProfiles();

      Arrays.stream(profiles).forEach(obj -> System.out.println(obj));
  }

}
