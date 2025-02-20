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
// source: google/cloud/retail/v2/model_service.proto

package com.google.cloud.retail.v2;

public final class ModelServiceProto {
  private ModelServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CreateModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CreateModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UpdateModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UpdateModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_GetModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_GetModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PauseModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PauseModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ResumeModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ResumeModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_DeleteModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_DeleteModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_TuneModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_TuneModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CreateModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CreateModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_TuneModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_TuneModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_TuneModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_TuneModelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/retail/v2/model_service.p"
          + "roto\022\026google.cloud.retail.v2\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032\"google/cloud/re"
          + "tail/v2/model.proto\032#google/longrunning/"
          + "operations.proto\032\033google/protobuf/empty."
          + "proto\032 google/protobuf/field_mask.proto\""
          + "\227\001\n\022CreateModelRequest\0226\n\006parent\030\001 \001(\tB&"
          + "\342A\001\002\372A\037\n\035retail.googleapis.com/Catalog\0222"
          + "\n\005model\030\002 \001(\0132\035.google.cloud.retail.v2.M"
          + "odelB\004\342A\001\002\022\025\n\007dry_run\030\003 \001(\010B\004\342A\001\001\"\177\n\022Upd"
          + "ateModelRequest\0222\n\005model\030\001 \001(\0132\035.google."
          + "cloud.retail.v2.ModelB\004\342A\001\002\0225\n\013update_ma"
          + "sk\030\002 \001(\0132\032.google.protobuf.FieldMaskB\004\342A"
          + "\001\001\"E\n\017GetModelRequest\0222\n\004name\030\001 \001(\tB$\342A\001"
          + "\002\372A\035\n\033retail.googleapis.com/Model\"G\n\021Pau"
          + "seModelRequest\0222\n\004name\030\001 \001(\tB$\342A\001\002\372A\035\n\033r"
          + "etail.googleapis.com/Model\"(\n\022ResumeMode"
          + "lRequest\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\"~\n\021ListMode"
          + "lsRequest\0226\n\006parent\030\001 \001(\tB&\342A\001\002\372A\037\n\035reta"
          + "il.googleapis.com/Catalog\022\027\n\tpage_size\030\002"
          + " \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\"H\n\022"
          + "DeleteModelRequest\0222\n\004name\030\001 \001(\tB$\342A\001\002\372A"
          + "\035\n\033retail.googleapis.com/Model\"\\\n\022ListMo"
          + "delsResponse\022-\n\006models\030\001 \003(\0132\035.google.cl"
          + "oud.retail.v2.Model\022\027\n\017next_page_token\030\002"
          + " \001(\t\"F\n\020TuneModelRequest\0222\n\004name\030\001 \001(\tB$"
          + "\342A\001\002\372A\035\n\033retail.googleapis.com/Model\"$\n\023"
          + "CreateModelMetadata\022\r\n\005model\030\001 \001(\t\"\"\n\021Tu"
          + "neModelMetadata\022\r\n\005model\030\001 \001(\t\"\023\n\021TuneMo"
          + "delResponse2\305\014\n\014ModelService\022\373\001\n\013CreateM"
          + "odel\022*.google.cloud.retail.v2.CreateMode"
          + "lRequest\032\035.google.longrunning.Operation\""
          + "\240\001\312AJ\n\034google.cloud.retail.v2.Model\022*goo"
          + "gle.cloud.retail.v2.CreateModelMetadata\332"
          + "A\014parent,model\202\323\344\223\002>\"5/v2/{parent=projec"
          + "ts/*/locations/*/catalogs/*}/models:\005mod"
          + "el\022\230\001\n\010GetModel\022\'.google.cloud.retail.v2"
          + ".GetModelRequest\032\035.google.cloud.retail.v"
          + "2.Model\"D\332A\004name\202\323\344\223\0027\0225/v2/{name=projec"
          + "ts/*/locations/*/catalogs/*/models/*}\022\245\001"
          + "\n\nPauseModel\022).google.cloud.retail.v2.Pa"
          + "useModelRequest\032\035.google.cloud.retail.v2"
          + ".Model\"M\332A\004name\202\323\344\223\002@\";/v2/{name=project"
          + "s/*/locations/*/catalogs/*/models/*}:pau"
          + "se:\001*\022\250\001\n\013ResumeModel\022*.google.cloud.ret"
          + "ail.v2.ResumeModelRequest\032\035.google.cloud"
          + ".retail.v2.Model\"N\332A\004name\202\323\344\223\002A\"</v2/{na"
          + "me=projects/*/locations/*/catalogs/*/mod"
          + "els/*}:resume:\001*\022\227\001\n\013DeleteModel\022*.googl"
          + "e.cloud.retail.v2.DeleteModelRequest\032\026.g"
          + "oogle.protobuf.Empty\"D\332A\004name\202\323\344\223\0027*5/v2"
          + "/{name=projects/*/locations/*/catalogs/*"
          + "/models/*}\022\253\001\n\nListModels\022).google.cloud"
          + ".retail.v2.ListModelsRequest\032*.google.cl"
          + "oud.retail.v2.ListModelsResponse\"F\332A\006par"
          + "ent\202\323\344\223\0027\0225/v2/{parent=projects/*/locati"
          + "ons/*/catalogs/*}/models\022\270\001\n\013UpdateModel"
          + "\022*.google.cloud.retail.v2.UpdateModelReq"
          + "uest\032\035.google.cloud.retail.v2.Model\"^\332A\021"
          + "model,update_mask\202\323\344\223\002D2;/v2/{model.name"
          + "=projects/*/locations/*/catalogs/*/model"
          + "s/*}:\005model\022\372\001\n\tTuneModel\022(.google.cloud"
          + ".retail.v2.TuneModelRequest\032\035.google.lon"
          + "grunning.Operation\"\243\001\312AT\n(google.cloud.r"
          + "etail.v2.TuneModelResponse\022(google.cloud"
          + ".retail.v2.TuneModelMetadata\332A\004name\202\323\344\223\002"
          + "?\":/v2/{name=projects/*/locations/*/cata"
          + "logs/*/models/*}:tune:\001*\032I\312A\025retail.goog"
          + "leapis.com\322A.https://www.googleapis.com/"
          + "auth/cloud-platformB\274\001\n\032com.google.cloud"
          + ".retail.v2B\021ModelServiceProtoP\001Z2cloud.g"
          + "oogle.com/go/retail/apiv2/retailpb;retai"
          + "lpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026"
          + "Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::"
          + "Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.ModelProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_CreateModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_CreateModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CreateModelRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Model", "DryRun",
            });
    internal_static_google_cloud_retail_v2_UpdateModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_UpdateModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UpdateModelRequest_descriptor,
            new java.lang.String[] {
              "Model", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2_GetModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_GetModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_GetModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_PauseModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_PauseModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PauseModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_ResumeModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_ResumeModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ResumeModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_ListModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2_ListModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_retail_v2_DeleteModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2_DeleteModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_DeleteModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_ListModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2_ListModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListModelsResponse_descriptor,
            new java.lang.String[] {
              "Models", "NextPageToken",
            });
    internal_static_google_cloud_retail_v2_TuneModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2_TuneModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_TuneModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_CreateModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2_CreateModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CreateModelMetadata_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_retail_v2_TuneModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2_TuneModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_TuneModelMetadata_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_retail_v2_TuneModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2_TuneModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_TuneModelResponse_descriptor,
            new java.lang.String[] {});
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
    com.google.cloud.retail.v2.ModelProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
