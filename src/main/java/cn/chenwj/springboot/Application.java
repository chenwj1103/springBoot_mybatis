package cn.chenwj.springboot;

import cn.chenwj.springboot.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springBoot启动类
 *
 * @author Chen WeiJie
 * @date 2017-12-07 18:52
 **/
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CountryMapper countryMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        countryMapper.selectAll();
    }
}
