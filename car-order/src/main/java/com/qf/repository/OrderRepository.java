package com.qf.repository;

import com.qf.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 54110 on 2019/12/11.
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByUserId(Integer userid);
}
