package Business;

import Adapters.CustomerCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private CustomerCheckService customerCheckService;
	
	
	public GamerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void add(Gamer gamer) {
     
         if (this.customerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println("Kullanýcý eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
			
		}else {
			System.out.println("Kullanýcý doðrulama baþarýsýz");
		}
	}

	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi"+gamer.getFirstName());
		
	}

	public void update(Gamer gamer) {
		System.out.println("Kullanýcý güncellendi."+gamer.getFirstName());
		
	}

}
