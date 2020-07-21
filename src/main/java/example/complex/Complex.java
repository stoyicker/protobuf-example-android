// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/complex.proto

package example.complex;

public final class Complex {
  private Complex() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ComplexMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:example.complex.ComplexMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     * @return Whether the oneDummy field is set.
     */
    boolean hasOneDummy();
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     * @return The oneDummy.
     */
    example.complex.Complex.DummyMessage getOneDummy();

    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    java.util.List<example.complex.Complex.DummyMessage> 
        getMultipleDummyList();
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    example.complex.Complex.DummyMessage getMultipleDummy(int index);
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    int getMultipleDummyCount();
  }
  /**
   * Protobuf type {@code example.complex.ComplexMessage}
   */
  public  static final class ComplexMessage extends
      com.google.protobuf.GeneratedMessageLite<
          ComplexMessage, ComplexMessage.Builder> implements
      // @@protoc_insertion_point(message_implements:example.complex.ComplexMessage)
      ComplexMessageOrBuilder {
    private ComplexMessage() {
      multipleDummy_ = emptyProtobufList();
    }
    public static final int ONE_DUMMY_FIELD_NUMBER = 2;
    private example.complex.Complex.DummyMessage oneDummy_;
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     */
    @java.lang.Override
    public boolean hasOneDummy() {
      return oneDummy_ != null;
    }
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     */
    @java.lang.Override
    public example.complex.Complex.DummyMessage getOneDummy() {
      return oneDummy_ == null ? example.complex.Complex.DummyMessage.getDefaultInstance() : oneDummy_;
    }
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     */
    private void setOneDummy(example.complex.Complex.DummyMessage value) {
      value.getClass();
  oneDummy_ = value;
      
      }
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeOneDummy(example.complex.Complex.DummyMessage value) {
      value.getClass();
  if (oneDummy_ != null &&
          oneDummy_ != example.complex.Complex.DummyMessage.getDefaultInstance()) {
        oneDummy_ =
          example.complex.Complex.DummyMessage.newBuilder(oneDummy_).mergeFrom(value).buildPartial();
      } else {
        oneDummy_ = value;
      }
      
    }
    /**
     * <code>.example.complex.DummyMessage one_dummy = 2;</code>
     */
    private void clearOneDummy() {  oneDummy_ = null;
      
    }

    public static final int MULTIPLE_DUMMY_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.ProtobufList<example.complex.Complex.DummyMessage> multipleDummy_;
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    @java.lang.Override
    public java.util.List<example.complex.Complex.DummyMessage> getMultipleDummyList() {
      return multipleDummy_;
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    public java.util.List<? extends example.complex.Complex.DummyMessageOrBuilder> 
        getMultipleDummyOrBuilderList() {
      return multipleDummy_;
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    @java.lang.Override
    public int getMultipleDummyCount() {
      return multipleDummy_.size();
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    @java.lang.Override
    public example.complex.Complex.DummyMessage getMultipleDummy(int index) {
      return multipleDummy_.get(index);
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    public example.complex.Complex.DummyMessageOrBuilder getMultipleDummyOrBuilder(
        int index) {
      return multipleDummy_.get(index);
    }
    private void ensureMultipleDummyIsMutable() {
      com.google.protobuf.Internal.ProtobufList<example.complex.Complex.DummyMessage> tmp = multipleDummy_;
      if (!tmp.isModifiable()) {
        multipleDummy_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }

    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void setMultipleDummy(
        int index, example.complex.Complex.DummyMessage value) {
      value.getClass();
  ensureMultipleDummyIsMutable();
      multipleDummy_.set(index, value);
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void addMultipleDummy(example.complex.Complex.DummyMessage value) {
      value.getClass();
  ensureMultipleDummyIsMutable();
      multipleDummy_.add(value);
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void addMultipleDummy(
        int index, example.complex.Complex.DummyMessage value) {
      value.getClass();
  ensureMultipleDummyIsMutable();
      multipleDummy_.add(index, value);
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void addAllMultipleDummy(
        java.lang.Iterable<? extends example.complex.Complex.DummyMessage> values) {
      ensureMultipleDummyIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, multipleDummy_);
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void clearMultipleDummy() {
      multipleDummy_ = emptyProtobufList();
    }
    /**
     * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
     */
    private void removeMultipleDummy(int index) {
      ensureMultipleDummyIsMutable();
      multipleDummy_.remove(index);
    }

    public static example.complex.Complex.ComplexMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static example.complex.Complex.ComplexMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.ComplexMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.ComplexMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(example.complex.Complex.ComplexMessage prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code example.complex.ComplexMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          example.complex.Complex.ComplexMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:example.complex.ComplexMessage)
        example.complex.Complex.ComplexMessageOrBuilder {
      // Construct using example.complex.Complex.ComplexMessage.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      @java.lang.Override
      public boolean hasOneDummy() {
        return instance.hasOneDummy();
      }
      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      @java.lang.Override
      public example.complex.Complex.DummyMessage getOneDummy() {
        return instance.getOneDummy();
      }
      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      public Builder setOneDummy(example.complex.Complex.DummyMessage value) {
        copyOnWrite();
        instance.setOneDummy(value);
        return this;
        }
      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      public Builder setOneDummy(
          example.complex.Complex.DummyMessage.Builder builderForValue) {
        copyOnWrite();
        instance.setOneDummy(builderForValue.build());
        return this;
      }
      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      public Builder mergeOneDummy(example.complex.Complex.DummyMessage value) {
        copyOnWrite();
        instance.mergeOneDummy(value);
        return this;
      }
      /**
       * <code>.example.complex.DummyMessage one_dummy = 2;</code>
       */
      public Builder clearOneDummy() {  copyOnWrite();
        instance.clearOneDummy();
        return this;
      }

      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      @java.lang.Override
      public java.util.List<example.complex.Complex.DummyMessage> getMultipleDummyList() {
        return java.util.Collections.unmodifiableList(
            instance.getMultipleDummyList());
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      @java.lang.Override
      public int getMultipleDummyCount() {
        return instance.getMultipleDummyCount();
      }/**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      @java.lang.Override
      public example.complex.Complex.DummyMessage getMultipleDummy(int index) {
        return instance.getMultipleDummy(index);
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder setMultipleDummy(
          int index, example.complex.Complex.DummyMessage value) {
        copyOnWrite();
        instance.setMultipleDummy(index, value);
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder setMultipleDummy(
          int index, example.complex.Complex.DummyMessage.Builder builderForValue) {
        copyOnWrite();
        instance.setMultipleDummy(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder addMultipleDummy(example.complex.Complex.DummyMessage value) {
        copyOnWrite();
        instance.addMultipleDummy(value);
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder addMultipleDummy(
          int index, example.complex.Complex.DummyMessage value) {
        copyOnWrite();
        instance.addMultipleDummy(index, value);
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder addMultipleDummy(
          example.complex.Complex.DummyMessage.Builder builderForValue) {
        copyOnWrite();
        instance.addMultipleDummy(builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder addMultipleDummy(
          int index, example.complex.Complex.DummyMessage.Builder builderForValue) {
        copyOnWrite();
        instance.addMultipleDummy(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder addAllMultipleDummy(
          java.lang.Iterable<? extends example.complex.Complex.DummyMessage> values) {
        copyOnWrite();
        instance.addAllMultipleDummy(values);
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder clearMultipleDummy() {
        copyOnWrite();
        instance.clearMultipleDummy();
        return this;
      }
      /**
       * <code>repeated .example.complex.DummyMessage multiple_dummy = 3;</code>
       */
      public Builder removeMultipleDummy(int index) {
        copyOnWrite();
        instance.removeMultipleDummy(index);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:example.complex.ComplexMessage)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new example.complex.Complex.ComplexMessage();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "oneDummy_",
              "multipleDummy_",
              example.complex.Complex.DummyMessage.class,
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\t\u0003\u001b" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<example.complex.Complex.ComplexMessage> parser = PARSER;
          if (parser == null) {
            synchronized (example.complex.Complex.ComplexMessage.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<example.complex.Complex.ComplexMessage>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:example.complex.ComplexMessage)
    private static final example.complex.Complex.ComplexMessage DEFAULT_INSTANCE;
    static {
      ComplexMessage defaultInstance = new ComplexMessage();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ComplexMessage.class, defaultInstance);
    }

    public static example.complex.Complex.ComplexMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ComplexMessage> PARSER;

    public static com.google.protobuf.Parser<ComplexMessage> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface DummyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:example.complex.DummyMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code example.complex.DummyMessage}
   */
  public  static final class DummyMessage extends
      com.google.protobuf.GeneratedMessageLite<
          DummyMessage, DummyMessage.Builder> implements
      // @@protoc_insertion_point(message_implements:example.complex.DummyMessage)
      DummyMessageOrBuilder {
    private DummyMessage() {
      name_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.String name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     */
    private void setName(
        java.lang.String value) {
      value.getClass();
  
      name_ = value;
    }
    /**
     * <code>string name = 2;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      name_ = value.toStringUtf8();
      
    }

    public static example.complex.Complex.DummyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.DummyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static example.complex.Complex.DummyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static example.complex.Complex.DummyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.DummyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static example.complex.Complex.DummyMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(example.complex.Complex.DummyMessage prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code example.complex.DummyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          example.complex.Complex.DummyMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:example.complex.DummyMessage)
        example.complex.Complex.DummyMessageOrBuilder {
      // Construct using example.complex.Complex.DummyMessage.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return instance.getId();
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:example.complex.DummyMessage)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new example.complex.Complex.DummyMessage();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "id_",
              "name_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<example.complex.Complex.DummyMessage> parser = PARSER;
          if (parser == null) {
            synchronized (example.complex.Complex.DummyMessage.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<example.complex.Complex.DummyMessage>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:example.complex.DummyMessage)
    private static final example.complex.Complex.DummyMessage DEFAULT_INSTANCE;
    static {
      DummyMessage defaultInstance = new DummyMessage();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        DummyMessage.class, defaultInstance);
    }

    public static example.complex.Complex.DummyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DummyMessage> PARSER;

    public static com.google.protobuf.Parser<DummyMessage> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
