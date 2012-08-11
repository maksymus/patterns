package patterns.creational.abstractfactory;

public class MysqlDaoFactory implements DaoFactory {

	public Connection getConnection() {
		return new MysqlConnection();
	}
}
