package eternalKurazushi.dao;

import org.seasar.doma.jdbc.Sql;
import org.seasar.doma.jdbc.UtilLoggingJdbcLogger;

import java.util.function.Supplier;
import java.util.logging.Level;

public class DomaLogger extends UtilLoggingJdbcLogger {
	public DomaLogger() {
		super(Level.FINE);
	}

	@Override
	protected void logSql(String callerClassName, String callerMethodName, Sql<?> sql, Level level,
			Supplier<String> messageSupplier) {
		if(level.intValue() >= Level.WARNING.intValue())
			super.logSql(callerClassName, callerMethodName, sql, level, messageSupplier);
	}

	@Override
	protected void log(Level level, String callerClassName, String callerMethodName, Throwable throwable,
			Supplier<String> messageSupplier) {
		if(level.intValue() >= Level.WARNING.intValue())
			super.log(level, callerClassName, callerMethodName, throwable, messageSupplier);
	}
}
