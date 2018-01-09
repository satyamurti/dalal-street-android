// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/Subscribe.proto

package dalalstreet.api.datastreams;

/**
 * Protobuf type {@code proto.SubscriptionId}
 */
public  final class SubscriptionId extends
    com.google.protobuf.GeneratedMessageLite<
            SubscriptionId, SubscriptionId.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.SubscriptionId)
        SubscriptionIdOrBuilder {
  private SubscriptionId() {
    id_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private String id_;
  /**
   * <code>optional string id = 1;</code>
   */
  public String getId() {
    return id_;
  }
  /**
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <code>optional string id = 1;</code>
   */
  private void setId(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    id_ = value;
  }
  /**
   * <code>optional string id = 1;</code>
   */
  private void clearId() {

    id_ = getDefaultInstance().getId();
  }
  /**
   * <code>optional string id = 1;</code>
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    id_ = value.toStringUtf8();
  }

  public static final int DATA_STREAM_TYPE_FIELD_NUMBER = 2;
  private int dataStreamType_;
  /**
   * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
   */
  public int getDataStreamTypeValue() {
    return dataStreamType_;
  }
  /**
   * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
   */
  public DataStreamType getDataStreamType() {
    DataStreamType result = DataStreamType.forNumber(dataStreamType_);
    return result == null ? DataStreamType.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
   */
  private void setDataStreamTypeValue(int value) {
      dataStreamType_ = value;
  }
  /**
   * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
   */
  private void setDataStreamType(DataStreamType value) {
    if (value == null) {
      throw new NullPointerException();
    }

    dataStreamType_ = value.getNumber();
  }
  /**
   * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
   */
  private void clearDataStreamType() {

    dataStreamType_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!id_.isEmpty()) {
      output.writeString(1, getId());
    }
    if (dataStreamType_ != DataStreamType.MARKET_DEPTH.getNumber()) {
      output.writeEnum(2, dataStreamType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getId());
    }
    if (dataStreamType_ != DataStreamType.MARKET_DEPTH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataStreamType_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static SubscriptionId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static SubscriptionId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static SubscriptionId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static SubscriptionId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static SubscriptionId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static SubscriptionId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static SubscriptionId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static SubscriptionId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static SubscriptionId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static SubscriptionId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SubscriptionId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.SubscriptionId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              SubscriptionId, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.SubscriptionId)
          SubscriptionIdOrBuilder {
    // Construct using dalalstreet.api.datastreams.SubscriptionId.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string id = 1;</code>
     */
    public String getId() {
      return instance.getId();
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
     */
    public int getDataStreamTypeValue() {
      return instance.getDataStreamTypeValue();
    }
    /**
     * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
     */
    public Builder setDataStreamTypeValue(int value) {
      copyOnWrite();
      instance.setDataStreamTypeValue(value);
      return this;
    }
    /**
     * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
     */
    public DataStreamType getDataStreamType() {
      return instance.getDataStreamType();
    }
    /**
     * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
     */
    public Builder setDataStreamType(DataStreamType value) {
      copyOnWrite();
      instance.setDataStreamType(value);
      return this;
    }
    /**
     * <code>optional .proto.DataStreamType data_stream_type = 2;</code>
     */
    public Builder clearDataStreamType() {
      copyOnWrite();
      instance.clearDataStreamType();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.SubscriptionId)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new SubscriptionId();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        SubscriptionId other = (SubscriptionId) arg1;
        id_ = visitor.visitString(!id_.isEmpty(), id_,
            !other.id_.isEmpty(), other.id_);
        dataStreamType_ = visitor.visitInt(dataStreamType_ != 0, dataStreamType_,    other.dataStreamType_ != 0, other.dataStreamType_);
        if (visitor == MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                id_ = s;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();

                dataStreamType_ = rawValue;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (SubscriptionId.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:proto.SubscriptionId)
  private static final SubscriptionId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SubscriptionId();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static SubscriptionId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SubscriptionId> PARSER;

  public static com.google.protobuf.Parser<SubscriptionId> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
