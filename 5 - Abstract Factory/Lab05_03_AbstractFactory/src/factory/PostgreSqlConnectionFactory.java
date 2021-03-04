package factory;

import connection.Connection;
import connection.PostgreSqlConnection;

public class PostgreSqlConnectionFactory implements ConnectionFactory {
	@Override
	  public Connection getConnection() {
	    return new PostgreSqlConnection();
	  }
}
