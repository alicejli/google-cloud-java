/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.PacketMirroringsClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.PacketMirroringsClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListPacketMirroringsRequest;
import com.google.cloud.compute.v1.DeletePacketMirroringRequest;
import com.google.cloud.compute.v1.GetPacketMirroringRequest;
import com.google.cloud.compute.v1.InsertPacketMirroringRequest;
import com.google.cloud.compute.v1.ListPacketMirroringsRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PacketMirroring;
import com.google.cloud.compute.v1.PacketMirroringAggregatedList;
import com.google.cloud.compute.v1.PacketMirroringList;
import com.google.cloud.compute.v1.PatchPacketMirroringRequest;
import com.google.cloud.compute.v1.TestIamPermissionsPacketMirroringRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the PacketMirrorings service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonPacketMirroringsStub extends PacketMirroringsStub {
  private static final ApiMethodDescriptor<
          AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListPacketMirroringsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/packetMirrorings",
                          new FieldsExtractor<
                              AggregatedListPacketMirroringsRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                AggregatedListPacketMirroringsRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListPacketMirroringsRequest>
                                  serializer = ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              AggregatedListPacketMirroringsRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                AggregatedListPacketMirroringsRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListPacketMirroringsRequest>
                                  serializer = ProtoRestSerializer.create();
                              if (request.hasFilter()) {
                                serializer.putQueryParam(fields, "filter", request.getFilter());
                              }
                              if (request.hasIncludeAllScopes()) {
                                serializer.putQueryParam(
                                    fields, "includeAllScopes", request.getIncludeAllScopes());
                              }
                              if (request.hasMaxResults()) {
                                serializer.putQueryParam(
                                    fields, "maxResults", request.getMaxResults());
                              }
                              if (request.hasOrderBy()) {
                                serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              }
                              if (request.hasPageToken()) {
                                serializer.putQueryParam(
                                    fields, "pageToken", request.getPageToken());
                              }
                              if (request.hasReturnPartialSuccess()) {
                                serializer.putQueryParam(
                                    fields,
                                    "returnPartialSuccess",
                                    request.getReturnPartialSuccess());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<AggregatedListPacketMirroringsRequest, String>() {
                            @Override
                            public String extract(AggregatedListPacketMirroringsRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<PacketMirroringAggregatedList>newBuilder()
                      .setDefaultInstance(PacketMirroringAggregatedList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeletePacketMirroringRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeletePacketMirroringRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeletePacketMirroringRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings/{packetMirroring}",
                          new FieldsExtractor<DeletePacketMirroringRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                DeletePacketMirroringRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<DeletePacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(
                                  fields, "packetMirroring", request.getPacketMirroring());
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              DeletePacketMirroringRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                DeletePacketMirroringRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<DeletePacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<DeletePacketMirroringRequest, String>() {
                            @Override
                            public String extract(DeletePacketMirroringRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetPacketMirroringRequest, PacketMirroring>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetPacketMirroringRequest, PacketMirroring>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetPacketMirroringRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings/{packetMirroring}",
                          new FieldsExtractor<GetPacketMirroringRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(GetPacketMirroringRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<GetPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(
                                  fields, "packetMirroring", request.getPacketMirroring());
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              GetPacketMirroringRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                GetPacketMirroringRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<GetPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<GetPacketMirroringRequest, String>() {
                            @Override
                            public String extract(GetPacketMirroringRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<PacketMirroring>newBuilder()
                      .setDefaultInstance(PacketMirroring.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<InsertPacketMirroringRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertPacketMirroringRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertPacketMirroringRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings",
                          new FieldsExtractor<InsertPacketMirroringRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                InsertPacketMirroringRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<InsertPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              InsertPacketMirroringRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                InsertPacketMirroringRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<InsertPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<InsertPacketMirroringRequest, String>() {
                            @Override
                            public String extract(InsertPacketMirroringRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "packetMirroringResource",
                                      request.getPacketMirroringResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListPacketMirroringsRequest, PacketMirroringList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListPacketMirroringsRequest, PacketMirroringList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListPacketMirroringsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings",
                          new FieldsExtractor<ListPacketMirroringsRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                ListPacketMirroringsRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListPacketMirroringsRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              ListPacketMirroringsRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListPacketMirroringsRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListPacketMirroringsRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasFilter()) {
                                serializer.putQueryParam(fields, "filter", request.getFilter());
                              }
                              if (request.hasMaxResults()) {
                                serializer.putQueryParam(
                                    fields, "maxResults", request.getMaxResults());
                              }
                              if (request.hasOrderBy()) {
                                serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              }
                              if (request.hasPageToken()) {
                                serializer.putQueryParam(
                                    fields, "pageToken", request.getPageToken());
                              }
                              if (request.hasReturnPartialSuccess()) {
                                serializer.putQueryParam(
                                    fields,
                                    "returnPartialSuccess",
                                    request.getReturnPartialSuccess());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<ListPacketMirroringsRequest, String>() {
                            @Override
                            public String extract(ListPacketMirroringsRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<PacketMirroringList>newBuilder()
                      .setDefaultInstance(PacketMirroringList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<PatchPacketMirroringRequest, Operation>
      patchMethodDescriptor =
          ApiMethodDescriptor.<PatchPacketMirroringRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/Patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PatchPacketMirroringRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings/{packetMirroring}",
                          new FieldsExtractor<PatchPacketMirroringRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                PatchPacketMirroringRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<PatchPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(
                                  fields, "packetMirroring", request.getPacketMirroring());
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              PatchPacketMirroringRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                PatchPacketMirroringRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<PatchPacketMirroringRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<PatchPacketMirroringRequest, String>() {
                            @Override
                            public String extract(PatchPacketMirroringRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "packetMirroringResource",
                                      request.getPacketMirroringResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          ApiMethodDescriptor
              .<TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.PacketMirrorings/TestIamPermissions")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter
                      .<TestIamPermissionsPacketMirroringRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/packetMirrorings/{resource}/testIamPermissions",
                          new FieldsExtractor<
                              TestIamPermissionsPacketMirroringRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                TestIamPermissionsPacketMirroringRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<TestIamPermissionsPacketMirroringRequest>
                                  serializer = ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              serializer.putPathParam(fields, "resource", request.getResource());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              TestIamPermissionsPacketMirroringRequest,
                              Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                TestIamPermissionsPacketMirroringRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<TestIamPermissionsPacketMirroringRequest>
                                  serializer = ProtoRestSerializer.create();
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<TestIamPermissionsPacketMirroringRequest, String>() {
                            @Override
                            public String extract(
                                TestIamPermissionsPacketMirroringRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "testPermissionsRequestResource",
                                      request.getTestPermissionsRequestResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<TestPermissionsResponse>newBuilder()
                      .setDefaultInstance(TestPermissionsResponse.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListPacketMirroringsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<DeletePacketMirroringRequest, Operation> deleteCallable;
  private final UnaryCallable<GetPacketMirroringRequest, PacketMirroring> getCallable;
  private final UnaryCallable<InsertPacketMirroringRequest, Operation> insertCallable;
  private final UnaryCallable<ListPacketMirroringsRequest, PacketMirroringList> listCallable;
  private final UnaryCallable<ListPacketMirroringsRequest, ListPagedResponse> listPagedCallable;
  private final UnaryCallable<PatchPacketMirroringRequest, Operation> patchCallable;
  private final UnaryCallable<TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>
      testIamPermissionsCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonPacketMirroringsStub create(PacketMirroringsStubSettings settings)
      throws IOException {
    return new HttpJsonPacketMirroringsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonPacketMirroringsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonPacketMirroringsStub(
        PacketMirroringsStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonPacketMirroringsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonPacketMirroringsStub(
        PacketMirroringsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonPacketMirroringsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonPacketMirroringsStub(
      PacketMirroringsStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonPacketMirroringsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonPacketMirroringsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonPacketMirroringsStub(
      PacketMirroringsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeletePacketMirroringRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeletePacketMirroringRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetPacketMirroringRequest, PacketMirroring> getTransportSettings =
        HttpJsonCallSettings.<GetPacketMirroringRequest, PacketMirroring>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertPacketMirroringRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertPacketMirroringRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListPacketMirroringsRequest, PacketMirroringList> listTransportSettings =
        HttpJsonCallSettings.<ListPacketMirroringsRequest, PacketMirroringList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchPacketMirroringRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchPacketMirroringRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();
    HttpJsonCallSettings<TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>
        testIamPermissionsTransportSettings =
            HttpJsonCallSettings
                .<TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.patchCallable =
        callableFactory.createUnaryCallable(
            patchTransportSettings, settings.patchSettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(aggregatedListMethodDescriptor);
    methodDescriptors.add(deleteMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(insertMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    methodDescriptors.add(patchMethodDescriptor);
    methodDescriptors.add(testIamPermissionsMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<AggregatedListPacketMirroringsRequest, PacketMirroringAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  @Override
  public UnaryCallable<AggregatedListPacketMirroringsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  @Override
  public UnaryCallable<DeletePacketMirroringRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @Override
  public UnaryCallable<GetPacketMirroringRequest, PacketMirroring> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<InsertPacketMirroringRequest, Operation> insertCallable() {
    return insertCallable;
  }

  @Override
  public UnaryCallable<ListPacketMirroringsRequest, PacketMirroringList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListPacketMirroringsRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public UnaryCallable<PatchPacketMirroringRequest, Operation> patchCallable() {
    return patchCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsPacketMirroringRequest, TestPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
