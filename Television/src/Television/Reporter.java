package Television;

public class Reporter implements ReporterInterface {

	private String name;
	private String news;
	private String salary;

	public Reporter() {

	}

	public Reporter(String name, String news) {
		super();
		this.name = name;
		this.news = news;
		this.salary = "800e";
	}

	public String getName() {
		return name;
	}

	public String getNews() {
		return news;
	}

	@Override
	public String toString() {
		return "\nReporter " + getName() + " - " + getNews();
	}

	@Override
	public void printMySalary() {
		System.out.println(this.name + "'s salary is " + this.salary);
		
	}

}
