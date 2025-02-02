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

package com.google.api.services.compute.model;

/**
 * Specification for how requests are aborted as part of fault injection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpFaultAbort extends com.google.api.client.json.GenericJson {

  /**
   * The HTTP status code used to abort the request. The value must be between 200 and 599
   * inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to
   * this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is
   * currently not supported by Traffic Director.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long httpStatus;

  /**
   * The percentage of traffic (connections/operations/requests) which will be aborted as part of
   * fault injection. The value must be between 0.0 and 100.0 inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double percentage;

  /**
   * The HTTP status code used to abort the request. The value must be between 200 and 599
   * inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to
   * this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is
   * currently not supported by Traffic Director.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHttpStatus() {
    return httpStatus;
  }

  /**
   * The HTTP status code used to abort the request. The value must be between 200 and 599
   * inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to
   * this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is
   * currently not supported by Traffic Director.
   * @param httpStatus httpStatus or {@code null} for none
   */
  public HttpFaultAbort setHttpStatus(java.lang.Long httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * The percentage of traffic (connections/operations/requests) which will be aborted as part of
   * fault injection. The value must be between 0.0 and 100.0 inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPercentage() {
    return percentage;
  }

  /**
   * The percentage of traffic (connections/operations/requests) which will be aborted as part of
   * fault injection. The value must be between 0.0 and 100.0 inclusive.
   * @param percentage percentage or {@code null} for none
   */
  public HttpFaultAbort setPercentage(java.lang.Double percentage) {
    this.percentage = percentage;
    return this;
  }

  @Override
  public HttpFaultAbort set(String fieldName, Object value) {
    return (HttpFaultAbort) super.set(fieldName, value);
  }

  @Override
  public HttpFaultAbort clone() {
    return (HttpFaultAbort) super.clone();
  }

}
