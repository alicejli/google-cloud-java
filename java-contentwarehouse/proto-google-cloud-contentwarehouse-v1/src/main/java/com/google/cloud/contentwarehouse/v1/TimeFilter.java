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
// source: google/cloud/contentwarehouse/v1/filters.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Filter on create timestamp or update timestamp of documents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.TimeFilter}
 */
public final class TimeFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.TimeFilter)
    TimeFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeFilter.newBuilder() to construct.
  private TimeFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeFilter() {
    timeField_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimeFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.FiltersProto
        .internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.FiltersProto
        .internal_static_google_cloud_contentwarehouse_v1_TimeFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.TimeFilter.class,
            com.google.cloud.contentwarehouse.v1.TimeFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Time field used in TimeFilter.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.contentwarehouse.v1.TimeFilter.TimeField}
   */
  public enum TimeField implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>TIME_FIELD_UNSPECIFIED = 0;</code>
     */
    TIME_FIELD_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Earliest document create time.
     * </pre>
     *
     * <code>CREATE_TIME = 1;</code>
     */
    CREATE_TIME(1),
    /**
     *
     *
     * <pre>
     * Latest document update time.
     * </pre>
     *
     * <code>UPDATE_TIME = 2;</code>
     */
    UPDATE_TIME(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>TIME_FIELD_UNSPECIFIED = 0;</code>
     */
    public static final int TIME_FIELD_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Earliest document create time.
     * </pre>
     *
     * <code>CREATE_TIME = 1;</code>
     */
    public static final int CREATE_TIME_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Latest document update time.
     * </pre>
     *
     * <code>UPDATE_TIME = 2;</code>
     */
    public static final int UPDATE_TIME_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimeField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TimeField forNumber(int value) {
      switch (value) {
        case 0:
          return TIME_FIELD_UNSPECIFIED;
        case 1:
          return CREATE_TIME;
        case 2:
          return UPDATE_TIME;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TimeField> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TimeField> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TimeField>() {
          public TimeField findValueByNumber(int number) {
            return TimeField.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.TimeFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final TimeField[] VALUES = values();

    public static TimeField valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TimeField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.TimeFilter.TimeField)
  }

  public static final int TIME_RANGE_FIELD_NUMBER = 1;
  private com.google.type.Interval timeRange_;
  /**
   * <code>.google.type.Interval time_range = 1;</code>
   *
   * @return Whether the timeRange field is set.
   */
  @java.lang.Override
  public boolean hasTimeRange() {
    return timeRange_ != null;
  }
  /**
   * <code>.google.type.Interval time_range = 1;</code>
   *
   * @return The timeRange.
   */
  @java.lang.Override
  public com.google.type.Interval getTimeRange() {
    return timeRange_ == null ? com.google.type.Interval.getDefaultInstance() : timeRange_;
  }
  /** <code>.google.type.Interval time_range = 1;</code> */
  @java.lang.Override
  public com.google.type.IntervalOrBuilder getTimeRangeOrBuilder() {
    return getTimeRange();
  }

  public static final int TIME_FIELD_FIELD_NUMBER = 2;
  private int timeField_;
  /**
   *
   *
   * <pre>
   * Specifies which time field to filter documents on.
   * Defaults to [TimeField.UPLOAD_TIME][].
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
   *
   * @return The enum numeric value on the wire for timeField.
   */
  @java.lang.Override
  public int getTimeFieldValue() {
    return timeField_;
  }
  /**
   *
   *
   * <pre>
   * Specifies which time field to filter documents on.
   * Defaults to [TimeField.UPLOAD_TIME][].
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
   *
   * @return The timeField.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField getTimeField() {
    @SuppressWarnings("deprecation")
    com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField result =
        com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.valueOf(timeField_);
    return result == null
        ? com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.UNRECOGNIZED
        : result;
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
    if (timeRange_ != null) {
      output.writeMessage(1, getTimeRange());
    }
    if (timeField_
        != com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.TIME_FIELD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, timeField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeRange_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeRange());
    }
    if (timeField_
        != com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.TIME_FIELD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, timeField_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.TimeFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.TimeFilter other =
        (com.google.cloud.contentwarehouse.v1.TimeFilter) obj;

    if (hasTimeRange() != other.hasTimeRange()) return false;
    if (hasTimeRange()) {
      if (!getTimeRange().equals(other.getTimeRange())) return false;
    }
    if (timeField_ != other.timeField_) return false;
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
    if (hasTimeRange()) {
      hash = (37 * hash) + TIME_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getTimeRange().hashCode();
    }
    hash = (37 * hash) + TIME_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + timeField_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.TimeFilter prototype) {
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
   * Filter on create timestamp or update timestamp of documents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.TimeFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.TimeFilter)
      com.google.cloud.contentwarehouse.v1.TimeFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_TimeFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.TimeFilter.class,
              com.google.cloud.contentwarehouse.v1.TimeFilter.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.TimeFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timeRangeBuilder_ == null) {
        timeRange_ = null;
      } else {
        timeRange_ = null;
        timeRangeBuilder_ = null;
      }
      timeField_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimeFilter getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.TimeFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimeFilter build() {
      com.google.cloud.contentwarehouse.v1.TimeFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimeFilter buildPartial() {
      com.google.cloud.contentwarehouse.v1.TimeFilter result =
          new com.google.cloud.contentwarehouse.v1.TimeFilter(this);
      if (timeRangeBuilder_ == null) {
        result.timeRange_ = timeRange_;
      } else {
        result.timeRange_ = timeRangeBuilder_.build();
      }
      result.timeField_ = timeField_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.TimeFilter) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.TimeFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.TimeFilter other) {
      if (other == com.google.cloud.contentwarehouse.v1.TimeFilter.getDefaultInstance())
        return this;
      if (other.hasTimeRange()) {
        mergeTimeRange(other.getTimeRange());
      }
      if (other.timeField_ != 0) {
        setTimeFieldValue(other.getTimeFieldValue());
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
                input.readMessage(getTimeRangeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 16:
              {
                timeField_ = input.readEnum();

                break;
              } // case 16
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

    private com.google.type.Interval timeRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Interval,
            com.google.type.Interval.Builder,
            com.google.type.IntervalOrBuilder>
        timeRangeBuilder_;
    /**
     * <code>.google.type.Interval time_range = 1;</code>
     *
     * @return Whether the timeRange field is set.
     */
    public boolean hasTimeRange() {
      return timeRangeBuilder_ != null || timeRange_ != null;
    }
    /**
     * <code>.google.type.Interval time_range = 1;</code>
     *
     * @return The timeRange.
     */
    public com.google.type.Interval getTimeRange() {
      if (timeRangeBuilder_ == null) {
        return timeRange_ == null ? com.google.type.Interval.getDefaultInstance() : timeRange_;
      } else {
        return timeRangeBuilder_.getMessage();
      }
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public Builder setTimeRange(com.google.type.Interval value) {
      if (timeRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeRange_ = value;
        onChanged();
      } else {
        timeRangeBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public Builder setTimeRange(com.google.type.Interval.Builder builderForValue) {
      if (timeRangeBuilder_ == null) {
        timeRange_ = builderForValue.build();
        onChanged();
      } else {
        timeRangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public Builder mergeTimeRange(com.google.type.Interval value) {
      if (timeRangeBuilder_ == null) {
        if (timeRange_ != null) {
          timeRange_ =
              com.google.type.Interval.newBuilder(timeRange_).mergeFrom(value).buildPartial();
        } else {
          timeRange_ = value;
        }
        onChanged();
      } else {
        timeRangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public Builder clearTimeRange() {
      if (timeRangeBuilder_ == null) {
        timeRange_ = null;
        onChanged();
      } else {
        timeRange_ = null;
        timeRangeBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public com.google.type.Interval.Builder getTimeRangeBuilder() {

      onChanged();
      return getTimeRangeFieldBuilder().getBuilder();
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    public com.google.type.IntervalOrBuilder getTimeRangeOrBuilder() {
      if (timeRangeBuilder_ != null) {
        return timeRangeBuilder_.getMessageOrBuilder();
      } else {
        return timeRange_ == null ? com.google.type.Interval.getDefaultInstance() : timeRange_;
      }
    }
    /** <code>.google.type.Interval time_range = 1;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Interval,
            com.google.type.Interval.Builder,
            com.google.type.IntervalOrBuilder>
        getTimeRangeFieldBuilder() {
      if (timeRangeBuilder_ == null) {
        timeRangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Interval,
                com.google.type.Interval.Builder,
                com.google.type.IntervalOrBuilder>(
                getTimeRange(), getParentForChildren(), isClean());
        timeRange_ = null;
      }
      return timeRangeBuilder_;
    }

    private int timeField_ = 0;
    /**
     *
     *
     * <pre>
     * Specifies which time field to filter documents on.
     * Defaults to [TimeField.UPLOAD_TIME][].
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
     *
     * @return The enum numeric value on the wire for timeField.
     */
    @java.lang.Override
    public int getTimeFieldValue() {
      return timeField_;
    }
    /**
     *
     *
     * <pre>
     * Specifies which time field to filter documents on.
     * Defaults to [TimeField.UPLOAD_TIME][].
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
     *
     * @param value The enum numeric value on the wire for timeField to set.
     * @return This builder for chaining.
     */
    public Builder setTimeFieldValue(int value) {

      timeField_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which time field to filter documents on.
     * Defaults to [TimeField.UPLOAD_TIME][].
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
     *
     * @return The timeField.
     */
    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField getTimeField() {
      @SuppressWarnings("deprecation")
      com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField result =
          com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.valueOf(timeField_);
      return result == null
          ? com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specifies which time field to filter documents on.
     * Defaults to [TimeField.UPLOAD_TIME][].
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
     *
     * @param value The timeField to set.
     * @return This builder for chaining.
     */
    public Builder setTimeField(com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField value) {
      if (value == null) {
        throw new NullPointerException();
      }

      timeField_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which time field to filter documents on.
     * Defaults to [TimeField.UPLOAD_TIME][].
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeField() {

      timeField_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.TimeFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.TimeFilter)
  private static final com.google.cloud.contentwarehouse.v1.TimeFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.TimeFilter();
  }

  public static com.google.cloud.contentwarehouse.v1.TimeFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeFilter> PARSER =
      new com.google.protobuf.AbstractParser<TimeFilter>() {
        @java.lang.Override
        public TimeFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.TimeFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
