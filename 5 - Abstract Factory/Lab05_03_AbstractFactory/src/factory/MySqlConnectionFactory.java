package factory;

import connection.Connection;
import connection.MySqlConnection;

public class MySqlConnectionFactory implements ConnectionFactory {

	  @Override
	  public Connection getConnection() {
	    return new MySqlConnection();
	  }

}
