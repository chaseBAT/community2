package com.nowcoder.community.dao.impl;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHibernatelmpl implements AlphaDao {
    @Override
    public String select() {
        return "Hiberbate";
    }
}
