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

package com.google.api.services.bigquery.model;

/**
 * Options used in model training.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrainingOptions extends com.google.api.client.json.GenericJson {

  /**
   * If true, detect step changes and make data adjustment in the input time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adjustStepChanges;

  /**
   * Whether to enable auto ARIMA or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoArima;

  /**
   * The max value of non-seasonal p and q.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long autoArimaMaxOrder;

  /**
   * Batch size for dnn models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long batchSize;

  /**
   * If true, clean spikes and dips in the input time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cleanSpikesAndDips;

  /**
   * The data frequency of a time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataFrequency;

  /**
   * The column to split data with. This column won't be used as a feature. 1. When
   * data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true
   * value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the
   * first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are
   * used as training data, and the rest are eval data. It respects the order in Orderable data
   * types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-
   * properties
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSplitColumn;

  /**
   * The fraction of evaluation data over the whole input data. The rest of data will be used as
   * training data. The format should be double. Accurate to two decimal places. Default value is
   * 0.2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double dataSplitEvalFraction;

  /**
   * The data split type for training and evaluation, e.g. RANDOM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSplitMethod;

  /**
   * If true, perform decompose time series and save the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean decomposeTimeSeries;

  /**
   * Distance type for clustering models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String distanceType;

  /**
   * Dropout probability for dnn models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double dropout;

  /**
   * Whether to stop early when the loss doesn't improve significantly any more (compared to
   * min_relative_progress). Used only for iterative training algorithms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean earlyStop;

  /**
   * Feedback type that specifies which algorithm to run for matrix factorization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feedbackType;

  /**
   * Hidden units for dnn models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> hiddenUnits;

  /**
   * The geographical region based on which the holidays are considered in time series modeling. If
   * a valid value is specified, then holiday effects modeling is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String holidayRegion;

  /**
   * The number of periods ahead that need to be forecasted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long horizon;

  /**
   * Include drift when fitting an ARIMA model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeDrift;

  /**
   * Specifies the initial learning rate for the line search learn rate strategy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double initialLearnRate;

  /**
   * Name of input label columns in training data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputLabelColumns;

  /**
   * Item column specified for matrix factorization models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemColumn;

  /**
   * The column used to provide the initial centroids for kmeans algorithm when
   * kmeans_initialization_method is CUSTOM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmeansInitializationColumn;

  /**
   * The method used to initialize the centroids for kmeans algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmeansInitializationMethod;

  /**
   * L1 regularization coefficient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double l1Regularization;

  /**
   * L2 regularization coefficient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double l2Regularization;

  /**
   * Weights associated with each label class, for rebalancing the training data. Only applicable
   * for classification models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Double> labelClassWeights;

  /**
   * Learning rate in training. Used only for iterative training algorithms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double learnRate;

  /**
   * The strategy to determine learn rate for the current iteration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String learnRateStrategy;

  /**
   * Type of loss function used during training run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lossType;

  /**
   * The maximum number of iterations in training. Used only for iterative training algorithms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxIterations;

  /**
   * Maximum depth of a tree for boosted tree models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxTreeDepth;

  /**
   * When early_stop is true, stops training when accuracy improvement is less than
   * 'min_relative_progress'. Used only for iterative training algorithms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minRelativeProgress;

  /**
   * Minimum split loss for boosted tree models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minSplitLoss;

  /**
   * Google Cloud Storage URI from which the model was imported. Only applicable for imported
   * models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelUri;

  /**
   * A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are
   * the AR order, the degree of differencing, and the MA order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArimaOrder nonSeasonalOrder;

  /**
   * Number of clusters for clustering models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numClusters;

  /**
   * Num factors specified for matrix factorization models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numFactors;

  /**
   * Optimization strategy for training linear regression models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String optimizationStrategy;

  /**
   * Whether to preserve the input structs in output feature names. Suppose there is a struct A with
   * field b. When false (default), the output feature name is A_b. When true, the output feature
   * name is A.b.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preserveInputStructs;

  /**
   * Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree
   * models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double subsample;

  /**
   * Column to be designated as time series data for ARIMA model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeSeriesDataColumn;

  /**
   * The time series id column that was used during ARIMA model training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeSeriesIdColumn;

  /**
   * The time series id columns that were used during ARIMA model training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> timeSeriesIdColumns;

  /**
   * Column to be designated as time series timestamp for ARIMA model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeSeriesTimestampColumn;

  /**
   * User column specified for matrix factorization models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userColumn;

  /**
   * Hyperparameter for matrix factoration when implicit feedback type is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double walsAlpha;

  /**
   * Whether to train a model from the last checkpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean warmStart;

  /**
   * If true, detect step changes and make data adjustment in the input time series.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdjustStepChanges() {
    return adjustStepChanges;
  }

  /**
   * If true, detect step changes and make data adjustment in the input time series.
   * @param adjustStepChanges adjustStepChanges or {@code null} for none
   */
  public TrainingOptions setAdjustStepChanges(java.lang.Boolean adjustStepChanges) {
    this.adjustStepChanges = adjustStepChanges;
    return this;
  }

  /**
   * Whether to enable auto ARIMA or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoArima() {
    return autoArima;
  }

  /**
   * Whether to enable auto ARIMA or not.
   * @param autoArima autoArima or {@code null} for none
   */
  public TrainingOptions setAutoArima(java.lang.Boolean autoArima) {
    this.autoArima = autoArima;
    return this;
  }

  /**
   * The max value of non-seasonal p and q.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAutoArimaMaxOrder() {
    return autoArimaMaxOrder;
  }

  /**
   * The max value of non-seasonal p and q.
   * @param autoArimaMaxOrder autoArimaMaxOrder or {@code null} for none
   */
  public TrainingOptions setAutoArimaMaxOrder(java.lang.Long autoArimaMaxOrder) {
    this.autoArimaMaxOrder = autoArimaMaxOrder;
    return this;
  }

  /**
   * Batch size for dnn models.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchSize() {
    return batchSize;
  }

  /**
   * Batch size for dnn models.
   * @param batchSize batchSize or {@code null} for none
   */
  public TrainingOptions setBatchSize(java.lang.Long batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * If true, clean spikes and dips in the input time series.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCleanSpikesAndDips() {
    return cleanSpikesAndDips;
  }

  /**
   * If true, clean spikes and dips in the input time series.
   * @param cleanSpikesAndDips cleanSpikesAndDips or {@code null} for none
   */
  public TrainingOptions setCleanSpikesAndDips(java.lang.Boolean cleanSpikesAndDips) {
    this.cleanSpikesAndDips = cleanSpikesAndDips;
    return this;
  }

  /**
   * The data frequency of a time series.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataFrequency() {
    return dataFrequency;
  }

  /**
   * The data frequency of a time series.
   * @param dataFrequency dataFrequency or {@code null} for none
   */
  public TrainingOptions setDataFrequency(java.lang.String dataFrequency) {
    this.dataFrequency = dataFrequency;
    return this;
  }

  /**
   * The column to split data with. This column won't be used as a feature. 1. When
   * data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true
   * value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the
   * first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are
   * used as training data, and the rest are eval data. It respects the order in Orderable data
   * types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-
   * properties
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSplitColumn() {
    return dataSplitColumn;
  }

  /**
   * The column to split data with. This column won't be used as a feature. 1. When
   * data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true
   * value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the
   * first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are
   * used as training data, and the rest are eval data. It respects the order in Orderable data
   * types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-
   * properties
   * @param dataSplitColumn dataSplitColumn or {@code null} for none
   */
  public TrainingOptions setDataSplitColumn(java.lang.String dataSplitColumn) {
    this.dataSplitColumn = dataSplitColumn;
    return this;
  }

  /**
   * The fraction of evaluation data over the whole input data. The rest of data will be used as
   * training data. The format should be double. Accurate to two decimal places. Default value is
   * 0.2.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDataSplitEvalFraction() {
    return dataSplitEvalFraction;
  }

  /**
   * The fraction of evaluation data over the whole input data. The rest of data will be used as
   * training data. The format should be double. Accurate to two decimal places. Default value is
   * 0.2.
   * @param dataSplitEvalFraction dataSplitEvalFraction or {@code null} for none
   */
  public TrainingOptions setDataSplitEvalFraction(java.lang.Double dataSplitEvalFraction) {
    this.dataSplitEvalFraction = dataSplitEvalFraction;
    return this;
  }

  /**
   * The data split type for training and evaluation, e.g. RANDOM.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSplitMethod() {
    return dataSplitMethod;
  }

  /**
   * The data split type for training and evaluation, e.g. RANDOM.
   * @param dataSplitMethod dataSplitMethod or {@code null} for none
   */
  public TrainingOptions setDataSplitMethod(java.lang.String dataSplitMethod) {
    this.dataSplitMethod = dataSplitMethod;
    return this;
  }

  /**
   * If true, perform decompose time series and save the results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDecomposeTimeSeries() {
    return decomposeTimeSeries;
  }

  /**
   * If true, perform decompose time series and save the results.
   * @param decomposeTimeSeries decomposeTimeSeries or {@code null} for none
   */
  public TrainingOptions setDecomposeTimeSeries(java.lang.Boolean decomposeTimeSeries) {
    this.decomposeTimeSeries = decomposeTimeSeries;
    return this;
  }

  /**
   * Distance type for clustering models.
   * @return value or {@code null} for none
   */
  public java.lang.String getDistanceType() {
    return distanceType;
  }

  /**
   * Distance type for clustering models.
   * @param distanceType distanceType or {@code null} for none
   */
  public TrainingOptions setDistanceType(java.lang.String distanceType) {
    this.distanceType = distanceType;
    return this;
  }

  /**
   * Dropout probability for dnn models.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDropout() {
    return dropout;
  }

  /**
   * Dropout probability for dnn models.
   * @param dropout dropout or {@code null} for none
   */
  public TrainingOptions setDropout(java.lang.Double dropout) {
    this.dropout = dropout;
    return this;
  }

  /**
   * Whether to stop early when the loss doesn't improve significantly any more (compared to
   * min_relative_progress). Used only for iterative training algorithms.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEarlyStop() {
    return earlyStop;
  }

  /**
   * Whether to stop early when the loss doesn't improve significantly any more (compared to
   * min_relative_progress). Used only for iterative training algorithms.
   * @param earlyStop earlyStop or {@code null} for none
   */
  public TrainingOptions setEarlyStop(java.lang.Boolean earlyStop) {
    this.earlyStop = earlyStop;
    return this;
  }

  /**
   * Feedback type that specifies which algorithm to run for matrix factorization.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeedbackType() {
    return feedbackType;
  }

  /**
   * Feedback type that specifies which algorithm to run for matrix factorization.
   * @param feedbackType feedbackType or {@code null} for none
   */
  public TrainingOptions setFeedbackType(java.lang.String feedbackType) {
    this.feedbackType = feedbackType;
    return this;
  }

  /**
   * Hidden units for dnn models.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getHiddenUnits() {
    return hiddenUnits;
  }

  /**
   * Hidden units for dnn models.
   * @param hiddenUnits hiddenUnits or {@code null} for none
   */
  public TrainingOptions setHiddenUnits(java.util.List<java.lang.Long> hiddenUnits) {
    this.hiddenUnits = hiddenUnits;
    return this;
  }

  /**
   * The geographical region based on which the holidays are considered in time series modeling. If
   * a valid value is specified, then holiday effects modeling is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getHolidayRegion() {
    return holidayRegion;
  }

  /**
   * The geographical region based on which the holidays are considered in time series modeling. If
   * a valid value is specified, then holiday effects modeling is enabled.
   * @param holidayRegion holidayRegion or {@code null} for none
   */
  public TrainingOptions setHolidayRegion(java.lang.String holidayRegion) {
    this.holidayRegion = holidayRegion;
    return this;
  }

  /**
   * The number of periods ahead that need to be forecasted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHorizon() {
    return horizon;
  }

  /**
   * The number of periods ahead that need to be forecasted.
   * @param horizon horizon or {@code null} for none
   */
  public TrainingOptions setHorizon(java.lang.Long horizon) {
    this.horizon = horizon;
    return this;
  }

  /**
   * Include drift when fitting an ARIMA model.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeDrift() {
    return includeDrift;
  }

  /**
   * Include drift when fitting an ARIMA model.
   * @param includeDrift includeDrift or {@code null} for none
   */
  public TrainingOptions setIncludeDrift(java.lang.Boolean includeDrift) {
    this.includeDrift = includeDrift;
    return this;
  }

  /**
   * Specifies the initial learning rate for the line search learn rate strategy.
   * @return value or {@code null} for none
   */
  public java.lang.Double getInitialLearnRate() {
    return initialLearnRate;
  }

  /**
   * Specifies the initial learning rate for the line search learn rate strategy.
   * @param initialLearnRate initialLearnRate or {@code null} for none
   */
  public TrainingOptions setInitialLearnRate(java.lang.Double initialLearnRate) {
    this.initialLearnRate = initialLearnRate;
    return this;
  }

  /**
   * Name of input label columns in training data.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputLabelColumns() {
    return inputLabelColumns;
  }

  /**
   * Name of input label columns in training data.
   * @param inputLabelColumns inputLabelColumns or {@code null} for none
   */
  public TrainingOptions setInputLabelColumns(java.util.List<java.lang.String> inputLabelColumns) {
    this.inputLabelColumns = inputLabelColumns;
    return this;
  }

  /**
   * Item column specified for matrix factorization models.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemColumn() {
    return itemColumn;
  }

  /**
   * Item column specified for matrix factorization models.
   * @param itemColumn itemColumn or {@code null} for none
   */
  public TrainingOptions setItemColumn(java.lang.String itemColumn) {
    this.itemColumn = itemColumn;
    return this;
  }

  /**
   * The column used to provide the initial centroids for kmeans algorithm when
   * kmeans_initialization_method is CUSTOM.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmeansInitializationColumn() {
    return kmeansInitializationColumn;
  }

  /**
   * The column used to provide the initial centroids for kmeans algorithm when
   * kmeans_initialization_method is CUSTOM.
   * @param kmeansInitializationColumn kmeansInitializationColumn or {@code null} for none
   */
  public TrainingOptions setKmeansInitializationColumn(java.lang.String kmeansInitializationColumn) {
    this.kmeansInitializationColumn = kmeansInitializationColumn;
    return this;
  }

  /**
   * The method used to initialize the centroids for kmeans algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmeansInitializationMethod() {
    return kmeansInitializationMethod;
  }

  /**
   * The method used to initialize the centroids for kmeans algorithm.
   * @param kmeansInitializationMethod kmeansInitializationMethod or {@code null} for none
   */
  public TrainingOptions setKmeansInitializationMethod(java.lang.String kmeansInitializationMethod) {
    this.kmeansInitializationMethod = kmeansInitializationMethod;
    return this;
  }

  /**
   * L1 regularization coefficient.
   * @return value or {@code null} for none
   */
  public java.lang.Double getL1Regularization() {
    return l1Regularization;
  }

  /**
   * L1 regularization coefficient.
   * @param l1Regularization l1Regularization or {@code null} for none
   */
  public TrainingOptions setL1Regularization(java.lang.Double l1Regularization) {
    this.l1Regularization = l1Regularization;
    return this;
  }

  /**
   * L2 regularization coefficient.
   * @return value or {@code null} for none
   */
  public java.lang.Double getL2Regularization() {
    return l2Regularization;
  }

  /**
   * L2 regularization coefficient.
   * @param l2Regularization l2Regularization or {@code null} for none
   */
  public TrainingOptions setL2Regularization(java.lang.Double l2Regularization) {
    this.l2Regularization = l2Regularization;
    return this;
  }

  /**
   * Weights associated with each label class, for rebalancing the training data. Only applicable
   * for classification models.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Double> getLabelClassWeights() {
    return labelClassWeights;
  }

  /**
   * Weights associated with each label class, for rebalancing the training data. Only applicable
   * for classification models.
   * @param labelClassWeights labelClassWeights or {@code null} for none
   */
  public TrainingOptions setLabelClassWeights(java.util.Map<String, java.lang.Double> labelClassWeights) {
    this.labelClassWeights = labelClassWeights;
    return this;
  }

  /**
   * Learning rate in training. Used only for iterative training algorithms.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLearnRate() {
    return learnRate;
  }

  /**
   * Learning rate in training. Used only for iterative training algorithms.
   * @param learnRate learnRate or {@code null} for none
   */
  public TrainingOptions setLearnRate(java.lang.Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * The strategy to determine learn rate for the current iteration.
   * @return value or {@code null} for none
   */
  public java.lang.String getLearnRateStrategy() {
    return learnRateStrategy;
  }

  /**
   * The strategy to determine learn rate for the current iteration.
   * @param learnRateStrategy learnRateStrategy or {@code null} for none
   */
  public TrainingOptions setLearnRateStrategy(java.lang.String learnRateStrategy) {
    this.learnRateStrategy = learnRateStrategy;
    return this;
  }

  /**
   * Type of loss function used during training run.
   * @return value or {@code null} for none
   */
  public java.lang.String getLossType() {
    return lossType;
  }

  /**
   * Type of loss function used during training run.
   * @param lossType lossType or {@code null} for none
   */
  public TrainingOptions setLossType(java.lang.String lossType) {
    this.lossType = lossType;
    return this;
  }

  /**
   * The maximum number of iterations in training. Used only for iterative training algorithms.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxIterations() {
    return maxIterations;
  }

  /**
   * The maximum number of iterations in training. Used only for iterative training algorithms.
   * @param maxIterations maxIterations or {@code null} for none
   */
  public TrainingOptions setMaxIterations(java.lang.Long maxIterations) {
    this.maxIterations = maxIterations;
    return this;
  }

  /**
   * Maximum depth of a tree for boosted tree models.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxTreeDepth() {
    return maxTreeDepth;
  }

  /**
   * Maximum depth of a tree for boosted tree models.
   * @param maxTreeDepth maxTreeDepth or {@code null} for none
   */
  public TrainingOptions setMaxTreeDepth(java.lang.Long maxTreeDepth) {
    this.maxTreeDepth = maxTreeDepth;
    return this;
  }

  /**
   * When early_stop is true, stops training when accuracy improvement is less than
   * 'min_relative_progress'. Used only for iterative training algorithms.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinRelativeProgress() {
    return minRelativeProgress;
  }

  /**
   * When early_stop is true, stops training when accuracy improvement is less than
   * 'min_relative_progress'. Used only for iterative training algorithms.
   * @param minRelativeProgress minRelativeProgress or {@code null} for none
   */
  public TrainingOptions setMinRelativeProgress(java.lang.Double minRelativeProgress) {
    this.minRelativeProgress = minRelativeProgress;
    return this;
  }

  /**
   * Minimum split loss for boosted tree models.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinSplitLoss() {
    return minSplitLoss;
  }

  /**
   * Minimum split loss for boosted tree models.
   * @param minSplitLoss minSplitLoss or {@code null} for none
   */
  public TrainingOptions setMinSplitLoss(java.lang.Double minSplitLoss) {
    this.minSplitLoss = minSplitLoss;
    return this;
  }

  /**
   * Google Cloud Storage URI from which the model was imported. Only applicable for imported
   * models.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelUri() {
    return modelUri;
  }

  /**
   * Google Cloud Storage URI from which the model was imported. Only applicable for imported
   * models.
   * @param modelUri modelUri or {@code null} for none
   */
  public TrainingOptions setModelUri(java.lang.String modelUri) {
    this.modelUri = modelUri;
    return this;
  }

  /**
   * A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are
   * the AR order, the degree of differencing, and the MA order.
   * @return value or {@code null} for none
   */
  public ArimaOrder getNonSeasonalOrder() {
    return nonSeasonalOrder;
  }

  /**
   * A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are
   * the AR order, the degree of differencing, and the MA order.
   * @param nonSeasonalOrder nonSeasonalOrder or {@code null} for none
   */
  public TrainingOptions setNonSeasonalOrder(ArimaOrder nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
    return this;
  }

  /**
   * Number of clusters for clustering models.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumClusters() {
    return numClusters;
  }

  /**
   * Number of clusters for clustering models.
   * @param numClusters numClusters or {@code null} for none
   */
  public TrainingOptions setNumClusters(java.lang.Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  /**
   * Num factors specified for matrix factorization models.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumFactors() {
    return numFactors;
  }

  /**
   * Num factors specified for matrix factorization models.
   * @param numFactors numFactors or {@code null} for none
   */
  public TrainingOptions setNumFactors(java.lang.Long numFactors) {
    this.numFactors = numFactors;
    return this;
  }

  /**
   * Optimization strategy for training linear regression models.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptimizationStrategy() {
    return optimizationStrategy;
  }

  /**
   * Optimization strategy for training linear regression models.
   * @param optimizationStrategy optimizationStrategy or {@code null} for none
   */
  public TrainingOptions setOptimizationStrategy(java.lang.String optimizationStrategy) {
    this.optimizationStrategy = optimizationStrategy;
    return this;
  }

  /**
   * Whether to preserve the input structs in output feature names. Suppose there is a struct A with
   * field b. When false (default), the output feature name is A_b. When true, the output feature
   * name is A.b.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreserveInputStructs() {
    return preserveInputStructs;
  }

  /**
   * Whether to preserve the input structs in output feature names. Suppose there is a struct A with
   * field b. When false (default), the output feature name is A_b. When true, the output feature
   * name is A.b.
   * @param preserveInputStructs preserveInputStructs or {@code null} for none
   */
  public TrainingOptions setPreserveInputStructs(java.lang.Boolean preserveInputStructs) {
    this.preserveInputStructs = preserveInputStructs;
    return this;
  }

  /**
   * Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree
   * models.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSubsample() {
    return subsample;
  }

  /**
   * Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree
   * models.
   * @param subsample subsample or {@code null} for none
   */
  public TrainingOptions setSubsample(java.lang.Double subsample) {
    this.subsample = subsample;
    return this;
  }

  /**
   * Column to be designated as time series data for ARIMA model.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeSeriesDataColumn() {
    return timeSeriesDataColumn;
  }

  /**
   * Column to be designated as time series data for ARIMA model.
   * @param timeSeriesDataColumn timeSeriesDataColumn or {@code null} for none
   */
  public TrainingOptions setTimeSeriesDataColumn(java.lang.String timeSeriesDataColumn) {
    this.timeSeriesDataColumn = timeSeriesDataColumn;
    return this;
  }

  /**
   * The time series id column that was used during ARIMA model training.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeSeriesIdColumn() {
    return timeSeriesIdColumn;
  }

  /**
   * The time series id column that was used during ARIMA model training.
   * @param timeSeriesIdColumn timeSeriesIdColumn or {@code null} for none
   */
  public TrainingOptions setTimeSeriesIdColumn(java.lang.String timeSeriesIdColumn) {
    this.timeSeriesIdColumn = timeSeriesIdColumn;
    return this;
  }

  /**
   * The time series id columns that were used during ARIMA model training.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTimeSeriesIdColumns() {
    return timeSeriesIdColumns;
  }

  /**
   * The time series id columns that were used during ARIMA model training.
   * @param timeSeriesIdColumns timeSeriesIdColumns or {@code null} for none
   */
  public TrainingOptions setTimeSeriesIdColumns(java.util.List<java.lang.String> timeSeriesIdColumns) {
    this.timeSeriesIdColumns = timeSeriesIdColumns;
    return this;
  }

  /**
   * Column to be designated as time series timestamp for ARIMA model.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeSeriesTimestampColumn() {
    return timeSeriesTimestampColumn;
  }

  /**
   * Column to be designated as time series timestamp for ARIMA model.
   * @param timeSeriesTimestampColumn timeSeriesTimestampColumn or {@code null} for none
   */
  public TrainingOptions setTimeSeriesTimestampColumn(java.lang.String timeSeriesTimestampColumn) {
    this.timeSeriesTimestampColumn = timeSeriesTimestampColumn;
    return this;
  }

  /**
   * User column specified for matrix factorization models.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserColumn() {
    return userColumn;
  }

  /**
   * User column specified for matrix factorization models.
   * @param userColumn userColumn or {@code null} for none
   */
  public TrainingOptions setUserColumn(java.lang.String userColumn) {
    this.userColumn = userColumn;
    return this;
  }

  /**
   * Hyperparameter for matrix factoration when implicit feedback type is specified.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWalsAlpha() {
    return walsAlpha;
  }

  /**
   * Hyperparameter for matrix factoration when implicit feedback type is specified.
   * @param walsAlpha walsAlpha or {@code null} for none
   */
  public TrainingOptions setWalsAlpha(java.lang.Double walsAlpha) {
    this.walsAlpha = walsAlpha;
    return this;
  }

  /**
   * Whether to train a model from the last checkpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWarmStart() {
    return warmStart;
  }

  /**
   * Whether to train a model from the last checkpoint.
   * @param warmStart warmStart or {@code null} for none
   */
  public TrainingOptions setWarmStart(java.lang.Boolean warmStart) {
    this.warmStart = warmStart;
    return this;
  }

  @Override
  public TrainingOptions set(String fieldName, Object value) {
    return (TrainingOptions) super.set(fieldName, value);
  }

  @Override
  public TrainingOptions clone() {
    return (TrainingOptions) super.clone();
  }

}
