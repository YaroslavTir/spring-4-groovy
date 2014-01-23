package spring.groovy.service;

import spring.groovy.domain.Cat;

/**
 * Created by akutuzov on 23.01.14.
 */
public class CatShopServiceImpl implements CatShopService {
    private int amountOfCats;
    private CatShopServiceListener listener;

    public CatShopServiceImpl(int amountOfCats) {
        this.amountOfCats = amountOfCats;
    }

    public Cat buyCat() {
        if (amountOfCats > 0) {
            Cat cat = new Cat("Meow " + amountOfCats--);
            listener.buying(cat);
            return cat;
        }

        return null;
    }

    public void setListener(CatShopServiceListener listener) {
        this.listener = listener;
    }
}
