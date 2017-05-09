package com.dao;

import com.entities.TbManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/6.
 */
public class TbManagerDao {

    private SessionFactory sessionFactory;

    public Session getSession(){
//        return this.sessionFactory.getCurrentSession();
        return this.sessionFactory.openSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<TbManager> getAll(){
        String hql = "from TbManager";
        return getSession().createQuery(hql).list();
    }

    public void save(TbManager tbManager){
        getSession().save(tbManager);
        updateParent(tbManager.getParentInd());
    }

    public void delete(Integer id){
        String hql = "DELETE from TbManager e where e.id = ?";
        getSession().createQuery(hql).setInteger(0, id).executeUpdate();
    }

    public void update(TbManager model, String channel){
        Transaction trans=getSession().beginTransaction();
        String hql = "update TbManager SET Channel = '"+ channel + "' where ID = " + model.getId();
        getSession().createQuery(hql).executeUpdate();
        trans.commit();
    }

    public void updateParent(int id){
        Transaction trans=getSession().beginTransaction();
        String hql = "update TbManager SET ChildNum = ChildNum + 1 where ID = " + id;
        getSession().createQuery(hql).executeUpdate();
        hql = "update TbManager SET IsLeaf = 0 where ID = " + id;
        getSession().createQuery(hql).executeUpdate();
        trans.commit();
    }

    public TbManager get(Integer id){
        return (TbManager) getSession().get(TbManager.class, id);
    }

}
