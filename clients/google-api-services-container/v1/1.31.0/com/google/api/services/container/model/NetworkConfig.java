/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.container.model;

/**
 * NetworkConfig reports the relative names of network & subnetwork.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy
   * implementation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datapathProvider;

  /**
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled
   * when default_snat_status is disabled. When disabled is set to false, default IP masquerade
   * rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultSnatStatus defaultSnatStatus;

  /**
   * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod
   * traffic visible for VPC network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableIntraNodeVisibility;

  /**
   * Whether L4ILB Subsetting is enabled for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableL4ilbSubsetting;

  /**
   * Output only. The relative name of the Google Compute Engine
   * network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the
   * cluster is connected. Example: projects/my-project/global/networks/my-network
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access
   * to or from Google Services (all access will be via IPv4)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateIpv6GoogleAccess;

  /**
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy
   * implementation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatapathProvider() {
    return datapathProvider;
  }

  /**
   * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy
   * implementation.
   * @param datapathProvider datapathProvider or {@code null} for none
   */
  public NetworkConfig setDatapathProvider(java.lang.String datapathProvider) {
    this.datapathProvider = datapathProvider;
    return this;
  }

  /**
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled
   * when default_snat_status is disabled. When disabled is set to false, default IP masquerade
   * rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
   * @return value or {@code null} for none
   */
  public DefaultSnatStatus getDefaultSnatStatus() {
    return defaultSnatStatus;
  }

  /**
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled
   * when default_snat_status is disabled. When disabled is set to false, default IP masquerade
   * rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
   * @param defaultSnatStatus defaultSnatStatus or {@code null} for none
   */
  public NetworkConfig setDefaultSnatStatus(DefaultSnatStatus defaultSnatStatus) {
    this.defaultSnatStatus = defaultSnatStatus;
    return this;
  }

  /**
   * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod
   * traffic visible for VPC network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableIntraNodeVisibility() {
    return enableIntraNodeVisibility;
  }

  /**
   * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod
   * traffic visible for VPC network.
   * @param enableIntraNodeVisibility enableIntraNodeVisibility or {@code null} for none
   */
  public NetworkConfig setEnableIntraNodeVisibility(java.lang.Boolean enableIntraNodeVisibility) {
    this.enableIntraNodeVisibility = enableIntraNodeVisibility;
    return this;
  }

  /**
   * Whether L4ILB Subsetting is enabled for this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableL4ilbSubsetting() {
    return enableL4ilbSubsetting;
  }

  /**
   * Whether L4ILB Subsetting is enabled for this cluster.
   * @param enableL4ilbSubsetting enableL4ilbSubsetting or {@code null} for none
   */
  public NetworkConfig setEnableL4ilbSubsetting(java.lang.Boolean enableL4ilbSubsetting) {
    this.enableL4ilbSubsetting = enableL4ilbSubsetting;
    return this;
  }

  /**
   * Output only. The relative name of the Google Compute Engine
   * network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the
   * cluster is connected. Example: projects/my-project/global/networks/my-network
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Output only. The relative name of the Google Compute Engine
   * network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the
   * cluster is connected. Example: projects/my-project/global/networks/my-network
   * @param network network or {@code null} for none
   */
  public NetworkConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access
   * to or from Google Services (all access will be via IPv4)
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateIpv6GoogleAccess() {
    return privateIpv6GoogleAccess;
  }

  /**
   * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access
   * to or from Google Services (all access will be via IPv4)
   * @param privateIpv6GoogleAccess privateIpv6GoogleAccess or {@code null} for none
   */
  public NetworkConfig setPrivateIpv6GoogleAccess(java.lang.String privateIpv6GoogleAccess) {
    this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
    return this;
  }

  /**
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkConfig setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
