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

package com.google.api.services.chat.v1.model;

/**
 * A widget is a UI element that presents texts, images, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Widget extends com.google.api.client.json.GenericJson {

  /**
   * A list of buttons. For example, the following JSON creates two buttons. The first is a filled
   * text button and the second is an image button that opens a link: ``` "buttonList": { "buttons":
   * [ "button": { "text": "Edit", "Color": { "Red": 255 "Green": 255 "Blue": 255 } "disabled": true
   * }, "button": { "icon": { "knownIcon": "INVITE" "altText": "check calendar" }, "onClick": {
   * "openLink": { "url": "https://example.com/calendar" } } }, ] } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1ButtonList buttonList;

  /**
   * Displays a selection/input widget for date/time. For example, the following JSON creates a
   * date/time picker for an appointment time: ``` "date_time_picker": { "name": "appointment_time",
   * "label": "Book your appointment at:", "type": "DateTimePickerType.DATE_AND_TIME",
   * "valueMsEpoch": "796435200000" } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1DateTimePicker dateTimePicker;

  /**
   * Displays a decorated text item in this widget. For example, the following JSON creates a
   * decorated text widget showing email address: ``` "decoratedText": { "icon": { "knownIcon":
   * "EMAIL" }, "topLabel": "Email Address", "content": "heba.salam@example.com", "bottomLabel":
   * "This is a new Email address!", "switchWidget": { "name":
   * "has_send_welcome_email_to_heba_salam", "selected": false, "controlType":
   * "ControlType.CHECKBOX" } } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1DecoratedText decoratedText;

  /**
   * Displays a divider. For example, the following JSON creates a divider: ``` "divider": { } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1Divider divider;

  /**
   * Displays a grid with a collection of items. For example, the following JSON creates a 2 column
   * grid with a single item: ``` "grid": { "title": "A fine collection of items", "numColumns": 2,
   * "borderStyle": { "type": "STROKE", "cornerRadius": 4.0 }, "items": [ "image": { "imageUri":
   * "https://www.example.com/image.png", "cropStyle": { "type": "SQUARE" }, "borderStyle": {
   * "type": "STROKE" } }, "title": "An item", "textAlignment": "CENTER" ], "onClick": { "openLink":
   * { "url":"https://www.example.com" } } } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1Grid grid;

  /**
   * The horizontal alignment of this widget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String horizontalAlignment;

  /**
   * Displays an image in this widget. For example, the following JSON creates an image with
   * alternative text: ``` "image": { "imageUrl": "https://example.com/heba_salam.png" "altText":
   * "Avatar for Heba Salam" } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1Image image;

  /**
   * Displays a switch control in this widget. For example, the following JSON creates a dropdown
   * selection for size: ``` "switchControl": { "name": "size", "label": "Size" "type":
   * "SelectionType.DROPDOWN", "items": [ { "text": "S", "value": "small", "selected": false }, {
   * "text": "M", "value": "medium", "selected": true }, { "text": "L", "value": "large",
   * "selected": false }, { "text": "XL", "value": "extra_large", "selected": false } ] } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1SelectionInput selectionInput;

  /**
   * Displays a text input in this widget. For example, the following JSON creates a text input for
   * mail address: ``` "textInput": { "name": "mailing_address", "label": "Mailing Address" } ``` As
   * another example, the following JSON creates a text input for programming language with static
   * suggestions: ``` "textInput": { "name": "preferred_programing_language", "label": "Preferred
   * Language", "initialSuggestions": { "items": [ { "text": "C++" }, { "text": "Java" }, { "text":
   * "JavaScript" }, { "text": "Python" } ] } } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1TextInput textInput;

  /**
   * Displays a text paragraph in this widget. For example, the following JSON creates a bolded
   * text: ``` "textParagraph": { "text": " *bold text*" } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1TextParagraph textParagraph;

  /**
   * A list of buttons. For example, the following JSON creates two buttons. The first is a filled
   * text button and the second is an image button that opens a link: ``` "buttonList": { "buttons":
   * [ "button": { "text": "Edit", "Color": { "Red": 255 "Green": 255 "Blue": 255 } "disabled": true
   * }, "button": { "icon": { "knownIcon": "INVITE" "altText": "check calendar" }, "onClick": {
   * "openLink": { "url": "https://example.com/calendar" } } }, ] } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1ButtonList getButtonList() {
    return buttonList;
  }

  /**
   * A list of buttons. For example, the following JSON creates two buttons. The first is a filled
   * text button and the second is an image button that opens a link: ``` "buttonList": { "buttons":
   * [ "button": { "text": "Edit", "Color": { "Red": 255 "Green": 255 "Blue": 255 } "disabled": true
   * }, "button": { "icon": { "knownIcon": "INVITE" "altText": "check calendar" }, "onClick": {
   * "openLink": { "url": "https://example.com/calendar" } } }, ] } ```
   * @param buttonList buttonList or {@code null} for none
   */
  public GoogleAppsCardV1Widget setButtonList(GoogleAppsCardV1ButtonList buttonList) {
    this.buttonList = buttonList;
    return this;
  }

  /**
   * Displays a selection/input widget for date/time. For example, the following JSON creates a
   * date/time picker for an appointment time: ``` "date_time_picker": { "name": "appointment_time",
   * "label": "Book your appointment at:", "type": "DateTimePickerType.DATE_AND_TIME",
   * "valueMsEpoch": "796435200000" } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker getDateTimePicker() {
    return dateTimePicker;
  }

  /**
   * Displays a selection/input widget for date/time. For example, the following JSON creates a
   * date/time picker for an appointment time: ``` "date_time_picker": { "name": "appointment_time",
   * "label": "Book your appointment at:", "type": "DateTimePickerType.DATE_AND_TIME",
   * "valueMsEpoch": "796435200000" } ```
   * @param dateTimePicker dateTimePicker or {@code null} for none
   */
  public GoogleAppsCardV1Widget setDateTimePicker(GoogleAppsCardV1DateTimePicker dateTimePicker) {
    this.dateTimePicker = dateTimePicker;
    return this;
  }

  /**
   * Displays a decorated text item in this widget. For example, the following JSON creates a
   * decorated text widget showing email address: ``` "decoratedText": { "icon": { "knownIcon":
   * "EMAIL" }, "topLabel": "Email Address", "content": "heba.salam@example.com", "bottomLabel":
   * "This is a new Email address!", "switchWidget": { "name":
   * "has_send_welcome_email_to_heba_salam", "selected": false, "controlType":
   * "ControlType.CHECKBOX" } } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1DecoratedText getDecoratedText() {
    return decoratedText;
  }

  /**
   * Displays a decorated text item in this widget. For example, the following JSON creates a
   * decorated text widget showing email address: ``` "decoratedText": { "icon": { "knownIcon":
   * "EMAIL" }, "topLabel": "Email Address", "content": "heba.salam@example.com", "bottomLabel":
   * "This is a new Email address!", "switchWidget": { "name":
   * "has_send_welcome_email_to_heba_salam", "selected": false, "controlType":
   * "ControlType.CHECKBOX" } } ```
   * @param decoratedText decoratedText or {@code null} for none
   */
  public GoogleAppsCardV1Widget setDecoratedText(GoogleAppsCardV1DecoratedText decoratedText) {
    this.decoratedText = decoratedText;
    return this;
  }

  /**
   * Displays a divider. For example, the following JSON creates a divider: ``` "divider": { } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1Divider getDivider() {
    return divider;
  }

  /**
   * Displays a divider. For example, the following JSON creates a divider: ``` "divider": { } ```
   * @param divider divider or {@code null} for none
   */
  public GoogleAppsCardV1Widget setDivider(GoogleAppsCardV1Divider divider) {
    this.divider = divider;
    return this;
  }

  /**
   * Displays a grid with a collection of items. For example, the following JSON creates a 2 column
   * grid with a single item: ``` "grid": { "title": "A fine collection of items", "numColumns": 2,
   * "borderStyle": { "type": "STROKE", "cornerRadius": 4.0 }, "items": [ "image": { "imageUri":
   * "https://www.example.com/image.png", "cropStyle": { "type": "SQUARE" }, "borderStyle": {
   * "type": "STROKE" } }, "title": "An item", "textAlignment": "CENTER" ], "onClick": { "openLink":
   * { "url":"https://www.example.com" } } } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1Grid getGrid() {
    return grid;
  }

  /**
   * Displays a grid with a collection of items. For example, the following JSON creates a 2 column
   * grid with a single item: ``` "grid": { "title": "A fine collection of items", "numColumns": 2,
   * "borderStyle": { "type": "STROKE", "cornerRadius": 4.0 }, "items": [ "image": { "imageUri":
   * "https://www.example.com/image.png", "cropStyle": { "type": "SQUARE" }, "borderStyle": {
   * "type": "STROKE" } }, "title": "An item", "textAlignment": "CENTER" ], "onClick": { "openLink":
   * { "url":"https://www.example.com" } } } ```
   * @param grid grid or {@code null} for none
   */
  public GoogleAppsCardV1Widget setGrid(GoogleAppsCardV1Grid grid) {
    this.grid = grid;
    return this;
  }

  /**
   * The horizontal alignment of this widget.
   * @return value or {@code null} for none
   */
  public java.lang.String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * The horizontal alignment of this widget.
   * @param horizontalAlignment horizontalAlignment or {@code null} for none
   */
  public GoogleAppsCardV1Widget setHorizontalAlignment(java.lang.String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

  /**
   * Displays an image in this widget. For example, the following JSON creates an image with
   * alternative text: ``` "image": { "imageUrl": "https://example.com/heba_salam.png" "altText":
   * "Avatar for Heba Salam" } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1Image getImage() {
    return image;
  }

  /**
   * Displays an image in this widget. For example, the following JSON creates an image with
   * alternative text: ``` "image": { "imageUrl": "https://example.com/heba_salam.png" "altText":
   * "Avatar for Heba Salam" } ```
   * @param image image or {@code null} for none
   */
  public GoogleAppsCardV1Widget setImage(GoogleAppsCardV1Image image) {
    this.image = image;
    return this;
  }

  /**
   * Displays a switch control in this widget. For example, the following JSON creates a dropdown
   * selection for size: ``` "switchControl": { "name": "size", "label": "Size" "type":
   * "SelectionType.DROPDOWN", "items": [ { "text": "S", "value": "small", "selected": false }, {
   * "text": "M", "value": "medium", "selected": true }, { "text": "L", "value": "large",
   * "selected": false }, { "text": "XL", "value": "extra_large", "selected": false } ] } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1SelectionInput getSelectionInput() {
    return selectionInput;
  }

  /**
   * Displays a switch control in this widget. For example, the following JSON creates a dropdown
   * selection for size: ``` "switchControl": { "name": "size", "label": "Size" "type":
   * "SelectionType.DROPDOWN", "items": [ { "text": "S", "value": "small", "selected": false }, {
   * "text": "M", "value": "medium", "selected": true }, { "text": "L", "value": "large",
   * "selected": false }, { "text": "XL", "value": "extra_large", "selected": false } ] } ```
   * @param selectionInput selectionInput or {@code null} for none
   */
  public GoogleAppsCardV1Widget setSelectionInput(GoogleAppsCardV1SelectionInput selectionInput) {
    this.selectionInput = selectionInput;
    return this;
  }

  /**
   * Displays a text input in this widget. For example, the following JSON creates a text input for
   * mail address: ``` "textInput": { "name": "mailing_address", "label": "Mailing Address" } ``` As
   * another example, the following JSON creates a text input for programming language with static
   * suggestions: ``` "textInput": { "name": "preferred_programing_language", "label": "Preferred
   * Language", "initialSuggestions": { "items": [ { "text": "C++" }, { "text": "Java" }, { "text":
   * "JavaScript" }, { "text": "Python" } ] } } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1TextInput getTextInput() {
    return textInput;
  }

  /**
   * Displays a text input in this widget. For example, the following JSON creates a text input for
   * mail address: ``` "textInput": { "name": "mailing_address", "label": "Mailing Address" } ``` As
   * another example, the following JSON creates a text input for programming language with static
   * suggestions: ``` "textInput": { "name": "preferred_programing_language", "label": "Preferred
   * Language", "initialSuggestions": { "items": [ { "text": "C++" }, { "text": "Java" }, { "text":
   * "JavaScript" }, { "text": "Python" } ] } } ```
   * @param textInput textInput or {@code null} for none
   */
  public GoogleAppsCardV1Widget setTextInput(GoogleAppsCardV1TextInput textInput) {
    this.textInput = textInput;
    return this;
  }

  /**
   * Displays a text paragraph in this widget. For example, the following JSON creates a bolded
   * text: ``` "textParagraph": { "text": " *bold text*" } ```
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1TextParagraph getTextParagraph() {
    return textParagraph;
  }

  /**
   * Displays a text paragraph in this widget. For example, the following JSON creates a bolded
   * text: ``` "textParagraph": { "text": " *bold text*" } ```
   * @param textParagraph textParagraph or {@code null} for none
   */
  public GoogleAppsCardV1Widget setTextParagraph(GoogleAppsCardV1TextParagraph textParagraph) {
    this.textParagraph = textParagraph;
    return this;
  }

  @Override
  public GoogleAppsCardV1Widget set(String fieldName, Object value) {
    return (GoogleAppsCardV1Widget) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Widget clone() {
    return (GoogleAppsCardV1Widget) super.clone();
  }

}
