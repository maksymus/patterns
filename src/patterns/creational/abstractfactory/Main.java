package patterns.creational.abstractfactory;

public class Main {
	public static void main(String[] args) {
		DataStoreSelectorAbstractFactory dsAbstractFactory = new DataStoreSelectorAbstractFactory();
		
		DaoFactory mysqlDaoFactory = dsAbstractFactory.getMysqlDaoFactory();
		DaoFactory oracleDaoFactory = dsAbstractFactory.getOracleDaoFactory();
		
		System.out.println(mysqlDaoFactory.getConnection().getConnection());
		System.out.println(oracleDaoFactory.getConnection().getConnection());
	}
}
