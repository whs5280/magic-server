// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package microservice.protoc.zan.grpc;

public final class ZanServiceClient {
  private ZanServiceClient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tapi.proto\032\rrequest.proto\032\016response.pro" +
      "to2\276\002\n\nZanService\022 \n\006AddZan\022\n.AddZanReq\032" +
      "\n.AddZanRep\022 \n\006DelZan\022\n.DelZanReq\032\n.DelZ" +
      "anRep\022\035\n\005IsZan\022\t.IsZanReq\032\t.IsZanRep\022 \n\006" +
      "IsZans\022\n.IsZansReq\032\n.IsZansRep\022 \n\006ZanCnt" +
      "\022\n.ZanCntReq\032\n.ZanCntRep\022/\n\013MultiZanCnt\022" +
      "\017.MultiZanCntReq\032\017.MultiZanCntRep\022#\n\007Use" +
      "rZan\022\013.UserZanReq\032\013.UserZanRep\0223\n\017UserZa" +
      "nByAppIds\022\023.UserZanByAppIdsReq\032\013.UserZan" +
      "RepB0\n\034microservice.protoc.zan.grpcB\020Zan" +
      "ServiceClientb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          microservice.protoc.zan.grpc.Request.getDescriptor(),
          microservice.protoc.zan.grpc.Response.getDescriptor(),
        });
    microservice.protoc.zan.grpc.Request.getDescriptor();
    microservice.protoc.zan.grpc.Response.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
