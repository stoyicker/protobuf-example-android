// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/option_example.proto

package com.example.options;

/**
 * Protobuf type {@code example.options.OptionMessageOther}
 */
public  final class OptionMessageOther extends
    com.google.protobuf.GeneratedMessageLite<
        OptionMessageOther, OptionMessageOther.Builder> implements
    // @@protoc_insertion_point(message_implements:example.options.OptionMessageOther)
    OptionMessageOtherOrBuilder {
  private OptionMessageOther() {
    hello_ = "";
  }
  public static final int HELLO_FIELD_NUMBER = 1;
  private java.lang.String hello_;
  /**
   * <code>string hello = 1;</code>
   * @return The hello.
   */
  @java.lang.Override
  public java.lang.String getHello() {
    return hello_;
  }
  /**
   * <code>string hello = 1;</code>
   * @return The bytes for hello.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHelloBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(hello_);
  }
  /**
   * <code>string hello = 1;</code>
   * @param value The hello to set.
   */
  private void setHello(
      java.lang.String value) {
    value.getClass();
  
    hello_ = value;
  }
  /**
   * <code>string hello = 1;</code>
   */
  private void clearHello() {
    
    hello_ = getDefaultInstance().getHello();
  }
  /**
   * <code>string hello = 1;</code>
   * @param value The bytes for hello to set.
   */
  private void setHelloBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    hello_ = value.toStringUtf8();
    
  }

  public static com.example.options.OptionMessageOther parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.options.OptionMessageOther parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.options.OptionMessageOther parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.options.OptionMessageOther parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.options.OptionMessageOther parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.options.OptionMessageOther parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.options.OptionMessageOther prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code example.options.OptionMessageOther}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.options.OptionMessageOther, Builder> implements
      // @@protoc_insertion_point(builder_implements:example.options.OptionMessageOther)
      com.example.options.OptionMessageOtherOrBuilder {
    // Construct using com.example.options.OptionMessageOther.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string hello = 1;</code>
     * @return The hello.
     */
    @java.lang.Override
    public java.lang.String getHello() {
      return instance.getHello();
    }
    /**
     * <code>string hello = 1;</code>
     * @return The bytes for hello.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHelloBytes() {
      return instance.getHelloBytes();
    }
    /**
     * <code>string hello = 1;</code>
     * @param value The hello to set.
     * @return This builder for chaining.
     */
    public Builder setHello(
        java.lang.String value) {
      copyOnWrite();
      instance.setHello(value);
      return this;
    }
    /**
     * <code>string hello = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHello() {
      copyOnWrite();
      instance.clearHello();
      return this;
    }
    /**
     * <code>string hello = 1;</code>
     * @param value The bytes for hello to set.
     * @return This builder for chaining.
     */
    public Builder setHelloBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHelloBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:example.options.OptionMessageOther)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.options.OptionMessageOther();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "hello_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.options.OptionMessageOther> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.options.OptionMessageOther.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.options.OptionMessageOther>(
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


  // @@protoc_insertion_point(class_scope:example.options.OptionMessageOther)
  private static final com.example.options.OptionMessageOther DEFAULT_INSTANCE;
  static {
    OptionMessageOther defaultInstance = new OptionMessageOther();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      OptionMessageOther.class, defaultInstance);
  }

  public static com.example.options.OptionMessageOther getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<OptionMessageOther> PARSER;

  public static com.google.protobuf.Parser<OptionMessageOther> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
