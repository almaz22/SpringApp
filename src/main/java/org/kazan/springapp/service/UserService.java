package org.kazan.springapp.service;

import org.kazan.springapp.model.User;

/**
 * Service class for {@link org.kazan.springapp.model.User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
