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
// source: google/cloud/bigquery/migration/v2alpha/migration_metrics.proto

package com.google.cloud.bigquery.migration.v2alpha;

public final class MigrationMetricsProto {
  private MigrationMetricsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TimeSeries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_Point_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TimeInterval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TimeInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TypedValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TypedValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/bigquery/migration/v2alph"
          + "a/migration_metrics.proto\022\'google.cloud."
          + "bigquery.migration.v2alpha\032\035google/api/d"
          + "istribution.proto\032\037google/api/field_beha"
          + "vior.proto\032\027google/api/metric.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\"\356\001\n\nTimeSer"
          + "ies\022\024\n\006metric\030\001 \001(\tB\004\342A\001\002\022@\n\nvalue_type\030"
          + "\002 \001(\0162&.google.api.MetricDescriptor.Valu"
          + "eTypeB\004\342A\001\002\022B\n\013metric_kind\030\003 \001(\0162\'.googl"
          + "e.api.MetricDescriptor.MetricKindB\004\342A\001\001\022"
          + "D\n\006points\030\004 \003(\0132..google.cloud.bigquery."
          + "migration.v2alpha.PointB\004\342A\001\002\"\224\001\n\005Point\022"
          + "G\n\010interval\030\001 \001(\01325.google.cloud.bigquer"
          + "y.migration.v2alpha.TimeInterval\022B\n\005valu"
          + "e\030\002 \001(\01323.google.cloud.bigquery.migratio"
          + "n.v2alpha.TypedValue\"x\n\014TimeInterval\0224\n\n"
          + "start_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\001\0222\n\010end_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\002\"\252\001\n\nTypedValue\022\024\n"
          + "\nbool_value\030\001 \001(\010H\000\022\025\n\013int64_value\030\002 \001(\003"
          + "H\000\022\026\n\014double_value\030\003 \001(\001H\000\022\026\n\014string_val"
          + "ue\030\004 \001(\tH\000\0226\n\022distribution_value\030\005 \001(\0132\030"
          + ".google.api.DistributionH\000B\007\n\005valueB\345\001\n+"
          + "com.google.cloud.bigquery.migration.v2al"
          + "phaB\025MigrationMetricsProtoP\001ZIcloud.goog"
          + "le.com/go/bigquery/migration/apiv2alpha/"
          + "migrationpb;migrationpb\252\002\'Google.Cloud.B"
          + "igQuery.Migration.V2Alpha\312\002\'Google\\Cloud"
          + "\\BigQuery\\Migration\\V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.DistributionProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TimeSeries_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_TimeSeries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TimeSeries_descriptor,
            new java.lang.String[] {
              "Metric", "ValueType", "MetricKind", "Points",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_Point_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_Point_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_Point_descriptor,
            new java.lang.String[] {
              "Interval", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TimeInterval_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2alpha_TimeInterval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TimeInterval_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TypedValue_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_migration_v2alpha_TypedValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TypedValue_descriptor,
            new java.lang.String[] {
              "BoolValue", "Int64Value", "DoubleValue", "StringValue", "DistributionValue", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.DistributionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
