package eternalKurazushi.dao;

import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import io.vavr.Lazy;

@SingletonConfig
public class RDBConfig implements Config {

	private static Lazy<RDBConfig> CONFIG = Lazy.of(RDBConfig::new);

	public static class Configuration {

		public final HikariConfig hikariConfig;

		public Configuration(HikariConfig hikariConfig) {
			super();
			this.hikariConfig = hikariConfig;
		}
	}

	public static void setConfiguration(Configuration configuration) {
		RDBConfig.configuration = configuration;
	}

	static Configuration configuration;

	private final HikariConfig config;

	private final HikariDataSource hikaridataSource;
	private final Dialect dialect;
	private final LocalTransactionDataSource dataSource;
	private final TransactionManager transactionManager;
	private final DomaLogger domaLogger;

	private RDBConfig() {
		super();
		if (configuration == null) {
			config = new HikariConfig();
			ResourceBundle rb = ResourceBundle.getBundle("application");
	    	String dbUrl = rb.getString("rdb.url");
			config.setJdbcUrl(dbUrl);
		} else {
			config = configuration.hikariConfig;
		}
		hikaridataSource = new HikariDataSource(config);

		dataSource = new LocalTransactionDataSource(hikaridataSource);
		domaLogger = new DomaLogger();
		transactionManager = new LocalTransactionManager(dataSource.getLocalTransaction(getJdbcLogger()));
		dialect = new PostgresDialect();
	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}

	@Override
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	@Override
	public JdbcLogger getJdbcLogger() {
		return domaLogger;
	}

	public static RDBConfig singleton() {
		return CONFIG.get();
	}
}
