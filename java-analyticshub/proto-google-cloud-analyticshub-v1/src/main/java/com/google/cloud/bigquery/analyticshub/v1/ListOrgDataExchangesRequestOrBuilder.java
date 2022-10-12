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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

public interface ListOrgDataExchangesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.ListOrgDataExchangesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The organization resource path of the projects containing DataExchanges.
   * e.g. `organizations/myorg/locations/US`.
   * </pre>
   *
   * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   *
   *
   * <pre>
   * Required. The organization resource path of the projects containing DataExchanges.
   * e.g. `organizations/myorg/locations/US`.
   * </pre>
   *
   * <code>string organization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString getOrganizationBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response page. Leverage
   * the page tokens to iterate through the entire collection.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Page token, returned by a previous call, to request the next page of
   * results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Page token, returned by a previous call, to request the next page of
   * results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
