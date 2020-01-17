package com.tak.dubbomock;

import java.util.List;

/**
 * @author Rust
 */
public interface DemoService {
	String sayHello(String name);

	public List<User> getUsers();
}
