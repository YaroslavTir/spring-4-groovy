package spring.groovy.service;

import spring.groovy.domain.Cat;

/**
 * Created by akutuzov on 23.01.14.
 */
public class ShopService {
    private CatShopService catShopService;

    public Cat buyCat() {
        return catShopService.buyCat();
    }

    public void setCatShopService(CatShopService catShopService) {
        this.catShopService = catShopService;
    }
}
