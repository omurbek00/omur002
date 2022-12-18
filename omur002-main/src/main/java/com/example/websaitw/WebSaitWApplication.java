package com.example.websaitw;

import com.example.websaitw.models.repos.PostRepository;
import com.example.websaitw.models.Role;
import com.example.websaitw.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.io.IOException;
import java.util.Base64;
import java.util.Set;

@SpringBootApplication
public class WebSaitWApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSaitWApplication.class, args);
    }
    @Autowired
    PostRepository postRepository;
    @Autowired
    UserService userService;

    @Bean
    public CommandLineRunner bootstrap() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                Role role_admin = new Role("ROLE_ADMIN");
                Role role_user = new Role("ROLE_USER");

                User admin = saveUser("1", "1", "1", role_admin);

                User user = saveUser("boot", "boot", "boot", role_user);



            }

            private User saveUser(String firstname, String lastname, String username_password, Role role_user) throws IOException {
                    User user = new User().setFirstName(firstname)
                            .setLastName(lastname)
                            .setUsername(username_password)
                            .setPassword(username_password)
                            .setRoles(Set.of(role_user));

                    userService.saveUser(user);
                    return user;

            }


        };
    }

}




