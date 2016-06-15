package com.dianping.pigeon.remoting.common.domain.generic.thrift; /**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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

public class TraceInfo implements org.apache.thrift.TBase<TraceInfo, TraceInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TraceInfo");

  private static final org.apache.thrift.protocol.TField CLIENT_APPKEY_FIELD_DESC = new org.apache.thrift.protocol.TField("clientAppkey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traceId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPAN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("spanId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ROOT_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("rootMessageId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CURRENT_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("currentMessageId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SERVER_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverMessageId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField SAMPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sample", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TraceInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TraceInfoTupleSchemeFactory());
  }

  public String clientAppkey; // required
  public String traceId; // optional
  public String spanId; // optional
  public String rootMessageId; // optional
  public String currentMessageId; // optional
  public String serverMessageId; // optional
  public boolean debug; // optional
  public boolean sample; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENT_APPKEY((short)1, "clientAppkey"),
    TRACE_ID((short)2, "traceId"),
    SPAN_ID((short)3, "spanId"),
    ROOT_MESSAGE_ID((short)4, "rootMessageId"),
    CURRENT_MESSAGE_ID((short)5, "currentMessageId"),
    SERVER_MESSAGE_ID((short)6, "serverMessageId"),
    DEBUG((short)7, "debug"),
    SAMPLE((short)8, "sample");

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
        case 1: // CLIENT_APPKEY
          return CLIENT_APPKEY;
        case 2: // TRACE_ID
          return TRACE_ID;
        case 3: // SPAN_ID
          return SPAN_ID;
        case 4: // ROOT_MESSAGE_ID
          return ROOT_MESSAGE_ID;
        case 5: // CURRENT_MESSAGE_ID
          return CURRENT_MESSAGE_ID;
        case 6: // SERVER_MESSAGE_ID
          return SERVER_MESSAGE_ID;
        case 7: // DEBUG
          return DEBUG;
        case 8: // SAMPLE
          return SAMPLE;
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
  private static final int __DEBUG_ISSET_ID = 0;
  private static final int __SAMPLE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.TRACE_ID,_Fields.SPAN_ID,_Fields.ROOT_MESSAGE_ID,_Fields.CURRENT_MESSAGE_ID,_Fields.SERVER_MESSAGE_ID,_Fields.DEBUG,_Fields.SAMPLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_APPKEY, new org.apache.thrift.meta_data.FieldMetaData("clientAppkey", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("traceId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPAN_ID, new org.apache.thrift.meta_data.FieldMetaData("spanId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROOT_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("rootMessageId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURRENT_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("currentMessageId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("serverMessageId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SAMPLE, new org.apache.thrift.meta_data.FieldMetaData("sample", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TraceInfo.class, metaDataMap);
  }

  public TraceInfo() {
  }

  public TraceInfo(
    String clientAppkey)
  {
    this();
    this.clientAppkey = clientAppkey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TraceInfo(TraceInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetClientAppkey()) {
      this.clientAppkey = other.clientAppkey;
    }
    if (other.isSetTraceId()) {
      this.traceId = other.traceId;
    }
    if (other.isSetSpanId()) {
      this.spanId = other.spanId;
    }
    if (other.isSetRootMessageId()) {
      this.rootMessageId = other.rootMessageId;
    }
    if (other.isSetCurrentMessageId()) {
      this.currentMessageId = other.currentMessageId;
    }
    if (other.isSetServerMessageId()) {
      this.serverMessageId = other.serverMessageId;
    }
    this.debug = other.debug;
    this.sample = other.sample;
  }

  public TraceInfo deepCopy() {
    return new TraceInfo(this);
  }

  @Override
  public void clear() {
    this.clientAppkey = null;
    this.traceId = null;
    this.spanId = null;
    this.rootMessageId = null;
    this.currentMessageId = null;
    this.serverMessageId = null;
    setDebugIsSet(false);
    this.debug = false;
    setSampleIsSet(false);
    this.sample = false;
  }

  public String getClientAppkey() {
    return this.clientAppkey;
  }

  public TraceInfo setClientAppkey(String clientAppkey) {
    this.clientAppkey = clientAppkey;
    return this;
  }

  public void unsetClientAppkey() {
    this.clientAppkey = null;
  }

  /** Returns true if field clientAppkey is set (has been assigned a value) and false otherwise */
  public boolean isSetClientAppkey() {
    return this.clientAppkey != null;
  }

  public void setClientAppkeyIsSet(boolean value) {
    if (!value) {
      this.clientAppkey = null;
    }
  }

  public String getTraceId() {
    return this.traceId;
  }

  public TraceInfo setTraceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  public void unsetTraceId() {
    this.traceId = null;
  }

  /** Returns true if field traceId is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceId() {
    return this.traceId != null;
  }

  public void setTraceIdIsSet(boolean value) {
    if (!value) {
      this.traceId = null;
    }
  }

  public String getSpanId() {
    return this.spanId;
  }

  public TraceInfo setSpanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  public void unsetSpanId() {
    this.spanId = null;
  }

  /** Returns true if field spanId is set (has been assigned a value) and false otherwise */
  public boolean isSetSpanId() {
    return this.spanId != null;
  }

  public void setSpanIdIsSet(boolean value) {
    if (!value) {
      this.spanId = null;
    }
  }

  public String getRootMessageId() {
    return this.rootMessageId;
  }

  public TraceInfo setRootMessageId(String rootMessageId) {
    this.rootMessageId = rootMessageId;
    return this;
  }

  public void unsetRootMessageId() {
    this.rootMessageId = null;
  }

  /** Returns true if field rootMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetRootMessageId() {
    return this.rootMessageId != null;
  }

  public void setRootMessageIdIsSet(boolean value) {
    if (!value) {
      this.rootMessageId = null;
    }
  }

  public String getCurrentMessageId() {
    return this.currentMessageId;
  }

  public TraceInfo setCurrentMessageId(String currentMessageId) {
    this.currentMessageId = currentMessageId;
    return this;
  }

  public void unsetCurrentMessageId() {
    this.currentMessageId = null;
  }

  /** Returns true if field currentMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentMessageId() {
    return this.currentMessageId != null;
  }

  public void setCurrentMessageIdIsSet(boolean value) {
    if (!value) {
      this.currentMessageId = null;
    }
  }

  public String getServerMessageId() {
    return this.serverMessageId;
  }

  public TraceInfo setServerMessageId(String serverMessageId) {
    this.serverMessageId = serverMessageId;
    return this;
  }

  public void unsetServerMessageId() {
    this.serverMessageId = null;
  }

  /** Returns true if field serverMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetServerMessageId() {
    return this.serverMessageId != null;
  }

  public void setServerMessageIdIsSet(boolean value) {
    if (!value) {
      this.serverMessageId = null;
    }
  }

  public boolean isDebug() {
    return this.debug;
  }

  public TraceInfo setDebug(boolean debug) {
    this.debug = debug;
    setDebugIsSet(true);
    return this;
  }

  public void unsetDebug() {
    __isset_bit_vector.clear(__DEBUG_ISSET_ID);
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean isSetDebug() {
    return __isset_bit_vector.get(__DEBUG_ISSET_ID);
  }

  public void setDebugIsSet(boolean value) {
    __isset_bit_vector.set(__DEBUG_ISSET_ID, value);
  }

  public boolean isSample() {
    return this.sample;
  }

  public TraceInfo setSample(boolean sample) {
    this.sample = sample;
    setSampleIsSet(true);
    return this;
  }

  public void unsetSample() {
    __isset_bit_vector.clear(__SAMPLE_ISSET_ID);
  }

  /** Returns true if field sample is set (has been assigned a value) and false otherwise */
  public boolean isSetSample() {
    return __isset_bit_vector.get(__SAMPLE_ISSET_ID);
  }

  public void setSampleIsSet(boolean value) {
    __isset_bit_vector.set(__SAMPLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLIENT_APPKEY:
      if (value == null) {
        unsetClientAppkey();
      } else {
        setClientAppkey((String)value);
      }
      break;

    case TRACE_ID:
      if (value == null) {
        unsetTraceId();
      } else {
        setTraceId((String)value);
      }
      break;

    case SPAN_ID:
      if (value == null) {
        unsetSpanId();
      } else {
        setSpanId((String)value);
      }
      break;

    case ROOT_MESSAGE_ID:
      if (value == null) {
        unsetRootMessageId();
      } else {
        setRootMessageId((String)value);
      }
      break;

    case CURRENT_MESSAGE_ID:
      if (value == null) {
        unsetCurrentMessageId();
      } else {
        setCurrentMessageId((String)value);
      }
      break;

    case SERVER_MESSAGE_ID:
      if (value == null) {
        unsetServerMessageId();
      } else {
        setServerMessageId((String)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((Boolean)value);
      }
      break;

    case SAMPLE:
      if (value == null) {
        unsetSample();
      } else {
        setSample((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_APPKEY:
      return getClientAppkey();

    case TRACE_ID:
      return getTraceId();

    case SPAN_ID:
      return getSpanId();

    case ROOT_MESSAGE_ID:
      return getRootMessageId();

    case CURRENT_MESSAGE_ID:
      return getCurrentMessageId();

    case SERVER_MESSAGE_ID:
      return getServerMessageId();

    case DEBUG:
      return Boolean.valueOf(isDebug());

    case SAMPLE:
      return Boolean.valueOf(isSample());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_APPKEY:
      return isSetClientAppkey();
    case TRACE_ID:
      return isSetTraceId();
    case SPAN_ID:
      return isSetSpanId();
    case ROOT_MESSAGE_ID:
      return isSetRootMessageId();
    case CURRENT_MESSAGE_ID:
      return isSetCurrentMessageId();
    case SERVER_MESSAGE_ID:
      return isSetServerMessageId();
    case DEBUG:
      return isSetDebug();
    case SAMPLE:
      return isSetSample();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TraceInfo)
      return this.equals((TraceInfo)that);
    return false;
  }

  public boolean equals(TraceInfo that) {
    if (that == null)
      return false;

    boolean this_present_clientAppkey = true && this.isSetClientAppkey();
    boolean that_present_clientAppkey = true && that.isSetClientAppkey();
    if (this_present_clientAppkey || that_present_clientAppkey) {
      if (!(this_present_clientAppkey && that_present_clientAppkey))
        return false;
      if (!this.clientAppkey.equals(that.clientAppkey))
        return false;
    }

    boolean this_present_traceId = true && this.isSetTraceId();
    boolean that_present_traceId = true && that.isSetTraceId();
    if (this_present_traceId || that_present_traceId) {
      if (!(this_present_traceId && that_present_traceId))
        return false;
      if (!this.traceId.equals(that.traceId))
        return false;
    }

    boolean this_present_spanId = true && this.isSetSpanId();
    boolean that_present_spanId = true && that.isSetSpanId();
    if (this_present_spanId || that_present_spanId) {
      if (!(this_present_spanId && that_present_spanId))
        return false;
      if (!this.spanId.equals(that.spanId))
        return false;
    }

    boolean this_present_rootMessageId = true && this.isSetRootMessageId();
    boolean that_present_rootMessageId = true && that.isSetRootMessageId();
    if (this_present_rootMessageId || that_present_rootMessageId) {
      if (!(this_present_rootMessageId && that_present_rootMessageId))
        return false;
      if (!this.rootMessageId.equals(that.rootMessageId))
        return false;
    }

    boolean this_present_currentMessageId = true && this.isSetCurrentMessageId();
    boolean that_present_currentMessageId = true && that.isSetCurrentMessageId();
    if (this_present_currentMessageId || that_present_currentMessageId) {
      if (!(this_present_currentMessageId && that_present_currentMessageId))
        return false;
      if (!this.currentMessageId.equals(that.currentMessageId))
        return false;
    }

    boolean this_present_serverMessageId = true && this.isSetServerMessageId();
    boolean that_present_serverMessageId = true && that.isSetServerMessageId();
    if (this_present_serverMessageId || that_present_serverMessageId) {
      if (!(this_present_serverMessageId && that_present_serverMessageId))
        return false;
      if (!this.serverMessageId.equals(that.serverMessageId))
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (this.debug != that.debug)
        return false;
    }

    boolean this_present_sample = true && this.isSetSample();
    boolean that_present_sample = true && that.isSetSample();
    if (this_present_sample || that_present_sample) {
      if (!(this_present_sample && that_present_sample))
        return false;
      if (this.sample != that.sample)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TraceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TraceInfo typedOther = (TraceInfo)other;

    lastComparison = Boolean.valueOf(isSetClientAppkey()).compareTo(typedOther.isSetClientAppkey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientAppkey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientAppkey, typedOther.clientAppkey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceId()).compareTo(typedOther.isSetTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceId, typedOther.traceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpanId()).compareTo(typedOther.isSetSpanId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpanId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spanId, typedOther.spanId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRootMessageId()).compareTo(typedOther.isSetRootMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootMessageId, typedOther.rootMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrentMessageId()).compareTo(typedOther.isSetCurrentMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currentMessageId, typedOther.currentMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerMessageId()).compareTo(typedOther.isSetServerMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverMessageId, typedOther.serverMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebug()).compareTo(typedOther.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, typedOther.debug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSample()).compareTo(typedOther.isSetSample());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSample()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sample, typedOther.sample);
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
    StringBuilder sb = new StringBuilder("TraceInfo(");
    boolean first = true;

    sb.append("clientAppkey:");
    if (this.clientAppkey == null) {
      sb.append("null");
    } else {
      sb.append(this.clientAppkey);
    }
    first = false;
    if (isSetTraceId()) {
      if (!first) sb.append(", ");
      sb.append("traceId:");
      if (this.traceId == null) {
        sb.append("null");
      } else {
        sb.append(this.traceId);
      }
      first = false;
    }
    if (isSetSpanId()) {
      if (!first) sb.append(", ");
      sb.append("spanId:");
      if (this.spanId == null) {
        sb.append("null");
      } else {
        sb.append(this.spanId);
      }
      first = false;
    }
    if (isSetRootMessageId()) {
      if (!first) sb.append(", ");
      sb.append("rootMessageId:");
      if (this.rootMessageId == null) {
        sb.append("null");
      } else {
        sb.append(this.rootMessageId);
      }
      first = false;
    }
    if (isSetCurrentMessageId()) {
      if (!first) sb.append(", ");
      sb.append("currentMessageId:");
      if (this.currentMessageId == null) {
        sb.append("null");
      } else {
        sb.append(this.currentMessageId);
      }
      first = false;
    }
    if (isSetServerMessageId()) {
      if (!first) sb.append(", ");
      sb.append("serverMessageId:");
      if (this.serverMessageId == null) {
        sb.append("null");
      } else {
        sb.append(this.serverMessageId);
      }
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      sb.append(this.debug);
      first = false;
    }
    if (isSetSample()) {
      if (!first) sb.append(", ");
      sb.append("sample:");
      sb.append(this.sample);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (clientAppkey == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'clientAppkey' was not present! Struct: " + toString());
    }
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

  private static class TraceInfoStandardSchemeFactory implements SchemeFactory {
    public TraceInfoStandardScheme getScheme() {
      return new TraceInfoStandardScheme();
    }
  }

  private static class TraceInfoStandardScheme extends StandardScheme<TraceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TraceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_APPKEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientAppkey = iprot.readString();
              struct.setClientAppkeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.traceId = iprot.readString();
              struct.setTraceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPAN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.spanId = iprot.readString();
              struct.setSpanIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROOT_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rootMessageId = iprot.readString();
              struct.setRootMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURRENT_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currentMessageId = iprot.readString();
              struct.setCurrentMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVER_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverMessageId = iprot.readString();
              struct.setServerMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.debug = iprot.readBool();
              struct.setDebugIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SAMPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sample = iprot.readBool();
              struct.setSampleIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TraceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clientAppkey != null) {
        oprot.writeFieldBegin(CLIENT_APPKEY_FIELD_DESC);
        oprot.writeString(struct.clientAppkey);
        oprot.writeFieldEnd();
      }
      if (struct.traceId != null) {
        if (struct.isSetTraceId()) {
          oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
          oprot.writeString(struct.traceId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.spanId != null) {
        if (struct.isSetSpanId()) {
          oprot.writeFieldBegin(SPAN_ID_FIELD_DESC);
          oprot.writeString(struct.spanId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rootMessageId != null) {
        if (struct.isSetRootMessageId()) {
          oprot.writeFieldBegin(ROOT_MESSAGE_ID_FIELD_DESC);
          oprot.writeString(struct.rootMessageId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.currentMessageId != null) {
        if (struct.isSetCurrentMessageId()) {
          oprot.writeFieldBegin(CURRENT_MESSAGE_ID_FIELD_DESC);
          oprot.writeString(struct.currentMessageId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serverMessageId != null) {
        if (struct.isSetServerMessageId()) {
          oprot.writeFieldBegin(SERVER_MESSAGE_ID_FIELD_DESC);
          oprot.writeString(struct.serverMessageId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDebug()) {
        oprot.writeFieldBegin(DEBUG_FIELD_DESC);
        oprot.writeBool(struct.debug);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSample()) {
        oprot.writeFieldBegin(SAMPLE_FIELD_DESC);
        oprot.writeBool(struct.sample);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TraceInfoTupleSchemeFactory implements SchemeFactory {
    public TraceInfoTupleScheme getScheme() {
      return new TraceInfoTupleScheme();
    }
  }

  private static class TraceInfoTupleScheme extends TupleScheme<TraceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TraceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.clientAppkey);
      BitSet optionals = new BitSet();
      if (struct.isSetTraceId()) {
        optionals.set(0);
      }
      if (struct.isSetSpanId()) {
        optionals.set(1);
      }
      if (struct.isSetRootMessageId()) {
        optionals.set(2);
      }
      if (struct.isSetCurrentMessageId()) {
        optionals.set(3);
      }
      if (struct.isSetServerMessageId()) {
        optionals.set(4);
      }
      if (struct.isSetDebug()) {
        optionals.set(5);
      }
      if (struct.isSetSample()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTraceId()) {
        oprot.writeString(struct.traceId);
      }
      if (struct.isSetSpanId()) {
        oprot.writeString(struct.spanId);
      }
      if (struct.isSetRootMessageId()) {
        oprot.writeString(struct.rootMessageId);
      }
      if (struct.isSetCurrentMessageId()) {
        oprot.writeString(struct.currentMessageId);
      }
      if (struct.isSetServerMessageId()) {
        oprot.writeString(struct.serverMessageId);
      }
      if (struct.isSetDebug()) {
        oprot.writeBool(struct.debug);
      }
      if (struct.isSetSample()) {
        oprot.writeBool(struct.sample);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TraceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.clientAppkey = iprot.readString();
      struct.setClientAppkeyIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.traceId = iprot.readString();
        struct.setTraceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.spanId = iprot.readString();
        struct.setSpanIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rootMessageId = iprot.readString();
        struct.setRootMessageIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.currentMessageId = iprot.readString();
        struct.setCurrentMessageIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.serverMessageId = iprot.readString();
        struct.setServerMessageIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.debug = iprot.readBool();
        struct.setDebugIsSet(true);
      }
      if (incoming.get(6)) {
        struct.sample = iprot.readBool();
        struct.setSampleIsSet(true);
      }
    }
  }

}

