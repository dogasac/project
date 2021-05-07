package managers;

import Entities.Campaing;
import interfaces.CampaingService;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " added with" +campaing.getDiscountAmount() );	
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Campaing deleted : " + campaing.getCampaingName());
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " updated with " + campaing.getDiscountAmount());
		
	}
	
	

	

}
