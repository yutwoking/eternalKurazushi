package eternalKurazushi.dao;

import java.util.List;

import org.seasar.doma.BatchInsert;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Select;

import eternalKurazushi.model.MenuModel;

@Dao(config = RDBConfig.class)
public interface MenuDao {

	@BatchInsert(batchSize = 100)
	int[] insert(List<MenuModel> entities);

	@Select
	List<MenuModel> selectAll();

	@Delete(sqlFile = true)
	int deleteAll();

}