package br.com.mcos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: keymanagerGrpc.proto")
public final class KeymanagerRegistraGrpcServiceGrpc {

  private KeymanagerRegistraGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.mcos.KeymanagerRegistraGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.mcos.RegistraChavePixRequest,
      br.com.mcos.RegistraChavePixResponse> getRegistraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registra",
      requestType = br.com.mcos.RegistraChavePixRequest.class,
      responseType = br.com.mcos.RegistraChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.mcos.RegistraChavePixRequest,
      br.com.mcos.RegistraChavePixResponse> getRegistraMethod() {
    io.grpc.MethodDescriptor<br.com.mcos.RegistraChavePixRequest, br.com.mcos.RegistraChavePixResponse> getRegistraMethod;
    if ((getRegistraMethod = KeymanagerRegistraGrpcServiceGrpc.getRegistraMethod) == null) {
      synchronized (KeymanagerRegistraGrpcServiceGrpc.class) {
        if ((getRegistraMethod = KeymanagerRegistraGrpcServiceGrpc.getRegistraMethod) == null) {
          KeymanagerRegistraGrpcServiceGrpc.getRegistraMethod = getRegistraMethod =
              io.grpc.MethodDescriptor.<br.com.mcos.RegistraChavePixRequest, br.com.mcos.RegistraChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mcos.RegistraChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mcos.RegistraChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymanagerRegistraGrpcServiceMethodDescriptorSupplier("registra"))
              .build();
        }
      }
    }
    return getRegistraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymanagerRegistraGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceStub>() {
        @java.lang.Override
        public KeymanagerRegistraGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRegistraGrpcServiceStub(channel, callOptions);
        }
      };
    return KeymanagerRegistraGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymanagerRegistraGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeymanagerRegistraGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRegistraGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymanagerRegistraGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymanagerRegistraGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRegistraGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeymanagerRegistraGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRegistraGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeymanagerRegistraGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymanagerRegistraGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registra(br.com.mcos.RegistraChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.mcos.RegistraChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistraMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.mcos.RegistraChavePixRequest,
                br.com.mcos.RegistraChavePixResponse>(
                  this, METHODID_REGISTRA)))
          .build();
    }
  }

  /**
   */
  public static final class KeymanagerRegistraGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymanagerRegistraGrpcServiceStub> {
    private KeymanagerRegistraGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRegistraGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRegistraGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void registra(br.com.mcos.RegistraChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.mcos.RegistraChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymanagerRegistraGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymanagerRegistraGrpcServiceBlockingStub> {
    private KeymanagerRegistraGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRegistraGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRegistraGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.mcos.RegistraChavePixResponse registra(br.com.mcos.RegistraChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistraMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymanagerRegistraGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymanagerRegistraGrpcServiceFutureStub> {
    private KeymanagerRegistraGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRegistraGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRegistraGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.mcos.RegistraChavePixResponse> registra(
        br.com.mcos.RegistraChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymanagerRegistraGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymanagerRegistraGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRA:
          serviceImpl.registra((br.com.mcos.RegistraChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mcos.RegistraChavePixResponse>) responseObserver);
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

  private static abstract class KeymanagerRegistraGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymanagerRegistraGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.mcos.KeymanagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymanagerRegistraGrpcService");
    }
  }

  private static final class KeymanagerRegistraGrpcServiceFileDescriptorSupplier
      extends KeymanagerRegistraGrpcServiceBaseDescriptorSupplier {
    KeymanagerRegistraGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeymanagerRegistraGrpcServiceMethodDescriptorSupplier
      extends KeymanagerRegistraGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymanagerRegistraGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymanagerRegistraGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymanagerRegistraGrpcServiceFileDescriptorSupplier())
              .addMethod(getRegistraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
