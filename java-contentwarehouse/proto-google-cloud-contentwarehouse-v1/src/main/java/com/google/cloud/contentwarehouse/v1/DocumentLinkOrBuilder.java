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
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

public interface DocumentLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DocumentLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of this document-link.
   * It is required that the parent derived form the name to be consistent with
   * the source document reference. Otherwise an exception will be thrown.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}/documentLinks/{document_link_id}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of this document-link.
   * It is required that the parent derived form the name to be consistent with
   * the source document reference. Otherwise an exception will be thrown.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}/documentLinks/{document_link_id}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Document references of the source document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference source_document_reference = 2;</code>
   *
   * @return Whether the sourceDocumentReference field is set.
   */
  boolean hasSourceDocumentReference();
  /**
   *
   *
   * <pre>
   * Document references of the source document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference source_document_reference = 2;</code>
   *
   * @return The sourceDocumentReference.
   */
  com.google.cloud.contentwarehouse.v1.DocumentReference getSourceDocumentReference();
  /**
   *
   *
   * <pre>
   * Document references of the source document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference source_document_reference = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentReferenceOrBuilder
      getSourceDocumentReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Document references of the target document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference target_document_reference = 3;</code>
   *
   * @return Whether the targetDocumentReference field is set.
   */
  boolean hasTargetDocumentReference();
  /**
   *
   *
   * <pre>
   * Document references of the target document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference target_document_reference = 3;</code>
   *
   * @return The targetDocumentReference.
   */
  com.google.cloud.contentwarehouse.v1.DocumentReference getTargetDocumentReference();
  /**
   *
   *
   * <pre>
   * Document references of the target document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentReference target_document_reference = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentReferenceOrBuilder
      getTargetDocumentReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of this document-link.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of this document-link.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the documentLink is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The state of the documentlink. If target node has been deleted, the
   * link is marked as invalid. Removing a source node will result in removal
   * of all associated links.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentLink.State state = 7;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the documentlink. If target node has been deleted, the
   * link is marked as invalid. Removing a source node will result in removal
   * of all associated links.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentLink.State state = 7;</code>
   *
   * @return The state.
   */
  com.google.cloud.contentwarehouse.v1.DocumentLink.State getState();
}
