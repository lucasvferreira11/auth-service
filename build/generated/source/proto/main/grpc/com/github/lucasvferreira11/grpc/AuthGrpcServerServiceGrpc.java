package com.github.lucasvferreira11.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: authService.proto")
public final class AuthGrpcServerServiceGrpc {

  private AuthGrpcServerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.lucasvferreira11.grpc.AuthGrpcServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials,
      com.github.lucasvferreira11.grpc.AuthGrpcServerReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials.class,
      responseType = com.github.lucasvferreira11.grpc.AuthGrpcServerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials,
      com.github.lucasvferreira11.grpc.AuthGrpcServerReply> getSendMethod() {
    io.grpc.MethodDescriptor<com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials, com.github.lucasvferreira11.grpc.AuthGrpcServerReply> getSendMethod;
    if ((getSendMethod = AuthGrpcServerServiceGrpc.getSendMethod) == null) {
      synchronized (AuthGrpcServerServiceGrpc.class) {
        if ((getSendMethod = AuthGrpcServerServiceGrpc.getSendMethod) == null) {
          AuthGrpcServerServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials, com.github.lucasvferreira11.grpc.AuthGrpcServerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.lucasvferreira11.grpc.AuthGrpcServerReply.getDefaultInstance()))
              .setSchemaDescriptor(new AuthGrpcServerServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthGrpcServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceStub>() {
        @java.lang.Override
        public AuthGrpcServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthGrpcServerServiceStub(channel, callOptions);
        }
      };
    return AuthGrpcServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthGrpcServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceBlockingStub>() {
        @java.lang.Override
        public AuthGrpcServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthGrpcServerServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthGrpcServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthGrpcServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthGrpcServerServiceFutureStub>() {
        @java.lang.Override
        public AuthGrpcServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthGrpcServerServiceFutureStub(channel, callOptions);
        }
      };
    return AuthGrpcServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthGrpcServerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials request,
        io.grpc.stub.StreamObserver<com.github.lucasvferreira11.grpc.AuthGrpcServerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials,
                com.github.lucasvferreira11.grpc.AuthGrpcServerReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class AuthGrpcServerServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthGrpcServerServiceStub> {
    private AuthGrpcServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthGrpcServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthGrpcServerServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials request,
        io.grpc.stub.StreamObserver<com.github.lucasvferreira11.grpc.AuthGrpcServerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthGrpcServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthGrpcServerServiceBlockingStub> {
    private AuthGrpcServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthGrpcServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthGrpcServerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.lucasvferreira11.grpc.AuthGrpcServerReply send(com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthGrpcServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthGrpcServerServiceFutureStub> {
    private AuthGrpcServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthGrpcServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthGrpcServerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.lucasvferreira11.grpc.AuthGrpcServerReply> send(
        com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthGrpcServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthGrpcServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.github.lucasvferreira11.grpc.AuthGrpcServerCredentials) request,
              (io.grpc.stub.StreamObserver<com.github.lucasvferreira11.grpc.AuthGrpcServerReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthGrpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthGrpcServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.lucasvferreira11.grpc.AuthService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthGrpcServerService");
    }
  }

  private static final class AuthGrpcServerServiceFileDescriptorSupplier
      extends AuthGrpcServerServiceBaseDescriptorSupplier {
    AuthGrpcServerServiceFileDescriptorSupplier() {}
  }

  private static final class AuthGrpcServerServiceMethodDescriptorSupplier
      extends AuthGrpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthGrpcServerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthGrpcServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthGrpcServerServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
