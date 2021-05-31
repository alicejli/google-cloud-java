/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= OsConfigZonalServiceClient =======================
 *
 * <p>Service Description: Zonal OS Config API
 *
 * <p>The OS Config service is the server-side component that allows users to manage package
 * installations and patch jobs for Compute Engine VM instances.
 *
 * <p>Sample for OsConfigZonalServiceClient:
 *
 * <pre>{@code
 * try (OsConfigZonalServiceClient osConfigZonalServiceClient =
 *     OsConfigZonalServiceClient.create()) {
 *   OSPolicyAssignmentName name =
 *       OSPolicyAssignmentName.of("[PROJECT]", "[LOCATION]", "[OS_POLICY_ASSIGNMENT]");
 *   OSPolicyAssignment response = osConfigZonalServiceClient.getOSPolicyAssignment(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.osconfig.v1alpha;

import javax.annotation.Generated;
