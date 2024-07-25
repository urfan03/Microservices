package com.urfan.accounts.repository;

import com.urfan.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
