package com.mausam.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

static SessionFactory factory;
static{
//for Annotation AnnotationConfiguration have annotations support
AnnotationConfiguration cfg = new AnnotationConfiguration();
cfg=(AnnotationConfiguration) cfg.configure();
factory = cfg.buildSessionFactory();


}

public static SessionFactory getSessionFactory(){
	
	return factory;
}

}
