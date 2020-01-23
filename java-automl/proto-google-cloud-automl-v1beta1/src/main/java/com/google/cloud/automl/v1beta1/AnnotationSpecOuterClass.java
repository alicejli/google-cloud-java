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
// source: google/cloud/automl/v1beta1/annotation_spec.proto

package com.google.cloud.automl.v1beta1;

public final class AnnotationSpecOuterClass {
  private AnnotationSpecOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/automl/v1beta1/annotation"
          + "_spec.proto\022\033google.cloud.automl.v1beta1"
          + "\032\034google/api/annotations.proto\"K\n\016Annota"
          + "tionSpec\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002"
          + " \001(\t\022\025\n\rexample_count\030\t \001(\005B\245\001\n\037com.goog"
          + "le.cloud.automl.v1beta1P\001ZAgoogle.golang"
          + ".org/genproto/googleapis/cloud/automl/v1"
          + "beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1bet"
          + "a1\352\002\036Google::Cloud::AutoML::V1beta1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_AnnotationSpec_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ExampleCount",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
