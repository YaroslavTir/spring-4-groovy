import spring.groovy.Starter
import spring.groovy.service.CatShopServiceImpl
import spring.groovy.service.CatShopServiceListener
import spring.groovy.service.CatShopServiceMockImpl
import spring.groovy.service.ShopService

int amountOfCats = 5

beans {
    xmlns context:"http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "spring.groovy.scan")

    catShopService(CatShopServiceImpl, amountOfCats) {
        listener = { CatShopServiceListener cx ->
            prefix = "Buy cats "
        }
    }

    catShopServiceMock(CatShopServiceMockImpl)

    shopService(ShopService) {
        catShopService = ref('catShopService')
        if (Starter.env == "MOCK") {
            catShopService = ref('catShopServiceMock')
        }
    }
}