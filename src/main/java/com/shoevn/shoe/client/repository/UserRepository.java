package com.shoevn.shoe.client.repository;

import com.shoevn.shoe.Beans.Cart;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    @Query("select  u from User u where  u.role =?1")
    public List<User> findAllUserByRole(Role role);
    @Query("select  u from User u where  u.role =?1 and u.id=?2")
    public List<User> findUserByRoleId(String role,long id);
    @Query("select  u from User u where u.id=?1")
    public User findUserById(long id);
    @Query("SELECT u FROM User u WHERE u.role = :role and u.name LIKE CONCAT('%', :name, '%') OR u.email LIKE CONCAT('%', :email, '%')")
    List<User> findAccountBySearchKey(String name, String email,Role role);
}
