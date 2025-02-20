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

package com.google.analytics.admin.v1alpha;

import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.AuditUserLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAccessBindingsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAccountSummariesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAccountsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAdSenseLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAudiencesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListBigQueryLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListChannelGroupsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListConversionEventsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListCustomDimensionsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListCustomMetricsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListDataStreamsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListDisplayVideo360AdvertiserLinkProposalsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListDisplayVideo360AdvertiserLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListEventCreateRulesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListExpandedDataSetsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListFirebaseLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListGoogleAdsLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListMeasurementProtocolSecretsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListPropertiesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListSearchAds360LinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListUserLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.SearchChangeHistoryEventsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AnalyticsAdminServiceClientTest {
  private static MockAnalyticsAdminService mockAnalyticsAdminService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AnalyticsAdminServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAnalyticsAdminService = new MockAnalyticsAdminService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAnalyticsAdminService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    AnalyticsAdminServiceSettings settings =
        AnalyticsAdminServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AnalyticsAdminServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAccountTest() throws Exception {
    Account expectedResponse =
        Account.newBuilder()
            .setName(AccountName.of("[ACCOUNT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setRegionCode("regionCode-1991004415")
            .setDeleted(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName name = AccountName.of("[ACCOUNT]");

    Account actualResponse = client.getAccount(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountRequest actualRequest = ((GetAccountRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName name = AccountName.of("[ACCOUNT]");
      client.getAccount(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccountTest2() throws Exception {
    Account expectedResponse =
        Account.newBuilder()
            .setName(AccountName.of("[ACCOUNT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setRegionCode("regionCode-1991004415")
            .setDeleted(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    Account actualResponse = client.getAccount(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountRequest actualRequest = ((GetAccountRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getAccount(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccountsTest() throws Exception {
    Account responsesElement = Account.newBuilder().build();
    ListAccountsResponse expectedResponse =
        ListAccountsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccounts(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ListAccountsRequest request =
        ListAccountsRequest.newBuilder()
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .setShowDeleted(true)
            .build();

    ListAccountsPagedResponse pagedListResponse = client.listAccounts(request);

    List<Account> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccountsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccountsRequest actualRequest = ((ListAccountsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertEquals(request.getShowDeleted(), actualRequest.getShowDeleted());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccountsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ListAccountsRequest request =
          ListAccountsRequest.newBuilder()
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setShowDeleted(true)
              .build();
      client.listAccounts(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccountTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName name = AccountName.of("[ACCOUNT]");

    client.deleteAccount(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAccountRequest actualRequest = ((DeleteAccountRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAccountExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName name = AccountName.of("[ACCOUNT]");
      client.deleteAccount(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccountTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAccount(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAccountRequest actualRequest = ((DeleteAccountRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAccountExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAccount(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAccountTest() throws Exception {
    Account expectedResponse =
        Account.newBuilder()
            .setName(AccountName.of("[ACCOUNT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setRegionCode("regionCode-1991004415")
            .setDeleted(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    Account account = Account.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Account actualResponse = client.updateAccount(account, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAccountRequest actualRequest = ((UpdateAccountRequest) actualRequests.get(0));

    Assert.assertEquals(account, actualRequest.getAccount());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAccountExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      Account account = Account.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAccount(account, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void provisionAccountTicketTest() throws Exception {
    ProvisionAccountTicketResponse expectedResponse =
        ProvisionAccountTicketResponse.newBuilder()
            .setAccountTicketId("accountTicketId-1576709484")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ProvisionAccountTicketRequest request =
        ProvisionAccountTicketRequest.newBuilder()
            .setAccount(Account.newBuilder().build())
            .setRedirectUri("redirectUri1970337776")
            .build();

    ProvisionAccountTicketResponse actualResponse = client.provisionAccountTicket(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ProvisionAccountTicketRequest actualRequest =
        ((ProvisionAccountTicketRequest) actualRequests.get(0));

    Assert.assertEquals(request.getAccount(), actualRequest.getAccount());
    Assert.assertEquals(request.getRedirectUri(), actualRequest.getRedirectUri());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void provisionAccountTicketExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ProvisionAccountTicketRequest request =
          ProvisionAccountTicketRequest.newBuilder()
              .setAccount(Account.newBuilder().build())
              .setRedirectUri("redirectUri1970337776")
              .build();
      client.provisionAccountTicket(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccountSummariesTest() throws Exception {
    AccountSummary responsesElement = AccountSummary.newBuilder().build();
    ListAccountSummariesResponse expectedResponse =
        ListAccountSummariesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccountSummaries(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ListAccountSummariesRequest request =
        ListAccountSummariesRequest.newBuilder()
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListAccountSummariesPagedResponse pagedListResponse = client.listAccountSummaries(request);

    List<AccountSummary> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccountSummariesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccountSummariesRequest actualRequest =
        ((ListAccountSummariesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccountSummariesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ListAccountSummariesRequest request =
          ListAccountSummariesRequest.newBuilder()
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listAccountSummaries(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getPropertyTest() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName name = PropertyName.of("[PROPERTY]");

    Property actualResponse = client.getProperty(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetPropertyRequest actualRequest = ((GetPropertyRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getPropertyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName name = PropertyName.of("[PROPERTY]");
      client.getProperty(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getPropertyTest2() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    Property actualResponse = client.getProperty(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetPropertyRequest actualRequest = ((GetPropertyRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getPropertyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getProperty(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listPropertiesTest() throws Exception {
    Property responsesElement = Property.newBuilder().build();
    ListPropertiesResponse expectedResponse =
        ListPropertiesResponse.newBuilder()
            .setNextPageToken("")
            .addAllProperties(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ListPropertiesRequest request =
        ListPropertiesRequest.newBuilder()
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .setShowDeleted(true)
            .build();

    ListPropertiesPagedResponse pagedListResponse = client.listProperties(request);

    List<Property> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPropertiesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPropertiesRequest actualRequest = ((ListPropertiesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getFilter(), actualRequest.getFilter());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertEquals(request.getShowDeleted(), actualRequest.getShowDeleted());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listPropertiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ListPropertiesRequest request =
          ListPropertiesRequest.newBuilder()
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setShowDeleted(true)
              .build();
      client.listProperties(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createPropertyTest() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    Property property = Property.newBuilder().build();

    Property actualResponse = client.createProperty(property);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreatePropertyRequest actualRequest = ((CreatePropertyRequest) actualRequests.get(0));

    Assert.assertEquals(property, actualRequest.getProperty());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createPropertyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      Property property = Property.newBuilder().build();
      client.createProperty(property);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deletePropertyTest() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName name = PropertyName.of("[PROPERTY]");

    Property actualResponse = client.deleteProperty(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeletePropertyRequest actualRequest = ((DeletePropertyRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deletePropertyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName name = PropertyName.of("[PROPERTY]");
      client.deleteProperty(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deletePropertyTest2() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    Property actualResponse = client.deleteProperty(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeletePropertyRequest actualRequest = ((DeletePropertyRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deletePropertyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteProperty(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updatePropertyTest() throws Exception {
    Property expectedResponse =
        Property.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .setPropertyType(PropertyType.forNumber(0))
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParent("parent-995424086")
            .setDisplayName("displayName1714148973")
            .setIndustryCategory(IndustryCategory.forNumber(0))
            .setTimeZone("timeZone-2077180903")
            .setCurrencyCode("currencyCode1004773790")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setDeleteTime(Timestamp.newBuilder().build())
            .setExpireTime(Timestamp.newBuilder().build())
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    Property property = Property.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Property actualResponse = client.updateProperty(property, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdatePropertyRequest actualRequest = ((UpdatePropertyRequest) actualRequests.get(0));

    Assert.assertEquals(property, actualRequest.getProperty());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updatePropertyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      Property property = Property.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateProperty(property, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserLinkTest() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    UserLinkName name = UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]");

    UserLink actualResponse = client.getUserLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserLinkRequest actualRequest = ((GetUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      UserLinkName name = UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]");
      client.getUserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserLinkTest2() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    UserLink actualResponse = client.getUserLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserLinkRequest actualRequest = ((GetUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getUserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchGetUserLinksTest() throws Exception {
    BatchGetUserLinksResponse expectedResponse =
        BatchGetUserLinksResponse.newBuilder().addAllUserLinks(new ArrayList<UserLink>()).build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchGetUserLinksRequest request =
        BatchGetUserLinksRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllNames(new ArrayList<String>())
            .build();

    BatchGetUserLinksResponse actualResponse = client.batchGetUserLinks(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchGetUserLinksRequest actualRequest = ((BatchGetUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getNamesList(), actualRequest.getNamesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchGetUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchGetUserLinksRequest request =
          BatchGetUserLinksRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllNames(new ArrayList<String>())
              .build();
      client.batchGetUserLinks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listUserLinksTest() throws Exception {
    UserLink responsesElement = UserLink.newBuilder().build();
    ListUserLinksResponse expectedResponse =
        ListUserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllUserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");

    ListUserLinksPagedResponse pagedListResponse = client.listUserLinks(parent);

    List<UserLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getUserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListUserLinksRequest actualRequest = ((ListUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      client.listUserLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listUserLinksTest2() throws Exception {
    UserLink responsesElement = UserLink.newBuilder().build();
    ListUserLinksResponse expectedResponse =
        ListUserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllUserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListUserLinksPagedResponse pagedListResponse = client.listUserLinks(parent);

    List<UserLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getUserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListUserLinksRequest actualRequest = ((ListUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listUserLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listUserLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listUserLinksTest3() throws Exception {
    UserLink responsesElement = UserLink.newBuilder().build();
    ListUserLinksResponse expectedResponse =
        ListUserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllUserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListUserLinksPagedResponse pagedListResponse = client.listUserLinks(parent);

    List<UserLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getUserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListUserLinksRequest actualRequest = ((ListUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listUserLinksExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listUserLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void auditUserLinksTest() throws Exception {
    AuditUserLink responsesElement = AuditUserLink.newBuilder().build();
    AuditUserLinksResponse expectedResponse =
        AuditUserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllUserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AuditUserLinksRequest request =
        AuditUserLinksRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    AuditUserLinksPagedResponse pagedListResponse = client.auditUserLinks(request);

    List<AuditUserLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getUserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AuditUserLinksRequest actualRequest = ((AuditUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void auditUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AuditUserLinksRequest request =
          AuditUserLinksRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.auditUserLinks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createUserLinkTest() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");
    UserLink userLink = UserLink.newBuilder().build();

    UserLink actualResponse = client.createUserLink(parent, userLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateUserLinkRequest actualRequest = ((CreateUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(userLink, actualRequest.getUserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createUserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      UserLink userLink = UserLink.newBuilder().build();
      client.createUserLink(parent, userLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createUserLinkTest2() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    UserLink userLink = UserLink.newBuilder().build();

    UserLink actualResponse = client.createUserLink(parent, userLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateUserLinkRequest actualRequest = ((CreateUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(userLink, actualRequest.getUserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createUserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      UserLink userLink = UserLink.newBuilder().build();
      client.createUserLink(parent, userLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createUserLinkTest3() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    UserLink userLink = UserLink.newBuilder().build();

    UserLink actualResponse = client.createUserLink(parent, userLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateUserLinkRequest actualRequest = ((CreateUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(userLink, actualRequest.getUserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createUserLinkExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      UserLink userLink = UserLink.newBuilder().build();
      client.createUserLink(parent, userLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchCreateUserLinksTest() throws Exception {
    BatchCreateUserLinksResponse expectedResponse =
        BatchCreateUserLinksResponse.newBuilder()
            .addAllUserLinks(new ArrayList<UserLink>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchCreateUserLinksRequest request =
        BatchCreateUserLinksRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .setNotifyNewUsers(true)
            .addAllRequests(new ArrayList<CreateUserLinkRequest>())
            .build();

    BatchCreateUserLinksResponse actualResponse = client.batchCreateUserLinks(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateUserLinksRequest actualRequest =
        ((BatchCreateUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getNotifyNewUsers(), actualRequest.getNotifyNewUsers());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchCreateUserLinksRequest request =
          BatchCreateUserLinksRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .setNotifyNewUsers(true)
              .addAllRequests(new ArrayList<CreateUserLinkRequest>())
              .build();
      client.batchCreateUserLinks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateUserLinkTest() throws Exception {
    UserLink expectedResponse =
        UserLink.newBuilder()
            .setName(UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]").toString())
            .setEmailAddress("emailAddress-1070931784")
            .addAllDirectRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    UserLink userLink = UserLink.newBuilder().build();

    UserLink actualResponse = client.updateUserLink(userLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateUserLinkRequest actualRequest = ((UpdateUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(userLink, actualRequest.getUserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateUserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      UserLink userLink = UserLink.newBuilder().build();
      client.updateUserLink(userLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchUpdateUserLinksTest() throws Exception {
    BatchUpdateUserLinksResponse expectedResponse =
        BatchUpdateUserLinksResponse.newBuilder()
            .addAllUserLinks(new ArrayList<UserLink>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchUpdateUserLinksRequest request =
        BatchUpdateUserLinksRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllRequests(new ArrayList<UpdateUserLinkRequest>())
            .build();

    BatchUpdateUserLinksResponse actualResponse = client.batchUpdateUserLinks(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateUserLinksRequest actualRequest =
        ((BatchUpdateUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchUpdateUserLinksRequest request =
          BatchUpdateUserLinksRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<UpdateUserLinkRequest>())
              .build();
      client.batchUpdateUserLinks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteUserLinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    UserLinkName name = UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]");

    client.deleteUserLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteUserLinkRequest actualRequest = ((DeleteUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteUserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      UserLinkName name = UserLinkName.ofAccountUserLinkName("[ACCOUNT]", "[USER_LINK]");
      client.deleteUserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteUserLinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteUserLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteUserLinkRequest actualRequest = ((DeleteUserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteUserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteUserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchDeleteUserLinksTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchDeleteUserLinksRequest request =
        BatchDeleteUserLinksRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllRequests(new ArrayList<DeleteUserLinkRequest>())
            .build();

    client.batchDeleteUserLinks(request);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteUserLinksRequest actualRequest =
        ((BatchDeleteUserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteUserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchDeleteUserLinksRequest request =
          BatchDeleteUserLinksRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<DeleteUserLinkRequest>())
              .build();
      client.batchDeleteUserLinks(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createFirebaseLinkTest() throws Exception {
    FirebaseLink expectedResponse =
        FirebaseLink.newBuilder()
            .setName(FirebaseLinkName.of("[PROPERTY]", "[FIREBASE_LINK]").toString())
            .setProject("project-309310695")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    FirebaseLink firebaseLink = FirebaseLink.newBuilder().build();

    FirebaseLink actualResponse = client.createFirebaseLink(parent, firebaseLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFirebaseLinkRequest actualRequest = ((CreateFirebaseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(firebaseLink, actualRequest.getFirebaseLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFirebaseLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      FirebaseLink firebaseLink = FirebaseLink.newBuilder().build();
      client.createFirebaseLink(parent, firebaseLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createFirebaseLinkTest2() throws Exception {
    FirebaseLink expectedResponse =
        FirebaseLink.newBuilder()
            .setName(FirebaseLinkName.of("[PROPERTY]", "[FIREBASE_LINK]").toString())
            .setProject("project-309310695")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    FirebaseLink firebaseLink = FirebaseLink.newBuilder().build();

    FirebaseLink actualResponse = client.createFirebaseLink(parent, firebaseLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFirebaseLinkRequest actualRequest = ((CreateFirebaseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(firebaseLink, actualRequest.getFirebaseLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFirebaseLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      FirebaseLink firebaseLink = FirebaseLink.newBuilder().build();
      client.createFirebaseLink(parent, firebaseLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteFirebaseLinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    FirebaseLinkName name = FirebaseLinkName.of("[PROPERTY]", "[FIREBASE_LINK]");

    client.deleteFirebaseLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFirebaseLinkRequest actualRequest = ((DeleteFirebaseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFirebaseLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      FirebaseLinkName name = FirebaseLinkName.of("[PROPERTY]", "[FIREBASE_LINK]");
      client.deleteFirebaseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteFirebaseLinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteFirebaseLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFirebaseLinkRequest actualRequest = ((DeleteFirebaseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFirebaseLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteFirebaseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFirebaseLinksTest() throws Exception {
    FirebaseLink responsesElement = FirebaseLink.newBuilder().build();
    ListFirebaseLinksResponse expectedResponse =
        ListFirebaseLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllFirebaseLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListFirebaseLinksPagedResponse pagedListResponse = client.listFirebaseLinks(parent);

    List<FirebaseLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFirebaseLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFirebaseLinksRequest actualRequest = ((ListFirebaseLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFirebaseLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listFirebaseLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFirebaseLinksTest2() throws Exception {
    FirebaseLink responsesElement = FirebaseLink.newBuilder().build();
    ListFirebaseLinksResponse expectedResponse =
        ListFirebaseLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllFirebaseLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListFirebaseLinksPagedResponse pagedListResponse = client.listFirebaseLinks(parent);

    List<FirebaseLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFirebaseLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFirebaseLinksRequest actualRequest = ((ListFirebaseLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFirebaseLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listFirebaseLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGlobalSiteTagTest() throws Exception {
    GlobalSiteTag expectedResponse =
        GlobalSiteTag.newBuilder()
            .setName(GlobalSiteTagName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setSnippet("snippet-2061635299")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    GlobalSiteTagName name = GlobalSiteTagName.of("[PROPERTY]", "[DATA_STREAM]");

    GlobalSiteTag actualResponse = client.getGlobalSiteTag(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlobalSiteTagRequest actualRequest = ((GetGlobalSiteTagRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlobalSiteTagExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      GlobalSiteTagName name = GlobalSiteTagName.of("[PROPERTY]", "[DATA_STREAM]");
      client.getGlobalSiteTag(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGlobalSiteTagTest2() throws Exception {
    GlobalSiteTag expectedResponse =
        GlobalSiteTag.newBuilder()
            .setName(GlobalSiteTagName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setSnippet("snippet-2061635299")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    GlobalSiteTag actualResponse = client.getGlobalSiteTag(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlobalSiteTagRequest actualRequest = ((GetGlobalSiteTagRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlobalSiteTagExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getGlobalSiteTag(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createGoogleAdsLinkTest() throws Exception {
    GoogleAdsLink expectedResponse =
        GoogleAdsLink.newBuilder()
            .setName(GoogleAdsLinkName.of("[PROPERTY]", "[GOOGLE_ADS_LINK]").toString())
            .setCustomerId("customerId-1581184615")
            .setCanManageClients(true)
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setCreatorEmailAddress("creatorEmailAddress67752708")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();

    GoogleAdsLink actualResponse = client.createGoogleAdsLink(parent, googleAdsLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGoogleAdsLinkRequest actualRequest = ((CreateGoogleAdsLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(googleAdsLink, actualRequest.getGoogleAdsLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGoogleAdsLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();
      client.createGoogleAdsLink(parent, googleAdsLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createGoogleAdsLinkTest2() throws Exception {
    GoogleAdsLink expectedResponse =
        GoogleAdsLink.newBuilder()
            .setName(GoogleAdsLinkName.of("[PROPERTY]", "[GOOGLE_ADS_LINK]").toString())
            .setCustomerId("customerId-1581184615")
            .setCanManageClients(true)
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setCreatorEmailAddress("creatorEmailAddress67752708")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();

    GoogleAdsLink actualResponse = client.createGoogleAdsLink(parent, googleAdsLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGoogleAdsLinkRequest actualRequest = ((CreateGoogleAdsLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(googleAdsLink, actualRequest.getGoogleAdsLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGoogleAdsLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();
      client.createGoogleAdsLink(parent, googleAdsLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateGoogleAdsLinkTest() throws Exception {
    GoogleAdsLink expectedResponse =
        GoogleAdsLink.newBuilder()
            .setName(GoogleAdsLinkName.of("[PROPERTY]", "[GOOGLE_ADS_LINK]").toString())
            .setCustomerId("customerId-1581184615")
            .setCanManageClients(true)
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setCreatorEmailAddress("creatorEmailAddress67752708")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    GoogleAdsLink actualResponse = client.updateGoogleAdsLink(googleAdsLink, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateGoogleAdsLinkRequest actualRequest = ((UpdateGoogleAdsLinkRequest) actualRequests.get(0));

    Assert.assertEquals(googleAdsLink, actualRequest.getGoogleAdsLink());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateGoogleAdsLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      GoogleAdsLink googleAdsLink = GoogleAdsLink.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateGoogleAdsLink(googleAdsLink, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteGoogleAdsLinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    GoogleAdsLinkName name = GoogleAdsLinkName.of("[PROPERTY]", "[GOOGLE_ADS_LINK]");

    client.deleteGoogleAdsLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGoogleAdsLinkRequest actualRequest = ((DeleteGoogleAdsLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGoogleAdsLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      GoogleAdsLinkName name = GoogleAdsLinkName.of("[PROPERTY]", "[GOOGLE_ADS_LINK]");
      client.deleteGoogleAdsLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteGoogleAdsLinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteGoogleAdsLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGoogleAdsLinkRequest actualRequest = ((DeleteGoogleAdsLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGoogleAdsLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteGoogleAdsLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGoogleAdsLinksTest() throws Exception {
    GoogleAdsLink responsesElement = GoogleAdsLink.newBuilder().build();
    ListGoogleAdsLinksResponse expectedResponse =
        ListGoogleAdsLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllGoogleAdsLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListGoogleAdsLinksPagedResponse pagedListResponse = client.listGoogleAdsLinks(parent);

    List<GoogleAdsLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGoogleAdsLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGoogleAdsLinksRequest actualRequest = ((ListGoogleAdsLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGoogleAdsLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listGoogleAdsLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGoogleAdsLinksTest2() throws Exception {
    GoogleAdsLink responsesElement = GoogleAdsLink.newBuilder().build();
    ListGoogleAdsLinksResponse expectedResponse =
        ListGoogleAdsLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllGoogleAdsLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListGoogleAdsLinksPagedResponse pagedListResponse = client.listGoogleAdsLinks(parent);

    List<GoogleAdsLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGoogleAdsLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGoogleAdsLinksRequest actualRequest = ((ListGoogleAdsLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGoogleAdsLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listGoogleAdsLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataSharingSettingsTest() throws Exception {
    DataSharingSettings expectedResponse =
        DataSharingSettings.newBuilder()
            .setName(DataSharingSettingsName.of("[ACCOUNT]").toString())
            .setSharingWithGoogleSupportEnabled(true)
            .setSharingWithGoogleAssignedSalesEnabled(true)
            .setSharingWithGoogleAnySalesEnabled(true)
            .setSharingWithGoogleProductsEnabled(true)
            .setSharingWithOthersEnabled(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataSharingSettingsName name = DataSharingSettingsName.of("[ACCOUNT]");

    DataSharingSettings actualResponse = client.getDataSharingSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataSharingSettingsRequest actualRequest =
        ((GetDataSharingSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataSharingSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataSharingSettingsName name = DataSharingSettingsName.of("[ACCOUNT]");
      client.getDataSharingSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataSharingSettingsTest2() throws Exception {
    DataSharingSettings expectedResponse =
        DataSharingSettings.newBuilder()
            .setName(DataSharingSettingsName.of("[ACCOUNT]").toString())
            .setSharingWithGoogleSupportEnabled(true)
            .setSharingWithGoogleAssignedSalesEnabled(true)
            .setSharingWithGoogleAnySalesEnabled(true)
            .setSharingWithGoogleProductsEnabled(true)
            .setSharingWithOthersEnabled(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    DataSharingSettings actualResponse = client.getDataSharingSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataSharingSettingsRequest actualRequest =
        ((GetDataSharingSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataSharingSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getDataSharingSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMeasurementProtocolSecretTest() throws Exception {
    MeasurementProtocolSecret expectedResponse =
        MeasurementProtocolSecret.newBuilder()
            .setName(
                MeasurementProtocolSecretName.of(
                        "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setSecretValue("secretValue-2044460895")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    MeasurementProtocolSecretName name =
        MeasurementProtocolSecretName.of(
            "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]");

    MeasurementProtocolSecret actualResponse = client.getMeasurementProtocolSecret(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMeasurementProtocolSecretRequest actualRequest =
        ((GetMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMeasurementProtocolSecretExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      MeasurementProtocolSecretName name =
          MeasurementProtocolSecretName.of(
              "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]");
      client.getMeasurementProtocolSecret(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMeasurementProtocolSecretTest2() throws Exception {
    MeasurementProtocolSecret expectedResponse =
        MeasurementProtocolSecret.newBuilder()
            .setName(
                MeasurementProtocolSecretName.of(
                        "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setSecretValue("secretValue-2044460895")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    MeasurementProtocolSecret actualResponse = client.getMeasurementProtocolSecret(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMeasurementProtocolSecretRequest actualRequest =
        ((GetMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMeasurementProtocolSecretExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getMeasurementProtocolSecret(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listMeasurementProtocolSecretsTest() throws Exception {
    MeasurementProtocolSecret responsesElement = MeasurementProtocolSecret.newBuilder().build();
    ListMeasurementProtocolSecretsResponse expectedResponse =
        ListMeasurementProtocolSecretsResponse.newBuilder()
            .setNextPageToken("")
            .addAllMeasurementProtocolSecrets(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");

    ListMeasurementProtocolSecretsPagedResponse pagedListResponse =
        client.listMeasurementProtocolSecrets(parent);

    List<MeasurementProtocolSecret> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getMeasurementProtocolSecretsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListMeasurementProtocolSecretsRequest actualRequest =
        ((ListMeasurementProtocolSecretsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listMeasurementProtocolSecretsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      client.listMeasurementProtocolSecrets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listMeasurementProtocolSecretsTest2() throws Exception {
    MeasurementProtocolSecret responsesElement = MeasurementProtocolSecret.newBuilder().build();
    ListMeasurementProtocolSecretsResponse expectedResponse =
        ListMeasurementProtocolSecretsResponse.newBuilder()
            .setNextPageToken("")
            .addAllMeasurementProtocolSecrets(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListMeasurementProtocolSecretsPagedResponse pagedListResponse =
        client.listMeasurementProtocolSecrets(parent);

    List<MeasurementProtocolSecret> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getMeasurementProtocolSecretsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListMeasurementProtocolSecretsRequest actualRequest =
        ((ListMeasurementProtocolSecretsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listMeasurementProtocolSecretsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listMeasurementProtocolSecrets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createMeasurementProtocolSecretTest() throws Exception {
    MeasurementProtocolSecret expectedResponse =
        MeasurementProtocolSecret.newBuilder()
            .setName(
                MeasurementProtocolSecretName.of(
                        "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setSecretValue("secretValue-2044460895")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
    MeasurementProtocolSecret measurementProtocolSecret =
        MeasurementProtocolSecret.newBuilder().build();

    MeasurementProtocolSecret actualResponse =
        client.createMeasurementProtocolSecret(parent, measurementProtocolSecret);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateMeasurementProtocolSecretRequest actualRequest =
        ((CreateMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(measurementProtocolSecret, actualRequest.getMeasurementProtocolSecret());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createMeasurementProtocolSecretExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      MeasurementProtocolSecret measurementProtocolSecret =
          MeasurementProtocolSecret.newBuilder().build();
      client.createMeasurementProtocolSecret(parent, measurementProtocolSecret);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createMeasurementProtocolSecretTest2() throws Exception {
    MeasurementProtocolSecret expectedResponse =
        MeasurementProtocolSecret.newBuilder()
            .setName(
                MeasurementProtocolSecretName.of(
                        "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setSecretValue("secretValue-2044460895")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    MeasurementProtocolSecret measurementProtocolSecret =
        MeasurementProtocolSecret.newBuilder().build();

    MeasurementProtocolSecret actualResponse =
        client.createMeasurementProtocolSecret(parent, measurementProtocolSecret);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateMeasurementProtocolSecretRequest actualRequest =
        ((CreateMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(measurementProtocolSecret, actualRequest.getMeasurementProtocolSecret());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createMeasurementProtocolSecretExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      MeasurementProtocolSecret measurementProtocolSecret =
          MeasurementProtocolSecret.newBuilder().build();
      client.createMeasurementProtocolSecret(parent, measurementProtocolSecret);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteMeasurementProtocolSecretTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    MeasurementProtocolSecretName name =
        MeasurementProtocolSecretName.of(
            "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]");

    client.deleteMeasurementProtocolSecret(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteMeasurementProtocolSecretRequest actualRequest =
        ((DeleteMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteMeasurementProtocolSecretExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      MeasurementProtocolSecretName name =
          MeasurementProtocolSecretName.of(
              "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]");
      client.deleteMeasurementProtocolSecret(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteMeasurementProtocolSecretTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteMeasurementProtocolSecret(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteMeasurementProtocolSecretRequest actualRequest =
        ((DeleteMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteMeasurementProtocolSecretExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteMeasurementProtocolSecret(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateMeasurementProtocolSecretTest() throws Exception {
    MeasurementProtocolSecret expectedResponse =
        MeasurementProtocolSecret.newBuilder()
            .setName(
                MeasurementProtocolSecretName.of(
                        "[PROPERTY]", "[DATA_STREAM]", "[MEASUREMENT_PROTOCOL_SECRET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setSecretValue("secretValue-2044460895")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    MeasurementProtocolSecret measurementProtocolSecret =
        MeasurementProtocolSecret.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    MeasurementProtocolSecret actualResponse =
        client.updateMeasurementProtocolSecret(measurementProtocolSecret, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateMeasurementProtocolSecretRequest actualRequest =
        ((UpdateMeasurementProtocolSecretRequest) actualRequests.get(0));

    Assert.assertEquals(measurementProtocolSecret, actualRequest.getMeasurementProtocolSecret());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateMeasurementProtocolSecretExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      MeasurementProtocolSecret measurementProtocolSecret =
          MeasurementProtocolSecret.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateMeasurementProtocolSecret(measurementProtocolSecret, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void acknowledgeUserDataCollectionTest() throws Exception {
    AcknowledgeUserDataCollectionResponse expectedResponse =
        AcknowledgeUserDataCollectionResponse.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AcknowledgeUserDataCollectionRequest request =
        AcknowledgeUserDataCollectionRequest.newBuilder()
            .setProperty(PropertyName.of("[PROPERTY]").toString())
            .setAcknowledgement("acknowledgement1769490938")
            .build();

    AcknowledgeUserDataCollectionResponse actualResponse =
        client.acknowledgeUserDataCollection(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AcknowledgeUserDataCollectionRequest actualRequest =
        ((AcknowledgeUserDataCollectionRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getAcknowledgement(), actualRequest.getAcknowledgement());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void acknowledgeUserDataCollectionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AcknowledgeUserDataCollectionRequest request =
          AcknowledgeUserDataCollectionRequest.newBuilder()
              .setProperty(PropertyName.of("[PROPERTY]").toString())
              .setAcknowledgement("acknowledgement1769490938")
              .build();
      client.acknowledgeUserDataCollection(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchChangeHistoryEventsTest() throws Exception {
    ChangeHistoryEvent responsesElement = ChangeHistoryEvent.newBuilder().build();
    SearchChangeHistoryEventsResponse expectedResponse =
        SearchChangeHistoryEventsResponse.newBuilder()
            .setNextPageToken("")
            .addAllChangeHistoryEvents(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    SearchChangeHistoryEventsRequest request =
        SearchChangeHistoryEventsRequest.newBuilder()
            .setAccount(AccountName.of("[ACCOUNT]").toString())
            .setProperty(PropertyName.of("[PROPERTY]").toString())
            .addAllResourceType(new ArrayList<ChangeHistoryResourceType>())
            .addAllAction(new ArrayList<ActionType>())
            .addAllActorEmail(new ArrayList<String>())
            .setEarliestChangeTime(Timestamp.newBuilder().build())
            .setLatestChangeTime(Timestamp.newBuilder().build())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    SearchChangeHistoryEventsPagedResponse pagedListResponse =
        client.searchChangeHistoryEvents(request);

    List<ChangeHistoryEvent> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getChangeHistoryEventsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchChangeHistoryEventsRequest actualRequest =
        ((SearchChangeHistoryEventsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getAccount(), actualRequest.getAccount());
    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getResourceTypeList(), actualRequest.getResourceTypeList());
    Assert.assertEquals(request.getActionList(), actualRequest.getActionList());
    Assert.assertEquals(request.getActorEmailList(), actualRequest.getActorEmailList());
    Assert.assertEquals(request.getEarliestChangeTime(), actualRequest.getEarliestChangeTime());
    Assert.assertEquals(request.getLatestChangeTime(), actualRequest.getLatestChangeTime());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void searchChangeHistoryEventsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      SearchChangeHistoryEventsRequest request =
          SearchChangeHistoryEventsRequest.newBuilder()
              .setAccount(AccountName.of("[ACCOUNT]").toString())
              .setProperty(PropertyName.of("[PROPERTY]").toString())
              .addAllResourceType(new ArrayList<ChangeHistoryResourceType>())
              .addAllAction(new ArrayList<ActionType>())
              .addAllActorEmail(new ArrayList<String>())
              .setEarliestChangeTime(Timestamp.newBuilder().build())
              .setLatestChangeTime(Timestamp.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.searchChangeHistoryEvents(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGoogleSignalsSettingsTest() throws Exception {
    GoogleSignalsSettings expectedResponse =
        GoogleSignalsSettings.newBuilder()
            .setName(GoogleSignalsSettingsName.of("[PROPERTY]").toString())
            .setState(GoogleSignalsState.forNumber(0))
            .setConsent(GoogleSignalsConsent.forNumber(0))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    GoogleSignalsSettingsName name = GoogleSignalsSettingsName.of("[PROPERTY]");

    GoogleSignalsSettings actualResponse = client.getGoogleSignalsSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGoogleSignalsSettingsRequest actualRequest =
        ((GetGoogleSignalsSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGoogleSignalsSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      GoogleSignalsSettingsName name = GoogleSignalsSettingsName.of("[PROPERTY]");
      client.getGoogleSignalsSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGoogleSignalsSettingsTest2() throws Exception {
    GoogleSignalsSettings expectedResponse =
        GoogleSignalsSettings.newBuilder()
            .setName(GoogleSignalsSettingsName.of("[PROPERTY]").toString())
            .setState(GoogleSignalsState.forNumber(0))
            .setConsent(GoogleSignalsConsent.forNumber(0))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    GoogleSignalsSettings actualResponse = client.getGoogleSignalsSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGoogleSignalsSettingsRequest actualRequest =
        ((GetGoogleSignalsSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGoogleSignalsSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getGoogleSignalsSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateGoogleSignalsSettingsTest() throws Exception {
    GoogleSignalsSettings expectedResponse =
        GoogleSignalsSettings.newBuilder()
            .setName(GoogleSignalsSettingsName.of("[PROPERTY]").toString())
            .setState(GoogleSignalsState.forNumber(0))
            .setConsent(GoogleSignalsConsent.forNumber(0))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    GoogleSignalsSettings googleSignalsSettings = GoogleSignalsSettings.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    GoogleSignalsSettings actualResponse =
        client.updateGoogleSignalsSettings(googleSignalsSettings, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateGoogleSignalsSettingsRequest actualRequest =
        ((UpdateGoogleSignalsSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(googleSignalsSettings, actualRequest.getGoogleSignalsSettings());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateGoogleSignalsSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      GoogleSignalsSettings googleSignalsSettings = GoogleSignalsSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateGoogleSignalsSettings(googleSignalsSettings, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createConversionEventTest() throws Exception {
    ConversionEvent expectedResponse =
        ConversionEvent.newBuilder()
            .setName(ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]").toString())
            .setEventName("eventName31228997")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeletable(true)
            .setCustom(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    ConversionEvent conversionEvent = ConversionEvent.newBuilder().build();

    ConversionEvent actualResponse = client.createConversionEvent(parent, conversionEvent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConversionEventRequest actualRequest =
        ((CreateConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(conversionEvent, actualRequest.getConversionEvent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConversionEventExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      ConversionEvent conversionEvent = ConversionEvent.newBuilder().build();
      client.createConversionEvent(parent, conversionEvent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createConversionEventTest2() throws Exception {
    ConversionEvent expectedResponse =
        ConversionEvent.newBuilder()
            .setName(ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]").toString())
            .setEventName("eventName31228997")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeletable(true)
            .setCustom(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    ConversionEvent conversionEvent = ConversionEvent.newBuilder().build();

    ConversionEvent actualResponse = client.createConversionEvent(parent, conversionEvent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConversionEventRequest actualRequest =
        ((CreateConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(conversionEvent, actualRequest.getConversionEvent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConversionEventExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      ConversionEvent conversionEvent = ConversionEvent.newBuilder().build();
      client.createConversionEvent(parent, conversionEvent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversionEventTest() throws Exception {
    ConversionEvent expectedResponse =
        ConversionEvent.newBuilder()
            .setName(ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]").toString())
            .setEventName("eventName31228997")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeletable(true)
            .setCustom(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ConversionEventName name = ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]");

    ConversionEvent actualResponse = client.getConversionEvent(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionEventRequest actualRequest = ((GetConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionEventExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ConversionEventName name = ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]");
      client.getConversionEvent(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversionEventTest2() throws Exception {
    ConversionEvent expectedResponse =
        ConversionEvent.newBuilder()
            .setName(ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]").toString())
            .setEventName("eventName31228997")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeletable(true)
            .setCustom(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    ConversionEvent actualResponse = client.getConversionEvent(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionEventRequest actualRequest = ((GetConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionEventExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getConversionEvent(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConversionEventTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ConversionEventName name = ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]");

    client.deleteConversionEvent(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversionEventRequest actualRequest =
        ((DeleteConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversionEventExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ConversionEventName name = ConversionEventName.of("[PROPERTY]", "[CONVERSION_EVENT]");
      client.deleteConversionEvent(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConversionEventTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteConversionEvent(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversionEventRequest actualRequest =
        ((DeleteConversionEventRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversionEventExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteConversionEvent(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversionEventsTest() throws Exception {
    ConversionEvent responsesElement = ConversionEvent.newBuilder().build();
    ListConversionEventsResponse expectedResponse =
        ListConversionEventsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversionEvents(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListConversionEventsPagedResponse pagedListResponse = client.listConversionEvents(parent);

    List<ConversionEvent> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversionEventsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversionEventsRequest actualRequest =
        ((ListConversionEventsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversionEventsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listConversionEvents(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversionEventsTest2() throws Exception {
    ConversionEvent responsesElement = ConversionEvent.newBuilder().build();
    ListConversionEventsResponse expectedResponse =
        ListConversionEventsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversionEvents(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListConversionEventsPagedResponse pagedListResponse = client.listConversionEvents(parent);

    List<ConversionEvent> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversionEventsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversionEventsRequest actualRequest =
        ((ListConversionEventsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversionEventsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listConversionEvents(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkTest() throws Exception {
    DisplayVideo360AdvertiserLink expectedResponse =
        DisplayVideo360AdvertiserLink.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DisplayVideo360AdvertiserLinkName name =
        DisplayVideo360AdvertiserLinkName.of("[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]");

    DisplayVideo360AdvertiserLink actualResponse = client.getDisplayVideo360AdvertiserLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((GetDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DisplayVideo360AdvertiserLinkName name =
          DisplayVideo360AdvertiserLinkName.of("[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]");
      client.getDisplayVideo360AdvertiserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkTest2() throws Exception {
    DisplayVideo360AdvertiserLink expectedResponse =
        DisplayVideo360AdvertiserLink.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    DisplayVideo360AdvertiserLink actualResponse = client.getDisplayVideo360AdvertiserLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((GetDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getDisplayVideo360AdvertiserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDisplayVideo360AdvertiserLinksTest() throws Exception {
    DisplayVideo360AdvertiserLink responsesElement =
        DisplayVideo360AdvertiserLink.newBuilder().build();
    ListDisplayVideo360AdvertiserLinksResponse expectedResponse =
        ListDisplayVideo360AdvertiserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllDisplayVideo360AdvertiserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListDisplayVideo360AdvertiserLinksPagedResponse pagedListResponse =
        client.listDisplayVideo360AdvertiserLinks(parent);

    List<DisplayVideo360AdvertiserLink> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getDisplayVideo360AdvertiserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDisplayVideo360AdvertiserLinksRequest actualRequest =
        ((ListDisplayVideo360AdvertiserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDisplayVideo360AdvertiserLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listDisplayVideo360AdvertiserLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDisplayVideo360AdvertiserLinksTest2() throws Exception {
    DisplayVideo360AdvertiserLink responsesElement =
        DisplayVideo360AdvertiserLink.newBuilder().build();
    ListDisplayVideo360AdvertiserLinksResponse expectedResponse =
        ListDisplayVideo360AdvertiserLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllDisplayVideo360AdvertiserLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListDisplayVideo360AdvertiserLinksPagedResponse pagedListResponse =
        client.listDisplayVideo360AdvertiserLinks(parent);

    List<DisplayVideo360AdvertiserLink> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getDisplayVideo360AdvertiserLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDisplayVideo360AdvertiserLinksRequest actualRequest =
        ((ListDisplayVideo360AdvertiserLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDisplayVideo360AdvertiserLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listDisplayVideo360AdvertiserLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkTest() throws Exception {
    DisplayVideo360AdvertiserLink expectedResponse =
        DisplayVideo360AdvertiserLink.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
        DisplayVideo360AdvertiserLink.newBuilder().build();

    DisplayVideo360AdvertiserLink actualResponse =
        client.createDisplayVideo360AdvertiserLink(parent, displayVideo360AdvertiserLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((CreateDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(
        displayVideo360AdvertiserLink, actualRequest.getDisplayVideo360AdvertiserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
          DisplayVideo360AdvertiserLink.newBuilder().build();
      client.createDisplayVideo360AdvertiserLink(parent, displayVideo360AdvertiserLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkTest2() throws Exception {
    DisplayVideo360AdvertiserLink expectedResponse =
        DisplayVideo360AdvertiserLink.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
        DisplayVideo360AdvertiserLink.newBuilder().build();

    DisplayVideo360AdvertiserLink actualResponse =
        client.createDisplayVideo360AdvertiserLink(parent, displayVideo360AdvertiserLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((CreateDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(
        displayVideo360AdvertiserLink, actualRequest.getDisplayVideo360AdvertiserLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
          DisplayVideo360AdvertiserLink.newBuilder().build();
      client.createDisplayVideo360AdvertiserLink(parent, displayVideo360AdvertiserLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DisplayVideo360AdvertiserLinkName name =
        DisplayVideo360AdvertiserLinkName.of("[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]");

    client.deleteDisplayVideo360AdvertiserLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((DeleteDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DisplayVideo360AdvertiserLinkName name =
          DisplayVideo360AdvertiserLinkName.of("[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]");
      client.deleteDisplayVideo360AdvertiserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteDisplayVideo360AdvertiserLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((DeleteDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteDisplayVideo360AdvertiserLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDisplayVideo360AdvertiserLinkTest() throws Exception {
    DisplayVideo360AdvertiserLink expectedResponse =
        DisplayVideo360AdvertiserLink.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
        DisplayVideo360AdvertiserLink.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    DisplayVideo360AdvertiserLink actualResponse =
        client.updateDisplayVideo360AdvertiserLink(displayVideo360AdvertiserLink, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDisplayVideo360AdvertiserLinkRequest actualRequest =
        ((UpdateDisplayVideo360AdvertiserLinkRequest) actualRequests.get(0));

    Assert.assertEquals(
        displayVideo360AdvertiserLink, actualRequest.getDisplayVideo360AdvertiserLink());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateDisplayVideo360AdvertiserLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DisplayVideo360AdvertiserLink displayVideo360AdvertiserLink =
          DisplayVideo360AdvertiserLink.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateDisplayVideo360AdvertiserLink(displayVideo360AdvertiserLink, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkProposalTest() throws Exception {
    DisplayVideo360AdvertiserLinkProposal expectedResponse =
        DisplayVideo360AdvertiserLinkProposal.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setLinkProposalStatusDetails(LinkProposalStatusDetails.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setValidationEmail("validationEmail-94407005")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DisplayVideo360AdvertiserLinkProposalName name =
        DisplayVideo360AdvertiserLinkProposalName.of(
            "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]");

    DisplayVideo360AdvertiserLinkProposal actualResponse =
        client.getDisplayVideo360AdvertiserLinkProposal(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((GetDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DisplayVideo360AdvertiserLinkProposalName name =
          DisplayVideo360AdvertiserLinkProposalName.of(
              "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]");
      client.getDisplayVideo360AdvertiserLinkProposal(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkProposalTest2() throws Exception {
    DisplayVideo360AdvertiserLinkProposal expectedResponse =
        DisplayVideo360AdvertiserLinkProposal.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setLinkProposalStatusDetails(LinkProposalStatusDetails.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setValidationEmail("validationEmail-94407005")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    DisplayVideo360AdvertiserLinkProposal actualResponse =
        client.getDisplayVideo360AdvertiserLinkProposal(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((GetDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDisplayVideo360AdvertiserLinkProposalExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getDisplayVideo360AdvertiserLinkProposal(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDisplayVideo360AdvertiserLinkProposalsTest() throws Exception {
    DisplayVideo360AdvertiserLinkProposal responsesElement =
        DisplayVideo360AdvertiserLinkProposal.newBuilder().build();
    ListDisplayVideo360AdvertiserLinkProposalsResponse expectedResponse =
        ListDisplayVideo360AdvertiserLinkProposalsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDisplayVideo360AdvertiserLinkProposals(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListDisplayVideo360AdvertiserLinkProposalsPagedResponse pagedListResponse =
        client.listDisplayVideo360AdvertiserLinkProposals(parent);

    List<DisplayVideo360AdvertiserLinkProposal> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getDisplayVideo360AdvertiserLinkProposalsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDisplayVideo360AdvertiserLinkProposalsRequest actualRequest =
        ((ListDisplayVideo360AdvertiserLinkProposalsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDisplayVideo360AdvertiserLinkProposalsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listDisplayVideo360AdvertiserLinkProposals(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDisplayVideo360AdvertiserLinkProposalsTest2() throws Exception {
    DisplayVideo360AdvertiserLinkProposal responsesElement =
        DisplayVideo360AdvertiserLinkProposal.newBuilder().build();
    ListDisplayVideo360AdvertiserLinkProposalsResponse expectedResponse =
        ListDisplayVideo360AdvertiserLinkProposalsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDisplayVideo360AdvertiserLinkProposals(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListDisplayVideo360AdvertiserLinkProposalsPagedResponse pagedListResponse =
        client.listDisplayVideo360AdvertiserLinkProposals(parent);

    List<DisplayVideo360AdvertiserLinkProposal> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getDisplayVideo360AdvertiserLinkProposalsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDisplayVideo360AdvertiserLinkProposalsRequest actualRequest =
        ((ListDisplayVideo360AdvertiserLinkProposalsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDisplayVideo360AdvertiserLinkProposalsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listDisplayVideo360AdvertiserLinkProposals(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkProposalTest() throws Exception {
    DisplayVideo360AdvertiserLinkProposal expectedResponse =
        DisplayVideo360AdvertiserLinkProposal.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setLinkProposalStatusDetails(LinkProposalStatusDetails.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setValidationEmail("validationEmail-94407005")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    DisplayVideo360AdvertiserLinkProposal displayVideo360AdvertiserLinkProposal =
        DisplayVideo360AdvertiserLinkProposal.newBuilder().build();

    DisplayVideo360AdvertiserLinkProposal actualResponse =
        client.createDisplayVideo360AdvertiserLinkProposal(
            parent, displayVideo360AdvertiserLinkProposal);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((CreateDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(
        displayVideo360AdvertiserLinkProposal,
        actualRequest.getDisplayVideo360AdvertiserLinkProposal());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      DisplayVideo360AdvertiserLinkProposal displayVideo360AdvertiserLinkProposal =
          DisplayVideo360AdvertiserLinkProposal.newBuilder().build();
      client.createDisplayVideo360AdvertiserLinkProposal(
          parent, displayVideo360AdvertiserLinkProposal);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkProposalTest2() throws Exception {
    DisplayVideo360AdvertiserLinkProposal expectedResponse =
        DisplayVideo360AdvertiserLinkProposal.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setLinkProposalStatusDetails(LinkProposalStatusDetails.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setValidationEmail("validationEmail-94407005")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    DisplayVideo360AdvertiserLinkProposal displayVideo360AdvertiserLinkProposal =
        DisplayVideo360AdvertiserLinkProposal.newBuilder().build();

    DisplayVideo360AdvertiserLinkProposal actualResponse =
        client.createDisplayVideo360AdvertiserLinkProposal(
            parent, displayVideo360AdvertiserLinkProposal);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((CreateDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(
        displayVideo360AdvertiserLinkProposal,
        actualRequest.getDisplayVideo360AdvertiserLinkProposal());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDisplayVideo360AdvertiserLinkProposalExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      DisplayVideo360AdvertiserLinkProposal displayVideo360AdvertiserLinkProposal =
          DisplayVideo360AdvertiserLinkProposal.newBuilder().build();
      client.createDisplayVideo360AdvertiserLinkProposal(
          parent, displayVideo360AdvertiserLinkProposal);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkProposalTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DisplayVideo360AdvertiserLinkProposalName name =
        DisplayVideo360AdvertiserLinkProposalName.of(
            "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]");

    client.deleteDisplayVideo360AdvertiserLinkProposal(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((DeleteDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DisplayVideo360AdvertiserLinkProposalName name =
          DisplayVideo360AdvertiserLinkProposalName.of(
              "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]");
      client.deleteDisplayVideo360AdvertiserLinkProposal(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkProposalTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteDisplayVideo360AdvertiserLinkProposal(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((DeleteDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDisplayVideo360AdvertiserLinkProposalExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteDisplayVideo360AdvertiserLinkProposal(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void approveDisplayVideo360AdvertiserLinkProposalTest() throws Exception {
    ApproveDisplayVideo360AdvertiserLinkProposalResponse expectedResponse =
        ApproveDisplayVideo360AdvertiserLinkProposalResponse.newBuilder()
            .setDisplayVideo360AdvertiserLink(DisplayVideo360AdvertiserLink.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ApproveDisplayVideo360AdvertiserLinkProposalRequest request =
        ApproveDisplayVideo360AdvertiserLinkProposalRequest.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .build();

    ApproveDisplayVideo360AdvertiserLinkProposalResponse actualResponse =
        client.approveDisplayVideo360AdvertiserLinkProposal(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ApproveDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((ApproveDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void approveDisplayVideo360AdvertiserLinkProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ApproveDisplayVideo360AdvertiserLinkProposalRequest request =
          ApproveDisplayVideo360AdvertiserLinkProposalRequest.newBuilder()
              .setName(
                  DisplayVideo360AdvertiserLinkProposalName.of(
                          "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                      .toString())
              .build();
      client.approveDisplayVideo360AdvertiserLinkProposal(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void cancelDisplayVideo360AdvertiserLinkProposalTest() throws Exception {
    DisplayVideo360AdvertiserLinkProposal expectedResponse =
        DisplayVideo360AdvertiserLinkProposal.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .setAdvertiserId("advertiserId550061990")
            .setLinkProposalStatusDetails(LinkProposalStatusDetails.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setValidationEmail("validationEmail-94407005")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CancelDisplayVideo360AdvertiserLinkProposalRequest request =
        CancelDisplayVideo360AdvertiserLinkProposalRequest.newBuilder()
            .setName(
                DisplayVideo360AdvertiserLinkProposalName.of(
                        "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                    .toString())
            .build();

    DisplayVideo360AdvertiserLinkProposal actualResponse =
        client.cancelDisplayVideo360AdvertiserLinkProposal(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelDisplayVideo360AdvertiserLinkProposalRequest actualRequest =
        ((CancelDisplayVideo360AdvertiserLinkProposalRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void cancelDisplayVideo360AdvertiserLinkProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CancelDisplayVideo360AdvertiserLinkProposalRequest request =
          CancelDisplayVideo360AdvertiserLinkProposalRequest.newBuilder()
              .setName(
                  DisplayVideo360AdvertiserLinkProposalName.of(
                          "[PROPERTY]", "[DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL]")
                      .toString())
              .build();
      client.cancelDisplayVideo360AdvertiserLinkProposal(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCustomDimensionTest() throws Exception {
    CustomDimension expectedResponse =
        CustomDimension.newBuilder()
            .setName(CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDisallowAdsPersonalization(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    CustomDimension customDimension = CustomDimension.newBuilder().build();

    CustomDimension actualResponse = client.createCustomDimension(parent, customDimension);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCustomDimensionRequest actualRequest =
        ((CreateCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(customDimension, actualRequest.getCustomDimension());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCustomDimensionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      CustomDimension customDimension = CustomDimension.newBuilder().build();
      client.createCustomDimension(parent, customDimension);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCustomDimensionTest2() throws Exception {
    CustomDimension expectedResponse =
        CustomDimension.newBuilder()
            .setName(CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDisallowAdsPersonalization(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    CustomDimension customDimension = CustomDimension.newBuilder().build();

    CustomDimension actualResponse = client.createCustomDimension(parent, customDimension);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCustomDimensionRequest actualRequest =
        ((CreateCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(customDimension, actualRequest.getCustomDimension());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCustomDimensionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      CustomDimension customDimension = CustomDimension.newBuilder().build();
      client.createCustomDimension(parent, customDimension);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateCustomDimensionTest() throws Exception {
    CustomDimension expectedResponse =
        CustomDimension.newBuilder()
            .setName(CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDisallowAdsPersonalization(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomDimension customDimension = CustomDimension.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    CustomDimension actualResponse = client.updateCustomDimension(customDimension, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateCustomDimensionRequest actualRequest =
        ((UpdateCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(customDimension, actualRequest.getCustomDimension());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateCustomDimensionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomDimension customDimension = CustomDimension.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateCustomDimension(customDimension, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCustomDimensionsTest() throws Exception {
    CustomDimension responsesElement = CustomDimension.newBuilder().build();
    ListCustomDimensionsResponse expectedResponse =
        ListCustomDimensionsResponse.newBuilder()
            .setNextPageToken("")
            .addAllCustomDimensions(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListCustomDimensionsPagedResponse pagedListResponse = client.listCustomDimensions(parent);

    List<CustomDimension> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getCustomDimensionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCustomDimensionsRequest actualRequest =
        ((ListCustomDimensionsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCustomDimensionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listCustomDimensions(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCustomDimensionsTest2() throws Exception {
    CustomDimension responsesElement = CustomDimension.newBuilder().build();
    ListCustomDimensionsResponse expectedResponse =
        ListCustomDimensionsResponse.newBuilder()
            .setNextPageToken("")
            .addAllCustomDimensions(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListCustomDimensionsPagedResponse pagedListResponse = client.listCustomDimensions(parent);

    List<CustomDimension> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getCustomDimensionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCustomDimensionsRequest actualRequest =
        ((ListCustomDimensionsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCustomDimensionsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listCustomDimensions(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void archiveCustomDimensionTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomDimensionName name = CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]");

    client.archiveCustomDimension(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ArchiveCustomDimensionRequest actualRequest =
        ((ArchiveCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void archiveCustomDimensionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomDimensionName name = CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]");
      client.archiveCustomDimension(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void archiveCustomDimensionTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.archiveCustomDimension(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ArchiveCustomDimensionRequest actualRequest =
        ((ArchiveCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void archiveCustomDimensionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.archiveCustomDimension(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomDimensionTest() throws Exception {
    CustomDimension expectedResponse =
        CustomDimension.newBuilder()
            .setName(CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDisallowAdsPersonalization(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomDimensionName name = CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]");

    CustomDimension actualResponse = client.getCustomDimension(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomDimensionRequest actualRequest = ((GetCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomDimensionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomDimensionName name = CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]");
      client.getCustomDimension(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomDimensionTest2() throws Exception {
    CustomDimension expectedResponse =
        CustomDimension.newBuilder()
            .setName(CustomDimensionName.of("[PROPERTY]", "[CUSTOM_DIMENSION]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDisallowAdsPersonalization(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    CustomDimension actualResponse = client.getCustomDimension(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomDimensionRequest actualRequest = ((GetCustomDimensionRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomDimensionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getCustomDimension(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCustomMetricTest() throws Exception {
    CustomMetric expectedResponse =
        CustomMetric.newBuilder()
            .setName(CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllRestrictedMetricType(new ArrayList<CustomMetric.RestrictedMetricType>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    CustomMetric customMetric = CustomMetric.newBuilder().build();

    CustomMetric actualResponse = client.createCustomMetric(parent, customMetric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCustomMetricRequest actualRequest = ((CreateCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(customMetric, actualRequest.getCustomMetric());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCustomMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      CustomMetric customMetric = CustomMetric.newBuilder().build();
      client.createCustomMetric(parent, customMetric);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCustomMetricTest2() throws Exception {
    CustomMetric expectedResponse =
        CustomMetric.newBuilder()
            .setName(CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllRestrictedMetricType(new ArrayList<CustomMetric.RestrictedMetricType>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    CustomMetric customMetric = CustomMetric.newBuilder().build();

    CustomMetric actualResponse = client.createCustomMetric(parent, customMetric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCustomMetricRequest actualRequest = ((CreateCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(customMetric, actualRequest.getCustomMetric());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCustomMetricExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      CustomMetric customMetric = CustomMetric.newBuilder().build();
      client.createCustomMetric(parent, customMetric);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateCustomMetricTest() throws Exception {
    CustomMetric expectedResponse =
        CustomMetric.newBuilder()
            .setName(CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllRestrictedMetricType(new ArrayList<CustomMetric.RestrictedMetricType>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomMetric customMetric = CustomMetric.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    CustomMetric actualResponse = client.updateCustomMetric(customMetric, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateCustomMetricRequest actualRequest = ((UpdateCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(customMetric, actualRequest.getCustomMetric());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateCustomMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomMetric customMetric = CustomMetric.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateCustomMetric(customMetric, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCustomMetricsTest() throws Exception {
    CustomMetric responsesElement = CustomMetric.newBuilder().build();
    ListCustomMetricsResponse expectedResponse =
        ListCustomMetricsResponse.newBuilder()
            .setNextPageToken("")
            .addAllCustomMetrics(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListCustomMetricsPagedResponse pagedListResponse = client.listCustomMetrics(parent);

    List<CustomMetric> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getCustomMetricsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCustomMetricsRequest actualRequest = ((ListCustomMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCustomMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listCustomMetrics(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCustomMetricsTest2() throws Exception {
    CustomMetric responsesElement = CustomMetric.newBuilder().build();
    ListCustomMetricsResponse expectedResponse =
        ListCustomMetricsResponse.newBuilder()
            .setNextPageToken("")
            .addAllCustomMetrics(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListCustomMetricsPagedResponse pagedListResponse = client.listCustomMetrics(parent);

    List<CustomMetric> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getCustomMetricsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCustomMetricsRequest actualRequest = ((ListCustomMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCustomMetricsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listCustomMetrics(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void archiveCustomMetricTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomMetricName name = CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]");

    client.archiveCustomMetric(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ArchiveCustomMetricRequest actualRequest = ((ArchiveCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void archiveCustomMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomMetricName name = CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]");
      client.archiveCustomMetric(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void archiveCustomMetricTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.archiveCustomMetric(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ArchiveCustomMetricRequest actualRequest = ((ArchiveCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void archiveCustomMetricExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.archiveCustomMetric(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomMetricTest() throws Exception {
    CustomMetric expectedResponse =
        CustomMetric.newBuilder()
            .setName(CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllRestrictedMetricType(new ArrayList<CustomMetric.RestrictedMetricType>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CustomMetricName name = CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]");

    CustomMetric actualResponse = client.getCustomMetric(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomMetricRequest actualRequest = ((GetCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CustomMetricName name = CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]");
      client.getCustomMetric(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomMetricTest2() throws Exception {
    CustomMetric expectedResponse =
        CustomMetric.newBuilder()
            .setName(CustomMetricName.of("[PROPERTY]", "[CUSTOM_METRIC]").toString())
            .setParameterName("parameterName-379607596")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllRestrictedMetricType(new ArrayList<CustomMetric.RestrictedMetricType>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    CustomMetric actualResponse = client.getCustomMetric(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomMetricRequest actualRequest = ((GetCustomMetricRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomMetricExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getCustomMetric(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataRetentionSettingsTest() throws Exception {
    DataRetentionSettings expectedResponse =
        DataRetentionSettings.newBuilder()
            .setName(DataRetentionSettingsName.of("[PROPERTY]").toString())
            .setResetUserDataOnNewActivity(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataRetentionSettingsName name = DataRetentionSettingsName.of("[PROPERTY]");

    DataRetentionSettings actualResponse = client.getDataRetentionSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataRetentionSettingsRequest actualRequest =
        ((GetDataRetentionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataRetentionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataRetentionSettingsName name = DataRetentionSettingsName.of("[PROPERTY]");
      client.getDataRetentionSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataRetentionSettingsTest2() throws Exception {
    DataRetentionSettings expectedResponse =
        DataRetentionSettings.newBuilder()
            .setName(DataRetentionSettingsName.of("[PROPERTY]").toString())
            .setResetUserDataOnNewActivity(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    DataRetentionSettings actualResponse = client.getDataRetentionSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataRetentionSettingsRequest actualRequest =
        ((GetDataRetentionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataRetentionSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getDataRetentionSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDataRetentionSettingsTest() throws Exception {
    DataRetentionSettings expectedResponse =
        DataRetentionSettings.newBuilder()
            .setName(DataRetentionSettingsName.of("[PROPERTY]").toString())
            .setResetUserDataOnNewActivity(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataRetentionSettings dataRetentionSettings = DataRetentionSettings.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    DataRetentionSettings actualResponse =
        client.updateDataRetentionSettings(dataRetentionSettings, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDataRetentionSettingsRequest actualRequest =
        ((UpdateDataRetentionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(dataRetentionSettings, actualRequest.getDataRetentionSettings());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateDataRetentionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataRetentionSettings dataRetentionSettings = DataRetentionSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateDataRetentionSettings(dataRetentionSettings, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDataStreamTest() throws Exception {
    DataStream expectedResponse =
        DataStream.newBuilder()
            .setName(DataStreamName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    DataStream dataStream = DataStream.newBuilder().build();

    DataStream actualResponse = client.createDataStream(parent, dataStream);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDataStreamRequest actualRequest = ((CreateDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(dataStream, actualRequest.getDataStream());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDataStreamExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      DataStream dataStream = DataStream.newBuilder().build();
      client.createDataStream(parent, dataStream);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDataStreamTest2() throws Exception {
    DataStream expectedResponse =
        DataStream.newBuilder()
            .setName(DataStreamName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    DataStream dataStream = DataStream.newBuilder().build();

    DataStream actualResponse = client.createDataStream(parent, dataStream);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDataStreamRequest actualRequest = ((CreateDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(dataStream, actualRequest.getDataStream());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDataStreamExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      DataStream dataStream = DataStream.newBuilder().build();
      client.createDataStream(parent, dataStream);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDataStreamTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName name = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");

    client.deleteDataStream(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDataStreamRequest actualRequest = ((DeleteDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDataStreamExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName name = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      client.deleteDataStream(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDataStreamTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteDataStream(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDataStreamRequest actualRequest = ((DeleteDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDataStreamExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteDataStream(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDataStreamTest() throws Exception {
    DataStream expectedResponse =
        DataStream.newBuilder()
            .setName(DataStreamName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStream dataStream = DataStream.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    DataStream actualResponse = client.updateDataStream(dataStream, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDataStreamRequest actualRequest = ((UpdateDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(dataStream, actualRequest.getDataStream());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateDataStreamExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStream dataStream = DataStream.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateDataStream(dataStream, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDataStreamsTest() throws Exception {
    DataStream responsesElement = DataStream.newBuilder().build();
    ListDataStreamsResponse expectedResponse =
        ListDataStreamsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDataStreams(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListDataStreamsPagedResponse pagedListResponse = client.listDataStreams(parent);

    List<DataStream> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataStreamsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDataStreamsRequest actualRequest = ((ListDataStreamsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDataStreamsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listDataStreams(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDataStreamsTest2() throws Exception {
    DataStream responsesElement = DataStream.newBuilder().build();
    ListDataStreamsResponse expectedResponse =
        ListDataStreamsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDataStreams(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListDataStreamsPagedResponse pagedListResponse = client.listDataStreams(parent);

    List<DataStream> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataStreamsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDataStreamsRequest actualRequest = ((ListDataStreamsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDataStreamsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listDataStreams(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataStreamTest() throws Exception {
    DataStream expectedResponse =
        DataStream.newBuilder()
            .setName(DataStreamName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName name = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");

    DataStream actualResponse = client.getDataStream(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataStreamRequest actualRequest = ((GetDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataStreamExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName name = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      client.getDataStream(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataStreamTest2() throws Exception {
    DataStream expectedResponse =
        DataStream.newBuilder()
            .setName(DataStreamName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    DataStream actualResponse = client.getDataStream(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataStreamRequest actualRequest = ((GetDataStreamRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataStreamExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getDataStream(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAudienceTest() throws Exception {
    Audience expectedResponse =
        Audience.newBuilder()
            .setName(AudienceName.of("[PROPERTY]", "[AUDIENCE]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setMembershipDurationDays(1702404985)
            .setAdsPersonalizationEnabled(true)
            .setEventTrigger(AudienceEventTrigger.newBuilder().build())
            .addAllFilterClauses(new ArrayList<AudienceFilterClause>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AudienceName name = AudienceName.of("[PROPERTY]", "[AUDIENCE]");

    Audience actualResponse = client.getAudience(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAudienceRequest actualRequest = ((GetAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AudienceName name = AudienceName.of("[PROPERTY]", "[AUDIENCE]");
      client.getAudience(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAudienceTest2() throws Exception {
    Audience expectedResponse =
        Audience.newBuilder()
            .setName(AudienceName.of("[PROPERTY]", "[AUDIENCE]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setMembershipDurationDays(1702404985)
            .setAdsPersonalizationEnabled(true)
            .setEventTrigger(AudienceEventTrigger.newBuilder().build())
            .addAllFilterClauses(new ArrayList<AudienceFilterClause>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    Audience actualResponse = client.getAudience(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAudienceRequest actualRequest = ((GetAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAudienceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getAudience(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAudiencesTest() throws Exception {
    Audience responsesElement = Audience.newBuilder().build();
    ListAudiencesResponse expectedResponse =
        ListAudiencesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAudiences(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListAudiencesPagedResponse pagedListResponse = client.listAudiences(parent);

    List<Audience> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAudiencesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAudiencesRequest actualRequest = ((ListAudiencesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAudiencesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listAudiences(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAudiencesTest2() throws Exception {
    Audience responsesElement = Audience.newBuilder().build();
    ListAudiencesResponse expectedResponse =
        ListAudiencesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAudiences(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAudiencesPagedResponse pagedListResponse = client.listAudiences(parent);

    List<Audience> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAudiencesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAudiencesRequest actualRequest = ((ListAudiencesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAudiencesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAudiences(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAudienceTest() throws Exception {
    Audience expectedResponse =
        Audience.newBuilder()
            .setName(AudienceName.of("[PROPERTY]", "[AUDIENCE]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setMembershipDurationDays(1702404985)
            .setAdsPersonalizationEnabled(true)
            .setEventTrigger(AudienceEventTrigger.newBuilder().build())
            .addAllFilterClauses(new ArrayList<AudienceFilterClause>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    Audience audience = Audience.newBuilder().build();

    Audience actualResponse = client.createAudience(parent, audience);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAudienceRequest actualRequest = ((CreateAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(audience, actualRequest.getAudience());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      Audience audience = Audience.newBuilder().build();
      client.createAudience(parent, audience);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAudienceTest2() throws Exception {
    Audience expectedResponse =
        Audience.newBuilder()
            .setName(AudienceName.of("[PROPERTY]", "[AUDIENCE]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setMembershipDurationDays(1702404985)
            .setAdsPersonalizationEnabled(true)
            .setEventTrigger(AudienceEventTrigger.newBuilder().build())
            .addAllFilterClauses(new ArrayList<AudienceFilterClause>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Audience audience = Audience.newBuilder().build();

    Audience actualResponse = client.createAudience(parent, audience);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAudienceRequest actualRequest = ((CreateAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(audience, actualRequest.getAudience());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAudienceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      Audience audience = Audience.newBuilder().build();
      client.createAudience(parent, audience);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAudienceTest() throws Exception {
    Audience expectedResponse =
        Audience.newBuilder()
            .setName(AudienceName.of("[PROPERTY]", "[AUDIENCE]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setMembershipDurationDays(1702404985)
            .setAdsPersonalizationEnabled(true)
            .setEventTrigger(AudienceEventTrigger.newBuilder().build())
            .addAllFilterClauses(new ArrayList<AudienceFilterClause>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    Audience audience = Audience.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Audience actualResponse = client.updateAudience(audience, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAudienceRequest actualRequest = ((UpdateAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(audience, actualRequest.getAudience());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      Audience audience = Audience.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAudience(audience, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void archiveAudienceTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ArchiveAudienceRequest request =
        ArchiveAudienceRequest.newBuilder()
            .setName(PropertyName.of("[PROPERTY]").toString())
            .build();

    client.archiveAudience(request);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ArchiveAudienceRequest actualRequest = ((ArchiveAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void archiveAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ArchiveAudienceRequest request =
          ArchiveAudienceRequest.newBuilder()
              .setName(PropertyName.of("[PROPERTY]").toString())
              .build();
      client.archiveAudience(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSearchAds360LinkTest() throws Exception {
    SearchAds360Link expectedResponse =
        SearchAds360Link.newBuilder()
            .setName(SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]").toString())
            .setAdvertiserId("advertiserId550061990")
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setSiteStatsSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    SearchAds360LinkName name = SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]");

    SearchAds360Link actualResponse = client.getSearchAds360Link(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSearchAds360LinkRequest actualRequest = ((GetSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSearchAds360LinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      SearchAds360LinkName name = SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]");
      client.getSearchAds360Link(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSearchAds360LinkTest2() throws Exception {
    SearchAds360Link expectedResponse =
        SearchAds360Link.newBuilder()
            .setName(SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]").toString())
            .setAdvertiserId("advertiserId550061990")
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setSiteStatsSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    SearchAds360Link actualResponse = client.getSearchAds360Link(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSearchAds360LinkRequest actualRequest = ((GetSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSearchAds360LinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getSearchAds360Link(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSearchAds360LinksTest() throws Exception {
    SearchAds360Link responsesElement = SearchAds360Link.newBuilder().build();
    ListSearchAds360LinksResponse expectedResponse =
        ListSearchAds360LinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllSearchAds360Links(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListSearchAds360LinksPagedResponse pagedListResponse = client.listSearchAds360Links(parent);

    List<SearchAds360Link> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSearchAds360LinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSearchAds360LinksRequest actualRequest =
        ((ListSearchAds360LinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSearchAds360LinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listSearchAds360Links(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSearchAds360LinksTest2() throws Exception {
    SearchAds360Link responsesElement = SearchAds360Link.newBuilder().build();
    ListSearchAds360LinksResponse expectedResponse =
        ListSearchAds360LinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllSearchAds360Links(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListSearchAds360LinksPagedResponse pagedListResponse = client.listSearchAds360Links(parent);

    List<SearchAds360Link> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSearchAds360LinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSearchAds360LinksRequest actualRequest =
        ((ListSearchAds360LinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSearchAds360LinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listSearchAds360Links(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSearchAds360LinkTest() throws Exception {
    SearchAds360Link expectedResponse =
        SearchAds360Link.newBuilder()
            .setName(SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]").toString())
            .setAdvertiserId("advertiserId550061990")
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setSiteStatsSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();

    SearchAds360Link actualResponse = client.createSearchAds360Link(parent, searchAds360Link);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSearchAds360LinkRequest actualRequest =
        ((CreateSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(searchAds360Link, actualRequest.getSearchAds360Link());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createSearchAds360LinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();
      client.createSearchAds360Link(parent, searchAds360Link);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSearchAds360LinkTest2() throws Exception {
    SearchAds360Link expectedResponse =
        SearchAds360Link.newBuilder()
            .setName(SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]").toString())
            .setAdvertiserId("advertiserId550061990")
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setSiteStatsSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();

    SearchAds360Link actualResponse = client.createSearchAds360Link(parent, searchAds360Link);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSearchAds360LinkRequest actualRequest =
        ((CreateSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(searchAds360Link, actualRequest.getSearchAds360Link());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createSearchAds360LinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();
      client.createSearchAds360Link(parent, searchAds360Link);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSearchAds360LinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    SearchAds360LinkName name = SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]");

    client.deleteSearchAds360Link(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSearchAds360LinkRequest actualRequest =
        ((DeleteSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSearchAds360LinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      SearchAds360LinkName name = SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]");
      client.deleteSearchAds360Link(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSearchAds360LinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteSearchAds360Link(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSearchAds360LinkRequest actualRequest =
        ((DeleteSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSearchAds360LinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteSearchAds360Link(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateSearchAds360LinkTest() throws Exception {
    SearchAds360Link expectedResponse =
        SearchAds360Link.newBuilder()
            .setName(SearchAds360LinkName.of("[PROPERTY]", "[SEARCH_ADS_360_LINK]").toString())
            .setAdvertiserId("advertiserId550061990")
            .setCampaignDataSharingEnabled(BoolValue.newBuilder().build())
            .setCostDataSharingEnabled(BoolValue.newBuilder().build())
            .setAdvertiserDisplayName("advertiserDisplayName1594116162")
            .setAdsPersonalizationEnabled(BoolValue.newBuilder().build())
            .setSiteStatsSharingEnabled(BoolValue.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    SearchAds360Link actualResponse = client.updateSearchAds360Link(searchAds360Link, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateSearchAds360LinkRequest actualRequest =
        ((UpdateSearchAds360LinkRequest) actualRequests.get(0));

    Assert.assertEquals(searchAds360Link, actualRequest.getSearchAds360Link());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateSearchAds360LinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      SearchAds360Link searchAds360Link = SearchAds360Link.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSearchAds360Link(searchAds360Link, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAttributionSettingsTest() throws Exception {
    AttributionSettings expectedResponse =
        AttributionSettings.newBuilder()
            .setName(AttributionSettingsName.of("[PROPERTY]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AttributionSettingsName name = AttributionSettingsName.of("[PROPERTY]");

    AttributionSettings actualResponse = client.getAttributionSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAttributionSettingsRequest actualRequest =
        ((GetAttributionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAttributionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AttributionSettingsName name = AttributionSettingsName.of("[PROPERTY]");
      client.getAttributionSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAttributionSettingsTest2() throws Exception {
    AttributionSettings expectedResponse =
        AttributionSettings.newBuilder()
            .setName(AttributionSettingsName.of("[PROPERTY]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    AttributionSettings actualResponse = client.getAttributionSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAttributionSettingsRequest actualRequest =
        ((GetAttributionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAttributionSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getAttributionSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAttributionSettingsTest() throws Exception {
    AttributionSettings expectedResponse =
        AttributionSettings.newBuilder()
            .setName(AttributionSettingsName.of("[PROPERTY]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AttributionSettings attributionSettings = AttributionSettings.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    AttributionSettings actualResponse =
        client.updateAttributionSettings(attributionSettings, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAttributionSettingsRequest actualRequest =
        ((UpdateAttributionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(attributionSettings, actualRequest.getAttributionSettings());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAttributionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AttributionSettings attributionSettings = AttributionSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAttributionSettings(attributionSettings, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void runAccessReportTest() throws Exception {
    RunAccessReportResponse expectedResponse =
        RunAccessReportResponse.newBuilder()
            .addAllDimensionHeaders(new ArrayList<AccessDimensionHeader>())
            .addAllMetricHeaders(new ArrayList<AccessMetricHeader>())
            .addAllRows(new ArrayList<AccessRow>())
            .setRowCount(1340416618)
            .setQuota(AccessQuota.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    RunAccessReportRequest request =
        RunAccessReportRequest.newBuilder()
            .setEntity("entity-1298275357")
            .addAllDimensions(new ArrayList<AccessDimension>())
            .addAllMetrics(new ArrayList<AccessMetric>())
            .addAllDateRanges(new ArrayList<AccessDateRange>())
            .setDimensionFilter(AccessFilterExpression.newBuilder().build())
            .setMetricFilter(AccessFilterExpression.newBuilder().build())
            .setOffset(-1019779949)
            .setLimit(102976443)
            .setTimeZone("timeZone-2077180903")
            .addAllOrderBys(new ArrayList<AccessOrderBy>())
            .setReturnEntityQuota(true)
            .build();

    RunAccessReportResponse actualResponse = client.runAccessReport(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunAccessReportRequest actualRequest = ((RunAccessReportRequest) actualRequests.get(0));

    Assert.assertEquals(request.getEntity(), actualRequest.getEntity());
    Assert.assertEquals(request.getDimensionsList(), actualRequest.getDimensionsList());
    Assert.assertEquals(request.getMetricsList(), actualRequest.getMetricsList());
    Assert.assertEquals(request.getDateRangesList(), actualRequest.getDateRangesList());
    Assert.assertEquals(request.getDimensionFilter(), actualRequest.getDimensionFilter());
    Assert.assertEquals(request.getMetricFilter(), actualRequest.getMetricFilter());
    Assert.assertEquals(request.getOffset(), actualRequest.getOffset());
    Assert.assertEquals(request.getLimit(), actualRequest.getLimit());
    Assert.assertEquals(request.getTimeZone(), actualRequest.getTimeZone());
    Assert.assertEquals(request.getOrderBysList(), actualRequest.getOrderBysList());
    Assert.assertEquals(request.getReturnEntityQuota(), actualRequest.getReturnEntityQuota());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runAccessReportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      RunAccessReportRequest request =
          RunAccessReportRequest.newBuilder()
              .setEntity("entity-1298275357")
              .addAllDimensions(new ArrayList<AccessDimension>())
              .addAllMetrics(new ArrayList<AccessMetric>())
              .addAllDateRanges(new ArrayList<AccessDateRange>())
              .setDimensionFilter(AccessFilterExpression.newBuilder().build())
              .setMetricFilter(AccessFilterExpression.newBuilder().build())
              .setOffset(-1019779949)
              .setLimit(102976443)
              .setTimeZone("timeZone-2077180903")
              .addAllOrderBys(new ArrayList<AccessOrderBy>())
              .setReturnEntityQuota(true)
              .build();
      client.runAccessReport(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAccessBindingTest() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");
    AccessBinding accessBinding = AccessBinding.newBuilder().build();

    AccessBinding actualResponse = client.createAccessBinding(parent, accessBinding);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAccessBindingRequest actualRequest = ((CreateAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(accessBinding, actualRequest.getAccessBinding());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAccessBindingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      AccessBinding accessBinding = AccessBinding.newBuilder().build();
      client.createAccessBinding(parent, accessBinding);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAccessBindingTest2() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    AccessBinding accessBinding = AccessBinding.newBuilder().build();

    AccessBinding actualResponse = client.createAccessBinding(parent, accessBinding);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAccessBindingRequest actualRequest = ((CreateAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(accessBinding, actualRequest.getAccessBinding());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAccessBindingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      AccessBinding accessBinding = AccessBinding.newBuilder().build();
      client.createAccessBinding(parent, accessBinding);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAccessBindingTest3() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    AccessBinding accessBinding = AccessBinding.newBuilder().build();

    AccessBinding actualResponse = client.createAccessBinding(parent, accessBinding);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAccessBindingRequest actualRequest = ((CreateAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(accessBinding, actualRequest.getAccessBinding());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAccessBindingExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      AccessBinding accessBinding = AccessBinding.newBuilder().build();
      client.createAccessBinding(parent, accessBinding);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccessBindingTest() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccessBindingName name =
        AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]");

    AccessBinding actualResponse = client.getAccessBinding(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccessBindingRequest actualRequest = ((GetAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccessBindingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccessBindingName name =
          AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]");
      client.getAccessBinding(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccessBindingTest2() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    AccessBinding actualResponse = client.getAccessBinding(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccessBindingRequest actualRequest = ((GetAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccessBindingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getAccessBinding(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAccessBindingTest() throws Exception {
    AccessBinding expectedResponse =
        AccessBinding.newBuilder()
            .setName(
                AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]")
                    .toString())
            .addAllRoles(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccessBinding accessBinding = AccessBinding.newBuilder().build();

    AccessBinding actualResponse = client.updateAccessBinding(accessBinding);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAccessBindingRequest actualRequest = ((UpdateAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(accessBinding, actualRequest.getAccessBinding());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAccessBindingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccessBinding accessBinding = AccessBinding.newBuilder().build();
      client.updateAccessBinding(accessBinding);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccessBindingTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccessBindingName name =
        AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]");

    client.deleteAccessBinding(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAccessBindingRequest actualRequest = ((DeleteAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAccessBindingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccessBindingName name =
          AccessBindingName.ofAccountAccessBindingName("[ACCOUNT]", "[ACCESS_BINDING]");
      client.deleteAccessBinding(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccessBindingTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAccessBinding(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAccessBindingRequest actualRequest = ((DeleteAccessBindingRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAccessBindingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAccessBinding(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccessBindingsTest() throws Exception {
    AccessBinding responsesElement = AccessBinding.newBuilder().build();
    ListAccessBindingsResponse expectedResponse =
        ListAccessBindingsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccessBindings(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");

    ListAccessBindingsPagedResponse pagedListResponse = client.listAccessBindings(parent);

    List<AccessBinding> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccessBindingsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccessBindingsRequest actualRequest = ((ListAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccessBindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      client.listAccessBindings(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccessBindingsTest2() throws Exception {
    AccessBinding responsesElement = AccessBinding.newBuilder().build();
    ListAccessBindingsResponse expectedResponse =
        ListAccessBindingsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccessBindings(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListAccessBindingsPagedResponse pagedListResponse = client.listAccessBindings(parent);

    List<AccessBinding> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccessBindingsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccessBindingsRequest actualRequest = ((ListAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccessBindingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listAccessBindings(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccessBindingsTest3() throws Exception {
    AccessBinding responsesElement = AccessBinding.newBuilder().build();
    ListAccessBindingsResponse expectedResponse =
        ListAccessBindingsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccessBindings(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAccessBindingsPagedResponse pagedListResponse = client.listAccessBindings(parent);

    List<AccessBinding> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccessBindingsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccessBindingsRequest actualRequest = ((ListAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccessBindingsExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAccessBindings(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchCreateAccessBindingsTest() throws Exception {
    BatchCreateAccessBindingsResponse expectedResponse =
        BatchCreateAccessBindingsResponse.newBuilder()
            .addAllAccessBindings(new ArrayList<AccessBinding>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchCreateAccessBindingsRequest request =
        BatchCreateAccessBindingsRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllRequests(new ArrayList<CreateAccessBindingRequest>())
            .build();

    BatchCreateAccessBindingsResponse actualResponse = client.batchCreateAccessBindings(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateAccessBindingsRequest actualRequest =
        ((BatchCreateAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateAccessBindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchCreateAccessBindingsRequest request =
          BatchCreateAccessBindingsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<CreateAccessBindingRequest>())
              .build();
      client.batchCreateAccessBindings(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchGetAccessBindingsTest() throws Exception {
    BatchGetAccessBindingsResponse expectedResponse =
        BatchGetAccessBindingsResponse.newBuilder()
            .addAllAccessBindings(new ArrayList<AccessBinding>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchGetAccessBindingsRequest request =
        BatchGetAccessBindingsRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllNames(new ArrayList<String>())
            .build();

    BatchGetAccessBindingsResponse actualResponse = client.batchGetAccessBindings(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchGetAccessBindingsRequest actualRequest =
        ((BatchGetAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getNamesList(), actualRequest.getNamesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchGetAccessBindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchGetAccessBindingsRequest request =
          BatchGetAccessBindingsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllNames(new ArrayList<String>())
              .build();
      client.batchGetAccessBindings(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchUpdateAccessBindingsTest() throws Exception {
    BatchUpdateAccessBindingsResponse expectedResponse =
        BatchUpdateAccessBindingsResponse.newBuilder()
            .addAllAccessBindings(new ArrayList<AccessBinding>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchUpdateAccessBindingsRequest request =
        BatchUpdateAccessBindingsRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllRequests(new ArrayList<UpdateAccessBindingRequest>())
            .build();

    BatchUpdateAccessBindingsResponse actualResponse = client.batchUpdateAccessBindings(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateAccessBindingsRequest actualRequest =
        ((BatchUpdateAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateAccessBindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchUpdateAccessBindingsRequest request =
          BatchUpdateAccessBindingsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<UpdateAccessBindingRequest>())
              .build();
      client.batchUpdateAccessBindings(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchDeleteAccessBindingsTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BatchDeleteAccessBindingsRequest request =
        BatchDeleteAccessBindingsRequest.newBuilder()
            .setParent(AccountName.of("[ACCOUNT]").toString())
            .addAllRequests(new ArrayList<DeleteAccessBindingRequest>())
            .build();

    client.batchDeleteAccessBindings(request);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteAccessBindingsRequest actualRequest =
        ((BatchDeleteAccessBindingsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getRequestsList(), actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteAccessBindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BatchDeleteAccessBindingsRequest request =
          BatchDeleteAccessBindingsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<DeleteAccessBindingRequest>())
              .build();
      client.batchDeleteAccessBindings(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExpandedDataSetTest() throws Exception {
    ExpandedDataSet expectedResponse =
        ExpandedDataSet.newBuilder()
            .setName(ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDimensionNames(new ArrayList<String>())
            .addAllMetricNames(new ArrayList<String>())
            .setDimensionFilterExpression(ExpandedDataSetFilterExpression.newBuilder().build())
            .setDataCollectionStartTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ExpandedDataSetName name = ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]");

    ExpandedDataSet actualResponse = client.getExpandedDataSet(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExpandedDataSetRequest actualRequest = ((GetExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExpandedDataSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ExpandedDataSetName name = ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]");
      client.getExpandedDataSet(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExpandedDataSetTest2() throws Exception {
    ExpandedDataSet expectedResponse =
        ExpandedDataSet.newBuilder()
            .setName(ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDimensionNames(new ArrayList<String>())
            .addAllMetricNames(new ArrayList<String>())
            .setDimensionFilterExpression(ExpandedDataSetFilterExpression.newBuilder().build())
            .setDataCollectionStartTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    ExpandedDataSet actualResponse = client.getExpandedDataSet(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExpandedDataSetRequest actualRequest = ((GetExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExpandedDataSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getExpandedDataSet(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExpandedDataSetsTest() throws Exception {
    ExpandedDataSet responsesElement = ExpandedDataSet.newBuilder().build();
    ListExpandedDataSetsResponse expectedResponse =
        ListExpandedDataSetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllExpandedDataSets(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListExpandedDataSetsPagedResponse pagedListResponse = client.listExpandedDataSets(parent);

    List<ExpandedDataSet> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExpandedDataSetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExpandedDataSetsRequest actualRequest =
        ((ListExpandedDataSetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExpandedDataSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listExpandedDataSets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExpandedDataSetsTest2() throws Exception {
    ExpandedDataSet responsesElement = ExpandedDataSet.newBuilder().build();
    ListExpandedDataSetsResponse expectedResponse =
        ListExpandedDataSetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllExpandedDataSets(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListExpandedDataSetsPagedResponse pagedListResponse = client.listExpandedDataSets(parent);

    List<ExpandedDataSet> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExpandedDataSetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExpandedDataSetsRequest actualRequest =
        ((ListExpandedDataSetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExpandedDataSetsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listExpandedDataSets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createExpandedDataSetTest() throws Exception {
    ExpandedDataSet expectedResponse =
        ExpandedDataSet.newBuilder()
            .setName(ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDimensionNames(new ArrayList<String>())
            .addAllMetricNames(new ArrayList<String>())
            .setDimensionFilterExpression(ExpandedDataSetFilterExpression.newBuilder().build())
            .setDataCollectionStartTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();

    ExpandedDataSet actualResponse = client.createExpandedDataSet(parent, expandedDataSet);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateExpandedDataSetRequest actualRequest =
        ((CreateExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(expandedDataSet, actualRequest.getExpandedDataSet());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createExpandedDataSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();
      client.createExpandedDataSet(parent, expandedDataSet);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createExpandedDataSetTest2() throws Exception {
    ExpandedDataSet expectedResponse =
        ExpandedDataSet.newBuilder()
            .setName(ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDimensionNames(new ArrayList<String>())
            .addAllMetricNames(new ArrayList<String>())
            .setDimensionFilterExpression(ExpandedDataSetFilterExpression.newBuilder().build())
            .setDataCollectionStartTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();

    ExpandedDataSet actualResponse = client.createExpandedDataSet(parent, expandedDataSet);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateExpandedDataSetRequest actualRequest =
        ((CreateExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(expandedDataSet, actualRequest.getExpandedDataSet());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createExpandedDataSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();
      client.createExpandedDataSet(parent, expandedDataSet);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateExpandedDataSetTest() throws Exception {
    ExpandedDataSet expectedResponse =
        ExpandedDataSet.newBuilder()
            .setName(ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDimensionNames(new ArrayList<String>())
            .addAllMetricNames(new ArrayList<String>())
            .setDimensionFilterExpression(ExpandedDataSetFilterExpression.newBuilder().build())
            .setDataCollectionStartTime(Timestamp.newBuilder().build())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    ExpandedDataSet actualResponse = client.updateExpandedDataSet(expandedDataSet, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateExpandedDataSetRequest actualRequest =
        ((UpdateExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(expandedDataSet, actualRequest.getExpandedDataSet());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateExpandedDataSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ExpandedDataSet expandedDataSet = ExpandedDataSet.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateExpandedDataSet(expandedDataSet, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteExpandedDataSetTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ExpandedDataSetName name = ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]");

    client.deleteExpandedDataSet(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteExpandedDataSetRequest actualRequest =
        ((DeleteExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteExpandedDataSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ExpandedDataSetName name = ExpandedDataSetName.of("[PROPERTY]", "[EXPANDED_DATA_SET]");
      client.deleteExpandedDataSet(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteExpandedDataSetTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteExpandedDataSet(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteExpandedDataSetRequest actualRequest =
        ((DeleteExpandedDataSetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteExpandedDataSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteExpandedDataSet(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getChannelGroupTest() throws Exception {
    ChannelGroup expectedResponse =
        ChannelGroup.newBuilder()
            .setName(ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllGroupingRule(new ArrayList<GroupingRule>())
            .setSystemDefined(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ChannelGroupName name = ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]");

    ChannelGroup actualResponse = client.getChannelGroup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetChannelGroupRequest actualRequest = ((GetChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getChannelGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ChannelGroupName name = ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]");
      client.getChannelGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getChannelGroupTest2() throws Exception {
    ChannelGroup expectedResponse =
        ChannelGroup.newBuilder()
            .setName(ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllGroupingRule(new ArrayList<GroupingRule>())
            .setSystemDefined(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    ChannelGroup actualResponse = client.getChannelGroup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetChannelGroupRequest actualRequest = ((GetChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getChannelGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getChannelGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listChannelGroupsTest() throws Exception {
    ChannelGroup responsesElement = ChannelGroup.newBuilder().build();
    ListChannelGroupsResponse expectedResponse =
        ListChannelGroupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllChannelGroups(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListChannelGroupsPagedResponse pagedListResponse = client.listChannelGroups(parent);

    List<ChannelGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getChannelGroupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListChannelGroupsRequest actualRequest = ((ListChannelGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listChannelGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listChannelGroups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listChannelGroupsTest2() throws Exception {
    ChannelGroup responsesElement = ChannelGroup.newBuilder().build();
    ListChannelGroupsResponse expectedResponse =
        ListChannelGroupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllChannelGroups(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListChannelGroupsPagedResponse pagedListResponse = client.listChannelGroups(parent);

    List<ChannelGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getChannelGroupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListChannelGroupsRequest actualRequest = ((ListChannelGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listChannelGroupsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listChannelGroups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createChannelGroupTest() throws Exception {
    ChannelGroup expectedResponse =
        ChannelGroup.newBuilder()
            .setName(ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllGroupingRule(new ArrayList<GroupingRule>())
            .setSystemDefined(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    ChannelGroup channelGroup = ChannelGroup.newBuilder().build();

    ChannelGroup actualResponse = client.createChannelGroup(parent, channelGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateChannelGroupRequest actualRequest = ((CreateChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(channelGroup, actualRequest.getChannelGroup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createChannelGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      ChannelGroup channelGroup = ChannelGroup.newBuilder().build();
      client.createChannelGroup(parent, channelGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createChannelGroupTest2() throws Exception {
    ChannelGroup expectedResponse =
        ChannelGroup.newBuilder()
            .setName(ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllGroupingRule(new ArrayList<GroupingRule>())
            .setSystemDefined(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    ChannelGroup channelGroup = ChannelGroup.newBuilder().build();

    ChannelGroup actualResponse = client.createChannelGroup(parent, channelGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateChannelGroupRequest actualRequest = ((CreateChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(channelGroup, actualRequest.getChannelGroup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createChannelGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      ChannelGroup channelGroup = ChannelGroup.newBuilder().build();
      client.createChannelGroup(parent, channelGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateChannelGroupTest() throws Exception {
    ChannelGroup expectedResponse =
        ChannelGroup.newBuilder()
            .setName(ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllGroupingRule(new ArrayList<GroupingRule>())
            .setSystemDefined(true)
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ChannelGroup channelGroup = ChannelGroup.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    ChannelGroup actualResponse = client.updateChannelGroup(channelGroup, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateChannelGroupRequest actualRequest = ((UpdateChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(channelGroup, actualRequest.getChannelGroup());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateChannelGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ChannelGroup channelGroup = ChannelGroup.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateChannelGroup(channelGroup, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteChannelGroupTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ChannelGroupName name = ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]");

    client.deleteChannelGroup(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteChannelGroupRequest actualRequest = ((DeleteChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteChannelGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ChannelGroupName name = ChannelGroupName.of("[PROPERTY]", "[CHANNEL_GROUP]");
      client.deleteChannelGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteChannelGroupTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteChannelGroup(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteChannelGroupRequest actualRequest = ((DeleteChannelGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteChannelGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteChannelGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setAutomatedGa4ConfigurationOptOutTest() throws Exception {
    SetAutomatedGa4ConfigurationOptOutResponse expectedResponse =
        SetAutomatedGa4ConfigurationOptOutResponse.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    SetAutomatedGa4ConfigurationOptOutRequest request =
        SetAutomatedGa4ConfigurationOptOutRequest.newBuilder()
            .setProperty("property-993141291")
            .setOptOut(true)
            .build();

    SetAutomatedGa4ConfigurationOptOutResponse actualResponse =
        client.setAutomatedGa4ConfigurationOptOut(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetAutomatedGa4ConfigurationOptOutRequest actualRequest =
        ((SetAutomatedGa4ConfigurationOptOutRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getOptOut(), actualRequest.getOptOut());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setAutomatedGa4ConfigurationOptOutExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      SetAutomatedGa4ConfigurationOptOutRequest request =
          SetAutomatedGa4ConfigurationOptOutRequest.newBuilder()
              .setProperty("property-993141291")
              .setOptOut(true)
              .build();
      client.setAutomatedGa4ConfigurationOptOut(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void fetchAutomatedGa4ConfigurationOptOutTest() throws Exception {
    FetchAutomatedGa4ConfigurationOptOutResponse expectedResponse =
        FetchAutomatedGa4ConfigurationOptOutResponse.newBuilder().setOptOut(true).build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    FetchAutomatedGa4ConfigurationOptOutRequest request =
        FetchAutomatedGa4ConfigurationOptOutRequest.newBuilder()
            .setProperty("property-993141291")
            .build();

    FetchAutomatedGa4ConfigurationOptOutResponse actualResponse =
        client.fetchAutomatedGa4ConfigurationOptOut(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    FetchAutomatedGa4ConfigurationOptOutRequest actualRequest =
        ((FetchAutomatedGa4ConfigurationOptOutRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void fetchAutomatedGa4ConfigurationOptOutExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      FetchAutomatedGa4ConfigurationOptOutRequest request =
          FetchAutomatedGa4ConfigurationOptOutRequest.newBuilder()
              .setProperty("property-993141291")
              .build();
      client.fetchAutomatedGa4ConfigurationOptOut(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBigQueryLinkTest() throws Exception {
    BigQueryLink expectedResponse =
        BigQueryLink.newBuilder()
            .setName(BigQueryLinkName.of("[PROPERTY]", "[BIGQUERY_LINK]").toString())
            .setProject("project-309310695")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDailyExportEnabled(true)
            .setStreamingExportEnabled(true)
            .setIntradayExportEnabled(true)
            .setIncludeAdvertisingId(true)
            .addAllExportStreams(new ArrayList<String>())
            .addAllExcludedEvents(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    BigQueryLinkName name = BigQueryLinkName.of("[PROPERTY]", "[BIGQUERY_LINK]");

    BigQueryLink actualResponse = client.getBigQueryLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBigQueryLinkRequest actualRequest = ((GetBigQueryLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBigQueryLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      BigQueryLinkName name = BigQueryLinkName.of("[PROPERTY]", "[BIGQUERY_LINK]");
      client.getBigQueryLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBigQueryLinkTest2() throws Exception {
    BigQueryLink expectedResponse =
        BigQueryLink.newBuilder()
            .setName(BigQueryLinkName.of("[PROPERTY]", "[BIGQUERY_LINK]").toString())
            .setProject("project-309310695")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDailyExportEnabled(true)
            .setStreamingExportEnabled(true)
            .setIntradayExportEnabled(true)
            .setIncludeAdvertisingId(true)
            .addAllExportStreams(new ArrayList<String>())
            .addAllExcludedEvents(new ArrayList<String>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    BigQueryLink actualResponse = client.getBigQueryLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBigQueryLinkRequest actualRequest = ((GetBigQueryLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBigQueryLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getBigQueryLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBigQueryLinksTest() throws Exception {
    BigQueryLink responsesElement = BigQueryLink.newBuilder().build();
    ListBigQueryLinksResponse expectedResponse =
        ListBigQueryLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllBigqueryLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListBigQueryLinksPagedResponse pagedListResponse = client.listBigQueryLinks(parent);

    List<BigQueryLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBigqueryLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBigQueryLinksRequest actualRequest = ((ListBigQueryLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBigQueryLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listBigQueryLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBigQueryLinksTest2() throws Exception {
    BigQueryLink responsesElement = BigQueryLink.newBuilder().build();
    ListBigQueryLinksResponse expectedResponse =
        ListBigQueryLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllBigqueryLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListBigQueryLinksPagedResponse pagedListResponse = client.listBigQueryLinks(parent);

    List<BigQueryLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBigqueryLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBigQueryLinksRequest actualRequest = ((ListBigQueryLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBigQueryLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listBigQueryLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEnhancedMeasurementSettingsTest() throws Exception {
    EnhancedMeasurementSettings expectedResponse =
        EnhancedMeasurementSettings.newBuilder()
            .setName(EnhancedMeasurementSettingsName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setStreamEnabled(true)
            .setScrollsEnabled(true)
            .setOutboundClicksEnabled(true)
            .setSiteSearchEnabled(true)
            .setVideoEngagementEnabled(true)
            .setFileDownloadsEnabled(true)
            .setPageChangesEnabled(true)
            .setFormInteractionsEnabled(true)
            .setSearchQueryParameter("searchQueryParameter-2012788855")
            .setUriQueryParameter("uriQueryParameter1580843085")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    EnhancedMeasurementSettingsName name =
        EnhancedMeasurementSettingsName.of("[PROPERTY]", "[DATA_STREAM]");

    EnhancedMeasurementSettings actualResponse = client.getEnhancedMeasurementSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEnhancedMeasurementSettingsRequest actualRequest =
        ((GetEnhancedMeasurementSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEnhancedMeasurementSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      EnhancedMeasurementSettingsName name =
          EnhancedMeasurementSettingsName.of("[PROPERTY]", "[DATA_STREAM]");
      client.getEnhancedMeasurementSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEnhancedMeasurementSettingsTest2() throws Exception {
    EnhancedMeasurementSettings expectedResponse =
        EnhancedMeasurementSettings.newBuilder()
            .setName(EnhancedMeasurementSettingsName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setStreamEnabled(true)
            .setScrollsEnabled(true)
            .setOutboundClicksEnabled(true)
            .setSiteSearchEnabled(true)
            .setVideoEngagementEnabled(true)
            .setFileDownloadsEnabled(true)
            .setPageChangesEnabled(true)
            .setFormInteractionsEnabled(true)
            .setSearchQueryParameter("searchQueryParameter-2012788855")
            .setUriQueryParameter("uriQueryParameter1580843085")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    EnhancedMeasurementSettings actualResponse = client.getEnhancedMeasurementSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEnhancedMeasurementSettingsRequest actualRequest =
        ((GetEnhancedMeasurementSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEnhancedMeasurementSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getEnhancedMeasurementSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEnhancedMeasurementSettingsTest() throws Exception {
    EnhancedMeasurementSettings expectedResponse =
        EnhancedMeasurementSettings.newBuilder()
            .setName(EnhancedMeasurementSettingsName.of("[PROPERTY]", "[DATA_STREAM]").toString())
            .setStreamEnabled(true)
            .setScrollsEnabled(true)
            .setOutboundClicksEnabled(true)
            .setSiteSearchEnabled(true)
            .setVideoEngagementEnabled(true)
            .setFileDownloadsEnabled(true)
            .setPageChangesEnabled(true)
            .setFormInteractionsEnabled(true)
            .setSearchQueryParameter("searchQueryParameter-2012788855")
            .setUriQueryParameter("uriQueryParameter1580843085")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    EnhancedMeasurementSettings enhancedMeasurementSettings =
        EnhancedMeasurementSettings.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    EnhancedMeasurementSettings actualResponse =
        client.updateEnhancedMeasurementSettings(enhancedMeasurementSettings, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEnhancedMeasurementSettingsRequest actualRequest =
        ((UpdateEnhancedMeasurementSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(
        enhancedMeasurementSettings, actualRequest.getEnhancedMeasurementSettings());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEnhancedMeasurementSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      EnhancedMeasurementSettings enhancedMeasurementSettings =
          EnhancedMeasurementSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateEnhancedMeasurementSettings(enhancedMeasurementSettings, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createConnectedSiteTagTest() throws Exception {
    CreateConnectedSiteTagResponse expectedResponse =
        CreateConnectedSiteTagResponse.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    CreateConnectedSiteTagRequest request =
        CreateConnectedSiteTagRequest.newBuilder()
            .setProperty("property-993141291")
            .setConnectedSiteTag(ConnectedSiteTag.newBuilder().build())
            .build();

    CreateConnectedSiteTagResponse actualResponse = client.createConnectedSiteTag(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConnectedSiteTagRequest actualRequest =
        ((CreateConnectedSiteTagRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getConnectedSiteTag(), actualRequest.getConnectedSiteTag());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConnectedSiteTagExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      CreateConnectedSiteTagRequest request =
          CreateConnectedSiteTagRequest.newBuilder()
              .setProperty("property-993141291")
              .setConnectedSiteTag(ConnectedSiteTag.newBuilder().build())
              .build();
      client.createConnectedSiteTag(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConnectedSiteTagTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DeleteConnectedSiteTagRequest request =
        DeleteConnectedSiteTagRequest.newBuilder()
            .setProperty("property-993141291")
            .setTagId("tagId110119509")
            .build();

    client.deleteConnectedSiteTag(request);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConnectedSiteTagRequest actualRequest =
        ((DeleteConnectedSiteTagRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertEquals(request.getTagId(), actualRequest.getTagId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConnectedSiteTagExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DeleteConnectedSiteTagRequest request =
          DeleteConnectedSiteTagRequest.newBuilder()
              .setProperty("property-993141291")
              .setTagId("tagId110119509")
              .build();
      client.deleteConnectedSiteTag(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConnectedSiteTagsTest() throws Exception {
    ListConnectedSiteTagsResponse expectedResponse =
        ListConnectedSiteTagsResponse.newBuilder()
            .addAllConnectedSiteTags(new ArrayList<ConnectedSiteTag>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    ListConnectedSiteTagsRequest request =
        ListConnectedSiteTagsRequest.newBuilder().setProperty("property-993141291").build();

    ListConnectedSiteTagsResponse actualResponse = client.listConnectedSiteTags(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConnectedSiteTagsRequest actualRequest =
        ((ListConnectedSiteTagsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConnectedSiteTagsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      ListConnectedSiteTagsRequest request =
          ListConnectedSiteTagsRequest.newBuilder().setProperty("property-993141291").build();
      client.listConnectedSiteTags(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void fetchConnectedGa4PropertyTest() throws Exception {
    FetchConnectedGa4PropertyResponse expectedResponse =
        FetchConnectedGa4PropertyResponse.newBuilder()
            .setProperty(PropertyName.of("[PROPERTY]").toString())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    FetchConnectedGa4PropertyRequest request =
        FetchConnectedGa4PropertyRequest.newBuilder()
            .setProperty(PropertyName.of("[PROPERTY]").toString())
            .build();

    FetchConnectedGa4PropertyResponse actualResponse = client.fetchConnectedGa4Property(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    FetchConnectedGa4PropertyRequest actualRequest =
        ((FetchConnectedGa4PropertyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProperty(), actualRequest.getProperty());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void fetchConnectedGa4PropertyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      FetchConnectedGa4PropertyRequest request =
          FetchConnectedGa4PropertyRequest.newBuilder()
              .setProperty(PropertyName.of("[PROPERTY]").toString())
              .build();
      client.fetchConnectedGa4Property(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdSenseLinkTest() throws Exception {
    AdSenseLink expectedResponse =
        AdSenseLink.newBuilder()
            .setName(AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]").toString())
            .setAdClientCode("adClientCode-869953317")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AdSenseLinkName name = AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]");

    AdSenseLink actualResponse = client.getAdSenseLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdSenseLinkRequest actualRequest = ((GetAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdSenseLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AdSenseLinkName name = AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]");
      client.getAdSenseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdSenseLinkTest2() throws Exception {
    AdSenseLink expectedResponse =
        AdSenseLink.newBuilder()
            .setName(AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]").toString())
            .setAdClientCode("adClientCode-869953317")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    AdSenseLink actualResponse = client.getAdSenseLink(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdSenseLinkRequest actualRequest = ((GetAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdSenseLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getAdSenseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAdSenseLinkTest() throws Exception {
    AdSenseLink expectedResponse =
        AdSenseLink.newBuilder()
            .setName(AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]").toString())
            .setAdClientCode("adClientCode-869953317")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");
    AdSenseLink adsenseLink = AdSenseLink.newBuilder().build();

    AdSenseLink actualResponse = client.createAdSenseLink(parent, adsenseLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAdSenseLinkRequest actualRequest = ((CreateAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(adsenseLink, actualRequest.getAdsenseLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAdSenseLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      AdSenseLink adsenseLink = AdSenseLink.newBuilder().build();
      client.createAdSenseLink(parent, adsenseLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAdSenseLinkTest2() throws Exception {
    AdSenseLink expectedResponse =
        AdSenseLink.newBuilder()
            .setName(AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]").toString())
            .setAdClientCode("adClientCode-869953317")
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    AdSenseLink adsenseLink = AdSenseLink.newBuilder().build();

    AdSenseLink actualResponse = client.createAdSenseLink(parent, adsenseLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAdSenseLinkRequest actualRequest = ((CreateAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(adsenseLink, actualRequest.getAdsenseLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAdSenseLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      AdSenseLink adsenseLink = AdSenseLink.newBuilder().build();
      client.createAdSenseLink(parent, adsenseLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdSenseLinkTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    AdSenseLinkName name = AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]");

    client.deleteAdSenseLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdSenseLinkRequest actualRequest = ((DeleteAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdSenseLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      AdSenseLinkName name = AdSenseLinkName.of("[PROPERTY]", "[ADSENSE_LINK]");
      client.deleteAdSenseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdSenseLinkTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAdSenseLink(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdSenseLinkRequest actualRequest = ((DeleteAdSenseLinkRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdSenseLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAdSenseLink(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdSenseLinksTest() throws Exception {
    AdSenseLink responsesElement = AdSenseLink.newBuilder().build();
    ListAdSenseLinksResponse expectedResponse =
        ListAdSenseLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdsenseLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    PropertyName parent = PropertyName.of("[PROPERTY]");

    ListAdSenseLinksPagedResponse pagedListResponse = client.listAdSenseLinks(parent);

    List<AdSenseLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdsenseLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdSenseLinksRequest actualRequest = ((ListAdSenseLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdSenseLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      PropertyName parent = PropertyName.of("[PROPERTY]");
      client.listAdSenseLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdSenseLinksTest2() throws Exception {
    AdSenseLink responsesElement = AdSenseLink.newBuilder().build();
    ListAdSenseLinksResponse expectedResponse =
        ListAdSenseLinksResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdsenseLinks(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAdSenseLinksPagedResponse pagedListResponse = client.listAdSenseLinks(parent);

    List<AdSenseLink> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdsenseLinksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdSenseLinksRequest actualRequest = ((ListAdSenseLinksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdSenseLinksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAdSenseLinks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEventCreateRuleTest() throws Exception {
    EventCreateRule expectedResponse =
        EventCreateRule.newBuilder()
            .setName(
                EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]")
                    .toString())
            .setDestinationEvent("destinationEvent1181456172")
            .addAllEventConditions(new ArrayList<MatchingCondition>())
            .setSourceCopyParameters(true)
            .addAllParameterMutations(new ArrayList<ParameterMutation>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    EventCreateRuleName name =
        EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]");

    EventCreateRule actualResponse = client.getEventCreateRule(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEventCreateRuleRequest actualRequest = ((GetEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEventCreateRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      EventCreateRuleName name =
          EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]");
      client.getEventCreateRule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEventCreateRuleTest2() throws Exception {
    EventCreateRule expectedResponse =
        EventCreateRule.newBuilder()
            .setName(
                EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]")
                    .toString())
            .setDestinationEvent("destinationEvent1181456172")
            .addAllEventConditions(new ArrayList<MatchingCondition>())
            .setSourceCopyParameters(true)
            .addAllParameterMutations(new ArrayList<ParameterMutation>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    EventCreateRule actualResponse = client.getEventCreateRule(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEventCreateRuleRequest actualRequest = ((GetEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEventCreateRuleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.getEventCreateRule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventCreateRulesTest() throws Exception {
    EventCreateRule responsesElement = EventCreateRule.newBuilder().build();
    ListEventCreateRulesResponse expectedResponse =
        ListEventCreateRulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventCreateRules(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");

    ListEventCreateRulesPagedResponse pagedListResponse = client.listEventCreateRules(parent);

    List<EventCreateRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEventCreateRulesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEventCreateRulesRequest actualRequest =
        ((ListEventCreateRulesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEventCreateRulesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      client.listEventCreateRules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventCreateRulesTest2() throws Exception {
    EventCreateRule responsesElement = EventCreateRule.newBuilder().build();
    ListEventCreateRulesResponse expectedResponse =
        ListEventCreateRulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventCreateRules(Arrays.asList(responsesElement))
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListEventCreateRulesPagedResponse pagedListResponse = client.listEventCreateRules(parent);

    List<EventCreateRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEventCreateRulesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEventCreateRulesRequest actualRequest =
        ((ListEventCreateRulesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEventCreateRulesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listEventCreateRules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventCreateRuleTest() throws Exception {
    EventCreateRule expectedResponse =
        EventCreateRule.newBuilder()
            .setName(
                EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]")
                    .toString())
            .setDestinationEvent("destinationEvent1181456172")
            .addAllEventConditions(new ArrayList<MatchingCondition>())
            .setSourceCopyParameters(true)
            .addAllParameterMutations(new ArrayList<ParameterMutation>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
    EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();

    EventCreateRule actualResponse = client.createEventCreateRule(parent, eventCreateRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEventCreateRuleRequest actualRequest =
        ((CreateEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(eventCreateRule, actualRequest.getEventCreateRule());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEventCreateRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      DataStreamName parent = DataStreamName.of("[PROPERTY]", "[DATA_STREAM]");
      EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();
      client.createEventCreateRule(parent, eventCreateRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventCreateRuleTest2() throws Exception {
    EventCreateRule expectedResponse =
        EventCreateRule.newBuilder()
            .setName(
                EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]")
                    .toString())
            .setDestinationEvent("destinationEvent1181456172")
            .addAllEventConditions(new ArrayList<MatchingCondition>())
            .setSourceCopyParameters(true)
            .addAllParameterMutations(new ArrayList<ParameterMutation>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();

    EventCreateRule actualResponse = client.createEventCreateRule(parent, eventCreateRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEventCreateRuleRequest actualRequest =
        ((CreateEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(eventCreateRule, actualRequest.getEventCreateRule());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEventCreateRuleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String parent = "parent-995424086";
      EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();
      client.createEventCreateRule(parent, eventCreateRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEventCreateRuleTest() throws Exception {
    EventCreateRule expectedResponse =
        EventCreateRule.newBuilder()
            .setName(
                EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]")
                    .toString())
            .setDestinationEvent("destinationEvent1181456172")
            .addAllEventConditions(new ArrayList<MatchingCondition>())
            .setSourceCopyParameters(true)
            .addAllParameterMutations(new ArrayList<ParameterMutation>())
            .build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    EventCreateRule actualResponse = client.updateEventCreateRule(eventCreateRule, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEventCreateRuleRequest actualRequest =
        ((UpdateEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(eventCreateRule, actualRequest.getEventCreateRule());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEventCreateRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      EventCreateRule eventCreateRule = EventCreateRule.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateEventCreateRule(eventCreateRule, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEventCreateRuleTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    EventCreateRuleName name =
        EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]");

    client.deleteEventCreateRule(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEventCreateRuleRequest actualRequest =
        ((DeleteEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEventCreateRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      EventCreateRuleName name =
          EventCreateRuleName.of("[PROPERTY]", "[DATA_STREAM]", "[EVENT_CREATE_RULE]");
      client.deleteEventCreateRule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEventCreateRuleTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAnalyticsAdminService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteEventCreateRule(name);

    List<AbstractMessage> actualRequests = mockAnalyticsAdminService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEventCreateRuleRequest actualRequest =
        ((DeleteEventCreateRuleRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEventCreateRuleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnalyticsAdminService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteEventCreateRule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
