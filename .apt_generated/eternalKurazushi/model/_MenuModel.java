package eternalKurazushi.model;

/** */
@javax.annotation.Generated(value = { "Doma", "2.24.0" }, date = "2020-11-11T00:44:56.426+0900")
public final class _MenuModel extends org.seasar.doma.jdbc.entity.AbstractEntityType<eternalKurazushi.model.MenuModel> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.24.0");
    }

    private static final _MenuModel __singleton = new _MenuModel();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.String, java.lang.String> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.StringWrapper::new, false), "name", "name", __namingType, true, true, false);

    /** the price */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.Integer, java.lang.Integer> $price = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new, true), "price", "price", __namingType, true, true, false);

    /** the kcal */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.Integer, java.lang.Integer> $kcal = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new, true), "kcal", "kcal", __namingType, true, true, false);

    /** the area */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.String, java.lang.String> $area = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.StringWrapper::new, false), "area", "area", __namingType, true, true, false);

    /** the takeout */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.Boolean, java.lang.Boolean> $takeout = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.BooleanWrapper::new, true), "takeout", "takeout", __namingType, true, true, false);

    /** the type */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<eternalKurazushi.model.MenuModel, java.lang.String, java.lang.String> $type = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(eternalKurazushi.model.MenuModel.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.StringWrapper::new, false), "type", "type", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<eternalKurazushi.model.MenuModel>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __entityPropertyTypeMap;

    private _MenuModel() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "MenuModel";
        __catalogName = "";
        __schemaName = "";
        __tableName = "menu";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> __map = new java.util.HashMap<>(6);
        __list.add($name);
        __map.put("name", $name);
        __list.add($price);
        __map.put("price", $price);
        __list.add($kcal);
        __map.put("kcal", $kcal);
        __list.add($area);
        __map.put("area", $area);
        __list.add($takeout);
        __map.put("takeout", $takeout);
        __list.add($type);
        __map.put("type", $type);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PreInsertContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PreUpdateContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PreDeleteContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PostInsertContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PostUpdateContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(eternalKurazushi.model.MenuModel entity, org.seasar.doma.jdbc.entity.PostDeleteContext<eternalKurazushi.model.MenuModel> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<eternalKurazushi.model.MenuModel, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<eternalKurazushi.model.MenuModel, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<eternalKurazushi.model.MenuModel, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<eternalKurazushi.model.MenuModel, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public eternalKurazushi.model.MenuModel newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<eternalKurazushi.model.MenuModel, ?>> __args) {
        eternalKurazushi.model.MenuModel entity = new eternalKurazushi.model.MenuModel();
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("price") != null) __args.get("price").save(entity);
        if (__args.get("kcal") != null) __args.get("kcal").save(entity);
        if (__args.get("area") != null) __args.get("area").save(entity);
        if (__args.get("takeout") != null) __args.get("takeout").save(entity);
        if (__args.get("type") != null) __args.get("type").save(entity);
        return entity;
    }

    @Override
    public Class<eternalKurazushi.model.MenuModel> getEntityClass() {
        return eternalKurazushi.model.MenuModel.class;
    }

    @Override
    public eternalKurazushi.model.MenuModel getOriginalStates(eternalKurazushi.model.MenuModel __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(eternalKurazushi.model.MenuModel __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MenuModel getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MenuModel newInstance() {
        return new _MenuModel();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<eternalKurazushi.model.MenuModel> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
