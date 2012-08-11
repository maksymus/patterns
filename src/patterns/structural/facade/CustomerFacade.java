package patterns.structural.facade;

public class CustomerFacade {
	public void createCustomer(int id, String zip, int cardNumber) {
		Account account = new Account();
		Address address = new Address();
		Card card = new Card();
		
		account.setId(id);
		address.setZip(zip);
		card.setNumber(cardNumber);
		
		account.save();
		address.save();
		card.save();
	}
}
