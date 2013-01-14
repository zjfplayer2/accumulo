/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.data.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class UpdateErrors implements org.apache.thrift.TBase<UpdateErrors, UpdateErrors._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateErrors");

  private static final org.apache.thrift.protocol.TField FAILED_EXTENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("failedExtents", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField VIOLATION_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("violationSummaries", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField AUTHORIZATION_FAILURES_FIELD_DESC = new org.apache.thrift.protocol.TField("authorizationFailures", org.apache.thrift.protocol.TType.LIST, (short)3);

  public Map<TKeyExtent,Long> failedExtents;
  public List<TConstraintViolationSummary> violationSummaries;
  public List<TKeyExtent> authorizationFailures;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FAILED_EXTENTS((short)1, "failedExtents"),
    VIOLATION_SUMMARIES((short)2, "violationSummaries"),
    AUTHORIZATION_FAILURES((short)3, "authorizationFailures");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FAILED_EXTENTS
          return FAILED_EXTENTS;
        case 2: // VIOLATION_SUMMARIES
          return VIOLATION_SUMMARIES;
        case 3: // AUTHORIZATION_FAILURES
          return AUTHORIZATION_FAILURES;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FAILED_EXTENTS, new org.apache.thrift.meta_data.FieldMetaData("failedExtents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKeyExtent.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.VIOLATION_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("violationSummaries", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TConstraintViolationSummary.class))));
    tmpMap.put(_Fields.AUTHORIZATION_FAILURES, new org.apache.thrift.meta_data.FieldMetaData("authorizationFailures", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKeyExtent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateErrors.class, metaDataMap);
  }

  public UpdateErrors() {
  }

  public UpdateErrors(
    Map<TKeyExtent,Long> failedExtents,
    List<TConstraintViolationSummary> violationSummaries,
    List<TKeyExtent> authorizationFailures)
  {
    this();
    this.failedExtents = failedExtents;
    this.violationSummaries = violationSummaries;
    this.authorizationFailures = authorizationFailures;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateErrors(UpdateErrors other) {
    if (other.isSetFailedExtents()) {
      Map<TKeyExtent,Long> __this__failedExtents = new HashMap<TKeyExtent,Long>();
      for (Map.Entry<TKeyExtent, Long> other_element : other.failedExtents.entrySet()) {

        TKeyExtent other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        TKeyExtent __this__failedExtents_copy_key = new TKeyExtent(other_element_key);

        Long __this__failedExtents_copy_value = other_element_value;

        __this__failedExtents.put(__this__failedExtents_copy_key, __this__failedExtents_copy_value);
      }
      this.failedExtents = __this__failedExtents;
    }
    if (other.isSetViolationSummaries()) {
      List<TConstraintViolationSummary> __this__violationSummaries = new ArrayList<TConstraintViolationSummary>();
      for (TConstraintViolationSummary other_element : other.violationSummaries) {
        __this__violationSummaries.add(new TConstraintViolationSummary(other_element));
      }
      this.violationSummaries = __this__violationSummaries;
    }
    if (other.isSetAuthorizationFailures()) {
      List<TKeyExtent> __this__authorizationFailures = new ArrayList<TKeyExtent>();
      for (TKeyExtent other_element : other.authorizationFailures) {
        __this__authorizationFailures.add(new TKeyExtent(other_element));
      }
      this.authorizationFailures = __this__authorizationFailures;
    }
  }

  public UpdateErrors deepCopy() {
    return new UpdateErrors(this);
  }

  @Override
  public void clear() {
    this.failedExtents = null;
    this.violationSummaries = null;
    this.authorizationFailures = null;
  }

  public int getFailedExtentsSize() {
    return (this.failedExtents == null) ? 0 : this.failedExtents.size();
  }

  public void putToFailedExtents(TKeyExtent key, long val) {
    if (this.failedExtents == null) {
      this.failedExtents = new HashMap<TKeyExtent,Long>();
    }
    this.failedExtents.put(key, val);
  }

  public Map<TKeyExtent,Long> getFailedExtents() {
    return this.failedExtents;
  }

  public UpdateErrors setFailedExtents(Map<TKeyExtent,Long> failedExtents) {
    this.failedExtents = failedExtents;
    return this;
  }

  public void unsetFailedExtents() {
    this.failedExtents = null;
  }

  /** Returns true if field failedExtents is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedExtents() {
    return this.failedExtents != null;
  }

  public void setFailedExtentsIsSet(boolean value) {
    if (!value) {
      this.failedExtents = null;
    }
  }

  public int getViolationSummariesSize() {
    return (this.violationSummaries == null) ? 0 : this.violationSummaries.size();
  }

  public java.util.Iterator<TConstraintViolationSummary> getViolationSummariesIterator() {
    return (this.violationSummaries == null) ? null : this.violationSummaries.iterator();
  }

  public void addToViolationSummaries(TConstraintViolationSummary elem) {
    if (this.violationSummaries == null) {
      this.violationSummaries = new ArrayList<TConstraintViolationSummary>();
    }
    this.violationSummaries.add(elem);
  }

  public List<TConstraintViolationSummary> getViolationSummaries() {
    return this.violationSummaries;
  }

  public UpdateErrors setViolationSummaries(List<TConstraintViolationSummary> violationSummaries) {
    this.violationSummaries = violationSummaries;
    return this;
  }

  public void unsetViolationSummaries() {
    this.violationSummaries = null;
  }

  /** Returns true if field violationSummaries is set (has been assigned a value) and false otherwise */
  public boolean isSetViolationSummaries() {
    return this.violationSummaries != null;
  }

  public void setViolationSummariesIsSet(boolean value) {
    if (!value) {
      this.violationSummaries = null;
    }
  }

  public int getAuthorizationFailuresSize() {
    return (this.authorizationFailures == null) ? 0 : this.authorizationFailures.size();
  }

  public java.util.Iterator<TKeyExtent> getAuthorizationFailuresIterator() {
    return (this.authorizationFailures == null) ? null : this.authorizationFailures.iterator();
  }

  public void addToAuthorizationFailures(TKeyExtent elem) {
    if (this.authorizationFailures == null) {
      this.authorizationFailures = new ArrayList<TKeyExtent>();
    }
    this.authorizationFailures.add(elem);
  }

  public List<TKeyExtent> getAuthorizationFailures() {
    return this.authorizationFailures;
  }

  public UpdateErrors setAuthorizationFailures(List<TKeyExtent> authorizationFailures) {
    this.authorizationFailures = authorizationFailures;
    return this;
  }

  public void unsetAuthorizationFailures() {
    this.authorizationFailures = null;
  }

  /** Returns true if field authorizationFailures is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthorizationFailures() {
    return this.authorizationFailures != null;
  }

  public void setAuthorizationFailuresIsSet(boolean value) {
    if (!value) {
      this.authorizationFailures = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FAILED_EXTENTS:
      if (value == null) {
        unsetFailedExtents();
      } else {
        setFailedExtents((Map<TKeyExtent,Long>)value);
      }
      break;

    case VIOLATION_SUMMARIES:
      if (value == null) {
        unsetViolationSummaries();
      } else {
        setViolationSummaries((List<TConstraintViolationSummary>)value);
      }
      break;

    case AUTHORIZATION_FAILURES:
      if (value == null) {
        unsetAuthorizationFailures();
      } else {
        setAuthorizationFailures((List<TKeyExtent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FAILED_EXTENTS:
      return getFailedExtents();

    case VIOLATION_SUMMARIES:
      return getViolationSummaries();

    case AUTHORIZATION_FAILURES:
      return getAuthorizationFailures();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FAILED_EXTENTS:
      return isSetFailedExtents();
    case VIOLATION_SUMMARIES:
      return isSetViolationSummaries();
    case AUTHORIZATION_FAILURES:
      return isSetAuthorizationFailures();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateErrors)
      return this.equals((UpdateErrors)that);
    return false;
  }

  public boolean equals(UpdateErrors that) {
    if (that == null)
      return false;

    boolean this_present_failedExtents = true && this.isSetFailedExtents();
    boolean that_present_failedExtents = true && that.isSetFailedExtents();
    if (this_present_failedExtents || that_present_failedExtents) {
      if (!(this_present_failedExtents && that_present_failedExtents))
        return false;
      if (!this.failedExtents.equals(that.failedExtents))
        return false;
    }

    boolean this_present_violationSummaries = true && this.isSetViolationSummaries();
    boolean that_present_violationSummaries = true && that.isSetViolationSummaries();
    if (this_present_violationSummaries || that_present_violationSummaries) {
      if (!(this_present_violationSummaries && that_present_violationSummaries))
        return false;
      if (!this.violationSummaries.equals(that.violationSummaries))
        return false;
    }

    boolean this_present_authorizationFailures = true && this.isSetAuthorizationFailures();
    boolean that_present_authorizationFailures = true && that.isSetAuthorizationFailures();
    if (this_present_authorizationFailures || that_present_authorizationFailures) {
      if (!(this_present_authorizationFailures && that_present_authorizationFailures))
        return false;
      if (!this.authorizationFailures.equals(that.authorizationFailures))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UpdateErrors other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UpdateErrors typedOther = (UpdateErrors)other;

    lastComparison = Boolean.valueOf(isSetFailedExtents()).compareTo(typedOther.isSetFailedExtents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedExtents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failedExtents, typedOther.failedExtents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViolationSummaries()).compareTo(typedOther.isSetViolationSummaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViolationSummaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.violationSummaries, typedOther.violationSummaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthorizationFailures()).compareTo(typedOther.isSetAuthorizationFailures());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthorizationFailures()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authorizationFailures, typedOther.authorizationFailures);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FAILED_EXTENTS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map25 = iprot.readMapBegin();
              this.failedExtents = new HashMap<TKeyExtent,Long>(2*_map25.size);
              for (int _i26 = 0; _i26 < _map25.size; ++_i26)
              {
                TKeyExtent _key27;
                long _val28;
                _key27 = new TKeyExtent();
                _key27.read(iprot);
                _val28 = iprot.readI64();
                this.failedExtents.put(_key27, _val28);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VIOLATION_SUMMARIES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list29 = iprot.readListBegin();
              this.violationSummaries = new ArrayList<TConstraintViolationSummary>(_list29.size);
              for (int _i30 = 0; _i30 < _list29.size; ++_i30)
              {
                TConstraintViolationSummary _elem31;
                _elem31 = new TConstraintViolationSummary();
                _elem31.read(iprot);
                this.violationSummaries.add(_elem31);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // AUTHORIZATION_FAILURES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
              this.authorizationFailures = new ArrayList<TKeyExtent>(_list32.size);
              for (int _i33 = 0; _i33 < _list32.size; ++_i33)
              {
                TKeyExtent _elem34;
                _elem34 = new TKeyExtent();
                _elem34.read(iprot);
                this.authorizationFailures.add(_elem34);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.failedExtents != null) {
      oprot.writeFieldBegin(FAILED_EXTENTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.I64, this.failedExtents.size()));
        for (Map.Entry<TKeyExtent, Long> _iter35 : this.failedExtents.entrySet())
        {
          _iter35.getKey().write(oprot);
          oprot.writeI64(_iter35.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.violationSummaries != null) {
      oprot.writeFieldBegin(VIOLATION_SUMMARIES_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.violationSummaries.size()));
        for (TConstraintViolationSummary _iter36 : this.violationSummaries)
        {
          _iter36.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.authorizationFailures != null) {
      oprot.writeFieldBegin(AUTHORIZATION_FAILURES_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.authorizationFailures.size()));
        for (TKeyExtent _iter37 : this.authorizationFailures)
        {
          _iter37.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UpdateErrors(");
    boolean first = true;

    sb.append("failedExtents:");
    if (this.failedExtents == null) {
      sb.append("null");
    } else {
      sb.append(this.failedExtents);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("violationSummaries:");
    if (this.violationSummaries == null) {
      sb.append("null");
    } else {
      sb.append(this.violationSummaries);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("authorizationFailures:");
    if (this.authorizationFailures == null) {
      sb.append("null");
    } else {
      sb.append(this.authorizationFailures);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
