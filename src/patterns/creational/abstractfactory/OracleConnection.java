package patterns.creational.abstractfactory;

public class OracleConnection implements Connection {

	public String getConnection() {
		return "oracle";
	}
}
