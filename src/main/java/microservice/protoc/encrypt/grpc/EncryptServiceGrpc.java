package microservice.protoc.encrypt.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *加密服务调用接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EncryptServiceGrpc {

  private EncryptServiceGrpc() {}

  public static final String SERVICE_NAME = "EncryptService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrypt",
      requestType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.class,
      responseType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getDecryptMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getDecryptMethod;
    if ((getDecryptMethod = EncryptServiceGrpc.getDecryptMethod) == null) {
      synchronized (EncryptServiceGrpc.class) {
        if ((getDecryptMethod = EncryptServiceGrpc.getDecryptMethod) == null) {
          EncryptServiceGrpc.getDecryptMethod = getDecryptMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.getDefaultInstance()))
              .setSchemaDescriptor(new EncryptServiceMethodDescriptorSupplier("Decrypt"))
              .build();
        }
      }
    }
    return getDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getEncryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Encrypt",
      requestType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.class,
      responseType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getEncryptMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getEncryptMethod;
    if ((getEncryptMethod = EncryptServiceGrpc.getEncryptMethod) == null) {
      synchronized (EncryptServiceGrpc.class) {
        if ((getEncryptMethod = EncryptServiceGrpc.getEncryptMethod) == null) {
          EncryptServiceGrpc.getEncryptMethod = getEncryptMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Encrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.getDefaultInstance()))
              .setSchemaDescriptor(new EncryptServiceMethodDescriptorSupplier("Encrypt"))
              .build();
        }
      }
    }
    return getEncryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getGetHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHash",
      requestType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.class,
      responseType = microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
      microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getGetHashMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getGetHashMethod;
    if ((getGetHashMethod = EncryptServiceGrpc.getGetHashMethod) == null) {
      synchronized (EncryptServiceGrpc.class) {
        if ((getGetHashMethod = EncryptServiceGrpc.getGetHashMethod) == null) {
          EncryptServiceGrpc.getGetHashMethod = getGetHashMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.encrypt.grpc.EncryptServiceClient.Request, microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.encrypt.grpc.EncryptServiceClient.Response.getDefaultInstance()))
              .setSchemaDescriptor(new EncryptServiceMethodDescriptorSupplier("GetHash"))
              .build();
        }
      }
    }
    return getGetHashMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EncryptServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptServiceStub>() {
        @java.lang.Override
        public EncryptServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptServiceStub(channel, callOptions);
        }
      };
    return EncryptServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EncryptServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptServiceBlockingStub>() {
        @java.lang.Override
        public EncryptServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptServiceBlockingStub(channel, callOptions);
        }
      };
    return EncryptServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EncryptServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptServiceFutureStub>() {
        @java.lang.Override
        public EncryptServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptServiceFutureStub(channel, callOptions);
        }
      };
    return EncryptServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *加密服务调用接口
   * </pre>
   */
  public static abstract class EncryptServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *解码 获取明文
     * </pre>
     */
    public void decrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptMethod(), responseObserver);
    }

    /**
     * <pre>
     *编码 加密之后数据
     * </pre>
     */
    public void encrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取指定内容的HASH值，长度约定32 带盐值
     * </pre>
     */
    public void getHash(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHashMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecryptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>(
                  this, METHODID_DECRYPT)))
          .addMethod(
            getEncryptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>(
                  this, METHODID_ENCRYPT)))
          .addMethod(
            getGetHashMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Request,
                microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>(
                  this, METHODID_GET_HASH)))
          .build();
    }
  }

  /**
   * <pre>
   *加密服务调用接口
   * </pre>
   */
  public static final class EncryptServiceStub extends io.grpc.stub.AbstractAsyncStub<EncryptServiceStub> {
    private EncryptServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *解码 获取明文
     * </pre>
     */
    public void decrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *编码 加密之后数据
     * </pre>
     */
    public void encrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取指定内容的HASH值，长度约定32 带盐值
     * </pre>
     */
    public void getHash(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request,
        io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHashMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *加密服务调用接口
   * </pre>
   */
  public static final class EncryptServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EncryptServiceBlockingStub> {
    private EncryptServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *解码 获取明文
     * </pre>
     */
    public microservice.protoc.encrypt.grpc.EncryptServiceClient.Response decrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *编码 加密之后数据
     * </pre>
     */
    public microservice.protoc.encrypt.grpc.EncryptServiceClient.Response encrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取指定内容的HASH值，长度约定32 带盐值
     * </pre>
     */
    public microservice.protoc.encrypt.grpc.EncryptServiceClient.Response getHash(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHashMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *加密服务调用接口
   * </pre>
   */
  public static final class EncryptServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EncryptServiceFutureStub> {
    private EncryptServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *解码 获取明文
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> decrypt(
        microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *编码 加密之后数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> encrypt(
        microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取指定内容的HASH值，长度约定32 带盐值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response> getHash(
        microservice.protoc.encrypt.grpc.EncryptServiceClient.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHashMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECRYPT = 0;
  private static final int METHODID_ENCRYPT = 1;
  private static final int METHODID_GET_HASH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EncryptServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EncryptServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECRYPT:
          serviceImpl.decrypt((microservice.protoc.encrypt.grpc.EncryptServiceClient.Request) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>) responseObserver);
          break;
        case METHODID_ENCRYPT:
          serviceImpl.encrypt((microservice.protoc.encrypt.grpc.EncryptServiceClient.Request) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>) responseObserver);
          break;
        case METHODID_GET_HASH:
          serviceImpl.getHash((microservice.protoc.encrypt.grpc.EncryptServiceClient.Request) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.encrypt.grpc.EncryptServiceClient.Response>) responseObserver);
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

  private static abstract class EncryptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EncryptServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return microservice.protoc.encrypt.grpc.EncryptServiceClient.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EncryptService");
    }
  }

  private static final class EncryptServiceFileDescriptorSupplier
      extends EncryptServiceBaseDescriptorSupplier {
    EncryptServiceFileDescriptorSupplier() {}
  }

  private static final class EncryptServiceMethodDescriptorSupplier
      extends EncryptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EncryptServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EncryptServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EncryptServiceFileDescriptorSupplier())
              .addMethod(getDecryptMethod())
              .addMethod(getEncryptMethod())
              .addMethod(getGetHashMethod())
              .build();
        }
      }
    }
    return result;
  }
}
