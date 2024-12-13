package microservice.protoc.zan.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * &#64;exclude
 * This comment won't be rendered
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZanServiceGrpc {

  private ZanServiceGrpc() {}

  public static final String SERVICE_NAME = "ZanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.AddZanReq,
      microservice.protoc.zan.grpc.Response.AddZanRep> getAddZanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddZan",
      requestType = microservice.protoc.zan.grpc.Request.AddZanReq.class,
      responseType = microservice.protoc.zan.grpc.Response.AddZanRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.AddZanReq,
      microservice.protoc.zan.grpc.Response.AddZanRep> getAddZanMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.AddZanReq, microservice.protoc.zan.grpc.Response.AddZanRep> getAddZanMethod;
    if ((getAddZanMethod = ZanServiceGrpc.getAddZanMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getAddZanMethod = ZanServiceGrpc.getAddZanMethod) == null) {
          ZanServiceGrpc.getAddZanMethod = getAddZanMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.AddZanReq, microservice.protoc.zan.grpc.Response.AddZanRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddZan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.AddZanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.AddZanRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("AddZan"))
              .build();
        }
      }
    }
    return getAddZanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.DelZanReq,
      microservice.protoc.zan.grpc.Response.DelZanRep> getDelZanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelZan",
      requestType = microservice.protoc.zan.grpc.Request.DelZanReq.class,
      responseType = microservice.protoc.zan.grpc.Response.DelZanRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.DelZanReq,
      microservice.protoc.zan.grpc.Response.DelZanRep> getDelZanMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.DelZanReq, microservice.protoc.zan.grpc.Response.DelZanRep> getDelZanMethod;
    if ((getDelZanMethod = ZanServiceGrpc.getDelZanMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getDelZanMethod = ZanServiceGrpc.getDelZanMethod) == null) {
          ZanServiceGrpc.getDelZanMethod = getDelZanMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.DelZanReq, microservice.protoc.zan.grpc.Response.DelZanRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelZan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.DelZanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.DelZanRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("DelZan"))
              .build();
        }
      }
    }
    return getDelZanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZanReq,
      microservice.protoc.zan.grpc.Response.IsZanRep> getIsZanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsZan",
      requestType = microservice.protoc.zan.grpc.Request.IsZanReq.class,
      responseType = microservice.protoc.zan.grpc.Response.IsZanRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZanReq,
      microservice.protoc.zan.grpc.Response.IsZanRep> getIsZanMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZanReq, microservice.protoc.zan.grpc.Response.IsZanRep> getIsZanMethod;
    if ((getIsZanMethod = ZanServiceGrpc.getIsZanMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getIsZanMethod = ZanServiceGrpc.getIsZanMethod) == null) {
          ZanServiceGrpc.getIsZanMethod = getIsZanMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.IsZanReq, microservice.protoc.zan.grpc.Response.IsZanRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsZan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.IsZanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.IsZanRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("IsZan"))
              .build();
        }
      }
    }
    return getIsZanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZansReq,
      microservice.protoc.zan.grpc.Response.IsZansRep> getIsZansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsZans",
      requestType = microservice.protoc.zan.grpc.Request.IsZansReq.class,
      responseType = microservice.protoc.zan.grpc.Response.IsZansRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZansReq,
      microservice.protoc.zan.grpc.Response.IsZansRep> getIsZansMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.IsZansReq, microservice.protoc.zan.grpc.Response.IsZansRep> getIsZansMethod;
    if ((getIsZansMethod = ZanServiceGrpc.getIsZansMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getIsZansMethod = ZanServiceGrpc.getIsZansMethod) == null) {
          ZanServiceGrpc.getIsZansMethod = getIsZansMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.IsZansReq, microservice.protoc.zan.grpc.Response.IsZansRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsZans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.IsZansReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.IsZansRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("IsZans"))
              .build();
        }
      }
    }
    return getIsZansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.ZanCntReq,
      microservice.protoc.zan.grpc.Response.ZanCntRep> getZanCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZanCnt",
      requestType = microservice.protoc.zan.grpc.Request.ZanCntReq.class,
      responseType = microservice.protoc.zan.grpc.Response.ZanCntRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.ZanCntReq,
      microservice.protoc.zan.grpc.Response.ZanCntRep> getZanCntMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.ZanCntReq, microservice.protoc.zan.grpc.Response.ZanCntRep> getZanCntMethod;
    if ((getZanCntMethod = ZanServiceGrpc.getZanCntMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getZanCntMethod = ZanServiceGrpc.getZanCntMethod) == null) {
          ZanServiceGrpc.getZanCntMethod = getZanCntMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.ZanCntReq, microservice.protoc.zan.grpc.Response.ZanCntRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZanCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.ZanCntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.ZanCntRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("ZanCnt"))
              .build();
        }
      }
    }
    return getZanCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.MultiZanCntReq,
      microservice.protoc.zan.grpc.Response.MultiZanCntRep> getMultiZanCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiZanCnt",
      requestType = microservice.protoc.zan.grpc.Request.MultiZanCntReq.class,
      responseType = microservice.protoc.zan.grpc.Response.MultiZanCntRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.MultiZanCntReq,
      microservice.protoc.zan.grpc.Response.MultiZanCntRep> getMultiZanCntMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.MultiZanCntReq, microservice.protoc.zan.grpc.Response.MultiZanCntRep> getMultiZanCntMethod;
    if ((getMultiZanCntMethod = ZanServiceGrpc.getMultiZanCntMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getMultiZanCntMethod = ZanServiceGrpc.getMultiZanCntMethod) == null) {
          ZanServiceGrpc.getMultiZanCntMethod = getMultiZanCntMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.MultiZanCntReq, microservice.protoc.zan.grpc.Response.MultiZanCntRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiZanCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.MultiZanCntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.MultiZanCntRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("MultiZanCnt"))
              .build();
        }
      }
    }
    return getMultiZanCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanReq,
      microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserZan",
      requestType = microservice.protoc.zan.grpc.Request.UserZanReq.class,
      responseType = microservice.protoc.zan.grpc.Response.UserZanRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanReq,
      microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanReq, microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanMethod;
    if ((getUserZanMethod = ZanServiceGrpc.getUserZanMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getUserZanMethod = ZanServiceGrpc.getUserZanMethod) == null) {
          ZanServiceGrpc.getUserZanMethod = getUserZanMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.UserZanReq, microservice.protoc.zan.grpc.Response.UserZanRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserZan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.UserZanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.UserZanRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("UserZan"))
              .build();
        }
      }
    }
    return getUserZanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq,
      microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanByAppIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserZanByAppIds",
      requestType = microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq.class,
      responseType = microservice.protoc.zan.grpc.Response.UserZanRep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq,
      microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanByAppIdsMethod() {
    io.grpc.MethodDescriptor<microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq, microservice.protoc.zan.grpc.Response.UserZanRep> getUserZanByAppIdsMethod;
    if ((getUserZanByAppIdsMethod = ZanServiceGrpc.getUserZanByAppIdsMethod) == null) {
      synchronized (ZanServiceGrpc.class) {
        if ((getUserZanByAppIdsMethod = ZanServiceGrpc.getUserZanByAppIdsMethod) == null) {
          ZanServiceGrpc.getUserZanByAppIdsMethod = getUserZanByAppIdsMethod =
              io.grpc.MethodDescriptor.<microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq, microservice.protoc.zan.grpc.Response.UserZanRep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserZanByAppIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microservice.protoc.zan.grpc.Response.UserZanRep.getDefaultInstance()))
              .setSchemaDescriptor(new ZanServiceMethodDescriptorSupplier("UserZanByAppIds"))
              .build();
        }
      }
    }
    return getUserZanByAppIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZanServiceStub>() {
        @java.lang.Override
        public ZanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZanServiceStub(channel, callOptions);
        }
      };
    return ZanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZanServiceBlockingStub>() {
        @java.lang.Override
        public ZanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZanServiceBlockingStub(channel, callOptions);
        }
      };
    return ZanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZanServiceFutureStub>() {
        @java.lang.Override
        public ZanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZanServiceFutureStub(channel, callOptions);
        }
      };
    return ZanServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * &#64;exclude
   * This comment won't be rendered
   * </pre>
   */
  public static abstract class ZanServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public void addZan(microservice.protoc.zan.grpc.Request.AddZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.AddZanRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddZanMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消点赞
     * </pre>
     */
    public void delZan(microservice.protoc.zan.grpc.Request.DelZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.DelZanRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelZanMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取点赞状态
     * </pre>
     */
    public void isZan(microservice.protoc.zan.grpc.Request.IsZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZanRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsZanMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量获取点赞状态
     * </pre>
     */
    public void isZans(microservice.protoc.zan.grpc.Request.IsZansReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZansRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsZansMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取点赞总数
     * </pre>
     */
    public void zanCnt(microservice.protoc.zan.grpc.Request.ZanCntReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.ZanCntRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZanCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量获取点赞总数
     * </pre>
     */
    public void multiZanCnt(microservice.protoc.zan.grpc.Request.MultiZanCntReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.MultiZanCntRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiZanCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户点赞数据
     * </pre>
     */
    public void userZan(microservice.protoc.zan.grpc.Request.UserZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserZanMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户点赞数据，支持多个appId查询
     * </pre>
     */
    public void userZanByAppIds(microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserZanByAppIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddZanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.AddZanReq,
                microservice.protoc.zan.grpc.Response.AddZanRep>(
                  this, METHODID_ADD_ZAN)))
          .addMethod(
            getDelZanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.DelZanReq,
                microservice.protoc.zan.grpc.Response.DelZanRep>(
                  this, METHODID_DEL_ZAN)))
          .addMethod(
            getIsZanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.IsZanReq,
                microservice.protoc.zan.grpc.Response.IsZanRep>(
                  this, METHODID_IS_ZAN)))
          .addMethod(
            getIsZansMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.IsZansReq,
                microservice.protoc.zan.grpc.Response.IsZansRep>(
                  this, METHODID_IS_ZANS)))
          .addMethod(
            getZanCntMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.ZanCntReq,
                microservice.protoc.zan.grpc.Response.ZanCntRep>(
                  this, METHODID_ZAN_CNT)))
          .addMethod(
            getMultiZanCntMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.MultiZanCntReq,
                microservice.protoc.zan.grpc.Response.MultiZanCntRep>(
                  this, METHODID_MULTI_ZAN_CNT)))
          .addMethod(
            getUserZanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.UserZanReq,
                microservice.protoc.zan.grpc.Response.UserZanRep>(
                  this, METHODID_USER_ZAN)))
          .addMethod(
            getUserZanByAppIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq,
                microservice.protoc.zan.grpc.Response.UserZanRep>(
                  this, METHODID_USER_ZAN_BY_APP_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * &#64;exclude
   * This comment won't be rendered
   * </pre>
   */
  public static final class ZanServiceStub extends io.grpc.stub.AbstractAsyncStub<ZanServiceStub> {
    private ZanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public void addZan(microservice.protoc.zan.grpc.Request.AddZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.AddZanRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddZanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消点赞
     * </pre>
     */
    public void delZan(microservice.protoc.zan.grpc.Request.DelZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.DelZanRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelZanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取点赞状态
     * </pre>
     */
    public void isZan(microservice.protoc.zan.grpc.Request.IsZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZanRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsZanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量获取点赞状态
     * </pre>
     */
    public void isZans(microservice.protoc.zan.grpc.Request.IsZansReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZansRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsZansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取点赞总数
     * </pre>
     */
    public void zanCnt(microservice.protoc.zan.grpc.Request.ZanCntReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.ZanCntRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZanCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量获取点赞总数
     * </pre>
     */
    public void multiZanCnt(microservice.protoc.zan.grpc.Request.MultiZanCntReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.MultiZanCntRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiZanCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户点赞数据
     * </pre>
     */
    public void userZan(microservice.protoc.zan.grpc.Request.UserZanReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserZanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户点赞数据，支持多个appId查询
     * </pre>
     */
    public void userZanByAppIds(microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq request,
        io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserZanByAppIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * &#64;exclude
   * This comment won't be rendered
   * </pre>
   */
  public static final class ZanServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ZanServiceBlockingStub> {
    private ZanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.AddZanRep addZan(microservice.protoc.zan.grpc.Request.AddZanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddZanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消点赞
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.DelZanRep delZan(microservice.protoc.zan.grpc.Request.DelZanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelZanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取点赞状态
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.IsZanRep isZan(microservice.protoc.zan.grpc.Request.IsZanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsZanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量获取点赞状态
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.IsZansRep isZans(microservice.protoc.zan.grpc.Request.IsZansReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsZansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取点赞总数
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.ZanCntRep zanCnt(microservice.protoc.zan.grpc.Request.ZanCntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZanCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量获取点赞总数
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.MultiZanCntRep multiZanCnt(microservice.protoc.zan.grpc.Request.MultiZanCntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiZanCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户点赞数据
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.UserZanRep userZan(microservice.protoc.zan.grpc.Request.UserZanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserZanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户点赞数据，支持多个appId查询
     * </pre>
     */
    public microservice.protoc.zan.grpc.Response.UserZanRep userZanByAppIds(microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserZanByAppIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * &#64;exclude
   * This comment won't be rendered
   * </pre>
   */
  public static final class ZanServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ZanServiceFutureStub> {
    private ZanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 点赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.AddZanRep> addZan(
        microservice.protoc.zan.grpc.Request.AddZanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddZanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消点赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.DelZanRep> delZan(
        microservice.protoc.zan.grpc.Request.DelZanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelZanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取点赞状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.IsZanRep> isZan(
        microservice.protoc.zan.grpc.Request.IsZanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsZanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量获取点赞状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.IsZansRep> isZans(
        microservice.protoc.zan.grpc.Request.IsZansReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsZansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取点赞总数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.ZanCntRep> zanCnt(
        microservice.protoc.zan.grpc.Request.ZanCntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZanCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量获取点赞总数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.MultiZanCntRep> multiZanCnt(
        microservice.protoc.zan.grpc.Request.MultiZanCntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiZanCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户点赞数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.UserZanRep> userZan(
        microservice.protoc.zan.grpc.Request.UserZanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserZanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户点赞数据，支持多个appId查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<microservice.protoc.zan.grpc.Response.UserZanRep> userZanByAppIds(
        microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserZanByAppIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ZAN = 0;
  private static final int METHODID_DEL_ZAN = 1;
  private static final int METHODID_IS_ZAN = 2;
  private static final int METHODID_IS_ZANS = 3;
  private static final int METHODID_ZAN_CNT = 4;
  private static final int METHODID_MULTI_ZAN_CNT = 5;
  private static final int METHODID_USER_ZAN = 6;
  private static final int METHODID_USER_ZAN_BY_APP_IDS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ZanServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ZanServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ZAN:
          serviceImpl.addZan((microservice.protoc.zan.grpc.Request.AddZanReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.AddZanRep>) responseObserver);
          break;
        case METHODID_DEL_ZAN:
          serviceImpl.delZan((microservice.protoc.zan.grpc.Request.DelZanReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.DelZanRep>) responseObserver);
          break;
        case METHODID_IS_ZAN:
          serviceImpl.isZan((microservice.protoc.zan.grpc.Request.IsZanReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZanRep>) responseObserver);
          break;
        case METHODID_IS_ZANS:
          serviceImpl.isZans((microservice.protoc.zan.grpc.Request.IsZansReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.IsZansRep>) responseObserver);
          break;
        case METHODID_ZAN_CNT:
          serviceImpl.zanCnt((microservice.protoc.zan.grpc.Request.ZanCntReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.ZanCntRep>) responseObserver);
          break;
        case METHODID_MULTI_ZAN_CNT:
          serviceImpl.multiZanCnt((microservice.protoc.zan.grpc.Request.MultiZanCntReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.MultiZanCntRep>) responseObserver);
          break;
        case METHODID_USER_ZAN:
          serviceImpl.userZan((microservice.protoc.zan.grpc.Request.UserZanReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep>) responseObserver);
          break;
        case METHODID_USER_ZAN_BY_APP_IDS:
          serviceImpl.userZanByAppIds((microservice.protoc.zan.grpc.Request.UserZanByAppIdsReq) request,
              (io.grpc.stub.StreamObserver<microservice.protoc.zan.grpc.Response.UserZanRep>) responseObserver);
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

  private static abstract class ZanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return microservice.protoc.zan.grpc.ZanServiceClient.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZanService");
    }
  }

  private static final class ZanServiceFileDescriptorSupplier
      extends ZanServiceBaseDescriptorSupplier {
    ZanServiceFileDescriptorSupplier() {}
  }

  private static final class ZanServiceMethodDescriptorSupplier
      extends ZanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ZanServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ZanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZanServiceFileDescriptorSupplier())
              .addMethod(getAddZanMethod())
              .addMethod(getDelZanMethod())
              .addMethod(getIsZanMethod())
              .addMethod(getIsZansMethod())
              .addMethod(getZanCntMethod())
              .addMethod(getMultiZanCntMethod())
              .addMethod(getUserZanMethod())
              .addMethod(getUserZanByAppIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
