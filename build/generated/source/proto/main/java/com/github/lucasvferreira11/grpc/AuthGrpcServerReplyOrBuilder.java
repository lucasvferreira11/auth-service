// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authService.proto

package com.github.lucasvferreira11.grpc;

public interface AuthGrpcServerReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.lucasvferreira11.grpc.AuthGrpcServerReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool valid = 1;</code>
   * @return The valid.
   */
  boolean getValid();

  /**
   * <code>string token = 2;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}