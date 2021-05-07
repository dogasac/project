package managers;

import Entities.Sale;
import interfaces.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getDiscount() + " discount added ");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getDiscount() + " discount has already deleted");
		
	}
	

}
