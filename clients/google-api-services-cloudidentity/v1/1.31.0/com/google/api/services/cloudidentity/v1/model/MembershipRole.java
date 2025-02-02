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

package com.google.api.services.cloudidentity.v1.model;

/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges
 * granted to a `Membership`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipRole extends com.google.api.client.json.GenericJson {

  /**
   * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER`
   * `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExpiryDetail expiryDetail;

  /**
   * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER`
   * `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other
   * value.
   * @return value or {@code null} for none
   */
  public ExpiryDetail getExpiryDetail() {
    return expiryDetail;
  }

  /**
   * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER`
   * `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other
   * value.
   * @param expiryDetail expiryDetail or {@code null} for none
   */
  public MembershipRole setExpiryDetail(ExpiryDetail expiryDetail) {
    this.expiryDetail = expiryDetail;
    return this;
  }

  /**
   * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
   * @param name name or {@code null} for none
   */
  public MembershipRole setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public MembershipRole set(String fieldName, Object value) {
    return (MembershipRole) super.set(fieldName, value);
  }

  @Override
  public MembershipRole clone() {
    return (MembershipRole) super.clone();
  }

}
