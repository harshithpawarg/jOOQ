/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_DATES extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = -748268541;

	/**
	 * The singleton instance of TEST.T_DATES
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_DATES T_DATES = new org.jooq.test.oracle3.generatedclasses.tables.T_DATES();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> T = createField("T", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * No further instances allowed
	 */
	private T_DATES() {
		super("T_DATES", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_DATES(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DATES;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DATES);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_DATES as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_DATES(alias);
	}
}
