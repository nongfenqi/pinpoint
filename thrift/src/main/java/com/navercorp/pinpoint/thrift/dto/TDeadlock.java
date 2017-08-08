/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-16")
public class TDeadlock implements org.apache.thrift.TBase<TDeadlock, TDeadlock._Fields>, java.io.Serializable, Cloneable, Comparable<TDeadlock> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDeadlock");

  private static final org.apache.thrift.protocol.TField DEADLOCKED_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("deadlockedThreadCount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DEADLOCKED_THREAD_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("deadlockedThreadList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDeadlockStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDeadlockTupleSchemeFactory();

  private int deadlockedThreadCount; // optional
  private java.util.List<com.navercorp.pinpoint.thrift.dto.command.TThreadDump> deadlockedThreadList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEADLOCKED_THREAD_COUNT((short)1, "deadlockedThreadCount"),
    DEADLOCKED_THREAD_LIST((short)2, "deadlockedThreadList");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DEADLOCKED_THREAD_COUNT
          return DEADLOCKED_THREAD_COUNT;
        case 2: // DEADLOCKED_THREAD_LIST
          return DEADLOCKED_THREAD_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DEADLOCKEDTHREADCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DEADLOCKED_THREAD_COUNT,_Fields.DEADLOCKED_THREAD_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEADLOCKED_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("deadlockedThreadCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEADLOCKED_THREAD_LIST, new org.apache.thrift.meta_data.FieldMetaData("deadlockedThreadList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.navercorp.pinpoint.thrift.dto.command.TThreadDump.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDeadlock.class, metaDataMap);
  }

  public TDeadlock() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDeadlock(TDeadlock other) {
    __isset_bitfield = other.__isset_bitfield;
    this.deadlockedThreadCount = other.deadlockedThreadCount;
    if (other.isSetDeadlockedThreadList()) {
      java.util.List<com.navercorp.pinpoint.thrift.dto.command.TThreadDump> __this__deadlockedThreadList = new java.util.ArrayList<com.navercorp.pinpoint.thrift.dto.command.TThreadDump>(other.deadlockedThreadList.size());
      for (com.navercorp.pinpoint.thrift.dto.command.TThreadDump other_element : other.deadlockedThreadList) {
        __this__deadlockedThreadList.add(new com.navercorp.pinpoint.thrift.dto.command.TThreadDump(other_element));
      }
      this.deadlockedThreadList = __this__deadlockedThreadList;
    }
  }

  public TDeadlock deepCopy() {
    return new TDeadlock(this);
  }

  @Override
  public void clear() {
    setDeadlockedThreadCountIsSet(false);
    this.deadlockedThreadCount = 0;
    this.deadlockedThreadList = null;
  }

  public int getDeadlockedThreadCount() {
    return this.deadlockedThreadCount;
  }

  public void setDeadlockedThreadCount(int deadlockedThreadCount) {
    this.deadlockedThreadCount = deadlockedThreadCount;
    setDeadlockedThreadCountIsSet(true);
  }

  public void unsetDeadlockedThreadCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DEADLOCKEDTHREADCOUNT_ISSET_ID);
  }

  /** Returns true if field deadlockedThreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetDeadlockedThreadCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DEADLOCKEDTHREADCOUNT_ISSET_ID);
  }

  public void setDeadlockedThreadCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DEADLOCKEDTHREADCOUNT_ISSET_ID, value);
  }

  public int getDeadlockedThreadListSize() {
    return (this.deadlockedThreadList == null) ? 0 : this.deadlockedThreadList.size();
  }

  public java.util.Iterator<com.navercorp.pinpoint.thrift.dto.command.TThreadDump> getDeadlockedThreadListIterator() {
    return (this.deadlockedThreadList == null) ? null : this.deadlockedThreadList.iterator();
  }

  public void addToDeadlockedThreadList(com.navercorp.pinpoint.thrift.dto.command.TThreadDump elem) {
    if (this.deadlockedThreadList == null) {
      this.deadlockedThreadList = new java.util.ArrayList<com.navercorp.pinpoint.thrift.dto.command.TThreadDump>();
    }
    this.deadlockedThreadList.add(elem);
  }

  public java.util.List<com.navercorp.pinpoint.thrift.dto.command.TThreadDump> getDeadlockedThreadList() {
    return this.deadlockedThreadList;
  }

  public void setDeadlockedThreadList(java.util.List<com.navercorp.pinpoint.thrift.dto.command.TThreadDump> deadlockedThreadList) {
    this.deadlockedThreadList = deadlockedThreadList;
  }

  public void unsetDeadlockedThreadList() {
    this.deadlockedThreadList = null;
  }

  /** Returns true if field deadlockedThreadList is set (has been assigned a value) and false otherwise */
  public boolean isSetDeadlockedThreadList() {
    return this.deadlockedThreadList != null;
  }

  public void setDeadlockedThreadListIsSet(boolean value) {
    if (!value) {
      this.deadlockedThreadList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DEADLOCKED_THREAD_COUNT:
      if (value == null) {
        unsetDeadlockedThreadCount();
      } else {
        setDeadlockedThreadCount((java.lang.Integer)value);
      }
      break;

    case DEADLOCKED_THREAD_LIST:
      if (value == null) {
        unsetDeadlockedThreadList();
      } else {
        setDeadlockedThreadList((java.util.List<com.navercorp.pinpoint.thrift.dto.command.TThreadDump>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DEADLOCKED_THREAD_COUNT:
      return getDeadlockedThreadCount();

    case DEADLOCKED_THREAD_LIST:
      return getDeadlockedThreadList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DEADLOCKED_THREAD_COUNT:
      return isSetDeadlockedThreadCount();
    case DEADLOCKED_THREAD_LIST:
      return isSetDeadlockedThreadList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDeadlock)
      return this.equals((TDeadlock)that);
    return false;
  }

  public boolean equals(TDeadlock that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_deadlockedThreadCount = true && this.isSetDeadlockedThreadCount();
    boolean that_present_deadlockedThreadCount = true && that.isSetDeadlockedThreadCount();
    if (this_present_deadlockedThreadCount || that_present_deadlockedThreadCount) {
      if (!(this_present_deadlockedThreadCount && that_present_deadlockedThreadCount))
        return false;
      if (this.deadlockedThreadCount != that.deadlockedThreadCount)
        return false;
    }

    boolean this_present_deadlockedThreadList = true && this.isSetDeadlockedThreadList();
    boolean that_present_deadlockedThreadList = true && that.isSetDeadlockedThreadList();
    if (this_present_deadlockedThreadList || that_present_deadlockedThreadList) {
      if (!(this_present_deadlockedThreadList && that_present_deadlockedThreadList))
        return false;
      if (!this.deadlockedThreadList.equals(that.deadlockedThreadList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDeadlockedThreadCount()) ? 131071 : 524287);
    if (isSetDeadlockedThreadCount())
      hashCode = hashCode * 8191 + deadlockedThreadCount;

    hashCode = hashCode * 8191 + ((isSetDeadlockedThreadList()) ? 131071 : 524287);
    if (isSetDeadlockedThreadList())
      hashCode = hashCode * 8191 + deadlockedThreadList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDeadlock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDeadlockedThreadCount()).compareTo(other.isSetDeadlockedThreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeadlockedThreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deadlockedThreadCount, other.deadlockedThreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDeadlockedThreadList()).compareTo(other.isSetDeadlockedThreadList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeadlockedThreadList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deadlockedThreadList, other.deadlockedThreadList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDeadlock(");
    boolean first = true;

    if (isSetDeadlockedThreadCount()) {
      sb.append("deadlockedThreadCount:");
      sb.append(this.deadlockedThreadCount);
      first = false;
    }
    if (isSetDeadlockedThreadList()) {
      if (!first) sb.append(", ");
      sb.append("deadlockedThreadList:");
      if (this.deadlockedThreadList == null) {
        sb.append("null");
      } else {
        sb.append(this.deadlockedThreadList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDeadlockStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDeadlockStandardScheme getScheme() {
      return new TDeadlockStandardScheme();
    }
  }

  private static class TDeadlockStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDeadlock> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDeadlock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEADLOCKED_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.deadlockedThreadCount = iprot.readI32();
              struct.setDeadlockedThreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEADLOCKED_THREAD_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.deadlockedThreadList = new java.util.ArrayList<com.navercorp.pinpoint.thrift.dto.command.TThreadDump>(_list32.size);
                com.navercorp.pinpoint.thrift.dto.command.TThreadDump _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new com.navercorp.pinpoint.thrift.dto.command.TThreadDump();
                  _elem33.read(iprot);
                  struct.deadlockedThreadList.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setDeadlockedThreadListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDeadlock struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetDeadlockedThreadCount()) {
        oprot.writeFieldBegin(DEADLOCKED_THREAD_COUNT_FIELD_DESC);
        oprot.writeI32(struct.deadlockedThreadCount);
        oprot.writeFieldEnd();
      }
      if (struct.deadlockedThreadList != null) {
        if (struct.isSetDeadlockedThreadList()) {
          oprot.writeFieldBegin(DEADLOCKED_THREAD_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.deadlockedThreadList.size()));
            for (com.navercorp.pinpoint.thrift.dto.command.TThreadDump _iter35 : struct.deadlockedThreadList)
            {
              _iter35.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDeadlockTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDeadlockTupleScheme getScheme() {
      return new TDeadlockTupleScheme();
    }
  }

  private static class TDeadlockTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDeadlock> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDeadlock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDeadlockedThreadCount()) {
        optionals.set(0);
      }
      if (struct.isSetDeadlockedThreadList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDeadlockedThreadCount()) {
        oprot.writeI32(struct.deadlockedThreadCount);
      }
      if (struct.isSetDeadlockedThreadList()) {
        {
          oprot.writeI32(struct.deadlockedThreadList.size());
          for (com.navercorp.pinpoint.thrift.dto.command.TThreadDump _iter36 : struct.deadlockedThreadList)
          {
            _iter36.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDeadlock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.deadlockedThreadCount = iprot.readI32();
        struct.setDeadlockedThreadCountIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.deadlockedThreadList = new java.util.ArrayList<com.navercorp.pinpoint.thrift.dto.command.TThreadDump>(_list37.size);
          com.navercorp.pinpoint.thrift.dto.command.TThreadDump _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new com.navercorp.pinpoint.thrift.dto.command.TThreadDump();
            _elem38.read(iprot);
            struct.deadlockedThreadList.add(_elem38);
          }
        }
        struct.setDeadlockedThreadListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

