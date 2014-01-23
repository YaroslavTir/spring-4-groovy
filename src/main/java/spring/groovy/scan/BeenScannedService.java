package spring.groovy.scan;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by akutuzov on 23.01.14.
 */
@Service
public class BeenScannedService {
    @PostConstruct
    public void init() {
        System.out.println("You found me!");
    }
}
