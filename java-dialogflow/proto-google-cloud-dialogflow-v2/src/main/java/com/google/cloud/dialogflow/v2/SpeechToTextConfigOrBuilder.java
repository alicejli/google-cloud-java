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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface SpeechToTextConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SpeechToTextConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in
   * [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest]
   * and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest]
   * request. If enhanced model variant is specified and an enhanced version of
   * the specified model for the language does not exist, then it would emit an
   * error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1;</code>
   *
   * @return The enum numeric value on the wire for speechModelVariant.
   */
  int getSpeechModelVariantValue();
  /**
   *
   *
   * <pre>
   * The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in
   * [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest]
   * and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest]
   * request. If enhanced model variant is specified and an enhanced version of
   * the specified model for the language does not exist, then it would emit an
   * error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1;</code>
   *
   * @return The speechModelVariant.
   */
  com.google.cloud.dialogflow.v2.SpeechModelVariant getSpeechModelVariant();

  /**
   *
   *
   * <pre>
   * Which Speech model to select. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then a default
   * model is used.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Which Speech model to select. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then a default
   * model is used.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();
}
