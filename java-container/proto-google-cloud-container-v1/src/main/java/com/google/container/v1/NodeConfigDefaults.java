/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Subset of NodeConfig message that has defaults.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NodeConfigDefaults}
 */
public final class NodeConfigDefaults extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NodeConfigDefaults)
    NodeConfigDefaultsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodeConfigDefaults.newBuilder() to construct.
  private NodeConfigDefaults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeConfigDefaults() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeConfigDefaults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodeConfigDefaults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodeConfigDefaults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.NodeConfigDefaults.class,
            com.google.container.v1.NodeConfigDefaults.Builder.class);
  }

  public static final int GCFS_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1.GcfsConfig gcfsConfig_;
  /**
   *
   *
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   *
   * @return Whether the gcfsConfig field is set.
   */
  @java.lang.Override
  public boolean hasGcfsConfig() {
    return gcfsConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   *
   * @return The gcfsConfig.
   */
  @java.lang.Override
  public com.google.container.v1.GcfsConfig getGcfsConfig() {
    return gcfsConfig_ == null
        ? com.google.container.v1.GcfsConfig.getDefaultInstance()
        : gcfsConfig_;
  }
  /**
   *
   *
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1.GcfsConfigOrBuilder getGcfsConfigOrBuilder() {
    return gcfsConfig_ == null
        ? com.google.container.v1.GcfsConfig.getDefaultInstance()
        : gcfsConfig_;
  }

  public static final int LOGGING_CONFIG_FIELD_NUMBER = 3;
  private com.google.container.v1.NodePoolLoggingConfig loggingConfig_;
  /**
   *
   *
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   *
   * @return Whether the loggingConfig field is set.
   */
  @java.lang.Override
  public boolean hasLoggingConfig() {
    return loggingConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   *
   * @return The loggingConfig.
   */
  @java.lang.Override
  public com.google.container.v1.NodePoolLoggingConfig getLoggingConfig() {
    return loggingConfig_ == null
        ? com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()
        : loggingConfig_;
  }
  /**
   *
   *
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   */
  @java.lang.Override
  public com.google.container.v1.NodePoolLoggingConfigOrBuilder getLoggingConfigOrBuilder() {
    return loggingConfig_ == null
        ? com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()
        : loggingConfig_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (gcfsConfig_ != null) {
      output.writeMessage(1, getGcfsConfig());
    }
    if (loggingConfig_ != null) {
      output.writeMessage(3, getLoggingConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcfsConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcfsConfig());
    }
    if (loggingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLoggingConfig());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.container.v1.NodeConfigDefaults)) {
      return super.equals(obj);
    }
    com.google.container.v1.NodeConfigDefaults other =
        (com.google.container.v1.NodeConfigDefaults) obj;

    if (hasGcfsConfig() != other.hasGcfsConfig()) return false;
    if (hasGcfsConfig()) {
      if (!getGcfsConfig().equals(other.getGcfsConfig())) return false;
    }
    if (hasLoggingConfig() != other.hasLoggingConfig()) return false;
    if (hasLoggingConfig()) {
      if (!getLoggingConfig().equals(other.getLoggingConfig())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGcfsConfig()) {
      hash = (37 * hash) + GCFS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getGcfsConfig().hashCode();
    }
    if (hasLoggingConfig()) {
      hash = (37 * hash) + LOGGING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getLoggingConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodeConfigDefaults parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodeConfigDefaults parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodeConfigDefaults parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.container.v1.NodeConfigDefaults prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Subset of NodeConfig message that has defaults.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NodeConfigDefaults}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NodeConfigDefaults)
      com.google.container.v1.NodeConfigDefaultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodeConfigDefaults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodeConfigDefaults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.NodeConfigDefaults.class,
              com.google.container.v1.NodeConfigDefaults.Builder.class);
    }

    // Construct using com.google.container.v1.NodeConfigDefaults.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcfsConfig_ = null;
      if (gcfsConfigBuilder_ != null) {
        gcfsConfigBuilder_.dispose();
        gcfsConfigBuilder_ = null;
      }
      loggingConfig_ = null;
      if (loggingConfigBuilder_ != null) {
        loggingConfigBuilder_.dispose();
        loggingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodeConfigDefaults_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.NodeConfigDefaults getDefaultInstanceForType() {
      return com.google.container.v1.NodeConfigDefaults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.NodeConfigDefaults build() {
      com.google.container.v1.NodeConfigDefaults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.NodeConfigDefaults buildPartial() {
      com.google.container.v1.NodeConfigDefaults result =
          new com.google.container.v1.NodeConfigDefaults(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.NodeConfigDefaults result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcfsConfig_ = gcfsConfigBuilder_ == null ? gcfsConfig_ : gcfsConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.loggingConfig_ =
            loggingConfigBuilder_ == null ? loggingConfig_ : loggingConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.NodeConfigDefaults) {
        return mergeFrom((com.google.container.v1.NodeConfigDefaults) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.NodeConfigDefaults other) {
      if (other == com.google.container.v1.NodeConfigDefaults.getDefaultInstance()) return this;
      if (other.hasGcfsConfig()) {
        mergeGcfsConfig(other.getGcfsConfig());
      }
      if (other.hasLoggingConfig()) {
        mergeLoggingConfig(other.getLoggingConfig());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getGcfsConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(getLoggingConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.container.v1.GcfsConfig gcfsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.GcfsConfig,
            com.google.container.v1.GcfsConfig.Builder,
            com.google.container.v1.GcfsConfigOrBuilder>
        gcfsConfigBuilder_;
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     *
     * @return Whether the gcfsConfig field is set.
     */
    public boolean hasGcfsConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     *
     * @return The gcfsConfig.
     */
    public com.google.container.v1.GcfsConfig getGcfsConfig() {
      if (gcfsConfigBuilder_ == null) {
        return gcfsConfig_ == null
            ? com.google.container.v1.GcfsConfig.getDefaultInstance()
            : gcfsConfig_;
      } else {
        return gcfsConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public Builder setGcfsConfig(com.google.container.v1.GcfsConfig value) {
      if (gcfsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcfsConfig_ = value;
      } else {
        gcfsConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public Builder setGcfsConfig(com.google.container.v1.GcfsConfig.Builder builderForValue) {
      if (gcfsConfigBuilder_ == null) {
        gcfsConfig_ = builderForValue.build();
      } else {
        gcfsConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public Builder mergeGcfsConfig(com.google.container.v1.GcfsConfig value) {
      if (gcfsConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && gcfsConfig_ != null
            && gcfsConfig_ != com.google.container.v1.GcfsConfig.getDefaultInstance()) {
          getGcfsConfigBuilder().mergeFrom(value);
        } else {
          gcfsConfig_ = value;
        }
      } else {
        gcfsConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public Builder clearGcfsConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gcfsConfig_ = null;
      if (gcfsConfigBuilder_ != null) {
        gcfsConfigBuilder_.dispose();
        gcfsConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public com.google.container.v1.GcfsConfig.Builder getGcfsConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGcfsConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    public com.google.container.v1.GcfsConfigOrBuilder getGcfsConfigOrBuilder() {
      if (gcfsConfigBuilder_ != null) {
        return gcfsConfigBuilder_.getMessageOrBuilder();
      } else {
        return gcfsConfig_ == null
            ? com.google.container.v1.GcfsConfig.getDefaultInstance()
            : gcfsConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * GCFS (Google Container File System, also known as Riptide) options.
     * </pre>
     *
     * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.GcfsConfig,
            com.google.container.v1.GcfsConfig.Builder,
            com.google.container.v1.GcfsConfigOrBuilder>
        getGcfsConfigFieldBuilder() {
      if (gcfsConfigBuilder_ == null) {
        gcfsConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.GcfsConfig,
                com.google.container.v1.GcfsConfig.Builder,
                com.google.container.v1.GcfsConfigOrBuilder>(
                getGcfsConfig(), getParentForChildren(), isClean());
        gcfsConfig_ = null;
      }
      return gcfsConfigBuilder_;
    }

    private com.google.container.v1.NodePoolLoggingConfig loggingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NodePoolLoggingConfig,
            com.google.container.v1.NodePoolLoggingConfig.Builder,
            com.google.container.v1.NodePoolLoggingConfigOrBuilder>
        loggingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     *
     * @return Whether the loggingConfig field is set.
     */
    public boolean hasLoggingConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     *
     * @return The loggingConfig.
     */
    public com.google.container.v1.NodePoolLoggingConfig getLoggingConfig() {
      if (loggingConfigBuilder_ == null) {
        return loggingConfig_ == null
            ? com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()
            : loggingConfig_;
      } else {
        return loggingConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public Builder setLoggingConfig(com.google.container.v1.NodePoolLoggingConfig value) {
      if (loggingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loggingConfig_ = value;
      } else {
        loggingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public Builder setLoggingConfig(
        com.google.container.v1.NodePoolLoggingConfig.Builder builderForValue) {
      if (loggingConfigBuilder_ == null) {
        loggingConfig_ = builderForValue.build();
      } else {
        loggingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public Builder mergeLoggingConfig(com.google.container.v1.NodePoolLoggingConfig value) {
      if (loggingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && loggingConfig_ != null
            && loggingConfig_
                != com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()) {
          getLoggingConfigBuilder().mergeFrom(value);
        } else {
          loggingConfig_ = value;
        }
      } else {
        loggingConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public Builder clearLoggingConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      loggingConfig_ = null;
      if (loggingConfigBuilder_ != null) {
        loggingConfigBuilder_.dispose();
        loggingConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public com.google.container.v1.NodePoolLoggingConfig.Builder getLoggingConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLoggingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    public com.google.container.v1.NodePoolLoggingConfigOrBuilder getLoggingConfigOrBuilder() {
      if (loggingConfigBuilder_ != null) {
        return loggingConfigBuilder_.getMessageOrBuilder();
      } else {
        return loggingConfig_ == null
            ? com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()
            : loggingConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Logging configuration for node pools.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NodePoolLoggingConfig,
            com.google.container.v1.NodePoolLoggingConfig.Builder,
            com.google.container.v1.NodePoolLoggingConfigOrBuilder>
        getLoggingConfigFieldBuilder() {
      if (loggingConfigBuilder_ == null) {
        loggingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.NodePoolLoggingConfig,
                com.google.container.v1.NodePoolLoggingConfig.Builder,
                com.google.container.v1.NodePoolLoggingConfigOrBuilder>(
                getLoggingConfig(), getParentForChildren(), isClean());
        loggingConfig_ = null;
      }
      return loggingConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.NodeConfigDefaults)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.NodeConfigDefaults)
  private static final com.google.container.v1.NodeConfigDefaults DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.NodeConfigDefaults();
  }

  public static com.google.container.v1.NodeConfigDefaults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeConfigDefaults> PARSER =
      new com.google.protobuf.AbstractParser<NodeConfigDefaults>() {
        @java.lang.Override
        public NodeConfigDefaults parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<NodeConfigDefaults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeConfigDefaults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.NodeConfigDefaults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
