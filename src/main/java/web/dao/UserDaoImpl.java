package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;



    @Repository
    public class UserDaoImpl implements UserDao{

        private List<User> list;

        {   list = new ArrayList<>();
            list.add(new User("Ivan", "Ivanov", "ivanov@mail.ru"));
            list.add(new User("Petr", "Petrov", "petrov@mail.ru"));
            list.add(new User("Katya", "Fomina", "fomina@mail.ru"));
        }

        @PersistenceContext
        private EntityManager entityManager;

        public void addUser(User user) {
            entityManager.persist(user);
        }

        public List<User> usersList() {
            return entityManager.createQuery("SELECT u FROM User u ", User.class).getResultList();
        }

        public User getUserById(int id) {
            return entityManager.find(User.class, id);
        }

        public void updateUser(User user) {
            entityManager.merge(user);
        }

        public void removeUser(int id) {
            entityManager.remove(getUserById(id));

        }
    }

