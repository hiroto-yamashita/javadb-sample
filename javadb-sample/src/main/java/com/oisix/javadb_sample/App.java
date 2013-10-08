package com.oisix.javadb_sample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = config
				.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		Criteria crit = session.createCriteria(Customer.class);
		List<Customer> list = crit.list();
		for (Customer customer : list) {
			session.delete(customer);
		}

		Customer customer = new Customer();
		customer.id = 1l;
		customer.name = "Yamada";
		customer.address = "Saitama";
		customer.tel = "00-0000-0000";

		session.save(customer);

		list = crit.list();
		for (Customer cust : list) {
			System.out.println(cust.id + ":" + cust.name);
		}
		transaction.commit();
	}
}
