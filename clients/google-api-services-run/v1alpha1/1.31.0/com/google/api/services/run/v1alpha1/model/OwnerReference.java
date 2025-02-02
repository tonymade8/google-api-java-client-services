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

package com.google.api.services.run.v1alpha1.model;

/**
 * OwnerReference contains enough information to let you identify an owning object. Currently, an
 * owning object must be in the same namespace, so there is no namespace field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OwnerReference extends com.google.api.client.json.GenericJson {

  /**
   * API version of the referent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
   * deleted from the key-value store until this reference is removed. Defaults to false. To set
   * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity)
   * will be returned. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean blockOwnerDeletion;

  /**
   * If true, this reference points to the managing controller. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean controller;

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * API version of the referent.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * API version of the referent.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public OwnerReference setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
   * deleted from the key-value store until this reference is removed. Defaults to false. To set
   * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity)
   * will be returned. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  /**
   * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
   * deleted from the key-value store until this reference is removed. Defaults to false. To set
   * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity)
   * will be returned. +optional
   * @param blockOwnerDeletion blockOwnerDeletion or {@code null} for none
   */
  public OwnerReference setBlockOwnerDeletion(java.lang.Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  /**
   * If true, this reference points to the managing controller. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getController() {
    return controller;
  }

  /**
   * If true, this reference points to the managing controller. +optional
   * @param controller controller or {@code null} for none
   */
  public OwnerReference setController(java.lang.Boolean controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * @param kind kind or {@code null} for none
   */
  public OwnerReference setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @param name name or {@code null} for none
   */
  public OwnerReference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @param uid uid or {@code null} for none
   */
  public OwnerReference setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public OwnerReference set(String fieldName, Object value) {
    return (OwnerReference) super.set(fieldName, value);
  }

  @Override
  public OwnerReference clone() {
    return (OwnerReference) super.clone();
  }

}
