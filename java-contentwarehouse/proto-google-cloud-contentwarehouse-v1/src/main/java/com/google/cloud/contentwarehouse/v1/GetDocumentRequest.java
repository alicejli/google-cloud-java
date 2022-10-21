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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Request message for DocumentService.GetDocument.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.GetDocumentRequest}
 */
public final class GetDocumentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.GetDocumentRequest)
    GetDocumentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetDocumentRequest.newBuilder() to construct.
  private GetDocumentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetDocumentRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetDocumentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_GetDocumentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_GetDocumentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.GetDocumentRequest.class,
            com.google.cloud.contentwarehouse.v1.GetDocumentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The name of the document to retrieve.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id} or
   * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the document to retrieve.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id} or
   * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.contentwarehouse.v1.RequestMetadata requestMetadata_;
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  @java.lang.Override
  public boolean hasRequestMetadata() {
    return requestMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return The requestMetadata.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata() {
    return requestMetadata_ == null
        ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
        : requestMetadata_;
  }
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder
      getRequestMetadataOrBuilder() {
    return getRequestMetadata();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (requestMetadata_ != null) {
      output.writeMessage(2, getRequestMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (requestMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRequestMetadata());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.GetDocumentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.GetDocumentRequest other =
        (com.google.cloud.contentwarehouse.v1.GetDocumentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasRequestMetadata() != other.hasRequestMetadata()) return false;
    if (hasRequestMetadata()) {
      if (!getRequestMetadata().equals(other.getRequestMetadata())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasRequestMetadata()) {
      hash = (37 * hash) + REQUEST_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getRequestMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest parseFrom(
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
      com.google.cloud.contentwarehouse.v1.GetDocumentRequest prototype) {
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
   * Request message for DocumentService.GetDocument.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.GetDocumentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.GetDocumentRequest)
      com.google.cloud.contentwarehouse.v1.GetDocumentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_GetDocumentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_GetDocumentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.GetDocumentRequest.class,
              com.google.cloud.contentwarehouse.v1.GetDocumentRequest.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.GetDocumentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (requestMetadataBuilder_ == null) {
        requestMetadata_ = null;
      } else {
        requestMetadata_ = null;
        requestMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_GetDocumentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.GetDocumentRequest getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.GetDocumentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.GetDocumentRequest build() {
      com.google.cloud.contentwarehouse.v1.GetDocumentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.GetDocumentRequest buildPartial() {
      com.google.cloud.contentwarehouse.v1.GetDocumentRequest result =
          new com.google.cloud.contentwarehouse.v1.GetDocumentRequest(this);
      result.name_ = name_;
      if (requestMetadataBuilder_ == null) {
        result.requestMetadata_ = requestMetadata_;
      } else {
        result.requestMetadata_ = requestMetadataBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.GetDocumentRequest) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.GetDocumentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.GetDocumentRequest other) {
      if (other == com.google.cloud.contentwarehouse.v1.GetDocumentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasRequestMetadata()) {
        mergeRequestMetadata(other.getRequestMetadata());
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
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRequestMetadataFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the document to retrieve.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id} or
     * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to retrieve.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id} or
     * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to retrieve.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id} or
     * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to retrieve.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id} or
     * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to retrieve.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id} or
     * projects/{project_number}/locations/{location}/documents/referenceId/{reference_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.contentwarehouse.v1.RequestMetadata requestMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RequestMetadata,
            com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>
        requestMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return Whether the requestMetadata field is set.
     */
    public boolean hasRequestMetadata() {
      return requestMetadataBuilder_ != null || requestMetadata_ != null;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return The requestMetadata.
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata() {
      if (requestMetadataBuilder_ == null) {
        return requestMetadata_ == null
            ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      } else {
        return requestMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(com.google.cloud.contentwarehouse.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestMetadata_ = value;
        onChanged();
      } else {
        requestMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(
        com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder builderForValue) {
      if (requestMetadataBuilder_ == null) {
        requestMetadata_ = builderForValue.build();
        onChanged();
      } else {
        requestMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder mergeRequestMetadata(
        com.google.cloud.contentwarehouse.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (requestMetadata_ != null) {
          requestMetadata_ =
              com.google.cloud.contentwarehouse.v1.RequestMetadata.newBuilder(requestMetadata_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          requestMetadata_ = value;
        }
        onChanged();
      } else {
        requestMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder clearRequestMetadata() {
      if (requestMetadataBuilder_ == null) {
        requestMetadata_ = null;
        onChanged();
      } else {
        requestMetadata_ = null;
        requestMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder
        getRequestMetadataBuilder() {

      onChanged();
      return getRequestMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder
        getRequestMetadataOrBuilder() {
      if (requestMetadataBuilder_ != null) {
        return requestMetadataBuilder_.getMessageOrBuilder();
      } else {
        return requestMetadata_ == null
            ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the end user, used to enforce access
     * control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RequestMetadata,
            com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>
        getRequestMetadataFieldBuilder() {
      if (requestMetadataBuilder_ == null) {
        requestMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.RequestMetadata,
                com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
                com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>(
                getRequestMetadata(), getParentForChildren(), isClean());
        requestMetadata_ = null;
      }
      return requestMetadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.GetDocumentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.GetDocumentRequest)
  private static final com.google.cloud.contentwarehouse.v1.GetDocumentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.GetDocumentRequest();
  }

  public static com.google.cloud.contentwarehouse.v1.GetDocumentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDocumentRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetDocumentRequest>() {
        @java.lang.Override
        public GetDocumentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDocumentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDocumentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.GetDocumentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
