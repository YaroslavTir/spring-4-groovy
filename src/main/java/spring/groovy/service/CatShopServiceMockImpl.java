package spring.groovy.service;

import spring.groovy.domain.Cat;

/**
 * Created by akutuzov on 23.01.14.
 */
public class CatShopServiceMockImpl implements CatShopService {

    public CatShopServiceMockImpl() {
    }

    public Cat buyCat() {
        return new Cat("Mocked cat");
    }
}
