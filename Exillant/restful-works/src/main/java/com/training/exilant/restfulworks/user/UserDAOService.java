package com.training.exilant.restfulworks.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	// we r simulating the db
	// it is kept in the list

	private static List<User> users = new ArrayList<>();
	private static int userCount = 103;
	static {
		users.add(new User(101, "Rupa", new Date()));
		users.add(new User(102, "Divya", new Date()));
		users.add(new User(103, "Ankit", new Date()));

	}

	public List<User> getAllUsers() {
		return users;
	}

	public User saveUser(User user) {
		if (user.getUserId() == null) {
			user.setUserId(++userCount);

		}
		users.add(user);
		return user;
	}

	public User getUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	public User deleteUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				 users.remove(user);
			}
		}
		return null;
	}

	public User updateUser(int userId,User user1) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				 users.set(userId, user1);
			}
		}
		return null;
	}
}
