package eternalKurazushi.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.24.0" }, date = "2020-11-11T00:44:56.748+0900")
public class MenuDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements eternalKurazushi.dao.MenuDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.24.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(eternalKurazushi.dao.MenuDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(eternalKurazushi.dao.MenuDao.class, "selectAll");

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(eternalKurazushi.dao.MenuDao.class, "deleteAll");

    /** */
    public MenuDaoImpl() {
        super(eternalKurazushi.dao.RDBConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public MenuDaoImpl(java.sql.Connection connection) {
        super(eternalKurazushi.dao.RDBConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MenuDaoImpl(javax.sql.DataSource dataSource) {
        super(eternalKurazushi.dao.RDBConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MenuDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MenuDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MenuDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int[] insert(java.util.List<eternalKurazushi.model.MenuModel> entities) {
        entering("eternalKurazushi.dao.MenuDaoImpl", "insert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<eternalKurazushi.model.MenuModel> __query = getQueryImplementors().createAutoBatchInsertQuery(__method0, eternalKurazushi.model._MenuModel.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("eternalKurazushi.dao.MenuDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(100);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method0, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("eternalKurazushi.dao.MenuDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("eternalKurazushi.dao.MenuDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<eternalKurazushi.model.MenuModel> selectAll() {
        entering("eternalKurazushi.dao.MenuDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/eternalKurazushi/dao/MenuDao/selectAll.sql");
            __query.setEntityType(eternalKurazushi.model._MenuModel.getSingletonInternal());
            __query.setCallerClassName("eternalKurazushi.dao.MenuDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<eternalKurazushi.model.MenuModel>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<eternalKurazushi.model.MenuModel>(eternalKurazushi.model._MenuModel.getSingletonInternal()));
            java.util.List<eternalKurazushi.model.MenuModel> __result = __command.execute();
            __query.complete();
            exiting("eternalKurazushi.dao.MenuDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("eternalKurazushi.dao.MenuDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int deleteAll() {
        entering("eternalKurazushi.dao.MenuDaoImpl", "deleteAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/eternalKurazushi/dao/MenuDao/deleteAll.sql");
            __query.setCallerClassName("eternalKurazushi.dao.MenuDaoImpl");
            __query.setCallerMethodName("deleteAll");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("eternalKurazushi.dao.MenuDaoImpl", "deleteAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("eternalKurazushi.dao.MenuDaoImpl", "deleteAll", __e);
            throw __e;
        }
    }

}
