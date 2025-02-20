/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.redis.v1.stub;

import static com.google.cloud.redis.v1.CloudRedisClient.ListInstancesPagedResponse;
import static com.google.cloud.redis.v1.CloudRedisClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.redis.v1.CreateInstanceRequest;
import com.google.cloud.redis.v1.DeleteInstanceRequest;
import com.google.cloud.redis.v1.ExportInstanceRequest;
import com.google.cloud.redis.v1.FailoverInstanceRequest;
import com.google.cloud.redis.v1.GetInstanceAuthStringRequest;
import com.google.cloud.redis.v1.GetInstanceRequest;
import com.google.cloud.redis.v1.ImportInstanceRequest;
import com.google.cloud.redis.v1.Instance;
import com.google.cloud.redis.v1.InstanceAuthString;
import com.google.cloud.redis.v1.ListInstancesRequest;
import com.google.cloud.redis.v1.ListInstancesResponse;
import com.google.cloud.redis.v1.OperationMetadata;
import com.google.cloud.redis.v1.RescheduleMaintenanceRequest;
import com.google.cloud.redis.v1.UpdateInstanceRequest;
import com.google.cloud.redis.v1.UpgradeInstanceRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CloudRedis service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CloudRedisStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesPagedCallable()");
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesCallable()");
  }

  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceCallable()");
  }

  public UnaryCallable<GetInstanceAuthStringRequest, InstanceAuthString>
      getInstanceAuthStringCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceAuthStringCallable()");
  }

  public OperationCallable<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceOperationCallable()");
  }

  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceCallable()");
  }

  public OperationCallable<UpdateInstanceRequest, Instance, OperationMetadata>
      updateInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInstanceOperationCallable()");
  }

  public UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInstanceCallable()");
  }

  public OperationCallable<UpgradeInstanceRequest, Instance, OperationMetadata>
      upgradeInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: upgradeInstanceOperationCallable()");
  }

  public UnaryCallable<UpgradeInstanceRequest, Operation> upgradeInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: upgradeInstanceCallable()");
  }

  public OperationCallable<ImportInstanceRequest, Instance, OperationMetadata>
      importInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importInstanceOperationCallable()");
  }

  public UnaryCallable<ImportInstanceRequest, Operation> importInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: importInstanceCallable()");
  }

  public OperationCallable<ExportInstanceRequest, Instance, OperationMetadata>
      exportInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportInstanceOperationCallable()");
  }

  public UnaryCallable<ExportInstanceRequest, Operation> exportInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: exportInstanceCallable()");
  }

  public OperationCallable<FailoverInstanceRequest, Instance, OperationMetadata>
      failoverInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: failoverInstanceOperationCallable()");
  }

  public UnaryCallable<FailoverInstanceRequest, Operation> failoverInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: failoverInstanceCallable()");
  }

  public OperationCallable<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceOperationCallable()");
  }

  public UnaryCallable<DeleteInstanceRequest, Operation> deleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceCallable()");
  }

  public OperationCallable<RescheduleMaintenanceRequest, Instance, OperationMetadata>
      rescheduleMaintenanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: rescheduleMaintenanceOperationCallable()");
  }

  public UnaryCallable<RescheduleMaintenanceRequest, Operation> rescheduleMaintenanceCallable() {
    throw new UnsupportedOperationException("Not implemented: rescheduleMaintenanceCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
