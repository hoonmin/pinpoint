/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.profiler.common.dto.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class Annotation implements org.apache.thrift.TBase<Annotation, Annotation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Annotation");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField KEY2_FIELD_DESC = new org.apache.thrift.protocol.TField("key2", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_TYPE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("valueTypeCode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnotationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnotationTupleSchemeFactory());
  }

  private int key; // required
  private String key2; // optional
  private int valueTypeCode; // required
  private ByteBuffer value; // optional
  private long timestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    KEY2((short)2, "key2"),
    VALUE_TYPE_CODE((short)3, "valueTypeCode"),
    VALUE((short)4, "value"),
    TIMESTAMP((short)5, "timestamp");

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
        case 1: // KEY
          return KEY;
        case 2: // KEY2
          return KEY2;
        case 3: // VALUE_TYPE_CODE
          return VALUE_TYPE_CODE;
        case 4: // VALUE
          return VALUE;
        case 5: // TIMESTAMP
          return TIMESTAMP;
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
  private static final int __KEY_ISSET_ID = 0;
  private static final int __VALUETYPECODE_ISSET_ID = 1;
  private static final int __TIMESTAMP_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);
  private _Fields optionals[] = {_Fields.KEY2,_Fields.VALUE,_Fields.TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.KEY2, new org.apache.thrift.meta_data.FieldMetaData("key2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE_TYPE_CODE, new org.apache.thrift.meta_data.FieldMetaData("valueTypeCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Annotation.class, metaDataMap);
  }

  public Annotation() {
  }

  public Annotation(
    int key,
    int valueTypeCode)
  {
    this();
    this.key = key;
    setKeyIsSet(true);
    this.valueTypeCode = valueTypeCode;
    setValueTypeCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Annotation(Annotation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.key = other.key;
    if (other.isSetKey2()) {
      this.key2 = other.key2;
    }
    this.valueTypeCode = other.valueTypeCode;
    if (other.isSetValue()) {
      this.value = org.apache.thrift.TBaseHelper.copyBinary(other.value);
;
    }
    this.timestamp = other.timestamp;
  }

  public Annotation deepCopy() {
    return new Annotation(this);
  }

  @Override
  public void clear() {
    setKeyIsSet(false);
    this.key = 0;
    this.key2 = null;
    setValueTypeCodeIsSet(false);
    this.valueTypeCode = 0;
    this.value = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public int getKey() {
    return this.key;
  }

  public void setKey(int key) {
    this.key = key;
    setKeyIsSet(true);
  }

  public void unsetKey() {
    __isset_bit_vector.clear(__KEY_ISSET_ID);
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return __isset_bit_vector.get(__KEY_ISSET_ID);
  }

  public void setKeyIsSet(boolean value) {
    __isset_bit_vector.set(__KEY_ISSET_ID, value);
  }

  public String getKey2() {
    return this.key2;
  }

  public void setKey2(String key2) {
    this.key2 = key2;
  }

  public void unsetKey2() {
    this.key2 = null;
  }

  /** Returns true if field key2 is set (has been assigned a value) and false otherwise */
  public boolean isSetKey2() {
    return this.key2 != null;
  }

  public void setKey2IsSet(boolean value) {
    if (!value) {
      this.key2 = null;
    }
  }

  public int getValueTypeCode() {
    return this.valueTypeCode;
  }

  public void setValueTypeCode(int valueTypeCode) {
    this.valueTypeCode = valueTypeCode;
    setValueTypeCodeIsSet(true);
  }

  public void unsetValueTypeCode() {
    __isset_bit_vector.clear(__VALUETYPECODE_ISSET_ID);
  }

  /** Returns true if field valueTypeCode is set (has been assigned a value) and false otherwise */
  public boolean isSetValueTypeCode() {
    return __isset_bit_vector.get(__VALUETYPECODE_ISSET_ID);
  }

  public void setValueTypeCodeIsSet(boolean value) {
    __isset_bit_vector.set(__VALUETYPECODE_ISSET_ID, value);
  }

  public byte[] getValue() {
    setValue(org.apache.thrift.TBaseHelper.rightSize(value));
    return value == null ? null : value.array();
  }

  public ByteBuffer bufferForValue() {
    return value;
  }

  public void setValue(byte[] value) {
    setValue(value == null ? (ByteBuffer)null : ByteBuffer.wrap(value));
  }

  public void setValue(ByteBuffer value) {
    this.value = value;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((Integer)value);
      }
      break;

    case KEY2:
      if (value == null) {
        unsetKey2();
      } else {
        setKey2((String)value);
      }
      break;

    case VALUE_TYPE_CODE:
      if (value == null) {
        unsetValueTypeCode();
      } else {
        setValueTypeCode((Integer)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ByteBuffer)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return Integer.valueOf(getKey());

    case KEY2:
      return getKey2();

    case VALUE_TYPE_CODE:
      return Integer.valueOf(getValueTypeCode());

    case VALUE:
      return getValue();

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case KEY2:
      return isSetKey2();
    case VALUE_TYPE_CODE:
      return isSetValueTypeCode();
    case VALUE:
      return isSetValue();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Annotation)
      return this.equals((Annotation)that);
    return false;
  }

  public boolean equals(Annotation that) {
    if (that == null)
      return false;

    boolean this_present_key = true;
    boolean that_present_key = true;
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (this.key != that.key)
        return false;
    }

    boolean this_present_key2 = true && this.isSetKey2();
    boolean that_present_key2 = true && that.isSetKey2();
    if (this_present_key2 || that_present_key2) {
      if (!(this_present_key2 && that_present_key2))
        return false;
      if (!this.key2.equals(that.key2))
        return false;
    }

    boolean this_present_valueTypeCode = true;
    boolean that_present_valueTypeCode = true;
    if (this_present_valueTypeCode || that_present_valueTypeCode) {
      if (!(this_present_valueTypeCode && that_present_valueTypeCode))
        return false;
      if (this.valueTypeCode != that.valueTypeCode)
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Annotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Annotation typedOther = (Annotation)other;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, typedOther.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey2()).compareTo(typedOther.isSetKey2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key2, typedOther.key2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueTypeCode()).compareTo(typedOther.isSetValueTypeCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueTypeCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueTypeCode, typedOther.valueTypeCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Annotation(");
    boolean first = true;

    sb.append("key:");
    sb.append(this.key);
    first = false;
    if (isSetKey2()) {
      if (!first) sb.append(", ");
      sb.append("key2:");
      if (this.key2 == null) {
        sb.append("null");
      } else {
        sb.append(this.key2);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("valueTypeCode:");
    sb.append(this.valueTypeCode);
    first = false;
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.value, sb);
      }
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnnotationStandardSchemeFactory implements SchemeFactory {
    public AnnotationStandardScheme getScheme() {
      return new AnnotationStandardScheme();
    }
  }

  private static class AnnotationStandardScheme extends StandardScheme<Annotation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Annotation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.key = iprot.readI32();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key2 = iprot.readString();
              struct.setKey2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE_TYPE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.valueTypeCode = iprot.readI32();
              struct.setValueTypeCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readBinary();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Annotation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(KEY_FIELD_DESC);
      oprot.writeI32(struct.key);
      oprot.writeFieldEnd();
      if (struct.key2 != null) {
        if (struct.isSetKey2()) {
          oprot.writeFieldBegin(KEY2_FIELD_DESC);
          oprot.writeString(struct.key2);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(VALUE_TYPE_CODE_FIELD_DESC);
      oprot.writeI32(struct.valueTypeCode);
      oprot.writeFieldEnd();
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeBinary(struct.value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnotationTupleSchemeFactory implements SchemeFactory {
    public AnnotationTupleScheme getScheme() {
      return new AnnotationTupleScheme();
    }
  }

  private static class AnnotationTupleScheme extends TupleScheme<Annotation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Annotation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetKey2()) {
        optionals.set(1);
      }
      if (struct.isSetValueTypeCode()) {
        optionals.set(2);
      }
      if (struct.isSetValue()) {
        optionals.set(3);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetKey()) {
        oprot.writeI32(struct.key);
      }
      if (struct.isSetKey2()) {
        oprot.writeString(struct.key2);
      }
      if (struct.isSetValueTypeCode()) {
        oprot.writeI32(struct.valueTypeCode);
      }
      if (struct.isSetValue()) {
        oprot.writeBinary(struct.value);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Annotation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.key = iprot.readI32();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.key2 = iprot.readString();
        struct.setKey2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.valueTypeCode = iprot.readI32();
        struct.setValueTypeCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.value = iprot.readBinary();
        struct.setValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

}

