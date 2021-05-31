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
			
			System.out.println("Kullan�c� eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
			
		}else {
			System.out.println("Kullan�c� do�rulama ba�ar�s�z");
		}
	}

	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi"+gamer.getFirstName());
		
	}

	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi."+gamer.getFirstName());
		
	}

}
