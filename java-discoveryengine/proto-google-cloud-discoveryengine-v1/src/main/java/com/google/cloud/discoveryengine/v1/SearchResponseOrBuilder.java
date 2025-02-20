/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1/search_service.proto

package com.google.cloud.discoveryengine.v1;

public interface SearchResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult> getResultsList();
  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult getResults(int index);
  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The estimated total count of matched items irrespective of pagination. The
   * count of [results][google.cloud.discoveryengine.v1.SearchResponse.results]
   * returned by pagination may be less than the
   * [total_size][google.cloud.discoveryengine.v1.SearchResponse.total_size]
   * that matches.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this search, which enables accurate attribution of search model
   * performance.
   * </pre>
   *
   * <code>string attribution_token = 4;</code>
   *
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();
  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this search, which enables accurate attribution of search model
   * performance.
   * </pre>
   *
   * <code>string attribution_token = 4;</code>
   *
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString getAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.discoveryengine.v1.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 5;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.discoveryengine.v1.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 5;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 7;</code>
   *
   * @return The correctedQuery.
   */
  java.lang.String getCorrectedQuery();
  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 7;</code>
   *
   * @return The bytes for correctedQuery.
   */
  com.google.protobuf.ByteString getCorrectedQueryBytes();
}
