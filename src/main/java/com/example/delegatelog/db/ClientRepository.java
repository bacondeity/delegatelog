package com.example.delegatelog.db;
import java.util.List;
import com.example.delegatelog.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByfname(String fname);
}
