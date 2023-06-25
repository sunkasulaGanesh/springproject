package org.jsp.UseMvc.dao.UserDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.UseMvc.dto.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	EntityManager m;

	public User SaveUser(User user) {
		EntityTransaction t = m.getTransaction();
		m.persist(user);
		t.begin();
		t.commit();
		return user;

	}

	public User UpdateUser(User user) {
		EntityTransaction t = m.getTransaction();
		m.merge(user);
		t.begin();
		t.commit();
		return user;

	}

	@SuppressWarnings("all")
	public List<User> findAllUSer() {
		Query q = m.createQuery("select u from User u");
		return q.getResultList();

	}

	public User GetByID(int id) {
		return m.find(User.class, id);
	}

	public boolean DeleteByID(int id) {
		EntityTransaction t = m.getTransaction();
		User u = m.find(User.class, id);
		if (u != null) {
			m.remove(u);
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}

	@SuppressWarnings("all")
	public User VerifyUser(long phone, String password) {
		Query q = m.createQuery("select u from User u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> users = q.getResultList();
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
