package patterns.creational.abstractfactory;

public class OracleDaoFactory implements DaoFactory {

	public Connection getConnection() {
		return new OracleConnection();
	}
}
