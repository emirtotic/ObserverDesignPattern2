package Television;

public class TVStation {

	public static void main(String[] args) {
		
		// Initializing manager and reporters...
		
		Manager manager = new Manager("Mark the Manager");
		
		Reporter r1 = new Reporter("Clara", "Dallas won the last game!");
		Reporter r2 = new Reporter("Steve", "Weather will be super hot tomorrow!");
		Reporter r3 = new Reporter("Joe", "Audi is going to introduce new model soon!");
		
		
		manager.addReporterToTheList(r1);
		manager.addReporterToTheList(r2);
		manager.addReporterToTheList(r3);
		System.out.println(manager);
		
		// Manager is providing all news from reporters...
		
		manager.provideAllNews();
		
		// Printing fixed salary for the reporter
		
		r1.printMySalary();
		
		// Adding new reporter
		
		manager.addNewReporter(new Reporter("Mike", "I am new here, I don't have any news yet..."));
		
		// Providing all news including new reporter's news...

		manager.provideAllNews();
		
		// Oops... Someone is fired...
		
		manager.removeReporter(r2);
		
		// Printing the list without fired reporter...
		
		manager.provideAllNews();
		
		
	}

}
