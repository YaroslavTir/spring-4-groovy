package spring.groovy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spring.groovy.domain.Cat;

/**
 * Created by akutuzov on 23.01.14.
 */
public class CatShopServiceListener {
    private static final Logger log = LoggerFactory.getLogger(CatShopServiceListener.class);
    private String prefix;

    public void buying(Cat cat) {
        log.info(prefix + " {}", cat);
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
