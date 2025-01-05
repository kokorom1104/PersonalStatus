package repository;

import entity.User;

public interface UserRepository {

	void insert(User user);

	boolean delete(String name);

}
