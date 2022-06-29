package web.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{

    private List<User> users;

    @PersistenceContext
    EntityManager entityManager;

    
    private static int USER_ID = 0;

    @Override
    public List<User> getUserAll() {
       return entityManager.createQuery("SELECT users from User users",User.class).getResultList();
    }

    @Override
    public User getUserIndex(int index) {
        return entityManager.find(User.class,index);
    }

    @Override
    public void saveUser(User user) {
        user.setId(++USER_ID);
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateUser(int id,User user){
        User updatedUser = getUserIndex(id);
        updatedUser.setName(user.getName());
        updatedUser.setSurName(user.getSurName());
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(x -> x.getId() == id);
    }

    {
        users = new ArrayList<>();

        users.add(new User(++USER_ID,"Dmitry","Zinkin"));
        users.add(new User(++USER_ID,"Alexey","Zinkin"));
        users.add(new User(++USER_ID,"Olga","Zinkina"));

    }

}
