package com.doan.AppTuyenDung.Repositories.AllCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doan.AppTuyenDung.entity.CodeRule;

@Repository
public interface CodeRulesRepository extends JpaRepository<CodeRule,String> {
    
}
