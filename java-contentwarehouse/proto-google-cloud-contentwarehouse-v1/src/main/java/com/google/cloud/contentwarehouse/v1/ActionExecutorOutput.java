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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Represents the output of the Action Executor.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ActionExecutorOutput}
 */
public final class ActionExecutorOutput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ActionExecutorOutput)
    ActionExecutorOutputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ActionExecutorOutput.newBuilder() to construct.
  private ActionExecutorOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ActionExecutorOutput() {
    ruleActionsPairs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ActionExecutorOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.class,
            com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.Builder.class);
  }

  public static final int RULE_ACTIONS_PAIRS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair> ruleActionsPairs_;
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair>
      getRuleActionsPairsList() {
    return ruleActionsPairs_;
  }
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>
      getRuleActionsPairsOrBuilderList() {
    return ruleActionsPairs_;
  }
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  @java.lang.Override
  public int getRuleActionsPairsCount() {
    return ruleActionsPairs_.size();
  }
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RuleActionsPair getRuleActionsPairs(int index) {
    return ruleActionsPairs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder getRuleActionsPairsOrBuilder(
      int index) {
    return ruleActionsPairs_.get(index);
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
    for (int i = 0; i < ruleActionsPairs_.size(); i++) {
      output.writeMessage(1, ruleActionsPairs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ruleActionsPairs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, ruleActionsPairs_.get(i));
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ActionExecutorOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ActionExecutorOutput other =
        (com.google.cloud.contentwarehouse.v1.ActionExecutorOutput) obj;

    if (!getRuleActionsPairsList().equals(other.getRuleActionsPairsList())) return false;
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
    if (getRuleActionsPairsCount() > 0) {
      hash = (37 * hash) + RULE_ACTIONS_PAIRS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleActionsPairsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput parseFrom(
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
      com.google.cloud.contentwarehouse.v1.ActionExecutorOutput prototype) {
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
   * Represents the output of the Action Executor.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ActionExecutorOutput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ActionExecutorOutput)
      com.google.cloud.contentwarehouse.v1.ActionExecutorOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.class,
              com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ruleActionsPairsBuilder_ == null) {
        ruleActionsPairs_ = java.util.Collections.emptyList();
      } else {
        ruleActionsPairs_ = null;
        ruleActionsPairsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionExecutorOutput getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionExecutorOutput build() {
      com.google.cloud.contentwarehouse.v1.ActionExecutorOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionExecutorOutput buildPartial() {
      com.google.cloud.contentwarehouse.v1.ActionExecutorOutput result =
          new com.google.cloud.contentwarehouse.v1.ActionExecutorOutput(this);
      int from_bitField0_ = bitField0_;
      if (ruleActionsPairsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ruleActionsPairs_ = java.util.Collections.unmodifiableList(ruleActionsPairs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ruleActionsPairs_ = ruleActionsPairs_;
      } else {
        result.ruleActionsPairs_ = ruleActionsPairsBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.ActionExecutorOutput) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ActionExecutorOutput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.ActionExecutorOutput other) {
      if (other == com.google.cloud.contentwarehouse.v1.ActionExecutorOutput.getDefaultInstance())
        return this;
      if (ruleActionsPairsBuilder_ == null) {
        if (!other.ruleActionsPairs_.isEmpty()) {
          if (ruleActionsPairs_.isEmpty()) {
            ruleActionsPairs_ = other.ruleActionsPairs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuleActionsPairsIsMutable();
            ruleActionsPairs_.addAll(other.ruleActionsPairs_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleActionsPairs_.isEmpty()) {
          if (ruleActionsPairsBuilder_.isEmpty()) {
            ruleActionsPairsBuilder_.dispose();
            ruleActionsPairsBuilder_ = null;
            ruleActionsPairs_ = other.ruleActionsPairs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ruleActionsPairsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRuleActionsPairsFieldBuilder()
                    : null;
          } else {
            ruleActionsPairsBuilder_.addAllMessages(other.ruleActionsPairs_);
          }
        }
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
                com.google.cloud.contentwarehouse.v1.RuleActionsPair m =
                    input.readMessage(
                        com.google.cloud.contentwarehouse.v1.RuleActionsPair.parser(),
                        extensionRegistry);
                if (ruleActionsPairsBuilder_ == null) {
                  ensureRuleActionsPairsIsMutable();
                  ruleActionsPairs_.add(m);
                } else {
                  ruleActionsPairsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair> ruleActionsPairs_ =
        java.util.Collections.emptyList();

    private void ensureRuleActionsPairsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ruleActionsPairs_ =
            new java.util.ArrayList<com.google.cloud.contentwarehouse.v1.RuleActionsPair>(
                ruleActionsPairs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RuleActionsPair,
            com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder,
            com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>
        ruleActionsPairsBuilder_;

    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair>
        getRuleActionsPairsList() {
      if (ruleActionsPairsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleActionsPairs_);
      } else {
        return ruleActionsPairsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public int getRuleActionsPairsCount() {
      if (ruleActionsPairsBuilder_ == null) {
        return ruleActionsPairs_.size();
      } else {
        return ruleActionsPairsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair getRuleActionsPairs(int index) {
      if (ruleActionsPairsBuilder_ == null) {
        return ruleActionsPairs_.get(index);
      } else {
        return ruleActionsPairsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder setRuleActionsPairs(
        int index, com.google.cloud.contentwarehouse.v1.RuleActionsPair value) {
      if (ruleActionsPairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.set(index, value);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder setRuleActionsPairs(
        int index, com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder builderForValue) {
      if (ruleActionsPairsBuilder_ == null) {
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleActionsPairsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder addRuleActionsPairs(com.google.cloud.contentwarehouse.v1.RuleActionsPair value) {
      if (ruleActionsPairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.add(value);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder addRuleActionsPairs(
        int index, com.google.cloud.contentwarehouse.v1.RuleActionsPair value) {
      if (ruleActionsPairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.add(index, value);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder addRuleActionsPairs(
        com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder builderForValue) {
      if (ruleActionsPairsBuilder_ == null) {
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.add(builderForValue.build());
        onChanged();
      } else {
        ruleActionsPairsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder addRuleActionsPairs(
        int index, com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder builderForValue) {
      if (ruleActionsPairsBuilder_ == null) {
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleActionsPairsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder addAllRuleActionsPairs(
        java.lang.Iterable<? extends com.google.cloud.contentwarehouse.v1.RuleActionsPair> values) {
      if (ruleActionsPairsBuilder_ == null) {
        ensureRuleActionsPairsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ruleActionsPairs_);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder clearRuleActionsPairs() {
      if (ruleActionsPairsBuilder_ == null) {
        ruleActionsPairs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public Builder removeRuleActionsPairs(int index) {
      if (ruleActionsPairsBuilder_ == null) {
        ensureRuleActionsPairsIsMutable();
        ruleActionsPairs_.remove(index);
        onChanged();
      } else {
        ruleActionsPairsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder getRuleActionsPairsBuilder(
        int index) {
      return getRuleActionsPairsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder
        getRuleActionsPairsOrBuilder(int index) {
      if (ruleActionsPairsBuilder_ == null) {
        return ruleActionsPairs_.get(index);
      } else {
        return ruleActionsPairsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>
        getRuleActionsPairsOrBuilderList() {
      if (ruleActionsPairsBuilder_ != null) {
        return ruleActionsPairsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleActionsPairs_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder
        addRuleActionsPairsBuilder() {
      return getRuleActionsPairsFieldBuilder()
          .addBuilder(com.google.cloud.contentwarehouse.v1.RuleActionsPair.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder addRuleActionsPairsBuilder(
        int index) {
      return getRuleActionsPairsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.contentwarehouse.v1.RuleActionsPair.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of rule and corresponding actions result.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder>
        getRuleActionsPairsBuilderList() {
      return getRuleActionsPairsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RuleActionsPair,
            com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder,
            com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>
        getRuleActionsPairsFieldBuilder() {
      if (ruleActionsPairsBuilder_ == null) {
        ruleActionsPairsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.RuleActionsPair,
                com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder,
                com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>(
                ruleActionsPairs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ruleActionsPairs_ = null;
      }
      return ruleActionsPairsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ActionExecutorOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ActionExecutorOutput)
  private static final com.google.cloud.contentwarehouse.v1.ActionExecutorOutput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ActionExecutorOutput();
  }

  public static com.google.cloud.contentwarehouse.v1.ActionExecutorOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionExecutorOutput> PARSER =
      new com.google.protobuf.AbstractParser<ActionExecutorOutput>() {
        @java.lang.Override
        public ActionExecutorOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActionExecutorOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionExecutorOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ActionExecutorOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
