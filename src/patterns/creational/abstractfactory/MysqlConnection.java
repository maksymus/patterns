package patterns.creational.abstractfactory;

public class MysqlConnection implements Connection {

	public String getConnection() {
		return "mysql";
	}
}
