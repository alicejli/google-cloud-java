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
// source: google/cloud/aiplatform/v1beta1/migration_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class MigrationServiceProto {
  private MigrationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlModelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_PartialResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/migrat"
          + "ion_service.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\031google/api/resource."
          + "proto\0329google/cloud/aiplatform/v1beta1/m"
          + "igratable_resource.proto\032/google/cloud/a"
          + "iplatform/v1beta1/operation.proto\032#googl"
          + "e/longrunning/operations.proto\032\027google/r"
          + "pc/status.proto\"\225\001\n SearchMigratableReso"
          + "urcesRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022\021\n\tpage"
          + "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filte"
          + "r\030\004 \001(\t\"\217\001\n!SearchMigratableResourcesRes"
          + "ponse\022Q\n\024migratable_resources\030\001 \003(\01323.go"
          + "ogle.cloud.aiplatform.v1beta1.Migratable"
          + "Resource\022\027\n\017next_page_token\030\002 \001(\t\"\274\001\n\034Ba"
          + "tchMigrateResourcesRequest\022:\n\006parent\030\001 \001"
          + "(\tB*\342A\001\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022`\n\031migrate_resource_requests\030\002 \003("
          + "\01327.google.cloud.aiplatform.v1beta1.Migr"
          + "ateResourceRequestB\004\342A\001\002\"\207\013\n\026MigrateReso"
          + "urceRequest\022\213\001\n&migrate_ml_engine_model_"
          + "version_config\030\001 \001(\0132Y.google.cloud.aipl"
          + "atform.v1beta1.MigrateResourceRequest.Mi"
          + "grateMlEngineModelVersionConfigH\000\022w\n\033mig"
          + "rate_automl_model_config\030\002 \001(\0132P.google."
          + "cloud.aiplatform.v1beta1.MigrateResource"
          + "Request.MigrateAutomlModelConfigH\000\022{\n\035mi"
          + "grate_automl_dataset_config\030\003 \001(\0132R.goog"
          + "le.cloud.aiplatform.v1beta1.MigrateResou"
          + "rceRequest.MigrateAutomlDatasetConfigH\000\022"
          + "\210\001\n$migrate_data_labeling_dataset_config"
          + "\030\004 \001(\0132X.google.cloud.aiplatform.v1beta1"
          + ".MigrateResourceRequest.MigrateDataLabel"
          + "ingDatasetConfigH\000\032\230\001\n!MigrateMlEngineMo"
          + "delVersionConfig\022\026\n\010endpoint\030\001 \001(\tB\004\342A\001\002"
          + "\0229\n\rmodel_version\030\002 \001(\tB\"\342A\001\002\372A\033\n\031ml.goo"
          + "gleapis.com/Version\022 \n\022model_display_nam"
          + "e\030\003 \001(\tB\004\342A\001\002\032q\n\030MigrateAutomlModelConfi"
          + "g\0223\n\005model\030\001 \001(\tB$\342A\001\002\372A\035\n\033automl.google"
          + "apis.com/Model\022 \n\022model_display_name\030\002 \001"
          + "(\tB\004\342A\001\001\032y\n\032MigrateAutomlDatasetConfig\0227"
          + "\n\007dataset\030\001 \001(\tB&\342A\001\002\372A\037\n\035automl.googlea"
          + "pis.com/Dataset\022\"\n\024dataset_display_name\030"
          + "\002 \001(\tB\004\342A\001\002\032\311\003\n MigrateDataLabelingDatas"
          + "etConfig\022=\n\007dataset\030\001 \001(\tB,\342A\001\002\372A%\n#data"
          + "labeling.googleapis.com/Dataset\022\"\n\024datas"
          + "et_display_name\030\002 \001(\tB\004\342A\001\001\022\302\001\n/migrate_"
          + "data_labeling_annotated_dataset_configs\030"
          + "\003 \003(\0132\202\001.google.cloud.aiplatform.v1beta1"
          + ".MigrateResourceRequest.MigrateDataLabel"
          + "ingDatasetConfig.MigrateDataLabelingAnno"
          + "tatedDatasetConfigB\004\342A\001\001\032}\n)MigrateDataL"
          + "abelingAnnotatedDatasetConfig\022P\n\021annotat"
          + "ed_dataset\030\001 \001(\tB5\342A\001\002\372A.\n,datalabeling."
          + "googleapis.com/AnnotatedDatasetB\t\n\007reque"
          + "st\"}\n\035BatchMigrateResourcesResponse\022\\\n\032m"
          + "igrate_resource_responses\030\001 \003(\01328.google"
          + ".cloud.aiplatform.v1beta1.MigrateResourc"
          + "eResponse\"\362\001\n\027MigrateResourceResponse\0229\n"
          + "\007dataset\030\001 \001(\tB&\372A#\n!aiplatform.googleap"
          + "is.com/DatasetH\000\0225\n\005model\030\002 \001(\tB$\372A!\n\037ai"
          + "platform.googleapis.com/ModelH\000\022P\n\023migra"
          + "table_resource\030\003 \001(\01323.google.cloud.aipl"
          + "atform.v1beta1.MigratableResourceB\023\n\021mig"
          + "rated_resource\"\352\003\n&BatchMigrateResources"
          + "OperationMetadata\022S\n\020generic_metadata\030\001 "
          + "\001(\01329.google.cloud.aiplatform.v1beta1.Ge"
          + "nericOperationMetadata\022n\n\017partial_result"
          + "s\030\002 \003(\0132U.google.cloud.aiplatform.v1beta"
          + "1.BatchMigrateResourcesOperationMetadata"
          + ".PartialResult\032\372\001\n\rPartialResult\022#\n\005erro"
          + "r\030\002 \001(\0132\022.google.rpc.StatusH\000\0225\n\005model\030\003"
          + " \001(\tB$\372A!\n\037aiplatform.googleapis.com/Mod"
          + "elH\000\0229\n\007dataset\030\004 \001(\tB&\372A#\n!aiplatform.g"
          + "oogleapis.com/DatasetH\000\022H\n\007request\030\001 \001(\013"
          + "27.google.cloud.aiplatform.v1beta1.Migra"
          + "teResourceRequestB\010\n\006result2\233\005\n\020Migratio"
          + "nService\022\373\001\n\031SearchMigratableResources\022A"
          + ".google.cloud.aiplatform.v1beta1.SearchM"
          + "igratableResourcesRequest\032B.google.cloud"
          + ".aiplatform.v1beta1.SearchMigratableReso"
          + "urcesResponse\"W\332A\006parent\202\323\344\223\002H\"C/v1beta1"
          + "/{parent=projects/*/locations/*}/migrata"
          + "bleResources:search:\001*\022\271\002\n\025BatchMigrateR"
          + "esources\022=.google.cloud.aiplatform.v1bet"
          + "a1.BatchMigrateResourcesRequest\032\035.google"
          + ".longrunning.Operation\"\301\001\312AG\n\035BatchMigra"
          + "teResourcesResponse\022&BatchMigrateResourc"
          + "esOperationMetadata\332A parent,migrate_res"
          + "ource_requests\202\323\344\223\002N\"I/v1beta1/{parent=p"
          + "rojects/*/locations/*}/migratableResourc"
          + "es:batchMigrate:\001*\032M\312A\031aiplatform.google"
          + "apis.com\322A.https://www.googleapis.com/au"
          + "th/cloud-platformB\354\001\n#com.google.cloud.a"
          + "iplatform.v1beta1B\025MigrationServiceProto"
          + "P\001ZCcloud.google.com/go/aiplatform/apiv1"
          + "beta1/aiplatformpb;aiplatformpb\252\002\037Google"
          + ".Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud"
          + "\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIP"
          + "latform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MigratableResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchMigratableResourcesResponse_descriptor,
            new java.lang.String[] {
              "MigratableResources", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MigrateResourceRequests",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor,
            new java.lang.String[] {
              "MigrateMlEngineModelVersionConfig",
              "MigrateAutomlModelConfig",
              "MigrateAutomlDatasetConfig",
              "MigrateDataLabelingDatasetConfig",
              "Request",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor,
            new java.lang.String[] {
              "Endpoint", "ModelVersion", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlModelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor,
            new java.lang.String[] {
              "Model", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor,
            new java.lang.String[] {
              "Dataset", "DatasetDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor,
            new java.lang.String[] {
              "Dataset", "DatasetDisplayName", "MigrateDataLabelingAnnotatedDatasetConfigs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor,
            new java.lang.String[] {
              "AnnotatedDataset",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor,
            new java.lang.String[] {
              "MigrateResourceResponses",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MigrateResourceResponse_descriptor,
            new java.lang.String[] {
              "Dataset", "Model", "MigratableResource", "MigratedResource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "PartialResults",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_PartialResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor,
            new java.lang.String[] {
              "Error", "Model", "Dataset", "Request", "Result",
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
    com.google.cloud.aiplatform.v1beta1.MigratableResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
