package spring.groovy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import spring.groovy.service.CatShopService;
import spring.groovy.service.ShopService;

/**
 * Created by akutuzov on 23.01.14.
 */
public class Starter {
    public static void main(String[] args) {
        GenericGroovyApplicationContext ctx = new GenericGroovyApplicationContext("classpath:beans.groovy");
        ShopService bean = ctx.getBean(ShopService.class);
        System.out.println(bean.buyCat());
    }

    public static String getEnv() {
        return "MOCK";
    }
}
