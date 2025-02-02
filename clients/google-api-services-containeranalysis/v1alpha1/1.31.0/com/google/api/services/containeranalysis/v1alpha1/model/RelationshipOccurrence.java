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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * RelationshipOccurrence represents an SPDX Relationship section: https://spdx.github.io/spdx-
 * spec/7-relationships-between-SPDX-elements/
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RelationshipOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * A place for the SPDX file creator to record any general comments about the relationship
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there
   * are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be
   * used to indicate that an SPDX element (package/file/snippet) has no other elements connected by
   * some relationship to it
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * The type of relationship between the source and target SPDX elements
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A place for the SPDX file creator to record any general comments about the relationship
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * A place for the SPDX file creator to record any general comments about the relationship
   * @param comment comment or {@code null} for none
   */
  public RelationshipOccurrence setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
   * @param source source or {@code null} for none
   */
  public RelationshipOccurrence setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there
   * are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be
   * used to indicate that an SPDX element (package/file/snippet) has no other elements connected by
   * some relationship to it
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there
   * are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be
   * used to indicate that an SPDX element (package/file/snippet) has no other elements connected by
   * some relationship to it
   * @param target target or {@code null} for none
   */
  public RelationshipOccurrence setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * The type of relationship between the source and target SPDX elements
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of relationship between the source and target SPDX elements
   * @param type type or {@code null} for none
   */
  public RelationshipOccurrence setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public RelationshipOccurrence set(String fieldName, Object value) {
    return (RelationshipOccurrence) super.set(fieldName, value);
  }

  @Override
  public RelationshipOccurrence clone() {
    return (RelationshipOccurrence) super.clone();
  }

}
