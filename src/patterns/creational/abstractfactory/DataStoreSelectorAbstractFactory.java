package patterns.creational.abstractfactory;

public class DataStoreSelectorAbstractFactory {
	public DaoFactory getMysqlDaoFactory() {
		return new MysqlDaoFactory();
	}
	
	public DaoFactory getOracleDaoFactory() {
		return new OracleDaoFactory();
	}
}
