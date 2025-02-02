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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * Photo is used to store 360 photos along with photo metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Photo extends com.google.api.client.json.GenericJson {

  /**
   * Absolute time when the photo was captured. When the photo has no exif timestamp, this is used
   * to set a timestamp in the photo metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String captureTime;

  /**
   * Connections to other photos. A connection represents the link from this photo to another photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Connection> connections;

  static {
    // hack to force ProGuard to consider Connection used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Connection.class);
  }

  /**
   * Output only. The download URL for the photo bytes. This field is set only when
   * GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUrl;

  /**
   * Output only. Status in Google Maps, whether this photo was published or rejected. Not currently
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mapsPublishStatus;

  /**
   * Required when updating a photo. Output only when creating a photo. Identifier for the photo,
   * which is unique among all photos in Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PhotoId photoId;

  /**
   * Places where this photo belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Place> places;

  /**
   * Pose of the photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Pose pose;

  /**
   * Output only. The share link for the photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shareLink;

  /**
   * Output only. The thumbnail URL for showing a preview of the given photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * Output only. Status of rights transfer on this photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transferStatus;

  /**
   * Required when creating a photo. Input only. The resource URL where the photo bytes are uploaded
   * to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UploadRef uploadReference;

  /**
   * Time when the image was uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String uploadTime;

  /**
   * Output only. View count of the photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long viewCount;

  /**
   * Absolute time when the photo was captured. When the photo has no exif timestamp, this is used
   * to set a timestamp in the photo metadata.
   * @return value or {@code null} for none
   */
  public String getCaptureTime() {
    return captureTime;
  }

  /**
   * Absolute time when the photo was captured. When the photo has no exif timestamp, this is used
   * to set a timestamp in the photo metadata.
   * @param captureTime captureTime or {@code null} for none
   */
  public Photo setCaptureTime(String captureTime) {
    this.captureTime = captureTime;
    return this;
  }

  /**
   * Connections to other photos. A connection represents the link from this photo to another photo.
   * @return value or {@code null} for none
   */
  public java.util.List<Connection> getConnections() {
    return connections;
  }

  /**
   * Connections to other photos. A connection represents the link from this photo to another photo.
   * @param connections connections or {@code null} for none
   */
  public Photo setConnections(java.util.List<Connection> connections) {
    this.connections = connections;
    return this;
  }

  /**
   * Output only. The download URL for the photo bytes. This field is set only when
   * GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * Output only. The download URL for the photo bytes. This field is set only when
   * GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
   * @param downloadUrl downloadUrl or {@code null} for none
   */
  public Photo setDownloadUrl(java.lang.String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Output only. Status in Google Maps, whether this photo was published or rejected. Not currently
   * populated.
   * @return value or {@code null} for none
   */
  public java.lang.String getMapsPublishStatus() {
    return mapsPublishStatus;
  }

  /**
   * Output only. Status in Google Maps, whether this photo was published or rejected. Not currently
   * populated.
   * @param mapsPublishStatus mapsPublishStatus or {@code null} for none
   */
  public Photo setMapsPublishStatus(java.lang.String mapsPublishStatus) {
    this.mapsPublishStatus = mapsPublishStatus;
    return this;
  }

  /**
   * Required when updating a photo. Output only when creating a photo. Identifier for the photo,
   * which is unique among all photos in Google.
   * @return value or {@code null} for none
   */
  public PhotoId getPhotoId() {
    return photoId;
  }

  /**
   * Required when updating a photo. Output only when creating a photo. Identifier for the photo,
   * which is unique among all photos in Google.
   * @param photoId photoId or {@code null} for none
   */
  public Photo setPhotoId(PhotoId photoId) {
    this.photoId = photoId;
    return this;
  }

  /**
   * Places where this photo belongs.
   * @return value or {@code null} for none
   */
  public java.util.List<Place> getPlaces() {
    return places;
  }

  /**
   * Places where this photo belongs.
   * @param places places or {@code null} for none
   */
  public Photo setPlaces(java.util.List<Place> places) {
    this.places = places;
    return this;
  }

  /**
   * Pose of the photo.
   * @return value or {@code null} for none
   */
  public Pose getPose() {
    return pose;
  }

  /**
   * Pose of the photo.
   * @param pose pose or {@code null} for none
   */
  public Photo setPose(Pose pose) {
    this.pose = pose;
    return this;
  }

  /**
   * Output only. The share link for the photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getShareLink() {
    return shareLink;
  }

  /**
   * Output only. The share link for the photo.
   * @param shareLink shareLink or {@code null} for none
   */
  public Photo setShareLink(java.lang.String shareLink) {
    this.shareLink = shareLink;
    return this;
  }

  /**
   * Output only. The thumbnail URL for showing a preview of the given photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * Output only. The thumbnail URL for showing a preview of the given photo.
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public Photo setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * Output only. Status of rights transfer on this photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransferStatus() {
    return transferStatus;
  }

  /**
   * Output only. Status of rights transfer on this photo.
   * @param transferStatus transferStatus or {@code null} for none
   */
  public Photo setTransferStatus(java.lang.String transferStatus) {
    this.transferStatus = transferStatus;
    return this;
  }

  /**
   * Required when creating a photo. Input only. The resource URL where the photo bytes are uploaded
   * to.
   * @return value or {@code null} for none
   */
  public UploadRef getUploadReference() {
    return uploadReference;
  }

  /**
   * Required when creating a photo. Input only. The resource URL where the photo bytes are uploaded
   * to.
   * @param uploadReference uploadReference or {@code null} for none
   */
  public Photo setUploadReference(UploadRef uploadReference) {
    this.uploadReference = uploadReference;
    return this;
  }

  /**
   * Time when the image was uploaded.
   * @return value or {@code null} for none
   */
  public String getUploadTime() {
    return uploadTime;
  }

  /**
   * Time when the image was uploaded.
   * @param uploadTime uploadTime or {@code null} for none
   */
  public Photo setUploadTime(String uploadTime) {
    this.uploadTime = uploadTime;
    return this;
  }

  /**
   * Output only. View count of the photo.
   * @return value or {@code null} for none
   */
  public java.lang.Long getViewCount() {
    return viewCount;
  }

  /**
   * Output only. View count of the photo.
   * @param viewCount viewCount or {@code null} for none
   */
  public Photo setViewCount(java.lang.Long viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  @Override
  public Photo set(String fieldName, Object value) {
    return (Photo) super.set(fieldName, value);
  }

  @Override
  public Photo clone() {
    return (Photo) super.clone();
  }

}
