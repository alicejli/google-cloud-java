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
// source: google/analytics/admin/v1alpha/channel_group.proto

package com.google.analytics.admin.v1alpha;

public final class ChannelGroupProto {
  private ChannelGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_StringFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_StringFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_InListFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_InListFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpression_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpressionList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpressionList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_GroupingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_ChannelGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_ChannelGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/analytics/admin/v1alpha/channel"
          + "_group.proto\022\036google.analytics.admin.v1a"
          + "lpha\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\"\255\004\n\022ChannelGrou"
          + "pFilter\022X\n\rstring_filter\030\002 \001(\0132?.google."
          + "analytics.admin.v1alpha.ChannelGroupFilt"
          + "er.StringFilterH\000\022Y\n\016in_list_filter\030\003 \001("
          + "\0132?.google.analytics.admin.v1alpha.Chann"
          + "elGroupFilter.InListFilterH\000\022\031\n\nfield_na"
          + "me\030\001 \001(\tB\005\342A\002\002\005\032\220\002\n\014StringFilter\022c\n\nmatc"
          + "h_type\030\001 \001(\0162I.google.analytics.admin.v1"
          + "alpha.ChannelGroupFilter.StringFilter.Ma"
          + "tchTypeB\004\342A\001\002\022\023\n\005value\030\002 \001(\tB\004\342A\001\002\"\205\001\n\tM"
          + "atchType\022\032\n\026MATCH_TYPE_UNSPECIFIED\020\000\022\t\n\005"
          + "EXACT\020\001\022\017\n\013BEGINS_WITH\020\002\022\r\n\tENDS_WITH\020\003\022"
          + "\014\n\010CONTAINS\020\004\022\017\n\013FULL_REGEXP\020\005\022\022\n\016PARTIA"
          + "L_REGEXP\020\006\032$\n\014InListFilter\022\024\n\006values\030\001 \003"
          + "(\tB\004\342A\001\002B\016\n\014value_filter\"\361\002\n\034ChannelGrou"
          + "pFilterExpression\022U\n\tand_group\030\001 \001(\0132@.g"
          + "oogle.analytics.admin.v1alpha.ChannelGro"
          + "upFilterExpressionListH\000\022T\n\010or_group\030\002 \001"
          + "(\0132@.google.analytics.admin.v1alpha.Chan"
          + "nelGroupFilterExpressionListH\000\022V\n\016not_ex"
          + "pression\030\003 \001(\0132<.google.analytics.admin."
          + "v1alpha.ChannelGroupFilterExpressionH\000\022D"
          + "\n\006filter\030\004 \001(\01322.google.analytics.admin."
          + "v1alpha.ChannelGroupFilterH\000B\006\n\004expr\"|\n "
          + "ChannelGroupFilterExpressionList\022X\n\022filt"
          + "er_expressions\030\001 \003(\0132<.google.analytics."
          + "admin.v1alpha.ChannelGroupFilterExpressi"
          + "on\"\202\001\n\014GroupingRule\022\032\n\014display_name\030\001 \001("
          + "\tB\004\342A\001\002\022V\n\nexpression\030\002 \001(\0132<.google.ana"
          + "lytics.admin.v1alpha.ChannelGroupFilterE"
          + "xpressionB\004\342A\001\002\"\242\002\n\014ChannelGroup\022\022\n\004name"
          + "\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002"
          + "\022\023\n\013description\030\003 \001(\t\022I\n\rgrouping_rule\030\004"
          + " \003(\0132,.google.analytics.admin.v1alpha.Gr"
          + "oupingRuleB\004\342A\001\002\022\034\n\016system_defined\030\005 \001(\010"
          + "B\004\342A\001\003:d\352Aa\n*analyticsadmin.googleapis.c"
          + "om/ChannelGroup\0223properties/{property}/c"
          + "hannelGroups/{channel_group}By\n\"com.goog"
          + "le.analytics.admin.v1alphaB\021ChannelGroup"
          + "ProtoP\001Z>cloud.google.com/go/analytics/a"
          + "dmin/apiv1alpha/adminpb;adminpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_descriptor,
            new java.lang.String[] {
              "StringFilter", "InListFilter", "FieldName", "ValueFilter",
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_StringFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_StringFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_StringFilter_descriptor,
            new java.lang.String[] {
              "MatchType", "Value",
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_InListFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_InListFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroupFilter_InListFilter_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpression_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpression_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpression_descriptor,
            new java.lang.String[] {
              "AndGroup", "OrGroup", "NotExpression", "Filter", "Expr",
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpressionList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpressionList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroupFilterExpressionList_descriptor,
            new java.lang.String[] {
              "FilterExpressions",
            });
    internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_admin_v1alpha_GroupingRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor,
            new java.lang.String[] {
              "DisplayName", "Expression",
            });
    internal_static_google_analytics_admin_v1alpha_ChannelGroup_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_admin_v1alpha_ChannelGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_ChannelGroup_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "GroupingRule", "SystemDefined",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
