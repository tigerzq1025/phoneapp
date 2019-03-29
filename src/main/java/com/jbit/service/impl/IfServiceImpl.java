package com.jbit.service.impl;

import com.jbit.dao.InformationsDao;
import com.jbit.entity.Informations;
import com.jbit.service.IfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ifService")
public class IfServiceImpl implements IfService {
    @Resource
    public InformationsDao informationsDao;

    @Override
    public List<Informations> findAllIf() {
        return informationsDao.selectAll();
    }

    @Override
    public Informations findOneIf(Long id) {
        Informations informations=new Informations();
        informations.set;
        return informationsDao.selectByPrimaryKey(informations);
    }
}
