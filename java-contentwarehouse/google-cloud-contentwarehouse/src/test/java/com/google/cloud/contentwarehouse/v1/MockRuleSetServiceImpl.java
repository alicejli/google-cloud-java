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

package com.google.cloud.contentwarehouse.v1;

import com.google.api.core.BetaApi;
import com.google.cloud.contentwarehouse.v1.RuleSetServiceGrpc.RuleSetServiceImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockRuleSetServiceImpl extends RuleSetServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockRuleSetServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createRuleSet(
      CreateRuleSetRequest request, StreamObserver<RuleSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof RuleSet) {
      requests.add(request);
      responseObserver.onNext(((RuleSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateRuleSet, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  RuleSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getRuleSet(GetRuleSetRequest request, StreamObserver<RuleSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof RuleSet) {
      requests.add(request);
      responseObserver.onNext(((RuleSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetRuleSet, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  RuleSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateRuleSet(
      UpdateRuleSetRequest request, StreamObserver<RuleSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof RuleSet) {
      requests.add(request);
      responseObserver.onNext(((RuleSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateRuleSet, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  RuleSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteRuleSet(DeleteRuleSetRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteRuleSet, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listRuleSets(
      ListRuleSetsRequest request, StreamObserver<ListRuleSetsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListRuleSetsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListRuleSetsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListRuleSets, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListRuleSetsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
