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
// source: google/cloud/discoveryengine/v1beta/schema_service.proto

package com.google.cloud.discoveryengine.v1beta;

public final class SchemaServiceProto {
  private SchemaServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSchemasRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSchemasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSchemasResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSchemasResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1beta/sc"
          + "hema_service.proto\022#google.cloud.discove"
          + "ryengine.v1beta\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0320google/cloud/discoveryengine"
          + "/v1beta/schema.proto\032#google/longrunning"
          + "/operations.proto\032\033google/protobuf/empty"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "P\n\020GetSchemaRequest\022<\n\004name\030\001 \001(\tB.\342A\001\002\372"
          + "A\'\n%discoveryengine.googleapis.com/Schem"
          + "a\"~\n\022ListSchemasRequest\022A\n\006parent\030\001 \001(\tB"
          + "1\342A\001\002\372A*\n(discoveryengine.googleapis.com"
          + "/DataStore\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to"
          + "ken\030\003 \001(\t\"l\n\023ListSchemasResponse\022<\n\007sche"
          + "mas\030\001 \003(\0132+.google.cloud.discoveryengine"
          + ".v1beta.Schema\022\027\n\017next_page_token\030\002 \001(\t\""
          + "\264\001\n\023CreateSchemaRequest\022A\n\006parent\030\001 \001(\tB"
          + "1\342A\001\002\372A*\n(discoveryengine.googleapis.com"
          + "/DataStore\022A\n\006schema\030\002 \001(\0132+.google.clou"
          + "d.discoveryengine.v1beta.SchemaB\004\342A\001\002\022\027\n"
          + "\tschema_id\030\003 \001(\tB\004\342A\001\002\"o\n\023UpdateSchemaRe"
          + "quest\022A\n\006schema\030\001 \001(\0132+.google.cloud.dis"
          + "coveryengine.v1beta.SchemaB\004\342A\001\002\022\025\n\rallo"
          + "w_missing\030\003 \001(\010\"S\n\023DeleteSchemaRequest\022<"
          + "\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%discoveryengine.g"
          + "oogleapis.com/Schema\"x\n\024CreateSchemaMeta"
          + "data\022/\n\013create_time\030\001 \001(\0132\032.google.proto"
          + "buf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"x\n\024UpdateSchemaMe"
          + "tadata\022/\n\013create_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\"x\n\024DeleteSchema"
          + "Metadata\022/\n\013create_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032"
          + ".google.protobuf.Timestamp2\211\016\n\rSchemaSer"
          + "vice\022\214\002\n\tGetSchema\0225.google.cloud.discov"
          + "eryengine.v1beta.GetSchemaRequest\032+.goog"
          + "le.cloud.discoveryengine.v1beta.Schema\"\232"
          + "\001\332A\004name\202\323\344\223\002\214\001\022</v1beta/{name=projects/"
          + "*/locations/*/dataStores/*/schemas/*}ZL\022"
          + "J/v1beta/{name=projects/*/locations/*/co"
          + "llections/*/dataStores/*/schemas/*}\022\237\002\n\013"
          + "ListSchemas\0227.google.cloud.discoveryengi"
          + "ne.v1beta.ListSchemasRequest\0328.google.cl"
          + "oud.discoveryengine.v1beta.ListSchemasRe"
          + "sponse\"\234\001\332A\006parent\202\323\344\223\002\214\001\022</v1beta/{pare"
          + "nt=projects/*/locations/*/dataStores/*}/"
          + "schemasZL\022J/v1beta/{parent=projects/*/lo"
          + "cations/*/collections/*/dataStores/*}/sc"
          + "hemas\022\220\003\n\014CreateSchema\0228.google.cloud.di"
          + "scoveryengine.v1beta.CreateSchemaRequest"
          + "\032\035.google.longrunning.Operation\"\246\002\312Af\n*g"
          + "oogle.cloud.discoveryengine.v1beta.Schem"
          + "a\0228google.cloud.discoveryengine.v1beta.C"
          + "reateSchemaMetadata\332A\027parent,schema,sche"
          + "ma_id\202\323\344\223\002\234\001\"</v1beta/{parent=projects/*"
          + "/locations/*/dataStores/*}/schemas:\006sche"
          + "maZT\"J/v1beta/{parent=projects/*/locatio"
          + "ns/*/collections/*/dataStores/*}/schemas"
          + ":\006schema\022\204\003\n\014UpdateSchema\0228.google.cloud"
          + ".discoveryengine.v1beta.UpdateSchemaRequ"
          + "est\032\035.google.longrunning.Operation\"\232\002\312Af"
          + "\n*google.cloud.discoveryengine.v1beta.Sc"
          + "hema\0228google.cloud.discoveryengine.v1bet"
          + "a.UpdateSchemaMetadata\202\323\344\223\002\252\0012C/v1beta/{"
          + "schema.name=projects/*/locations/*/dataS"
          + "tores/*/schemas/*}:\006schemaZ[2Q/v1beta/{s"
          + "chema.name=projects/*/locations/*/collec"
          + "tions/*/dataStores/*/schemas/*}:\006schema\022"
          + "\330\002\n\014DeleteSchema\0228.google.cloud.discover"
          + "yengine.v1beta.DeleteSchemaRequest\032\035.goo"
          + "gle.longrunning.Operation\"\356\001\312AQ\n\025google."
          + "protobuf.Empty\0228google.cloud.discoveryen"
          + "gine.v1beta.DeleteSchemaMetadata\332A\004name\202"
          + "\323\344\223\002\214\001*</v1beta/{name=projects/*/locatio"
          + "ns/*/dataStores/*/schemas/*}ZL*J/v1beta/"
          + "{name=projects/*/locations/*/collections"
          + "/*/dataStores/*/schemas/*}\032R\312A\036discovery"
          + "engine.googleapis.com\322A.https://www.goog"
          + "leapis.com/auth/cloud-platformB\231\002\n\'com.g"
          + "oogle.cloud.discoveryengine.v1betaB\022Sche"
          + "maServiceProtoP\001ZQcloud.google.com/go/di"
          + "scoveryengine/apiv1beta/discoveryenginep"
          + "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002#"
          + "Google.Cloud.DiscoveryEngine.V1Beta\312\002#Go"
          + "ogle\\Cloud\\DiscoveryEngine\\V1beta\352\002&Goog"
          + "le::Cloud::DiscoveryEngine::V1betab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SchemaProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_GetSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetSchemaRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSchemasRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ListSchemasRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSchemasRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSchemasResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_ListSchemasResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSchemasResponse_descriptor,
            new java.lang.String[] {
              "Schemas", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Schema", "SchemaId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor,
            new java.lang.String[] {
              "Schema", "AllowMissing",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateSchemaMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteSchemaMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SchemaProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
