package no.group.springdemo.DAO;

import java.util.List;

import no.group.springdemo.entity.Customer;
import no.group.springdemo.util.SortBy;

public interface CustomerDAO {
	public List <Customer> getCustomers(SortBy sortBy);

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

	public List<Customer> searchCustomer(String searchName);
}
