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

package com.google.api.services.sheets.v4.model;

/**
 * Style override settings for a single series data point.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicSeriesDataPointStyleOverride extends com.google.api.client.json.GenericJson {

  /**
   * Color of the series data point. If empty, the series default is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * Color of the series data point. If empty, the series default is used. If color is also set,
   * this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle colorStyle;

  /**
   * Zero based index of the series data point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Point style of the series data point. Valid only if the chartType is AREA, LINE, or SCATTER.
   * COMBO charts are also supported if the series chart type is AREA, LINE, or SCATTER. If empty,
   * the series default is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PointStyle pointStyle;

  /**
   * Color of the series data point. If empty, the series default is used.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * Color of the series data point. If empty, the series default is used.
   * @param color color or {@code null} for none
   */
  public BasicSeriesDataPointStyleOverride setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * Color of the series data point. If empty, the series default is used. If color is also set,
   * this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getColorStyle() {
    return colorStyle;
  }

  /**
   * Color of the series data point. If empty, the series default is used. If color is also set,
   * this field takes precedence.
   * @param colorStyle colorStyle or {@code null} for none
   */
  public BasicSeriesDataPointStyleOverride setColorStyle(ColorStyle colorStyle) {
    this.colorStyle = colorStyle;
    return this;
  }

  /**
   * Zero based index of the series data point.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * Zero based index of the series data point.
   * @param index index or {@code null} for none
   */
  public BasicSeriesDataPointStyleOverride setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Point style of the series data point. Valid only if the chartType is AREA, LINE, or SCATTER.
   * COMBO charts are also supported if the series chart type is AREA, LINE, or SCATTER. If empty,
   * the series default is used.
   * @return value or {@code null} for none
   */
  public PointStyle getPointStyle() {
    return pointStyle;
  }

  /**
   * Point style of the series data point. Valid only if the chartType is AREA, LINE, or SCATTER.
   * COMBO charts are also supported if the series chart type is AREA, LINE, or SCATTER. If empty,
   * the series default is used.
   * @param pointStyle pointStyle or {@code null} for none
   */
  public BasicSeriesDataPointStyleOverride setPointStyle(PointStyle pointStyle) {
    this.pointStyle = pointStyle;
    return this;
  }

  @Override
  public BasicSeriesDataPointStyleOverride set(String fieldName, Object value) {
    return (BasicSeriesDataPointStyleOverride) super.set(fieldName, value);
  }

  @Override
  public BasicSeriesDataPointStyleOverride clone() {
    return (BasicSeriesDataPointStyleOverride) super.clone();
  }

}
