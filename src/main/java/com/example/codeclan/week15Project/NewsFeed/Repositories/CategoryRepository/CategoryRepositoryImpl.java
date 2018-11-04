package com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Article> getAllArticlesForCategory(Long categoryId){
        List<Article> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.eq("Category_Id", categoryId));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
}
