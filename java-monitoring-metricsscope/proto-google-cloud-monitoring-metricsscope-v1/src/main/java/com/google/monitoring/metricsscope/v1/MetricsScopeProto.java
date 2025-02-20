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
// source: google/monitoring/metricsscope/v1/metrics_scope.proto

package com.google.monitoring.metricsscope.v1;

public final class MetricsScopeProto {
  private MetricsScopeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_MetricsScope_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_MetricsScope_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_MonitoredProject_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_MonitoredProject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/monitoring/metricsscope/v1/metr"
          + "ics_scope.proto\022!google.monitoring.metri"
          + "csscope.v1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\303\002\n\014MetricsScope"
          + "\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\0225\n\013create_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013u"
          + "pdate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022U\n\022monitored_projects\030\004 \003(\01323"
          + ".google.monitoring.metricsscope.v1.Monit"
          + "oredProjectB\004\342A\001\003:Z\352AW\n&monitoring.googl"
          + "eapis.com/MetricsScope\022-locations/global"
          + "/metricsScope/{metrics_scope}\"\321\001\n\020Monito"
          + "redProject\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\0225\n\013create"
          + "_time\030\006 \001(\0132\032.google.protobuf.TimestampB"
          + "\004\342A\001\003:r\352Ao\n*monitoring.googleapis.com/Mo"
          + "nitoredProject\022Alocations/global/metrics"
          + "Scopes/{metrics_scope}/projects/{project"
          + "}B\217\002\n%com.google.monitoring.metricsscope"
          + ".v1B\021MetricsScopeProtoP\001ZOcloud.google.c"
          + "om/go/monitoring/metricsscope/apiv1/metr"
          + "icsscopepb;metricsscopepb\252\002\'Google.Cloud"
          + ".Monitoring.MetricsScope.V1\312\002\'Google\\Clo"
          + "ud\\Monitoring\\MetricsScope\\V1\352\002+Google::"
          + "Cloud::Monitoring::MetricsScope::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_monitoring_metricsscope_v1_MetricsScope_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_metricsscope_v1_MetricsScope_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_MetricsScope_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "MonitoredProjects",
            });
    internal_static_google_monitoring_metricsscope_v1_MonitoredProject_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_metricsscope_v1_MonitoredProject_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_MonitoredProject_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
