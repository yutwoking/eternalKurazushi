package eternalKurazushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eternalKurazushi.cache.MenuCaches;

@SpringBootApplication
public class ServerLuncher {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerLuncher.class, args);
        LoadMenu.init();
        MenuCaches.getSingleton().load();
    }


}
