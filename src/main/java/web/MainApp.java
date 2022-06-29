package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.HibernateConfig;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);

        UserDao userDao = context.getBean(UserDao.class);

        List<User> userList = userDao.getUserAll();

        for (User user:userList) {
            user.toString();
        }

    }
}
