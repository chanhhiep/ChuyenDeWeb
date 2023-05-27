package com.shoevn.shoe.admin.repository;
import com.shoevn.shoe.Beans.Account;
import com.shoevn.shoe.Beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
    @Query("SELECT u FROM Account u WHERE u.id = ?1")
    public Account findAccountById(long id);
    @Modifying
    @Query("select p from Account p where p.username like ?1 or p.email like ?1 or p.name like ?1")
    public List<Account> searchAccount(String keyword);
}
