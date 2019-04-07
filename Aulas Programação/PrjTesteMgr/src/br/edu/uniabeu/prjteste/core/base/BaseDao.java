package br.edu.uniabeu.prjteste.core.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.core.NestedRuntimeException;

public abstract class BaseDao {
	@PersistenceContext
	private EntityManager entityManager;

	public BaseDao() {
		super();
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Long getTotalRowsFromTable(String tableName, Map<String, Object> columns)
			throws PersistenceException, NestedRuntimeException {
		StringBuilder sb = new StringBuilder();
		sb.append("select count(t) from ").append(tableName).append(" t ");
		if (columns != null) {
			for (String col : columns.keySet()) {
				sb.append(col).append(" = ").append(":" + col.replace(".", "_"));
			}
		}
		Query query = getEntityManager().createQuery(sb.toString());
		if (columns != null) {
			for (String col : columns.keySet()) {
				String colName = col.replace(".", "_");
				query.setParameter(colName, columns.get(colName));
			}
		}
		Long rows = (Long) query.getSingleResult();
		return rows;
	}

	public Long getTotalRowsFromTable(String tableName) throws PersistenceException, NestedRuntimeException {
		return getTotalRowsFromTable(tableName, null);
	}

	public Date getStringToDateTime(String value, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(value);
	}

	public Date getStringToDate(String value, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(value);
	}

	public String getDateTimeToString(Date value, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(value);
	}
}