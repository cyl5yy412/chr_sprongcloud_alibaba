package com.chryl.dao;

import com.chryl.po.ChrUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Chr.yl on 2020/6/20.
 *
 * @author Chr.yl
 */
public interface UserDao extends JpaRepository<ChrUser, Integer> {
}
