package repository;

import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class JdbcUserRepository implements UserRepository {

	@Override
	public void insert(User user) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean delete(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
