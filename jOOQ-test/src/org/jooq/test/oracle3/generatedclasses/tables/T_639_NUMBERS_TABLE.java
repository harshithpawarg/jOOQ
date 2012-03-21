/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_639_NUMBERS_TABLE extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1935355743;

	/**
	 * The singleton instance of TEST.T_639_NUMBERS_TABLE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE T_639_NUMBERS_TABLE = new org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE();

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
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * No further instances allowed
	 */
	private T_639_NUMBERS_TABLE() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_639_NUMBERS_TABLE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE(alias);
	}
}
