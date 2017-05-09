package com.services;

import com.dao.TbManagerDao;
import com.entities.TbManager;

import java.util.List;

/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/6.
 */
public class TbManagerService {

    private TbManagerDao tbManagerDao;

    public List<TbManager> getAll(){
        return tbManagerDao.getAll();
    }

    public void setTbManagerDao(TbManagerDao tbManagerDao){
        this.tbManagerDao = tbManagerDao;
    }

    public void save(TbManager tbManager) {
        tbManagerDao.save(tbManager);
    }

    public void delete(Integer id){
        tbManagerDao.delete(id);
    }

    public void update(TbManager model, String channel){
        tbManagerDao.update(model, channel);
    }

    public TbManager get(Integer id){
        return tbManagerDao.get(id);
    }

}
