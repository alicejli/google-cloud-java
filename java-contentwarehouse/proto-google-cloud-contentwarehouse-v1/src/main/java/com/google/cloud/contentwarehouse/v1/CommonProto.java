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
// source: google/cloud/contentwarehouse/v1/common.proto

package com.google.cloud.contentwarehouse.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_RequestMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ResponseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ResponseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_MergeFieldsOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_MergeFieldsOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/contentwarehouse/v1/commo"
          + "n.proto\022 google.cloud.contentwarehouse.v"
          + "1\032\031google/api/resource.proto\032 google/pro"
          + "tobuf/field_mask.proto\"P\n\017RequestMetadat"
          + "a\022=\n\tuser_info\030\001 \001(\0132*.google.cloud.cont"
          + "entwarehouse.v1.UserInfo\"&\n\020ResponseMeta"
          + "data\022\022\n\nrequest_id\030\001 \001(\t\")\n\010UserInfo\022\n\n\002"
          + "id\030\001 \001(\t\022\021\n\tgroup_ids\030\002 \003(\t\"\327\001\n\rUpdateOp"
          + "tions\022A\n\013update_type\030\001 \001(\0162,.google.clou"
          + "d.contentwarehouse.v1.UpdateType\022/\n\013upda"
          + "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas"
          + "k\022R\n\024merge_fields_options\030\003 \001(\01324.google"
          + ".cloud.contentwarehouse.v1.MergeFieldsOp"
          + "tions\"\226\001\n\022MergeFieldsOptions\022#\n\026replace_"
          + "message_fields\030\001 \001(\010H\000\210\001\001\022$\n\027replace_rep"
          + "eated_fields\030\002 \001(\010H\001\210\001\001B\031\n\027_replace_mess"
          + "age_fieldsB\032\n\030_replace_repeated_fields*\336"
          + "\001\n\nUpdateType\022\033\n\027UPDATE_TYPE_UNSPECIFIED"
          + "\020\000\022\027\n\023UPDATE_TYPE_REPLACE\020\001\022\025\n\021UPDATE_TY"
          + "PE_MERGE\020\002\022*\n&UPDATE_TYPE_INSERT_PROPERT"
          + "IES_BY_NAMES\020\003\022+\n\'UPDATE_TYPE_REPLACE_PR"
          + "OPERTIES_BY_NAMES\020\004\022*\n&UPDATE_TYPE_DELET"
          + "E_PROPERTIES_BY_NAMES\020\005*O\n\014DatabaseType\022"
          + "\016\n\nDB_UNKNOWN\020\000\022\024\n\020DB_INFRA_SPANNER\020\001\022\031\n"
          + "\025DB_CLOUD_SQL_POSTGRES\020\002*\252\001\n\021AccessContr"
          + "olMode\022\024\n\020ACL_MODE_UNKNOWN\020\000\022\035\n\031ACL_MODE"
          + "_UNIVERSAL_ACCESS\020\001\0220\n,ACL_MODE_DOCUMENT"
          + "_LEVEL_ACCESS_CONTROL_BYOID\020\002\022.\n*ACL_MOD"
          + "E_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI\020\003B\335\001"
          + "\n$com.google.cloud.contentwarehouse.v1B\013"
          + "CommonProtoP\001ZPgoogle.golang.org/genprot"
          + "o/googleapis/cloud/contentwarehouse/v1;c"
          + "ontentwarehouse\352AS\n(contentwarehouse.goo"
          + "gleapis.com/Location\022\'projects/{project}"
          + "/locations/{location}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_RequestMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_RequestMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_RequestMetadata_descriptor,
            new java.lang.String[] {
              "UserInfo",
            });
    internal_static_google_cloud_contentwarehouse_v1_ResponseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_ResponseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ResponseMetadata_descriptor,
            new java.lang.String[] {
              "RequestId",
            });
    internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor,
            new java.lang.String[] {
              "Id", "GroupIds",
            });
    internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor,
            new java.lang.String[] {
              "UpdateType", "UpdateMask", "MergeFieldsOptions",
            });
    internal_static_google_cloud_contentwarehouse_v1_MergeFieldsOptions_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_MergeFieldsOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_MergeFieldsOptions_descriptor,
            new java.lang.String[] {
              "ReplaceMessageFields",
              "ReplaceRepeatedFields",
              "ReplaceMessageFields",
              "ReplaceRepeatedFields",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
