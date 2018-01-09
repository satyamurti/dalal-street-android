// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/GetCompanyProfile.proto

package dalalstreet.api.actions;

import dalalstreet.api.models.Stock;
import dalalstreet.api.models.StockHistory;

public interface GetCompanyProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetCompanyProfileResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .proto.GetCompanyProfileResponse.StatusCode status_code = 1;</code>
   */
  int getStatusCodeValue();
  /**
   * <code>optional .proto.GetCompanyProfileResponse.StatusCode status_code = 1;</code>
   */
  GetCompanyProfileResponse.StatusCode getStatusCode();

  /**
   * <code>optional string status_message = 2;</code>
   */
  String getStatusMessage();
  /**
   * <code>optional string status_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <code>optional .proto.Stock stock_details = 3;</code>
   */
  boolean hasStockDetails();
  /**
   * <code>optional .proto.Stock stock_details = 3;</code>
   */
  Stock getStockDetails();

  /**
   * <code>map&lt;string, .proto.StockHistory&gt; stock_history_map = 4;</code>
   */
  int getStockHistoryMapCount();
  /**
   * <code>map&lt;string, .proto.StockHistory&gt; stock_history_map = 4;</code>
   */
  boolean containsStockHistoryMap(
          String key);
  /**
   * Use {@link #getStockHistoryMapMap()} instead.
   */
  @Deprecated
  java.util.Map<String, StockHistory>
  getStockHistoryMap();
  /**
   * <code>map&lt;string, .proto.StockHistory&gt; stock_history_map = 4;</code>
   */
  java.util.Map<String, StockHistory>
  getStockHistoryMapMap();
  /**
   * <code>map&lt;string, .proto.StockHistory&gt; stock_history_map = 4;</code>
   */

  StockHistory getStockHistoryMapOrDefault(
          String key,
          StockHistory defaultValue);
  /**
   * <code>map&lt;string, .proto.StockHistory&gt; stock_history_map = 4;</code>
   */

  StockHistory getStockHistoryMapOrThrow(
          String key);
}