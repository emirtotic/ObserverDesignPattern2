package Television;

import java.util.ArrayList;
import java.util.List;

public class Manager implements ManagerInterface {

	private String name;
	private List<Reporter> reporters;

	public Manager() {

	}

	public Manager(String name) {
		super();
		this.name = name;
		this.reporters = new ArrayList<Reporter>();
	}

	public List<Reporter> getReporters() {
		return reporters;
	}

	@Override
	public void getAllNewsFromReporters() {
		for (Reporter reporter : reporters) {
			reporter.getNews();
		}
	}

	@Override
	public void provideAllNews() {
		getAllNewsFromReporters();
		System.out.println(reporters);

	}

	@Override
	public void addReporterToTheList(Reporter reporter) {

		reporters.add(reporter);

	}

	@Override
	public void removeReporter(Reporter reporter) {
		reporters.remove(reporter);
	}

	@Override
	public String toString() {
		return this.name + " reports from all reporters: \n";
	}

	@Override
	public void addNewReporter(Reporter reporter) {
		addReporterToTheList(reporter);
	}

}
