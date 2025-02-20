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
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

/**
 *
 *
 * <pre>
 * Response message for PreviewGameServerDeploymentRollout.
 * This has details about the Agones fleet and autoscaler to be actuated.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse}
 */
public final class PreviewGameServerDeploymentRolloutResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse)
    PreviewGameServerDeploymentRolloutResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreviewGameServerDeploymentRolloutResponse.newBuilder() to construct.
  private PreviewGameServerDeploymentRolloutResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreviewGameServerDeploymentRolloutResponse() {
    unavailable_ = com.google.protobuf.LazyStringArrayList.emptyList();
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreviewGameServerDeploymentRolloutResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments
        .internal_static_google_cloud_gaming_v1beta_PreviewGameServerDeploymentRolloutResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments
        .internal_static_google_cloud_gaming_v1beta_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse.class,
            com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse.Builder
                .class);
  }

  public static final int UNAVAILABLE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList unavailable_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @return A list containing the unavailable.
   */
  public com.google.protobuf.ProtocolStringList getUnavailableList() {
    return unavailable_;
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @return The count of unavailable.
   */
  public int getUnavailableCount() {
    return unavailable_.size();
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The unavailable at the given index.
   */
  public java.lang.String getUnavailable(int index) {
    return unavailable_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unavailable at the given index.
   */
  public com.google.protobuf.ByteString getUnavailableBytes(int index) {
    return unavailable_.getByteString(index);
  }

  public static final int ETAG_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object etag_ = "";
  /**
   *
   *
   * <pre>
   * ETag of the game server deployment.
   * </pre>
   *
   * <code>string etag = 3;</code>
   *
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ETag of the game server deployment.
   * </pre>
   *
   * <code>string etag = 3;</code>
   *
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_STATE_FIELD_NUMBER = 4;
  private com.google.cloud.gaming.v1beta.TargetState targetState_;
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
   *
   * @return Whether the targetState field is set.
   */
  @java.lang.Override
  public boolean hasTargetState() {
    return targetState_ != null;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
   *
   * @return The targetState.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.TargetState getTargetState() {
    return targetState_ == null
        ? com.google.cloud.gaming.v1beta.TargetState.getDefaultInstance()
        : targetState_;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.TargetStateOrBuilder getTargetStateOrBuilder() {
    return targetState_ == null
        ? com.google.cloud.gaming.v1beta.TargetState.getDefaultInstance()
        : targetState_;
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
    for (int i = 0; i < unavailable_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, unavailable_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, etag_);
    }
    if (targetState_ != null) {
      output.writeMessage(4, getTargetState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < unavailable_.size(); i++) {
        dataSize += computeStringSizeNoTag(unavailable_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUnavailableList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, etag_);
    }
    if (targetState_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getTargetState());
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
    if (!(obj
        instanceof com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse other =
        (com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse) obj;

    if (!getUnavailableList().equals(other.getUnavailableList())) return false;
    if (!getEtag().equals(other.getEtag())) return false;
    if (hasTargetState() != other.hasTargetState()) return false;
    if (hasTargetState()) {
      if (!getTargetState().equals(other.getTargetState())) return false;
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
    if (getUnavailableCount() > 0) {
      hash = (37 * hash) + UNAVAILABLE_FIELD_NUMBER;
      hash = (53 * hash) + getUnavailableList().hashCode();
    }
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    if (hasTargetState()) {
      hash = (37 * hash) + TARGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse prototype) {
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
   * Response message for PreviewGameServerDeploymentRollout.
   * This has details about the Agones fleet and autoscaler to be actuated.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse)
      com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_PreviewGameServerDeploymentRolloutResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse.class,
              com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      unavailable_ = com.google.protobuf.LazyStringArrayList.emptyList();
      etag_ = "";
      targetState_ = null;
      if (targetStateBuilder_ != null) {
        targetStateBuilder_.dispose();
        targetStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_PreviewGameServerDeploymentRolloutResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse build() {
      com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
        buildPartial() {
      com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse result =
          new com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        unavailable_.makeImmutable();
        result.unavailable_ = unavailable_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.etag_ = etag_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.targetState_ =
            targetStateBuilder_ == null ? targetState_ : targetStateBuilder_.build();
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
      if (other
          instanceof com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse) {
        return mergeFrom(
            (com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse other) {
      if (other
          == com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
              .getDefaultInstance()) return this;
      if (!other.unavailable_.isEmpty()) {
        if (unavailable_.isEmpty()) {
          unavailable_ = other.unavailable_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUnavailableIsMutable();
          unavailable_.addAll(other.unavailable_);
        }
        onChanged();
      }
      if (!other.getEtag().isEmpty()) {
        etag_ = other.etag_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTargetState()) {
        mergeTargetState(other.getTargetState());
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
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureUnavailableIsMutable();
                unavailable_.add(s);
                break;
              } // case 18
            case 26:
              {
                etag_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getTargetStateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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

    private com.google.protobuf.LazyStringArrayList unavailable_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureUnavailableIsMutable() {
      if (!unavailable_.isModifiable()) {
        unavailable_ = new com.google.protobuf.LazyStringArrayList(unavailable_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @return A list containing the unavailable.
     */
    public com.google.protobuf.ProtocolStringList getUnavailableList() {
      unavailable_.makeImmutable();
      return unavailable_;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @return The count of unavailable.
     */
    public int getUnavailableCount() {
      return unavailable_.size();
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The unavailable at the given index.
     */
    public java.lang.String getUnavailable(int index) {
      return unavailable_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the unavailable at the given index.
     */
    public com.google.protobuf.ByteString getUnavailableBytes(int index) {
      return unavailable_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The unavailable to set.
     * @return This builder for chaining.
     */
    public Builder setUnavailable(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUnavailableIsMutable();
      unavailable_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param value The unavailable to add.
     * @return This builder for chaining.
     */
    public Builder addUnavailable(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUnavailableIsMutable();
      unavailable_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param values The unavailable to add.
     * @return This builder for chaining.
     */
    public Builder addAllUnavailable(java.lang.Iterable<java.lang.String> values) {
      ensureUnavailableIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, unavailable_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnavailable() {
      unavailable_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached on this request.
     * </pre>
     *
     * <code>repeated string unavailable = 2;</code>
     *
     * @param value The bytes of the unavailable to add.
     * @return This builder for chaining.
     */
    public Builder addUnavailableBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureUnavailableIsMutable();
      unavailable_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object etag_ = "";
    /**
     *
     *
     * <pre>
     * ETag of the game server deployment.
     * </pre>
     *
     * <code>string etag = 3;</code>
     *
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ETag of the game server deployment.
     * </pre>
     *
     * <code>string etag = 3;</code>
     *
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ETag of the game server deployment.
     * </pre>
     *
     * <code>string etag = 3;</code>
     *
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      etag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ETag of the game server deployment.
     * </pre>
     *
     * <code>string etag = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      etag_ = getDefaultInstance().getEtag();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ETag of the game server deployment.
     * </pre>
     *
     * <code>string etag = 3;</code>
     *
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      etag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1beta.TargetState targetState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.TargetState,
            com.google.cloud.gaming.v1beta.TargetState.Builder,
            com.google.cloud.gaming.v1beta.TargetStateOrBuilder>
        targetStateBuilder_;
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     *
     * @return Whether the targetState field is set.
     */
    public boolean hasTargetState() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     *
     * @return The targetState.
     */
    public com.google.cloud.gaming.v1beta.TargetState getTargetState() {
      if (targetStateBuilder_ == null) {
        return targetState_ == null
            ? com.google.cloud.gaming.v1beta.TargetState.getDefaultInstance()
            : targetState_;
      } else {
        return targetStateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public Builder setTargetState(com.google.cloud.gaming.v1beta.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetState_ = value;
      } else {
        targetStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public Builder setTargetState(
        com.google.cloud.gaming.v1beta.TargetState.Builder builderForValue) {
      if (targetStateBuilder_ == null) {
        targetState_ = builderForValue.build();
      } else {
        targetStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public Builder mergeTargetState(com.google.cloud.gaming.v1beta.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && targetState_ != null
            && targetState_ != com.google.cloud.gaming.v1beta.TargetState.getDefaultInstance()) {
          getTargetStateBuilder().mergeFrom(value);
        } else {
          targetState_ = value;
        }
      } else {
        targetStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public Builder clearTargetState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      targetState_ = null;
      if (targetStateBuilder_ != null) {
        targetStateBuilder_.dispose();
        targetStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public com.google.cloud.gaming.v1beta.TargetState.Builder getTargetStateBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTargetStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    public com.google.cloud.gaming.v1beta.TargetStateOrBuilder getTargetStateOrBuilder() {
      if (targetStateBuilder_ != null) {
        return targetStateBuilder_.getMessageOrBuilder();
      } else {
        return targetState_ == null
            ? com.google.cloud.gaming.v1beta.TargetState.getDefaultInstance()
            : targetState_;
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.TargetState target_state = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.TargetState,
            com.google.cloud.gaming.v1beta.TargetState.Builder,
            com.google.cloud.gaming.v1beta.TargetStateOrBuilder>
        getTargetStateFieldBuilder() {
      if (targetStateBuilder_ == null) {
        targetStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1beta.TargetState,
                com.google.cloud.gaming.v1beta.TargetState.Builder,
                com.google.cloud.gaming.v1beta.TargetStateOrBuilder>(
                getTargetState(), getParentForChildren(), isClean());
        targetState_ = null;
      }
      return targetStateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse)
  private static final com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse();
  }

  public static com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewGameServerDeploymentRolloutResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<PreviewGameServerDeploymentRolloutResponse>() {
            @java.lang.Override
            public PreviewGameServerDeploymentRolloutResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<PreviewGameServerDeploymentRolloutResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewGameServerDeploymentRolloutResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
