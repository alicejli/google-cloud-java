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
// source: google/cloud/osconfig/v1alpha/inventory.proto

package com.google.cloud.osconfig.v1alpha;

/**
 *
 *
 * <pre>
 * A response message for listing inventory data for all VMs in a specified
 * location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1alpha.ListInventoriesResponse}
 */
public final class ListInventoriesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1alpha.ListInventoriesResponse)
    ListInventoriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListInventoriesResponse.newBuilder() to construct.
  private ListInventoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListInventoriesResponse() {
    inventories_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListInventoriesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListInventoriesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                inventories_ =
                    new java.util.ArrayList<com.google.cloud.osconfig.v1alpha.Inventory>();
                mutable_bitField0_ |= 0x00000001;
              }
              inventories_.add(
                  input.readMessage(
                      com.google.cloud.osconfig.v1alpha.Inventory.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        inventories_ = java.util.Collections.unmodifiableList(inventories_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.osconfig.v1alpha.Inventories
        .internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1alpha.Inventories
        .internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.class,
            com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.Builder.class);
  }

  public static final int INVENTORIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.osconfig.v1alpha.Inventory> inventories_;
  /**
   *
   *
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.osconfig.v1alpha.Inventory> getInventoriesList() {
    return inventories_;
  }
  /**
   *
   *
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.osconfig.v1alpha.InventoryOrBuilder>
      getInventoriesOrBuilderList() {
    return inventories_;
  }
  /**
   *
   *
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  @java.lang.Override
  public int getInventoriesCount() {
    return inventories_.size();
  }
  /**
   *
   *
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.Inventory getInventories(int index) {
    return inventories_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.InventoryOrBuilder getInventoriesOrBuilder(int index) {
    return inventories_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of inventory objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of inventory objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < inventories_.size(); i++) {
      output.writeMessage(1, inventories_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inventories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, inventories_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.osconfig.v1alpha.ListInventoriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1alpha.ListInventoriesResponse other =
        (com.google.cloud.osconfig.v1alpha.ListInventoriesResponse) obj;

    if (!getInventoriesList().equals(other.getInventoriesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getInventoriesCount() > 0) {
      hash = (37 * hash) + INVENTORIES_FIELD_NUMBER;
      hash = (53 * hash) + getInventoriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parseFrom(
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
      com.google.cloud.osconfig.v1alpha.ListInventoriesResponse prototype) {
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
   * A response message for listing inventory data for all VMs in a specified
   * location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1alpha.ListInventoriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1alpha.ListInventoriesResponse)
      com.google.cloud.osconfig.v1alpha.ListInventoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.osconfig.v1alpha.Inventories
          .internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1alpha.Inventories
          .internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.class,
              com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInventoriesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inventoriesBuilder_ == null) {
        inventories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inventoriesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.osconfig.v1alpha.Inventories
          .internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.ListInventoriesResponse getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.ListInventoriesResponse build() {
      com.google.cloud.osconfig.v1alpha.ListInventoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.ListInventoriesResponse buildPartial() {
      com.google.cloud.osconfig.v1alpha.ListInventoriesResponse result =
          new com.google.cloud.osconfig.v1alpha.ListInventoriesResponse(this);
      int from_bitField0_ = bitField0_;
      if (inventoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inventories_ = java.util.Collections.unmodifiableList(inventories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inventories_ = inventories_;
      } else {
        result.inventories_ = inventoriesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.osconfig.v1alpha.ListInventoriesResponse) {
        return mergeFrom((com.google.cloud.osconfig.v1alpha.ListInventoriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1alpha.ListInventoriesResponse other) {
      if (other == com.google.cloud.osconfig.v1alpha.ListInventoriesResponse.getDefaultInstance())
        return this;
      if (inventoriesBuilder_ == null) {
        if (!other.inventories_.isEmpty()) {
          if (inventories_.isEmpty()) {
            inventories_ = other.inventories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInventoriesIsMutable();
            inventories_.addAll(other.inventories_);
          }
          onChanged();
        }
      } else {
        if (!other.inventories_.isEmpty()) {
          if (inventoriesBuilder_.isEmpty()) {
            inventoriesBuilder_.dispose();
            inventoriesBuilder_ = null;
            inventories_ = other.inventories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inventoriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInventoriesFieldBuilder()
                    : null;
          } else {
            inventoriesBuilder_.addAllMessages(other.inventories_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.osconfig.v1alpha.ListInventoriesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.osconfig.v1alpha.ListInventoriesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.osconfig.v1alpha.Inventory> inventories_ =
        java.util.Collections.emptyList();

    private void ensureInventoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inventories_ =
            new java.util.ArrayList<com.google.cloud.osconfig.v1alpha.Inventory>(inventories_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.osconfig.v1alpha.Inventory,
            com.google.cloud.osconfig.v1alpha.Inventory.Builder,
            com.google.cloud.osconfig.v1alpha.InventoryOrBuilder>
        inventoriesBuilder_;

    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1alpha.Inventory> getInventoriesList() {
      if (inventoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inventories_);
      } else {
        return inventoriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public int getInventoriesCount() {
      if (inventoriesBuilder_ == null) {
        return inventories_.size();
      } else {
        return inventoriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public com.google.cloud.osconfig.v1alpha.Inventory getInventories(int index) {
      if (inventoriesBuilder_ == null) {
        return inventories_.get(index);
      } else {
        return inventoriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder setInventories(int index, com.google.cloud.osconfig.v1alpha.Inventory value) {
      if (inventoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoriesIsMutable();
        inventories_.set(index, value);
        onChanged();
      } else {
        inventoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder setInventories(
        int index, com.google.cloud.osconfig.v1alpha.Inventory.Builder builderForValue) {
      if (inventoriesBuilder_ == null) {
        ensureInventoriesIsMutable();
        inventories_.set(index, builderForValue.build());
        onChanged();
      } else {
        inventoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder addInventories(com.google.cloud.osconfig.v1alpha.Inventory value) {
      if (inventoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoriesIsMutable();
        inventories_.add(value);
        onChanged();
      } else {
        inventoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder addInventories(int index, com.google.cloud.osconfig.v1alpha.Inventory value) {
      if (inventoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoriesIsMutable();
        inventories_.add(index, value);
        onChanged();
      } else {
        inventoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder addInventories(
        com.google.cloud.osconfig.v1alpha.Inventory.Builder builderForValue) {
      if (inventoriesBuilder_ == null) {
        ensureInventoriesIsMutable();
        inventories_.add(builderForValue.build());
        onChanged();
      } else {
        inventoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder addInventories(
        int index, com.google.cloud.osconfig.v1alpha.Inventory.Builder builderForValue) {
      if (inventoriesBuilder_ == null) {
        ensureInventoriesIsMutable();
        inventories_.add(index, builderForValue.build());
        onChanged();
      } else {
        inventoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder addAllInventories(
        java.lang.Iterable<? extends com.google.cloud.osconfig.v1alpha.Inventory> values) {
      if (inventoriesBuilder_ == null) {
        ensureInventoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, inventories_);
        onChanged();
      } else {
        inventoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder clearInventories() {
      if (inventoriesBuilder_ == null) {
        inventories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inventoriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public Builder removeInventories(int index) {
      if (inventoriesBuilder_ == null) {
        ensureInventoriesIsMutable();
        inventories_.remove(index);
        onChanged();
      } else {
        inventoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public com.google.cloud.osconfig.v1alpha.Inventory.Builder getInventoriesBuilder(int index) {
      return getInventoriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public com.google.cloud.osconfig.v1alpha.InventoryOrBuilder getInventoriesOrBuilder(int index) {
      if (inventoriesBuilder_ == null) {
        return inventories_.get(index);
      } else {
        return inventoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.osconfig.v1alpha.InventoryOrBuilder>
        getInventoriesOrBuilderList() {
      if (inventoriesBuilder_ != null) {
        return inventoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inventories_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public com.google.cloud.osconfig.v1alpha.Inventory.Builder addInventoriesBuilder() {
      return getInventoriesFieldBuilder()
          .addBuilder(com.google.cloud.osconfig.v1alpha.Inventory.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public com.google.cloud.osconfig.v1alpha.Inventory.Builder addInventoriesBuilder(int index) {
      return getInventoriesFieldBuilder()
          .addBuilder(index, com.google.cloud.osconfig.v1alpha.Inventory.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of inventory objects.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1alpha.Inventory.Builder>
        getInventoriesBuilderList() {
      return getInventoriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.osconfig.v1alpha.Inventory,
            com.google.cloud.osconfig.v1alpha.Inventory.Builder,
            com.google.cloud.osconfig.v1alpha.InventoryOrBuilder>
        getInventoriesFieldBuilder() {
      if (inventoriesBuilder_ == null) {
        inventoriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.osconfig.v1alpha.Inventory,
                com.google.cloud.osconfig.v1alpha.Inventory.Builder,
                com.google.cloud.osconfig.v1alpha.InventoryOrBuilder>(
                inventories_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        inventories_ = null;
      }
      return inventoriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of inventory objects.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of inventory objects.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of inventory objects.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of inventory objects.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of inventory objects.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1alpha.ListInventoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.ListInventoriesResponse)
  private static final com.google.cloud.osconfig.v1alpha.ListInventoriesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1alpha.ListInventoriesResponse();
  }

  public static com.google.cloud.osconfig.v1alpha.ListInventoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInventoriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListInventoriesResponse>() {
        @java.lang.Override
        public ListInventoriesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListInventoriesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListInventoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInventoriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.ListInventoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
