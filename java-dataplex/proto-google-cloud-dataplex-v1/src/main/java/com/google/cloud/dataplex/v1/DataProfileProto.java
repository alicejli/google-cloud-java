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
// source: google/cloud/dataplex/v1/data_profile.proto

package com.google.cloud.dataplex.v1;

public final class DataProfileProto {
  private DataProfileProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dataplex/v1/data_profile."
          + "proto\022\030google.cloud.dataplex.v1\032\037google/"
          + "api/field_behavior.proto\032)google/cloud/d"
          + "ataplex/v1/processing.proto\"\021\n\017DataProfi"
          + "leSpec\"\353\t\n\021DataProfileResult\022\021\n\trow_coun"
          + "t\030\003 \001(\003\022D\n\007profile\030\004 \001(\01323.google.cloud."
          + "dataplex.v1.DataProfileResult.Profile\022;\n"
          + "\014scanned_data\030\005 \001(\0132%.google.cloud.datap"
          + "lex.v1.ScannedData\032\277\010\n\007Profile\022I\n\006fields"
          + "\030\002 \003(\01329.google.cloud.dataplex.v1.DataPr"
          + "ofileResult.Profile.Field\032\350\007\n\005Field\022\014\n\004n"
          + "ame\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\014\n\004mode\030\003 \001(\t\022V\n"
          + "\007profile\030\004 \001(\0132E.google.cloud.dataplex.v"
          + "1.DataProfileResult.Profile.Field.Profil"
          + "eInfo\032\334\006\n\013ProfileInfo\022\022\n\nnull_ratio\030\002 \001("
          + "\001\022\026\n\016distinct_ratio\030\003 \001(\001\022e\n\014top_n_value"
          + "s\030\004 \003(\0132O.google.cloud.dataplex.v1.DataP"
          + "rofileResult.Profile.Field.ProfileInfo.T"
          + "opNValue\022o\n\016string_profile\030e \001(\0132U.googl"
          + "e.cloud.dataplex.v1.DataProfileResult.Pr"
          + "ofile.Field.ProfileInfo.StringFieldInfoH"
          + "\000\022q\n\017integer_profile\030f \001(\0132V.google.clou"
          + "d.dataplex.v1.DataProfileResult.Profile."
          + "Field.ProfileInfo.IntegerFieldInfoH\000\022o\n\016"
          + "double_profile\030g \001(\0132U.google.cloud.data"
          + "plex.v1.DataProfileResult.Profile.Field."
          + "ProfileInfo.DoubleFieldInfoH\000\032Q\n\017StringF"
          + "ieldInfo\022\022\n\nmin_length\030\001 \001(\003\022\022\n\nmax_leng"
          + "th\030\002 \001(\003\022\026\n\016average_length\030\003 \001(\001\032l\n\020Inte"
          + "gerFieldInfo\022\017\n\007average\030\001 \001(\001\022\032\n\022standar"
          + "d_deviation\030\003 \001(\001\022\013\n\003min\030\004 \001(\003\022\021\n\tquarti"
          + "les\030\006 \003(\003\022\013\n\003max\030\005 \001(\003\032k\n\017DoubleFieldInf"
          + "o\022\017\n\007average\030\001 \001(\001\022\032\n\022standard_deviation"
          + "\030\003 \001(\001\022\013\n\003min\030\004 \001(\001\022\021\n\tquartiles\030\006 \003(\001\022\013"
          + "\n\003max\030\005 \001(\001\032)\n\tTopNValue\022\r\n\005value\030\001 \001(\t\022"
          + "\r\n\005count\030\002 \001(\003B\014\n\nfield_infoBl\n\034com.goog"
          + "le.cloud.dataplex.v1B\020DataProfileProtoP\001"
          + "Z8cloud.google.com/go/dataplex/apiv1/dat"
          + "aplexpb;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor,
            new java.lang.String[] {
              "RowCount", "Profile", "ScannedData",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Mode", "Profile",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor,
            new java.lang.String[] {
              "NullRatio",
              "DistinctRatio",
              "TopNValues",
              "StringProfile",
              "IntegerProfile",
              "DoubleProfile",
              "FieldInfo",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor,
            new java.lang.String[] {
              "MinLength", "MaxLength", "AverageLength",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor,
            new java.lang.String[] {
              "Average", "StandardDeviation", "Min", "Quartiles", "Max",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor,
            new java.lang.String[] {
              "Average", "StandardDeviation", "Min", "Quartiles", "Max",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor,
            new java.lang.String[] {
              "Value", "Count",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
