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
// source: google/cloud/websecurityscanner/v1/scan_config.proto

package com.google.cloud.websecurityscanner.v1;

public final class ScanConfigProto {
  private ScanConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_GoogleAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_CustomAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_CustomAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_IapTestServiceAccountInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_IapTestServiceAccountInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Schedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/websecurityscanner/v1/sca"
          + "n_config.proto\022\"google.cloud.websecurity"
          + "scanner.v1\032\037google/api/field_behavior.pr"
          + "oto\032\037google/protobuf/timestamp.proto\"\305\r\n"
          + "\nScanConfig\022\014\n\004name\030\001 \001(\t\022\024\n\014display_nam"
          + "e\030\002 \001(\t\022\017\n\007max_qps\030\003 \001(\005\022\025\n\rstarting_url"
          + "s\030\004 \003(\t\022U\n\016authentication\030\005 \001(\0132=.google"
          + ".cloud.websecurityscanner.v1.ScanConfig."
          + "Authentication\022L\n\nuser_agent\030\006 \001(\01628.goo"
          + "gle.cloud.websecurityscanner.v1.ScanConf"
          + "ig.UserAgent\022\032\n\022blacklist_patterns\030\007 \003(\t"
          + "\022I\n\010schedule\030\010 \001(\01327.google.cloud.websec"
          + "urityscanner.v1.ScanConfig.Schedule\022w\n!e"
          + "xport_to_security_command_center\030\n \001(\0162L"
          + ".google.cloud.websecurityscanner.v1.Scan"
          + "Config.ExportToSecurityCommandCenter\022L\n\n"
          + "risk_level\030\014 \001(\01628.google.cloud.websecur"
          + "ityscanner.v1.ScanConfig.RiskLevel\022\024\n\014ma"
          + "naged_scan\030\r \001(\010\022\026\n\016static_ip_scan\030\016 \001(\010"
          + "\022!\n\031ignore_http_status_errors\030\017 \001(\010\032\330\005\n\016"
          + "Authentication\022i\n\016google_account\030\001 \001(\0132K"
          + ".google.cloud.websecurityscanner.v1.Scan"
          + "Config.Authentication.GoogleAccountB\002\030\001H"
          + "\000\022e\n\016custom_account\030\002 \001(\0132K.google.cloud"
          + ".websecurityscanner.v1.ScanConfig.Authen"
          + "tication.CustomAccountH\000\022e\n\016iap_credenti"
          + "al\030\004 \001(\0132K.google.cloud.websecurityscann"
          + "er.v1.ScanConfig.Authentication.IapCrede"
          + "ntialH\000\0327\n\rGoogleAccount\022\020\n\010username\030\001 \001"
          + "(\t\022\020\n\010password\030\002 \001(\t:\002\030\001\032F\n\rCustomAccoun"
          + "t\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\021\n"
          + "\tlogin_url\030\003 \001(\t\032\371\001\n\rIapCredential\022\216\001\n\035i"
          + "ap_test_service_account_info\030\001 \001(\0132e.goo"
          + "gle.cloud.websecurityscanner.v1.ScanConf"
          + "ig.Authentication.IapCredential.IapTestS"
          + "erviceAccountInfoH\000\032D\n\031IapTestServiceAcc"
          + "ountInfo\022\'\n\031target_audience_client_id\030\001 "
          + "\001(\tB\004\342A\001\002B\021\n\017iap_credentialsB\020\n\016authenti"
          + "cation\032]\n\010Schedule\0221\n\rschedule_time\030\001 \001("
          + "\0132\032.google.protobuf.Timestamp\022\036\n\026interva"
          + "l_duration_days\030\002 \001(\005\"`\n\tUserAgent\022\032\n\026US"
          + "ER_AGENT_UNSPECIFIED\020\000\022\020\n\014CHROME_LINUX\020\001"
          + "\022\022\n\016CHROME_ANDROID\020\002\022\021\n\rSAFARI_IPHONE\020\003\""
          + "<\n\tRiskLevel\022\032\n\026RISK_LEVEL_UNSPECIFIED\020\000"
          + "\022\n\n\006NORMAL\020\001\022\007\n\003LOW\020\002\"m\n\035ExportToSecurit"
          + "yCommandCenter\0221\n-EXPORT_TO_SECURITY_COM"
          + "MAND_CENTER_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022\014"
          + "\n\010DISABLED\020\002B\205\002\n&com.google.cloud.websec"
          + "urityscanner.v1B\017ScanConfigProtoP\001ZVclou"
          + "d.google.com/go/websecurityscanner/apiv1"
          + "/websecurityscannerpb;websecurityscanner"
          + "pb\252\002\"Google.Cloud.WebSecurityScanner.V1\312"
          + "\002\"Google\\Cloud\\WebSecurityScanner\\V1\352\002%G"
          + "oogle::Cloud::WebSecurityScanner::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MaxQps",
              "StartingUrls",
              "Authentication",
              "UserAgent",
              "BlacklistPatterns",
              "Schedule",
              "ExportToSecurityCommandCenter",
              "RiskLevel",
              "ManagedScan",
              "StaticIpScan",
              "IgnoreHttpStatusErrors",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor,
            new java.lang.String[] {
              "GoogleAccount", "CustomAccount", "IapCredential", "Authentication",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_GoogleAccount_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_GoogleAccount_descriptor,
            new java.lang.String[] {
              "Username", "Password",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_CustomAccount_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_CustomAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_CustomAccount_descriptor,
            new java.lang.String[] {
              "Username", "Password", "LoginUrl",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_descriptor,
            new java.lang.String[] {
              "IapTestServiceAccountInfo", "IapCredentials",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_IapTestServiceAccountInfo_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_IapTestServiceAccountInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Authentication_IapCredential_IapTestServiceAccountInfo_descriptor,
            new java.lang.String[] {
              "TargetAudienceClientId",
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Schedule_descriptor =
        internal_static_google_cloud_websecurityscanner_v1_ScanConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanConfig_Schedule_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "IntervalDurationDays",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
